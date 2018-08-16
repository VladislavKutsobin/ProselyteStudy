package net.proselyte.javacore.chapter15;

interface DoubleNumericArrayFunc {
    double average(double[] n) throws EmptyException;
}

class EmptyException extends Exception {
    EmptyException() {
        super("Массив пуст");
    }
}

public class AvarageExc {
    public static void main(String[] args) throws EmptyException {
        double[] values = {1.0, 2.7, 3.1, 4.8};

        DoubleNumericArrayFunc avg = (n) -> {
            double sum = 0;
            if(n.length == 0) {
                throw new EmptyException();
            }

            for(int i=0; i< n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };

        System.out.println("Выполнение: " + avg.average(values));
    }
}
