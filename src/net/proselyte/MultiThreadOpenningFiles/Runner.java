package net.proselyte.MultiThreadOpenningFiles;

public class Runner {
    public static void main(String[] args) {
        FileThread fileThread = new FileThread();
        fileThread.start();
    }
}