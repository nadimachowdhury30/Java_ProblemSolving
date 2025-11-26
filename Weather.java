package java1;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the temperature outside today?");
		int temperature = scanner.nextInt();
		System.out.println("Todays's temperature is: " +temperature);
		
		if(temperature <40) {
			System.out.println("Todays's temperature is freezing cold");
		}
		else if(temperature >40 && temperature <70) {
			System.out.println("Todays's temperature is comfortable");
		}
			else { 
				System.out.println("Todays's weather feels hot");
			}
		}

	}



