package net.proselyte.javacore.chapter03;
// Демонстрация "периода жизни" переменной

public class LifeTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x  = 0; x < 3; x++) {
			int y = -1;
			System.out.println("Сейчас у равна: " + y);
			y = 100;
			System.out.println("Теперь y равна: " + y);
		}
	}

}
