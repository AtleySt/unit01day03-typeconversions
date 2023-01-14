// good
public class Quadratic {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println("a = " + a);
        System.out.print("b = " + b);
        System.out.print("c = " + c);

        double result = (-b + Math.sqrt(b*b - 4 * a * c))/(2 * a);
        double result2 = (-b - Math.sqrt(b*b - 4 * a * c))/(2 * a);
        System.out.println(result);
        System.out.println(result2);
    }}



      