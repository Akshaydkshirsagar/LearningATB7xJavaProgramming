package EX_27072024;

public class Lab003 {
    // How to print array
    public static void main(String[] args) {

        int [] marks= {44, 67, 88, 56, 98};

        //traversing over array using for loop
        int j;
        for (j=0; j<marks.length; j++) {
            System.out.println("Element "+ j + "= "+ marks[j]);
        }
    }
}
