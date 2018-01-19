package utils;

import java.io.IOException;
import java.util.Scanner;

public class CounterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterClass count = new CounterClass();
		Scanner reader = new Scanner(System.in);
		
		
		System.out.println("Introdueix el número per fer el counter de 1, 2 & 5");
			
		int ini = reader.nextInt();
			
		System.out.println("Introdueix el límit del counter");
		
		int fi = reader.nextInt();
			
		count.counter1to1(ini, fi);
		count.counter2to2(ini, fi);
		count.counter5to5(ini, fi);
		
		
	}

}
