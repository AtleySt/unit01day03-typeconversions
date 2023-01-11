class DoubleOps {
    public static void main(String[] args) {
        //System.out.println("Arg 1: " + args[0]);
        //System.out.println("Arg 2: " + args[1]);

        //abs command
        System.out.println("The absolute value of " + args[0] + " is " +Math.abs(Integer.parseInt(args[0])));

        //double abs
        System.out.println("The absolute value of " + args[1] + " is " + Math.abs(Double.parseDouble(args[1])));

        //double pow
        System.out.println(args[0]+ " to the power of " + args[1] + " is " +Math.pow(Double.parseDouble(args[0]), Double.parseDouble(args[1])));

        //double sqrt
        System.out.print("The square root of " + args[0] + " is " +Math.sqrt(Double.parseDouble(args[0])));
        System.out.println("The square root of " + args[1] + " is " +Math.sqrt(Double.parseDouble(args[1])));

        //double random
        System.out.println("Your random number is " + Math.random());
    }
}