package javacalculator;
import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       
		    int num1, num2;
		    double answ;
		    char calc;
		    Scanner scan= new Scanner(System.in);

		    System.out.println("Enter Num1 : ");
		   num1 = scan.nextInt();
		   System.out.println("Enter Num2 : ");
		   num2 = scan.nextInt();
	 System.out.println("choose calc:+,-,*, or /");
	 calc= scan.next().charAt(0);
switch(calc){
case '+' : 
	answ=num1 + num2;
	 System.out.println(num1 +  "+" + num2 +  "="  + answ);
break;
case '-':answ= num1 - num2;
System.out.println(num1 +  "-" + num2 + "=" +answ);
break;
case '*': answ=num1 * num2;
System.out.println(num1 + "*" + num2 + "=" + answ);
break;
case'/':answ= num1 / num2;
System.out.println(num1 + "/" + num2 +  "=" + answ);
 break;

default:	   
System.out.println("Invalid Input");
break;
	}		    

	}
	
}
