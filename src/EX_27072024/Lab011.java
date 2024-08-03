package EX_27072024;

public class Lab011 {
    // 2D array
    public static void main(String[] args) {
        int [][] multiDimentionArray= new int[3][3];
        multiDimentionArray[0][0]=22;
        multiDimentionArray[0][1]=33;
        multiDimentionArray[0][2]=44;
        multiDimentionArray[1][0]=1;
        multiDimentionArray[1][1]=2;
        multiDimentionArray[1][2]=3;
        multiDimentionArray[2][0]=-3;
        multiDimentionArray[2][1]=-2;
        multiDimentionArray[2][2]=-1;

        for(int i=0; i<multiDimentionArray.length; i++){
            for(int j=0; j<multiDimentionArray.length; j++){
                System.out.print(multiDimentionArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
