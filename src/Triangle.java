//Q60 you can't initilized variable in if condition, it must be initialized in certain number, not just declare
//compliation failed at line n2 (area = p * b * h)!!!!!
public class Triangle {
    static double area;
    int b = 2, h = 3;

    public static void main(String[] args) {
        double p , b, h;
        if (area == 0) {
            b = 3;
            h = 4;
            p = 0.5;
            System.out.println("in if");
        }
        //area = p* b* h;
        System.out.println("Area is " + area);
    }
}
