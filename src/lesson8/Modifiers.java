package lesson8;

public class Modifiers {

    public int a;
    final public int f;  // final public = public final
    public final double fin;
    boolean bool;

    Modifiers(){
        f = 100;
        fin = 200.88;
    }
    Modifiers(boolean boo) {
        bool = boo;
        f = 1;
        fin = 2.2;
    }

    public void sum(final int i){
        double res = i + f + fin;
        System.out.println(res);
    }

    public static void main(String[] args) {
        Modifiers m1 = new Modifiers();
        m1.a =2;
        m1.a *=2;
        //m1.f = 3;
        System.out.println(m1.a);
        System.out.println(m1.f + m1.fin);
        System.out.println();
        Modifiers m2 = new Modifiers(false);
        System.out.println(m2.f + m2.fin);
        System.out.println();
        m2.sum(9);
    }
}
