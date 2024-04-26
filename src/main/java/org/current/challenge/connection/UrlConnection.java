package org.current.challenge.connection;

public class UrlConnection {
     private static String apiKey = "7b5fc905e4f3ff25a01ca639";

     private static String url = "https://v6.exchangerate-api.com/v6/";

    public static String getApiKey() {
        return apiKey;
    }

    public static String getUrl() {
        return url;
    }
}
