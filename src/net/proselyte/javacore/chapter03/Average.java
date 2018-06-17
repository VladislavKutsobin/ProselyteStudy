package net.proselyte.javacore.chapter03;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double average[] = {10.1, 10.2, 10.3, 10.4, 10.5};
		double result = 0;
		
		for(int i = 0; i < 5; i++) {
			result = result + average[i];
		}
		System.out.println("Среднее равно: " + result/5);
	}

}
