public class DemoOb {
    private int num;
    DemoOb(int num) {
        this.num = num;
    }

    public void getNum() {
        System.out.println(this.num);
    }

    public static void main(String[] args) {
        DemoOb d1 = new DemoOb(999);

        DemoOb ref = d1;
        // the address of d1 object is stored inside the reference 'ref'(4 bytes of memory is allocated to reference)

        ref.getNum();

        ref = new DemoOb(88);
        // the address of a new object is stored inside the ref i.e. the value inside it is replaced by the address
        // of the newly created object

        d1.getNum();
        
        ref.getNum();

    }
};