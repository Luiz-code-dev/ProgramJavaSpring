package viewApplication;

import java.util.Scanner;

public class homeInterfaces {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (y > x) {
			System.out.println(y == x*x);
		}else {
			System.out.println("Impossivel calcular");
		}		
		
		sc.close();
	}

}
