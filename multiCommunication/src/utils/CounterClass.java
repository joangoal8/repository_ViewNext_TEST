package utils;

public class CounterClass {
	
	public void counter1to1(int ini, int fi) {
		
		String line = "";
		while (ini < fi) {
			line += ini + " ,";
			ini = ini + 1;
			
		}
		System.out.println("calcul és : " + line);
	}
	
	public void counter2to2(int ini, int fi) {
		String line = "";
		while (ini < fi) {
			
			line += ini + " ,";
			ini = ini + 2;
			
		}
		
		System.out.println("calcul és : " + line);
	}
	
	public void counter5to5(int ini, int fi) {
		
		String line = "";
		while (ini < fi) {
			line += ini + " ,";
					
			ini = ini + 5;
			
			
			
		}
		
		System.out.println("calcul és : " + line);
	}
}
