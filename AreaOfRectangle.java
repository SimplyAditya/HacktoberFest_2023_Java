import java.util.*;
public class AreaOfRectangle {

       static Double length, breadth;

        public static void setDim(Double l, Double b) {
            length = l;
            breadth = b;
        }

        public static Double getArea() {
            return length * breadth;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double l=scan.nextDouble();
        System.out.println("Enter the breadth of the rectangle");
        double b=scan.nextDouble();

        setDim(l,b);
        l=5;
        b=4;
        System.out.println(getArea());

    }

}
