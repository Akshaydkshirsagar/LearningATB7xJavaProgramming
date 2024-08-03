package EX_27072024;

public class Lab013 {
    // String builder and String buffer
    public static void main(String[] args) {

        String s1= "abcd";
               s1="asdf";  // it will create 2 strings in scp

        StringBuffer stringbuffer= new StringBuffer("Akshay");
        stringbuffer.append("Kshirsagar");
        // here akshay is deleted and replace with AkshayKshirsagar ; resolve memory wastage

        StringBuilder stringbuilder = new StringBuilder("Pro");
        stringbuilder.append("Trader");
        // works same as above
        // then what is difference?
        // Thread safety..........
        //string builder TF- not synchronized perf- faster  syncheo menas 1 by 1
        // String buffer TF- synchronized    perf- slower
    }
}
