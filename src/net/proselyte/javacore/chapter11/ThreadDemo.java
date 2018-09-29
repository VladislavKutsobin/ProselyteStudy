package net.proselyte.javacore.chapter11;

class NewThread implements Runnable {
    Thread t;
    NewThread() {
        t = new Thread(this, "Демонстрационній поток");
        System.out.println("Дочерний поток создан...");
        t.start();
    }

    @Override
    public void run() {
        try {
            for(int n=5;n>0;n--){
                System.out.println("Дочерний поток: " + n);
                Thread.sleep(2000);
            }
        } catch(InterruptedException e) {
            System.out.println("Выполнение потока прервано...");
        }
        System.out.println("Дочерний поток завершен...");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Главный поток: " + n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван...");
        }
        System.out.println("Главный поток завершен...");
    }
}
