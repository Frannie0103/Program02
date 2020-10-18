public class J2_2 {

    public static void main(String[] args) {
        J2_2 vector = new J2_2(3, 4, 5);
        System.out.println(vector.getLen());
    }

    private double x;
    private double y;
    private double z;

    public J2_2(){

    }

    public J2_2(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLen() {
        return Math.sqrt(x*x+y*y+z*z);
    }
}