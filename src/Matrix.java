
public class Matrix {

	public static void main(String[] args) {
		int A[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int B[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int C[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			//	C[i][j]=0;
				for(int k=0;k<3;k++) {
					C[i][j]=A[i][k]*B[k][j]+C[i][j];      
				} 
				System.out.print(C[i][j]+" ");   
				}  
				System.out.println();    
				}    
				}
				
			}
		
	


