package Arrayss;

public class MultiDimension {
	public static void main(String[] args) {
        int arr[][] = {{1,4,3},{2,7,4}};
        int brr[][] = {{4,5,6},{8,5,6}};
        
        int crr[][] = new int[2][3];
        
        for(int i =0;i<2;i++){
            for(int j=0;j<3;j++){
              crr[i][j] = arr[i][j] + brr[i][j];
              System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }
    }

	

}
