public class Emp {
    private static int cnt = 10;


    public static void getCnt() {
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Emp e1 = new Emp();
        Emp.getCnt();
    }

}