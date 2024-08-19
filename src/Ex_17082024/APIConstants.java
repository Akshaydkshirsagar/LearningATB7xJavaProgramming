package Ex_17082024;

public enum APIConstants {
    Base_Url("https://app.vwo.com"),
    Login_Url("https://app.vwo.com/Login"),
    Dashboard_Url("https://app.vwo.com/Dashboard"),
    Chatbot_Url("https://app.vwo.com/Chatbot");



    private final String name;

    APIConstants (String name ){
        this.name = name;
    }
    public String getValue(){
        return name;
    }
}
