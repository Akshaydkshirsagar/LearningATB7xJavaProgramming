package Ex_13072024;

public class Lab003 {
    public static void main(String[] args) {
        int a=66;
        int b=10;
        String s="Ak";
        int c=50;
        System.out.println(a+b+s+c);  //BODMAS
        System.out.println(a+s+c+b);
        System.out.println(s+a+b*c);
        System.out.println(s+a/b*c);
        System.out.println(s+a%b*c);
        System.out.println(s+a%b+(-c));
    }
}
