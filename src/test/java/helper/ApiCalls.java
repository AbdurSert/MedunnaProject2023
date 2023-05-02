package helper;

public class ApiCalls {

    public static String GET_CUSTOMERS_WITH_ID = "https://www.gmibank.com/api/tp-customers/";

    public static String createGetUserApiCall(int id){
        return GET_CUSTOMERS_WITH_ID + id ;
    }

}
