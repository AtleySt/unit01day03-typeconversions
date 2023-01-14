public class TrigIdentity {
    public static void main(String[] args) {
        System.out.println(Math.sin(Double.parseDouble(args[0])));
        System.out.println(Math.cos(Double.parseDouble(args[0])));
        // double != Double... you'll learn more about this later
        double a = Math.sin(Double.parseDouble(args[0]));
        double b = Math.cos(Double.parseDouble(args[0]));

        double result = (a*a) + (b*b);
        System.out.println(result);
    
    }
}
