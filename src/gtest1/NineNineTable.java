package gtest1;

public class NineNineTable {
	
	public static void main(String args[]){
		int i, j;
		for (j=0; j<9; j++){
			for (i=0; i<j; i++){
				System.out.print(i+ "*" + j + " ");
			}
			System.out.println();
		}
	}
//	 for (int i = 1,j = 1; j <= 9; i++) { 
//         System.out.print(i+"*"+j+"="+i*j+" "); 
//         if(i==j){ 
//             i=0; 
//             j++; 
//             System.out.println(); 
//         } 
//	 }
//	 
//	}
}
