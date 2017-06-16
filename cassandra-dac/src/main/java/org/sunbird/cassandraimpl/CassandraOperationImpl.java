package org.sunbird.cassandraimpl;

import static com.datastax.driver.core.querybuilder.QueryBuilder.eq;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.sunbird.cassandra.CassandraOperation;
import org.sunbird.common.CassandraUtil;
import org.sunbird.common.Constants;
import org.sunbird.common.exception.ProjectCommonException;
import org.sunbird.common.models.response.Response;
import org.sunbird.common.models.util.LogHelper;
import org.sunbird.common.responsecode.ResponseCode;
import org.sunbird.helper.CassandraConnectionManager;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.querybuilder.Clause;
import com.datastax.driver.core.querybuilder.Delete;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;
import com.datastax.driver.core.querybuilder.Select.Where;

/**
 * 
 * @author Amit Kumar
 * 
 * this class contains methods to interact with cassandra DB
 * 
 */
public class CassandraOperationImpl implements CassandraOperation{

	private final static LogHelper LOGGER = LogHelper.getInstance(CassandraOperationImpl.class.getName());
	
	@Override
	public Response insertRecord(String keyspaceName, String tableName, Map<String, Object> request) throws ProjectCommonException {
		Response response = new Response();
		try {
			String query = CassandraUtil.getPreparedStatement(keyspaceName,tableName,request);
			PreparedStatement statement = CassandraConnectionManager.getSession(keyspaceName).prepare(query);
			BoundStatement boundStatement = new BoundStatement(statement);
			Iterator<Object> iterator = request.values().iterator(); 
			Object [] array =  new Object[request.keySet().size()];
			int i=0;
			while (iterator.hasNext()) {
				array[i++] = iterator.next();
			}
		   	CassandraConnectionManager.getSession(keyspaceName).execute(boundStatement.bind(array));
			response.put(Constants.RESPONSE, Constants.SUCCESS);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			throw new ProjectCommonException(ResponseCode.internalError.getErrorCode(), e.getMessage(), ResponseCode.SERVER_ERROR.getResponseCode());
		}
		return response;
	}


	@Override
	public Response updateRecord(String keyspaceName, String tableName, Map<String, Object> request) throws ProjectCommonException {
		Response response = new Response();
		try{
		String query = CassandraUtil.getUpdateQueryStatement(keyspaceName, tableName, request);
		String updateQuery =query+Constants.IF_EXISTS;
		PreparedStatement statement = CassandraConnectionManager.getSession(keyspaceName).prepare(updateQuery);
		Object [] array =  new Object[request.size()];
		int i=0;
		String str= "";
		int index = query.lastIndexOf(Constants.SET.trim());
		str= query.substring(index+4);
		str = str.replace(Constants.EQUAL_WITH_QUE_MARK, "");
		str = str.replace(Constants.WHERE_ID, "");
		str = str.replace(Constants.SEMICOLON, "");
		String [] arr = str.split(",");
		for(String key : arr){
			array[i++] = request.get(key.trim());
		}
		array[i++] = request.get(Constants.IDENTIFIER);
		BoundStatement boundStatement = statement.bind(array);
		ResultSet result= CassandraConnectionManager.getSession(keyspaceName).execute(boundStatement);
			if(result.wasApplied()){
				response.put(Constants.RESPONSE, Constants.SUCCESS);
			}else{
				throw new ProjectCommonException(ResponseCode.internalError.getErrorCode(), Constants.INCORRECT_DATA, ResponseCode.SERVER_ERROR.getResponseCode());
			}
		}catch(Exception e){
			LOGGER.error(e.getMessage(), e);
			throw new ProjectCommonException(ResponseCode.internalError.getErrorCode(), e.getMessage(), ResponseCode.SERVER_ERROR.getResponseCode());
		}
		return response;
	}


	@Override
	public Response deleteRecord(String keyspaceName, String tableName, String identifier) throws ProjectCommonException{
		Response response = new Response();
		try{
		Delete.Where delete = QueryBuilder.delete().from(keyspaceName, tableName)
				.where(eq(Constants.IDENTIFIER, identifier));
		 CassandraConnectionManager.getSession(keyspaceName).execute(delete);
		 response.put(Constants.RESPONSE, Constants.SUCCESS);
		}catch(Exception e){
			LOGGER.error(e.getMessage(), e);
			throw new ProjectCommonException(ResponseCode.internalError.getErrorCode(), e.getMessage(), ResponseCode.SERVER_ERROR.getResponseCode());
		}
		 return response;
	}


	@Override
	public Response getRecordById(String keyspaceName, String tableName, String identifier) throws ProjectCommonException{
		Response response = new Response();
		try{
			Select selectQuery = QueryBuilder.select().all().from(keyspaceName, tableName);
		    Where selectWhere = selectQuery.where();
		    Clause clause = QueryBuilder.eq(Constants.IDENTIFIER, identifier);
		    selectWhere.and(clause);
			ResultSet results  = CassandraConnectionManager.getSession(keyspaceName).execute(selectQuery);
			response = CassandraUtil.createResponse(results);
		}catch(Exception e){
			LOGGER.error(e.getMessage(), e);
			throw new ProjectCommonException(ResponseCode.internalError.getErrorCode(), e.getMessage(), ResponseCode.SERVER_ERROR.getResponseCode());
		}
		 return response;
	}


	@Override
	public Response getRecordsByProperty(String keyspaceName, String tableName, String propertyName, String propertyValue) throws ProjectCommonException{
		Response response = new Response();
		try{
			Select selectQuery = QueryBuilder.select().all().from(keyspaceName, tableName);
		    Where selectWhere = selectQuery.where();
		    Clause clause = QueryBuilder.eq(propertyName, propertyValue);
		    selectWhere.and(clause);
		    ResultSet results=null;
		    Session session=CassandraConnectionManager.getSession(keyspaceName);
			results  = session.execute(selectQuery);
			response = CassandraUtil.createResponse(results);
		}catch(Exception e){
			LOGGER.error(e.getMessage(), e);
			throw new ProjectCommonException(ResponseCode.internalError.getErrorCode(), e.getMessage(), ResponseCode.SERVER_ERROR.getResponseCode());
		}
		 return response;
	}

	@Override
	public Response getRecordsByProperty(String keyspaceName, String tableName, String propertyName,
			List<Object> propertyValueList) throws ProjectCommonException{
		Response response = new Response();
		try{
			Select selectQuery = QueryBuilder.select().all().from(keyspaceName, tableName);
		    Where selectWhere = selectQuery.where();
		    Clause clause = QueryBuilder.in(propertyName, propertyValueList);
		    selectWhere.and(clause);
			ResultSet results  = CassandraConnectionManager.getSession(keyspaceName).execute(selectQuery);
			response = CassandraUtil.createResponse(results);
		}catch(Exception e){
			LOGGER.error(e.getMessage(), e);
			throw new ProjectCommonException(ResponseCode.internalError.getErrorCode(), e.getMessage(), ResponseCode.SERVER_ERROR.getResponseCode());
		}
		 return response;
	}


	@Override
	public Response getRecordsByProperties(String keyspaceName, String tableName, Map<String, Object> propertyMap) throws ProjectCommonException{
		Response response = new Response();
		try{
			Select selectQuery = QueryBuilder.select().all().from(keyspaceName, tableName);
		    Where selectWhere = selectQuery.where();
		    for (Entry<String, Object> entry : propertyMap.entrySet())
		    {
		    	if(entry.getValue() instanceof List){
		    		Clause clause = QueryBuilder.in(entry.getKey(), entry.getValue());
				    selectWhere.and(clause);
		    	}else{
		    		Clause clause = QueryBuilder.eq(entry.getKey(), entry.getValue());
				    selectWhere.and(clause);
		    	}
		    }
			ResultSet results  = CassandraConnectionManager.getSession(keyspaceName).execute(selectQuery.allowFiltering());
			response = CassandraUtil.createResponse(results);
		}catch(Exception e){
			LOGGER.error(e.getMessage(), e);
			throw new ProjectCommonException(ResponseCode.internalError.getErrorCode(), e.getMessage(), ResponseCode.SERVER_ERROR.getResponseCode());
		}
		 return response;
	}


	@Override
	public Response getPropertiesValueById(String keyspaceName, String tableName, String id, String... properties) {
		Response response = new Response();
		try{
			String selectQuery = CassandraUtil.getSelectStatement(keyspaceName, tableName, properties);
			PreparedStatement statement = CassandraConnectionManager.getSession(keyspaceName).prepare(selectQuery);
			BoundStatement boundStatement = new BoundStatement(statement);
			ResultSet results  = CassandraConnectionManager.getSession(keyspaceName).execute(boundStatement.bind(id));
			response = CassandraUtil.createResponse(results);
		}catch(Exception e){
			LOGGER.error(e.getMessage(), e);
			throw new ProjectCommonException(ResponseCode.internalError.getErrorCode(), e.getMessage(), ResponseCode.SERVER_ERROR.getResponseCode());
		}
		return response;
	}


	@Override
	public Response getAllRecords(String keyspaceName, String tableName) {
		Response response = new Response();
		try{
			Select selectQuery = QueryBuilder.select().all().from(keyspaceName, tableName);
			ResultSet results  = CassandraConnectionManager.getSession(keyspaceName).execute(selectQuery);
			response = CassandraUtil.createResponse(results);
		}catch(Exception e){
			LOGGER.error(e.getMessage(), e);
			throw new ProjectCommonException(ResponseCode.internalError.getErrorCode(), e.getMessage(), ResponseCode.SERVER_ERROR.getResponseCode());
		}
		return response;
	}

}

