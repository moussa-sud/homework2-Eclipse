package homework2;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String fullname = scanner.nextLine();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        
        
		HeartRate patient = new HeartRate(fullname, birthYear);


		patient.show();
		        
		    }
	}

