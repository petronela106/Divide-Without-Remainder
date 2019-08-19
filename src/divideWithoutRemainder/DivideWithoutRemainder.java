package divideWithoutRemainder;


import java.util.Scanner;

//Reads n and n numbers
//
//Finds in percentage how many of them can divide without remainder at 2, 3 and 4
//
//Prints percentages p1, p2 and p3, formatted to the second digit

	public class DivideWithoutRemainder {
	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       int n = Integer.parseInt(scanner.nextLine());
	       int p1 = 0;
	       int p2 = 0;
	       int p3 = 0;
	       for(int i = 0 ; i < n; i++){
	           int nr = Integer.parseInt(scanner.nextLine());
	            if(nr % 2 == 0){
	             p1++;
	           } 
	           if(nr % 3 == 0 ){
	               p2++;
	           }
	           if(nr % 4 == 0 ){
	               p3++;
	           }

	       }
	       double result1 = (double)p1 / n *100;
	       double result2 = (double)p2 / n *100;
	       double result3 = (double)p3 / n *100;
	       System.out.printf("%.2f\n%.2f\n%.2f", result1, result2, result3);
	     
	    }
	}