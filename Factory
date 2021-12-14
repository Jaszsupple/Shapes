import java.util.Scanner;
public class ShapeFactoryV1 {

	public static void main(String[] args) {

		System.out.println("*** Welcome to the Shape Factory! ***");
		Scanner userinput = new Scanner(System.in);

		String reversePyramid = "R";
		String numberPattern = "#";
		String quit = "X";
		String reverseStarPyramid = "*";
		String reverseSignPyramid = "@";

		for(int repeatLoop = 1; repeatLoop <=1;) {
			System.out.println("Do you want to print a reversed pyranid or a number pattern? (\"R\", \"#\" or \"x\" for exit) ");

			String userSelection = userinput.next();

			if (userSelection.compareToIgnoreCase(reversePyramid)==0) {
				System.out.println("A reversed pyramid of stars or at signs? (\"*\" or \"@\" ) ");
				String userSelection2 = userinput.next();

				if (userSelection2.compareTo(reverseStarPyramid)==0) {
					for (int rows = 5; rows >=1; rows--) {
						for (int spaces = 1; spaces <= 5-rows; spaces++) {
							System.out.print("  ");
						} for (int columns = 1; columns < rows*2; columns++) {
							System.out.print("* ");
						} System.out.println();
					}
				} else if (userSelection2.compareTo(reverseSignPyramid)==0) {
					for (int rows = 5; rows >=1; rows--) {
						for (int spaces = 1; spaces <= 5-rows; spaces++) {
							System.out.print("  ");
						} for (int columns = 1; columns < rows*2; columns++) {
							System.out.print("@ ");
						} System.out.println();
					}
				} else System.out.println("Wrong input! Please try again");

			} else if (userSelection.compareToIgnoreCase(numberPattern)==0) {
				int Number=1;
				for (int rows = 1; rows <=5; rows++) {
					for ( int columns= 1; columns <=rows; columns++) {
						System.out.print( Number++ + " ");
					}System.out.println();
				}
			} else if (userSelection.compareToIgnoreCase(quit)==0) {
				break;
			} else System.out.println("Wrong input! Please try again");
		} 
		userinput.close();
		System.out.println("Bye!");
	}



}
