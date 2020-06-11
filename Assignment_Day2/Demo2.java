public class Demo2 {
    public static void main(String[] args) {
        
        
        A a1 = new A();
        A a2 = new A();
        a1.getNum();
        A.getCnt();

        B b1 = new B();
        b1.getNum();
        B.getCnt();


        C c1 = new C();
        C c2 = new C();
        C c3 = new C();
        c1.getNum();
        C.getCnt();
    }
};


class A {
    private int num = 10;
    private static int cnt = 0;

    {
        cnt++;
    }
    public void getNum() {
        System.out.println(this.num);
    }

    public static void getCnt() {
        System.out.println("the count of A is " + cnt);
    }

    static {
        System.out.println("inside static member of A");
    }
};


class B {
    private int num2 = 5;
    private static int cnt = 0;
    {
        cnt++;
    }
    public void getNum() {
        System.out.println(this.num2);
    }
    public static void getCnt() {
        System.out.println("the count of B is " + cnt);
    }

    static {
        System.out.println("inside static member of B");
    }
};


class C {
    private int num3 = 30;
    private static int cnt = 0;
    {
        cnt++;
    }
    public void getNum() {
        System.out.println(this.num3);
    }
    public static void getCnt() {
        System.out.println("The count of C is " + cnt);
    }
    static {
        System.out.println("inside static member of C");
    }
}