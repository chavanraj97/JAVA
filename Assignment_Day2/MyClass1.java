public class MyClass1 {
    int num1;
    int num2;
    MyClass1() {
        this.num1 = 0;
        this.num2 = 0;
    }
    MyClass1(int n1) {
        this.num1 = n1;
        this.num2 = 0;
    }
    MyClass1(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }
    public void setNum1(int n){
        this.num1 = n;
    }
    public void setNum2(int n) {
        this.num2 = n;
    }

    public void getAddition() {
        System.out.println(this.num1 + this.num2);
    }

    public static void main(String[] args) {
        MyClass1 m1 = new MyClass1();
        MyClass1 m2 = new MyClass1(10);
        MyClass1 m3 = new MyClass1(10, 30);

        m1.setNum1(50);
        m1.setNum2(30);
        m1.getAddition();

        m2.setNum2(1000);
        m2.getAddition();

        m3.getAddition();

    }
}