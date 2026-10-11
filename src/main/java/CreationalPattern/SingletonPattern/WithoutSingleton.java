package CreationalPattern.SingletonPattern;



class AppSettings{
    private String DatabaseUrl;
    private String ApiKey;


    public AppSettings() {

        //we are hetting this for config file lets say

        DatabaseUrl = "databaseUrl";
        ApiKey = "apiKey";
    }

    public String getDatabaseUrl() {
        return DatabaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        DatabaseUrl = databaseUrl;
    }

    public String getApiKey() {
        return ApiKey;
    }

    public void setApiKey(String apiKey) {
        ApiKey = apiKey;
    }
}
public class WithoutSingleton {
    public static void main(String[] args) {
         AppSettings setting = new AppSettings();
         AppSettings setting2 = new AppSettings();

        System.out.println(setting.getDatabaseUrl());
        System.out.println(setting2.getDatabaseUrl());
        System.out.println(setting == setting2);
         //so here both object has same value and we have setter too so lets say
        //if i chnag evalue in one object but not in second so this lead to inconsistency
        //which is bad code and also we just need one object for whole app
        //another copy is just taking extra memory which bad roo
        //that is why we have single ton pattern

    }
}
