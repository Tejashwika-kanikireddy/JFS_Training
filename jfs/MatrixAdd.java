public class MatrixAdd{
public static void main(String args[]){
     int [][] matrix1 = { 
	  {1,2},
	  {3,4}
	  };
	 int [][] matrix2={
	  {1,2},
	  {3,4}
	 };
    
	int[][] result = new int[2][2]; 
	for(int i=0; i<2;i++){
	for(int j=0;j<2;j++){
	result[i][j] = matrix1[i][j] + matrix2[i][j];
	}
	}
    System.out.println("Resultant Martix");
	for(int i=0;i<2;i++){
	for(int j=0;j<2;j++){
	System.out.print(result[i][j] + " ");
	}
    System.out.println();
	}
	System.out.println();
}
}