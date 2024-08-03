package EX_27072024;

public class Lab008 {
    //Program to find second largest in array
    public static void main(String[] args) {
        int[] arr={44, 66, 77,55};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        //return secondLargest;
        System.out.println(secondLargest);
    }
}
