package EX_27072024;

public class Lab010 {
    //find min num of array
    public static void main(String[] args) {
        int [] number={22,11,2,55};
        int min= number[0];
        for(int i = 0; i< number.length; i++ ){
            if(number[i]< min){
                min=number[i];
            }

        }
        System.out.println("Minimum number is: "+min);
    }
}
