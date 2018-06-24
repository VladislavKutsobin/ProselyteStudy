package net.proselyte.javacore.chapter07;

class TeSt {
    int a, b;
    TeSt(int i, int j) {
        a = i;
        b = j;
    }

    void meth(TeSt o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class PassObjRe {
    public static void main(String[] args) {
        TeSt ob = new TeSt(15, 20);
        System.out.println("До вызова метода: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("После вызова: " + ob.a + " " + ob.b);
    }
}
