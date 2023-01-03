abstract class A {
    int x;

    abstract void print1();
}

abstract class B extends A {
    abstract void print2();
}

class C extends B {
    @Override
    public void print1() {
        System.out.println("class c should override the method print1()");
    }

    @Override
    public void print2() {
        System.out.println("class c should override the method print2()");
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.print1();
        c.print2();
    }
}