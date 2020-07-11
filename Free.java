package chapter7_question;
import java.util.Scanner;
public class Free {
public static Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) {
		int [] myInt = getInt(5);
		for(int i = 0; i < myInt.length;i++) {
			System.out.println(" the number at position" + i + " is " + myInt[i]);
		}
		}
	public static  int[] getInt(int number) {
				System.out.println("Enter  your figures here: ");
				int [] value = new int [number];
				for(int i = 0; i < value.length; i++) {
					value[i] = scanner.nextInt();
					if(value[i] == number) {
						break;
					}	
				}
				
				
				return value;
	}

}
