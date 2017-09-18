package org.sunbird.common.responsecode;

/**
 * This interface will hold all the response key and message
 * @author Manzarul
 *
 */
public interface ResponseMessage {
  
    public interface Message {
      
        public static final String UNAUTHORISE_USER = "You are not authorized.";
        public static final String INVALID_USER_CREDENTIALS = "Please check your credentials";
        public static final String INVALID_OPERATION_NAME = "Operation name is invalid.Please provide a valid operation name";
        public static final String INVALID_REQUESTED_DATA = "Requested data for this operation is not valid.";
        public static final String CONSUMER_ID_MISSING_ERROR = "Consumer id is mandatory.";
        public static final String CONSUMER_ID_INVALID_ERROR = "Consumer id is invalid.";
        public static final String DEVICE_ID_MISSING_ERROR = "Device id is mandatory.";
        public static final String CONTENT_ID_INVALID_ERROR = "Please provide a valid content id.";
        public static final String CONTENT_ID_MISSING_ERROR = "Please provide content id.";
        public static final String COURSE_ID_MISSING_ERROR = "Please provide course id.";
        public static final String API_KEY_MISSING_ERROR = "APi key is mandatory.";
        public static final String API_KEY_INVALID_ERROR = "APi key is invalid.";
        public static final String INTERNAL_ERROR = "Process failed,please try again later.";
        public static final String COURSE_NAME_MISSING = "Please provide the course name.";
        public static final String SUCCESS_MESSAGE = "Success";
        public static final String SESSION_ID_MISSING = "Session id is mandatory.";
        public static final String COURSE_ID_MISSING = "Course id is mandatory.";
        public static final String CONTENT_ID_MISSING = "Content id is mandatory.";
        public static final String VERSION_MISSING = "Version is mandatory.";
        public static final String COURSE_VERSION_MISSING = "Course version is mandatory.";
        public static final String CONTENT_VERSION_MISSING = "Content version is mandatory.";
        public static final String COURSE_DESCRIPTION_MISSING = "Description is mandatory.";
        public static final String COURSE_TOCURL_MISSING = "Course tocurl is mandatory.";
        public static final String EMAIL_MISSING = "Email is mandatory.";
        public static final String EMAIL_FORMAT = "Email is invalid.";
        public static final String FIRST_NAME_MISSING = "First name is mandatory.";
        public static final String LANGUAGE_MISSING = "Language is mandatory.";
        public static final String PASSWORD_MISSING = "Password is mandatory.";
        public static final String PASSWORD_MIN_LENGHT = "Password should have at least 8 character.";
        public static final String PASSWORD_MAX_LENGHT = "Password should not be more than 12 character.";
        public static final String ORGANISATION_ID_MISSING = "Organisation id is mandatory.";
        public static final String REQUIRED_DATA_ORG_MISSING = "Organisation Id or Provider with External Id values are required for the operation";
        public static final String ORGANISATION_NAME_MISSING = "organisation name is mandatory.";
        public static final String CHANNEL_SHOULD_BE_UNIQUE = "Channel value already used by another organisation. Provide different value for channel";
        public static final String INVALID_ORG_DATA = "Given Organisation Data doesn't exist in our records. Please provide a valid one";
        public static final String INVALID_USR_DATA = "Given User Data doesn't exist in our records. Please provide a valid one";
        public static final String USR_DATA_VALIDATION_ERROR = "Please provide valid userId or userName";
        public static final String INVALID_ROOT_ORGANIZATION = "Root organization id is invalid";
        public static final String INVALID_PARENT_ORGANIZATION_ID = "Parent organization id is invalid";
        public static final String CYCLIC_VALIDATION_FAILURE = "The relation cannot be created as it is cyclic";
        public static final String CHANNEL_MISSING = "Channel is mandatory for root organisation";
        public static final String ENROLLMENT_START_DATE_MISSING = "Enrollment start date is mandatory.";
        public static final String COURSE_DURATION_MISSING = "Course duration is mandatory.";
        public static final String LOGIN_TYPE_MISSING = "Login type is required.";
        public static final String EMAIL_IN_USE = "Email already exists.";
        public static final String USERNAME_EMAIL_IN_USE = "Username or Email is already in used. Please try with a different Username or Email.";
        public static final String KEY_CLOAK_DEFAULT_ERROR = "server error at sso.";
        public static final String USER_REG_UNSUCCESSFULL = "User Registration unsuccessfull.";
        public static final String USER_UPDATE_UNSUCCESSFULL = "User update operation is unsuccessfull.";
        public static final String INVALID_CREDENTIAL = "Invalid credential.";
        public static final String USERNAME_MISSING = "Username is mandatory.";
        public static final String USERNAME_IN_USE = "Username already exists.";
        public static final String USERID_MISSING = "UserId is mandatory.";
        public static final String ROLE_MISSING = "Role of the user is required";
        public static final String MESSAGE_ID_MISSING = "Message id is mandatory.";
        public static final String USERNAME_CANNOT_BE_UPDATED = "UserName cann't be updated.";
        public static final String AUTH_TOKEN_MISSING = "Auth token is mandatory.";
        public static final String INVALID_AUTH_TOKEN = "Auth token is invalid.Please login again.";
        public static final String TIMESTAMP_REQUIRED = "TimeStamp is required.";
        public static final String PUBLISHED_COURSE_CAN_NOT_UPDATED ="Published course can't be updated.";
        public static final String SOURCE_MISSING = "Source is required.";
        public static final String SECTION_NAME_MISSING = "Section name is required.";
        public static final String SECTION_DATA_TYPE_MISSING = "Section data type missing.";
        public static final String SECTION_ID_REQUIRED = "Section id is required.";
        public static final String PAGE_NAME_REQUIRED = "Page name is required.";
        public static final String PAGE_ID_REQUIRED = "Page id is required.";
        public static final String INVALID_CONFIGURATION ="Invalid configuration data.";
        public static final String ASSESSMENT_ITEM_ID_REQUIRED = "Assessment item id is required.";
        public static final String ASSESSMENT_TYPE_REQUIRED = "Assessment type is required.";
        public static final String ATTEMPTED_DATE_REQUIRED = "Attempted data is required.";
        public static final String ATTEMPTED_ANSWERS_REQUIRED = "Attempted answers is required.";
        public static final String MAX_SCORE_REQUIRED = "Max score is required.";
        public static final String STATUS_CANNOT_BE_UPDATED = "status cann't be updated.";
        public static final String ATTEMPT_ID_MISSING_ERROR = "Please provide attempt id.";
        public static final String LOGIN_TYPE_ERROR = "provide login type as null.";
		public static final String INVALID_ORG_ID ="Org id does not exist .";
		public static final String INVALID_ORG_STATUS = "Invalid org status for approve .";
		public static final String INVALID_ORG_STATUS_TRANSITION = "Can not change state of Org to requeted state .";
        public static final String ADDRESS_REQUIRED_ERROR = "Please provide address.";
        public static final String EDUCATION_REQUIRED_ERROR = "Please provide education details.";
        public static final String JOBDETAILS_REQUIRED_ERROR = "Please provide job details.";
		public static final String DB_INSERTION_FAIL = "DB insert operation failed.";
		public static final String DB_UPDATE_FAIL = "Db update operation failed.";
		public static final String DATA_ALREADY_EXIST = "data already exist.";
		public static final String INVALID_DATA = "Incorrect data.";
		public static final String INVALID_COURSE_ID = "Course doesnot exist. Please provide a valid course identifier";
		public static final String PHONE_NO_REQUIRED_ERROR = "Phone number is required.";
		public static final String ORG_ID_MISSING ="Organisation Id required.";
		public static final String ACTOR_CONNECTION_ERROR = "Service is not able to connect with actor.";
		public static final String USER_ALREADY_EXIST = "user already exist.";
		public static final String PAGE_ALREADY_EXIST = "page already exist with this Page Name and Org Code.";
		public static final String INVALID_USER_ID = "User Id does not exists in our records";
		public static final String LOGIN_ID_MISSING = "loginId is required.";
		public static final String CONTENT_STATUS_MISSING_ERROR = "content status is required .";
		public static final String ES_ERROR = "Something went wrong when processing data for search";
		public static final String INVALID_PERIOD = "Time Period is invalid";
		public static final String USER_NOT_FOUND = "user not found.";
		public static final String ID_REQUIRED_ERROR = "For deleting a record, Id is required.";
		public static final String DATA_TYPE_ERROR = "{0} data type should be of {1}.";
		public static final String ADDRESS_ERROR = "In {0}, {1} is mandatory.";
		public static final String ADDRESS_TYPE_ERROR = "Please provide correct address Type.";
		public static final String NAME_OF_INSTITUTION_ERROR = "Please provide name of Institution.";
		public static final String EDUCATION_DEGREE_ERROR = "Education degree is required.";
		public static final String JOB_NAME_ERROR = "Job Name is required.";
		public static final String NAME_OF_ORGANISATION_ERROR = "Organisation Name is required.";
		public static final String ROLES_MISSING = "user role is required.";
        public static final String INVALID_DATE_FORMAT = "Invalid Date format . Date format should be : yyyy-MM-dd hh:mm:ss:SSSZ";
        public static final String SRC_EXTERNAL_ID_ALREADY_EXIST = "SOURCE WITH EXTERNAL ID ALREADY EXIST .";
        public static final String ALREADY_ENROLLED_COURSE = "User has already Enrolled this course .";
        public static final String EXISTING_ORG_MEMBER ="You already have a membership of this organization.";
        public static final String CONTNET_TYPE_ERROR = "Please add Content-Type header with value application/json";
        public static final String INVALID_PROPERTY_ERROR = "invalid property {0}.";
        public static final String USER_NAME_OR_ID_ERROR = "Please provide either username or userId.";
        public static final String USER_ACCOUNT_BLOCKED = "User account has been blocked .";
        public static final String EMAIL_VERIFY_ERROR = "Please provide a verified email in order to create user.";
        public static final String PHONE_VERIFY_ERROR = "Please provide a verified phone number in order to create user.";
        public static final String BULK_USER_UPLOAD_ERROR = "Please provide either organisation Id or external Id & provider value.";
        public static final String DATA_SIZE_EXCEEDED = "Maximum upload data size should be 200";
        public static final String INVALID_COLUMN_NAME = "Invalid column name.";
        public  static final String USER_ALREADY_ACTIVE = "User is already active";
        public static final String ENROLMENT_TYPE_REQUIRED = "Enrolment type is mandatory.";
        public static final String ENROLMENT_TYPE_VALUE_ERROR = "EnrolmentType value must be either open or invite-only.";
        public static final String COURSE_BATCH_START_DATE_REQUIRED = "batch start date is mandatory.";
        public static final String COURSE_BATCH_START_DATE_INVALID = "batch start date should be either today or future date.";
        public static final String DATE_FORMAT_ERRROR = "Date format error.";
        public static final String END_DATE_ERROR = "end date should be greater than start date.";
        public  static final String INVALID_CSV_FILE = "Please provide valid csv file.";
      public static final String INVALID_COURSE_BATCH_ID = "Invalid course batch id ";
      public  static final String COURSE_BATCH_ID_MISSING="Course batch Id required";
      public static final String ENROLLMENT_TYPE_VALIDATION = "Enrollment type should be invite-only.";
      public static final String USER_NOT_BELONGS_TO_ANY_ORG ="User does not belongs to any org .";
      public static final String INVALID_OBJECT_TYPE ="Invalid Object Type.";
      public static final String INVALID_PROGRESS_STATUS = "Progress status value should be NOT_STARTED(0), STARTED(1), COMPLETED(2).";
      public static final String COURSE_CREATED_FOR_NULL = "Batch does not belong to any organisation .";
      public static final String COURSE_BATCH_START_PASSED_DATE_INVALID = "This Batch already started.";
      public static final String UNABLE_TO_CONNECT_TO_EKSTEP = "Unable to connect to Ekstep Server";
      public static final String INVALID_JSON = "Unable to process object to JSON/ JSON to Object";
      public static final String EMPTY_CSV_FILE = "CSV file is Empty.";
      public static final String INVALID_ROOT_ORG_DATA = "Root org doesn't exist for this Organisation Id and channel {0}";
        public static final String NO_DATA = "No sufficient data for fetching the results";
      public static final String INVALID_CHANNEL = "Channel value is invalid.";
      public static final String INVALID_PROCESS_ID = "Invalid Process Id.";
      public static final String EMAIL_SUBJECT_ERROR = "Email Subject is mandatory.";
      public static final String EMAIL_BODY_ERROR = "Email Body is mandatory.";
      public static final String RECIPIENT_ADDRESS_ERROR = "Please send recipientEmails or recipientUserIds.";
      public static final String STORAGE_CONTAINER_NAME_MANDATORY = " Container name can not be null or empty.";
      public static final String CLOUD_SERVICE_ERROR = "Cloud storage service error.";
      public static final String BADGE_TYPE_ID_ERROR = "Badge type id is mandatory.";
      public static final String RECEIVER_ID_ERROR = "Receiver id is mandatory.";
      public static final String INVALID_RECEIVER_ID = "Receiver id is invalid.";
      public static final String INVALID_BADGE_ID = "Invalid badge type id.";
      public static final String USER_REG_ORG_ERROR = "this user belongs to some other organisation.";
      public static final String INVALID_ROLE = "Invalid role value provided in request.";
      public static final String INVALID_SALT = "Please provide salt value.";
      public static final String ORG_TYPE_MANDATORY = "Org Type name is mandatory.";
      public static final String ORG_TYPE_ALREADY_EXIST = "Org type with this name already exist.Please provide some other name.";
      public static final String ORG_TYPE_ID_REQUIRED_ERROR = "Org Type Id is required.";
      public static final String TITLE_REQUIRED = "Title is required";
      public static final String NOTE_REQUIRED = "No data to store for notes";
      public static final String CONTENT_ID_ERROR = "Please provide content id or course id";
      public static final String INVALID_TAGS = "Invalid data for tags";
      public static final String NOTE_ID_INVALID = "Invalid note id";
	}
    
    public interface Key {
      
        public static final String UNAUTHORISE_USER = "UNAUTHORIZE_USER";
        public static final String INVALID_USER_CREDENTIALS = "INVALID_USER_CREDENTIALS";
        public static final String INVALID_OPERATION_NAME = "INVALID_OPERATION_NAME";
        public static final String INVALID_REQUESTED_DATA = "INVALID_REQUESTED_DATA";
        public static final String CONSUMER_ID_MISSING_ERROR = "CONSUMER_ID_REQUIRED_ERROR";
        public static final String CONSUMER_ID_INVALID_ERROR = "CONSUMER_ID_INVALID_ERROR";
        public static final String DEVICE_ID_MISSING_ERROR = "DEVICE_ID_REQUIRED_ERROR";
        public static final String CONTENT_ID_INVALID_ERROR = "CONTENT_ID_INVALID_ERROR";
        public static final String CONTENT_ID_MISSING_ERROR = "CONTENT_ID_REQUIRED_ERROR";
        public static final String COURSE_ID_MISSING_ERROR = "COURSE_ID_REQUIRED_ERROR";
        public static final String API_KEY_MISSING_ERROR = "API_KEY_REQUIRED_ERROR";
        public static final String API_KEY_INVALID_ERROR = "API_KEY_INVALID_ERROR";
        public static final String INTERNAL_ERROR = "INTERNAL_ERROR";
        public static final String COURSE_NAME_MISSING = "COURSE_NAME_REQUIRED_ERROR";
        public static final String SUCCESS_MESSAGE = "SUCCESS";
        public static final String SESSION_ID_MISSING = "SESSION_ID_REQUIRED_ERROR";
        public static final String COURSE_ID_MISSING = "COURSE_ID_REQUIRED_ERROR";
        public static final String CONTENT_ID_MISSING ="CONTENT_ID_REQUIRED_ERROR";
        public static final String VERSION_MISSING ="VERSION_REQUIRED_ERROR";
        public static final String COURSE_VERSION_MISSING ="COURSE_VERSION_REQUIRED_ERROR";
        public static final String CONTENT_VERSION_MISSING ="CONTENT_VERSION_REQUIRED_ERROR";
        public static final String COURSE_DESCRIPTION_MISSING = "COURSE_DESCRIPTION_REQUIRED_ERROR";
        public static final String COURSE_TOCURL_MISSING = "COURSE_TOCURL_REQUIRED_ERROR";
        public static final String EMAIL_MISSING = "EMAIL_ID_REQUIRED_ERROR";
        public static final String EMAIL_FORMAT = "EMAIL_FORMAT_ERROR";
        public static final String FIRST_NAME_MISSING = "FIRST_NAME_REQUIRED_ERROR";
        public static final String LANGUAGE_MISSING = "LANGUAGE_REQUIRED_ERROR";
        public static final String PASSWORD_MISSING = "PASSWORD_REQUIRED_ERROR";
        public static final String PASSWORD_MIN_LENGHT = "PASSWORD_MIN_LENGHT_ERROR";
        public static final String PASSWORD_MAX_LENGHT = "PASSWORD_MAX_LENGHT_ERROR";
        public static final String ORGANISATION_ID_MISSING = "ORGANISATION_ID_MISSING";
        public static final String REQUIRED_DATA_ORG_MISSING = "REQUIRED_DATA_MISSING";
        public static final String ORGANISATION_NAME_MISSING = "ORGANISATION_NAME_MISSING";
        public static final String CHANNEL_SHOULD_BE_UNIQUE = "CHANNEL_SHOULD_BE_UNIQUE";
        public static final String INVALID_ORG_DATA = "INVALID_ORGANISATION_DATA";
        public static final String INVALID_USR_DATA = "INVALID_USER_DATA";
        public static final String USR_DATA_VALIDATION_ERROR = "USER_DATA_VALIDATION_ERROR";
        public static final String INVALID_ROOT_ORGANIZATION = "INVALID ROOT ORGANIZATION";
        public static final String INVALID_PARENT_ORGANIZATION_ID = "INVALID_PARENT_ORGANIZATION_ID";
        public static final String CYCLIC_VALIDATION_FAILURE = "CYCLIC_VALIDATION_FAILURE";
        public static final String CHANNEL_MISSING = "CHANNEL_MISSING";
        public static final String ENROLLMENT_START_DATE_MISSING = "ENROLLMENT_START_DATE_MISSING";
        public static final String COURSE_DURATION_MISSING = "COURSE_DURATION_MISSING";
        public static final String LOGIN_TYPE_MISSING = "LOGIN_TYPE_MISSING";
        public static final String EMAIL_IN_USE = "EMAIL_IN_USE";
        public static final String USERNAME_EMAIL_IN_USE = "USERNAME_EMAIL_IN_USE";
        public static final String KEY_CLOAK_DEFAULT_ERROR = "KEY_CLOAK_DEFAULT_ERROR";
        public static final String USER_REG_UNSUCCESSFULL = "USER_REG_UNSUCCESSFULL";
        public static final String USER_UPDATE_UNSUCCESSFULL = "USER_UPDATE_UNSUCCESSFULL";
        public static final String INVALID_CREDENTIAL = "INVALID_CREDENTIAL";
        public static final String USERNAME_MISSING = "USERNAME_MISSING";
        public static final String USERNAME_IN_USE = "USERNAME_IN_USE";
        public static final String USERID_MISSING = "USERID_MISSING";
        public static final String ROLE_MISSING = "ROLE_MISSING";
        public static final String MESSAGE_ID_MISSING = "MESSAGE_ID_MISSING";
        public static final String USERNAME_CANNOT_BE_UPDATED = "USERNAME_CANNOT_BE_UPDATED";
        public static final String AUTH_TOKEN_MISSING = "X_Authenticated_Userid_MISSING";
        public static final String INVALID_AUTH_TOKEN = "INVALID_AUTH_TOKEN";
        public static final String TIMESTAMP_REQUIRED = "TIMESTAMP_REQUIRED";
        public static final String PUBLISHED_COURSE_CAN_NOT_UPDATED = "PUBLISHED_COURSE_CAN_NOT_UPDATED";
        public static final String SOURCE_MISSING = "SOURCE_MISSING";
        public static final String SECTION_NAME_MISSING = "SECTION_NAME_MISSING";
        public static final String SECTION_DATA_TYPE_MISSING = "SECTION_DATA_TYPE_MISSING";
        public static final String SECTION_ID_REQUIRED = "SECTION_ID_REQUIRED";
        public static final String PAGE_NAME_REQUIRED = "PAGE_NAME_REQUIRED";
        public static final String PAGE_ID_REQUIRED = "PAGE_ID_REQUIRED";
        public static final String INVALID_CONFIGURATION ="INVALID_CONFIGURATION";
        public static final String ASSESSMENT_ITEM_ID_REQUIRED = "ASSESSMENT_ITEM_ID_REQUIRED";
        public static final String ASSESSMENT_TYPE_REQUIRED = "ASSESSMENT_TYPE_REQUIRED";
        public static final String ATTEMPTED_DATE_REQUIRED = "ATTEMPTED_DATE_REQUIRED";
        public static final String ATTEMPTED_ANSWERS_REQUIRED = "ATTEMPTED_ANSWERS_REQUIRED";
        public static final String MAX_SCORE_REQUIRED = "MAX_SCORE_REQUIRED";
        public static final String STATUS_CANNOT_BE_UPDATED = "STATUS_CANNOT_BE_UPDATED";
        public static final String ATTEMPT_ID_MISSING_ERROR = "ATTEMPT_ID_REQUIRED_ERROR";
        public static final String LOGIN_TYPE_ERROR = "LOGIN_TYPE_ERROR";
		public static final String INVALID_ORG_ID = "INVALID_ORG_ID";
		public static final String INVALID_ORG_STATUS = "INVALID_ORG_STATUS";
		public static final String INVALID_ORG_STATUS_TRANSITION = "INVALID_ORG_STATUS_TRANSITION";
		public static final String ADDRESS_REQUIRED_ERROR = "ADDRESS_REQUIRED_ERROR";
		public static final String EDUCATION_REQUIRED_ERROR = "EDUCATION_REQUIRED_ERROR";
		public static final String JOBDETAILS_REQUIRED_ERROR = "JOBDETAILS_REQUIRED_ERROR";
		public static final String DB_INSERTION_FAIL = "DB_INSERTION_FAIL";
		public static final String DB_UPDATE_FAIL = "DB_UPDATE_FAIL";
		public static final String DATA_ALREADY_EXIST = "DATA_ALREADY_EXIST";
		public static final String INVALID_DATA = "INVALID_DATA";
		public static final String INVALID_COURSE_ID = "INVALID_COURSE_ID";
		public static final String PHONE_NO_REQUIRED_ERROR = "PHONE_NO_REQUIRED_ERROR";
		public static final String ORG_ID_MISSING = "ORG_ID_MISSING";
		public static final String ACTOR_CONNECTION_ERROR = "ACTOR_CONNECTION_ERROR";
		public static final String USER_ALREADY_EXIST = "USER_ALREADY_EXIST";
		public static final String PAGE_ALREADY_EXIST = "PAGE_ALREADY_EXIST";
		public static final String INVALID_USER_ID = "INVALID_USER_ID";
		public static final String LOGIN_ID_MISSING = "LOGIN_ID_MISSING";
		public static final String CONTENT_STATUS_MISSING_ERROR = "CONTENT_STATUS_MISSING_ERROR";
		public static final String ES_ERROR = "ELASTICSEARCH_ERROR";
		public static final String INVALID_PERIOD = "INVALID_PERIOD";
		public static final String USER_NOT_FOUND = "USER_NOT_FOUND";
		public static final String ID_REQUIRED_ERROR = "ID_REQUIRED_ERROR";
		public static final String DATA_TYPE_ERROR = "DATA_TYPE_ERROR";
		public static final String ADDRESS_ERROR = "ADDRESS_ERROR";
		public static final String ADDRESS_TYPE_ERROR = "ADDRESS_TYPE_ERROR";
		public static final String NAME_OF_INSTITUTION_ERROR = "NAME_OF_INSTITUTION_ERROR";
		public static final String EDUCATION_DEGREE_ERROR = "EDUCATION_DEGREE_ERROR";
		public static final String JOB_NAME_ERROR = "JOB_NAME_ERROR";
		public static final String NAME_OF_ORGANISATION_ERROR = "NAME_OF_ORGANISATION_ERROR";
		public static final String ROLES_MISSING = "ROLES_REQUIRED_ERROR";
		public static final String INVALID_DATE_FORMAT = "INVALID_DATE_FORMAT";
		public static final String SRC_EXTERNAL_ID_ALREADY_EXIST = "SRC_EXTERNAL_ID_ALREADY_EXIST";
		public static final String ALREADY_ENROLLED_COURSE = "ALREADY_ENROLLED_COURSE";
		public static final String CONTNET_TYPE_ERROR = "CONTNET_TYPE_ERROR";
		public static final String INVALID_PROPERTY_ERROR = "INVALID_PROPERTY_ERROR";
		public static final String USER_NAME_OR_ID_ERROR = "USER_NAME_OR_ID_ERROR";
		public static final String USER_ACCOUNT_BLOCKED = "USER_ACCOUNT_BLOCKED";
		public static final String EMAIL_VERIFY_ERROR = "EMAIL_VERIFY_ERROR";
		public static final String PHONE_VERIFY_ERROR = "PHONE_VERIFY_ERROR";
		public static final String BULK_USER_UPLOAD_ERROR = "BULK_USER_UPLOAD_ERROR";
		public static final String DATA_SIZE_EXCEEDED = "DATA_SIZE_EXCEEDED";
		public static final String INVALID_COLUMN_NAME = "INVALID_COLUMN_NAME";
		public static final String USER_ALREADY_ACTIVE = "USER_ALREADY_ACTIVE";
		public static final String ENROLMENT_TYPE_REQUIRED = "ENROLMENT_TYPE_REQUIRED";
		public static final String ENROLMENT_TYPE_VALUE_ERROR = "ENROLMENT_TYPE_VALUE_ERROR";
		public static final String COURSE_BATCH_START_DATE_REQUIRED = "COURSE_BATCH_START_DATE_REQUIRED";
		public static final String COURSE_BATCH_START_DATE_INVALID = "COURSE_BATCH_START_DATE_INVALID";
		public static final String DATE_FORMAT_ERRROR = "DATE_FORMAT_ERRROR";
		public static final String END_DATE_ERROR = "END_DATE_ERROR";
		public static final String INVALID_CSV_FILE = "INVALID_CSV_FILE";
		public static final String INVALID_COURSE_BATCH_ID = "INVALID_COURSE_BATCH_ID";
		public  static final String COURSE_BATCH_ID_MISSING = "COURSE_BATCH_ID_MISSING";
		public static final String ENROLLMENT_TYPE_VALIDATION = "ENROLLMENT_TYPE_VALIDATION";
		public static final String COURSE_CREATED_FOR_NULL = "COURSE_CREATED_FOR_NULL";
		public static final String USER_NOT_BELONGS_TO_ANY_ORG ="USER_NOT_BELONGS_TO_ANY_ORG";
		public static final String INVALID_OBJECT_TYPE ="INVALID_OBJECT_TYPE";
		public static final String INVALID_PROGRESS_STATUS = "INVALID_PROGRESS_STATUS";
		public static final String COURSE_BATCH_START_PASSED_DATE_INVALID = "COURSE_BATCH_START_PASSED_DATE_INVALID";
		public static final String UNABLE_TO_CONNECT_TO_EKSTEP = "UNABLE_TO_CONNECT_TO_EKSTEP";
		public static final String INVALID_JSON = "INVALID_JSON";
		public static final String EMPTY_CSV_FILE = "EMPTY_CSV_FILE";
		public static final String INVALID_ROOT_ORG_DATA = "INVALID_ROOT_ORG_DATA";
		public static final String NO_DATA = "NO_DATA";
		public static final String INVALID_CHANNEL = "INVALID_CHANNEL";
		public static final String INVALID_PROCESS_ID = "INVALID_PROCESS_ID";
		public static final String EMAIL_SUBJECT_ERROR = "EMAIL_SUBJECT_ERROR";
		public static final String EMAIL_BODY_ERROR = "EMAIL_BODY_ERROR";
		public static final String RECIPIENT_ADDRESS_ERROR = "RECIPIENT_ADDRESS_ERROR";
        public static final String STORAGE_CONTAINER_NAME_MANDATORY = "STORAGE_CONTAINER_NAME_MANDATORY";
        public static final String USER_REG_ORG_ERROR = "USER_REG_ORG_ERROR";
        public static final String CLOUD_SERVICE_ERROR = "CLOUD_SERVICE_ERROR";
        public static final String BADGE_TYPE_ID_ERROR = "BADGE_TYPE_ID_ERROR";
        public static final String RECEIVER_ID_ERROR = "RECEIVER_ID_ERROR";
        public static final String INVALID_RECEIVER_ID = "INVALID_RECEIVER_ID";
        public static final String INVALID_BADGE_ID = "INVALID_BADGE_ID";
        public static final String INVALID_ROLE = "INVALID_ROLE";
        public static final String INVALID_SALT = "INVALID_SALT";
        public static final String ORG_TYPE_MANDATORY = "ORG_TYPE_MANDATORY";
        public static final String ORG_TYPE_ALREADY_EXIST = "ORG_TYPE_ALREADY_EXIST";
        public static final String ORG_TYPE_ID_REQUIRED_ERROR = "ORG_TYPE_ID_REQUIRED_ERROR";
        public static final String TITLE_REQUIRED = "TITLE_REQUIRED";
        public static final String NOTE_REQUIRED = "NOTE_REQUIRED";
        public static final String CONTENT_ID_ERROR = "CONTENT_ID_OR_COURSE_ID_REQUIRED";
        public static final String INVALID_TAGS = "INVALID_TAGS";
        public static final String NOTE_ID_INVALID = "NOTE_ID_INVALID";
    }
}
