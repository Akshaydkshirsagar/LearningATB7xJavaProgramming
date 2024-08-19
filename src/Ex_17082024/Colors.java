package Ex_17082024;
//Enums are used to store final constnt values seperate trom code
public enum Colors {
    RED ( "#f000"),
    BLUE("#f111"),
    YELLOW("#f222");


    private String hexValue;
    Colors(String hexValue){
        this.hexValue= hexValue;
    }
    public String getvalue(){
        return hexValue;
    }
}
