

public class Shape
{
    private int height;
    private int width;

    Shape() {
        this.height = 0;
        this.width = 0;
    }

    Shape(int ht, int wt) {
        this.height = ht;
        this.width = wt;
    }

    public int getHeight() {
        return this.height;
    }
    public int getWidth() {
        return this.width;
    }

    public static void main(String[] args) {
        Shape m1 = new Shape(10, 20);
        System.out.println(m1.getHeight());
        System.out.println(m1.getWidth());
    }
};
