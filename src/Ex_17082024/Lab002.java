package Ex_17082024;

public class Lab002 {
    public static void main(String[] Akshay) {
        String num="10";
      //  int i=(int)num;        not possible
        Integer i= Integer.valueOf(num);
        System.out.println(i);
        int f= Integer.parseInt(num);
        System.out.println(f);

        String st="111133";
        Integer j=Integer.valueOf(st);
        System.out.println(j);

       /* String str="Akshay";          //Number format exception
        Integer k=Integer.valueOf(str);
        System.out.println(j);

        */
        Character c='A';
        Integer z=Integer.valueOf(c);
        System.out.println(z);
        int i1=c;
        System.out.println(i1);
        char ch=c;
        System.out.println(ch);


    }
}
