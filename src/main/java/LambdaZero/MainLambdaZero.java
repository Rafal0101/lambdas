package LambdaZero;

public class MainLambdaZero {
    public static void main(String[] args) {
        ZeroLambda zeroLambda = (int loops) -> {
                System.out.println("Start of Lambda.");
                for (int i = 0; i < loops; i++) {
                    System.out.println("Step " + i);
                }
            System.out.println("End of Lambda");
        };

        zeroLambda.someMethod(10);
    }
}
