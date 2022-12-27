package cs502;

public class Test {
    public static void main(String[] args) {
        D8 obj;
        A8 aaa;
        A8 bbbbb;
        int a;
        int b;
        obj = new D8();
        aaa = new A8();
        bbbbb = new A8();
        aaa = new D8();
        aaa = bbbbb;
        a = obj.avar1;
        a = 1;
        obj.dvar = a;
        b = obj.bbb(aaa);
        b = obj.dvar;
        System.out.println(a);
        System.out.println(b);
    }
}

class A8 {
    int avar1;
    int avar2;
    int avar3;

    public int ff(int n, int m) {
        return 1;
    }

    public int bb() {
        return 0;
    }
}

class B8 extends A8 {
    int avar1;

    public int fff() {
        return 5;
    }

    public int bb() {
        return 2;
    }

    public int bbb(A8 a) {
        return 5;
    }
}

class C8 extends B8 {
    int avar2;

    public int ccc() {
        return 6;
    }
}

class D8 extends C8 {
    int avar1;
    int avar2;
    int dvar;

    public int f8() {
        A8 o1;
        B8 o2;
        C8 o3;
        A8 o4;
        int i;
        boolean b;
        o1 = new A8();
        o2 = new B8();
        o3 = new C8();
        avar1 = dvar + 5;
        b = true;
        if (b) {
            b = false;
            System.out.println(5);
        } else {
            System.out.println(6);
        }
        i = 0;
        while (b)
            i = i + 1;
        return 0;
    }

    public int ff(int n, int m) {
        return 5;
    }
}
