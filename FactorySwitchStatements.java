import java.util.Scanner;
public class ShapeFactoryV2 {

	public static void main(String[] args) {

		System.out.println( "*** Welcome to Shape Factory ***");
		Scanner scan = new Scanner(System.in);

		for (int repeat =1; repeat>=1;) {
			System.out.println(" Do you want to print a reversed pyramid or a number pattern");
			System.out.println(" Please enter, 'R', for Reverse Pyramid, 'P' for # Pattern or 'X', to exit");
			char printOption= scan.next().toUpperCase().charAt(0); 

			if (printOption != 'X') {
				switch (printOption) {
				case 'R': {
					System.out.println(" Do you whish a pyramid of '*' or '@");
					char printOption1 = scan.next().toUpperCase().charAt(0); 

					if (printOption1 == '*') {
						for (int i = 5; i >=1; i--) {
							for (int j = 0; j <=4 - i; j++) 
								System.out.print(" ");
							for (int k = 0; k != (2 * i) - 1; k++) 
								System.out.print("*");
							System.out.println();
						}
					} else if (printOption1 == '@')
						for (int i = 5; i >=1; i--) {
							for (int j = 0; j <=4 - i; j++) 
								System.out.print(" ");
							for (int k = 0; k != (2 * i) - 1; k++) 
								System.out.print("@");
							System.out.println();
						}
				} break;
				case 'P': {
					System.out.println(" Print a # Pattern ");
					printOption = scan.next().toUpperCase().charAt(0);

					int n=1;
					int rows=5;
					if (printOption == '#')
						for (int i = 1; i <= rows; i++) {
							for (int j = 1; j <= i; j++) {
								System.out.print(n + " ");				
								++n; }
							System.out.println();
						}			
				}
				break;
				default:{
					System.out.println( " Wrong input! Please try again");
				}
				}
			} else if (printOption == 'X') {
				break;
			}

		}
		scan.close();
		System.out.println("Bye!");
	}
}
