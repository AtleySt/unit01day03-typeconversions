public class TrigIdentity {
    public static void main(String[] args) {
        System.out.println(Math.sin(Double.parseDouble(args[0])));
        System.out.println(Math.cos(Double.parseDouble(args[0])));
        Double a = Math.sin(Double.parseDouble(args[0]));
        Double b = Math.cos(Double.parseDouble(args[0]));

        Double result = (a*a) + (b*b);
        System.out.println(result);
    
    }
}
