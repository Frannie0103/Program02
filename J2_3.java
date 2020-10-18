import java.util.Random;

public class J2_3 {

    public static void main(String[] args) {
        J2_3 pi = new J2_3();
        pi.getPi(1000);
    }

    public void getPi(int n) {
        int sum = 0;
        int c_sum = 0;
        double x;
        double y;
        Random ra = new Random();

        int i = 0;
        while (i != n) {
            x = ra.nextDouble();
            y = ra.nextDouble();

            if (x * x + y * y <= 1)
                ++c_sum;
            ++sum;
            ++i;
        }

        double area = (double) c_sum / sum * 4;
        System.out.println("area = " + area);
        System.out.println("error = " + Math.abs((1-area/Math.PI)*100)+"%");
    }
}