package CreationalPattern.SingletonPattern;


class AppSettings2 implements Cloneable{
    private static AppSettings2 instance;

    private String DatabaseUrl;
    private String ApiKey;


    private AppSettings2() {

        //we are hetting this for config file lets say

        DatabaseUrl = "databaseUrl";
        ApiKey = "apiKey";
    }


    //here static method need static members so the refrence is static and
//    it has to be private so no class out side of this class can access this code
    //and now we will check if this class instace already there or not so now just instance of this class can be created
    public static AppSettings2 getInstance(){
        if(instance == null){
            instance = new AppSettings2();
        }

        return instance;
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


    @Override
    public Object clone() throws CloneNotSupportedException {
         throw new CloneNotSupportedException("cloning not supported");
    }
}
public class WithSingleton {
    public static void main(String[] args) {
        //gigving error
//        AppSettings2 setting = new AppSettings2();
//        AppSettings2 setting2 = new AppSettings2();

        AppSettings2 setting = AppSettings2.getInstance();
        AppSettings2 setting2 = AppSettings2.getInstance();



        //we have override this method so now it cannot create clon of the obj
//        setting2 = setting.clone();




        System.out.println(setting.getDatabaseUrl());
        System.out.println(setting2.getDatabaseUrl());

        // same obj for both varible
        System.out.println(setting == setting2);
    }
}
