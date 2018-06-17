package net.proselyte.javacore.chapter03;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		if(x == 10) {
			int y = 20;
			x = x * y;
			System.out.println("x равен: " + x);
		}
		//y = 100 у - тут у не видна так как у создана локально в блоке кода if)
	}

}
