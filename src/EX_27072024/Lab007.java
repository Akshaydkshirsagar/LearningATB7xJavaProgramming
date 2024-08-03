package EX_27072024;

import java.util.Arrays;

public class Lab007 {
    // find max salary from given array
    public static void main(String[] args) {
        float [] salary = {42.5f, 21f ,23.7f, 12.789f, 6.33f, 19};
         float max=salary[0];
         for(int i=0 ; i< salary.length; i++){
             if(salary[i]>max){
                 max= salary[i];
             }
         }
        System.out.println("Maxium salary is: "+ max);

         //using function
        Arrays.sort(salary);
        System.out.println("max salary is: "+ salary[salary.length-1]);

        float min= salary[0];
        for(int i=0 ; i< salary.length; i++){
            if(salary[i]<min){
                min= salary[i];
            }
        }
        System.out.println("minimum salary is: " + min);
    }
}
