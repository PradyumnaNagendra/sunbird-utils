package org.sunbird.services.sso.impl;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.sunbird.common.exception.ProjectCommonException;
import org.sunbird.common.models.util.JsonKey;
import org.sunbird.services.sso.SSOManager;
import org.sunbird.services.sso.SSOServiceFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author arvind
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KeyCloakServiceImplTest {

    SSOManager keyCloakService = SSOServiceFactory.getInstance();

    private static String userId ;
    final static String userName = UUID.randomUUID().toString().replaceAll("-", "");

    @BeforeClass
    public static void setup(){

    }

    @Test
    public void createUserTest(){

        Map<String , Object> request = new HashMap<String , Object>();
        request.put(JsonKey.USERNAME , userName);
        request.put(JsonKey.PASSWORD , "password");
        request.put(JsonKey.FIRST_NAME , "A");
        request.put(JsonKey.LAST_NAME , "B");
        request.put(JsonKey.EMAIL_VERIFIED , true);
        request.put(JsonKey.EMAIL , userName.substring(0,10));
        userId = keyCloakService.createUser(request);
        Assert.assertNotNull(userId);
    }

    @Test(expected = ProjectCommonException.class)
    public void createUserTestWithSameEmailUserName(){

        Map<String , Object> request = new HashMap<String , Object>();
        request.put(JsonKey.USERNAME , userName);
        request.put(JsonKey.PASSWORD , "password");
        request.put(JsonKey.FIRST_NAME , "A");
        request.put(JsonKey.LAST_NAME , "B");
        request.put(JsonKey.EMAIL_VERIFIED , true);
        request.put(JsonKey.EMAIL , userName.substring(0,10));
        userId = keyCloakService.createUser(request);
        Assert.assertNotNull(userId);
    }

    @Test(expected = ProjectCommonException.class)
    public void createUserTestWithSameEmailDiffUserName(){

        Map<String , Object> request = new HashMap<String , Object>();
        request.put(JsonKey.USERNAME , userName+"01abc");
        request.put(JsonKey.PASSWORD , "password");
        request.put(JsonKey.FIRST_NAME , "A");
        request.put(JsonKey.LAST_NAME , "B");
        request.put(JsonKey.EMAIL_VERIFIED , true);
        request.put(JsonKey.EMAIL , userName.substring(0,10));
        userId = keyCloakService.createUser(request);
        Assert.assertNotNull(userId);
    }

    @Test
    public void updateUserTest(){

        Map<String , Object> request = new HashMap<String , Object>();
        request.put(JsonKey.USER_ID , userId);
        request.put(JsonKey.FIRST_NAME , userName);
        String result = keyCloakService.updateUser(request);
        Assert.assertNotNull(result);
    }

    @Test
    public void vdeactivateUserTest(){

        Map<String , Object> request = new HashMap<String , Object>();
        request.put(JsonKey.USER_ID , userId);
        request.put(JsonKey.FIRST_NAME , userName);
        String result = keyCloakService.deactivateUser(request);
        Assert.assertNotNull(result);
    }

    @Test
    public void xremoveUserTest(){

        Map<String , Object> request = new HashMap<String , Object>();
        request.put(JsonKey.USER_ID , userId);
        String result = keyCloakService.removeUser(request);
        Assert.assertNotNull(result);
    }
}