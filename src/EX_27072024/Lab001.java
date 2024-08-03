package EX_27072024;

import org.w3c.dom.ls.LSOutput;

public class Lab001 {
    // Arrays
    /* Array is collection of similar daya types
    it stored in continuous memory
     */
    public static void main(String[] args) {


        //Datatype[] arryName; declearation of array


        int[] marksObtained = {22, 44, 56, 78, 99};
       // index from 0,1,2,3,4   total lenght= elemcnts=5
        System.out.println(marksObtained.length);
        System.out.println(marksObtained[3 ]);
        System.out.println(marksObtained[0]);
       // System.out.println(marksObtained[-1]);   .ArrayIndexOutOfBoundsException
        //System.out.println(marksObtained[12]);    .ArrayIndexOutOfBoundsException

        float gstPaid[] = {22.33f, 55.67f, 77.05f, 55.77f};
        char [] grade={'A', 'O', 'B', 'C', 'F'};
        boolean[] is_married= {true, false, false, true, true};
    }

}
