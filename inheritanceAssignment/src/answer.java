public class answer {
    public static void main(String[] args) {
        A a = new B();
        a.calculate(1);
        B b = (B) a;
        b.calculate(1);
        C c = (C) b;
        c.calculate(1);
    }
}

