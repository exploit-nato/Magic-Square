import java.util.Arrays;
import java.util.Scanner;
////
public class MagicSquare {
	////////////////////////////////////////////////	
	static Scanner sc = new Scanner(System.in);
	////////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.println("Hello,\nPlease enter your numbers\nIn the blocks below:\n");
		  int[][] square = new int[4][4];
		  for(int i = 0; i < square.length; i++){
			  for (int j = 0; j < square[i].length; j++){
				  System.out.print("Enter Number:");
				  square[i][j] = sc.nextInt();
			  }System.out.println();
		  } System.out.println("Is it a magic square? " + magicSquare(square)); System.out.println("\n");
		  for(int[] x: square)
	            System.out.println(Arrays.toString(x) + "\t");
		}
	////////////////////////////////////////////////	
	private static String magicSquare(int[][] square){   
		int n = sumOfRow(square[0]);
		for (int[] row : square){
		         int sum = sumOfRow(row);
		         if (sum != n)
		         return "nope";
		}
		int sum = 0;      
		for (int i = 0; i < square.length; i++){
			sum = 0;
			for (int j = 0; j < square.length; j++){
				sum += square[i][j];
		    }
			if(sum != n){
				return "nope";
				}
		     }
		    for(int i =0; i < square.length; i++){
		    	sum = 0;	       
		    	for(int j = 0; j< square.length; j++){
		    		sum += square[j][i];
		        }
		        if(sum != n){
		        	return "nope";
		        }
		    }
		    sum = 0;
		    for (int i = 0; i < square.length; i++){
		         sum += square[i][i];
		      }
		    if (sum != n)
		    	return "nope";
		          
		    sum = 0;
		    for (int i = 0; i < square.length; i++)
		      {
		         sum += square[i][square.length - 1 - i];
		      }
		    if (sum != n)
		    	return "nope";
		return "yup!";   
	} 
	////////////////////////////////////////////////		   
	private static int sumOfRow(int[] row){
		int sum = 0;
		for(int y : row){
			sum += y;
	  	} return sum;
  	}
}
