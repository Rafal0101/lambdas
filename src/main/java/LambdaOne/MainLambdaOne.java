package LambdaOne;

public class MainLambdaOne {
    public static void main(String[] args) {
        StringLengthLambdaOne stringLengthLambda1 = s1 -> s1.length();
        int length = stringLengthLambda1.getLength("Hello lambda.");
        System.out.println(length);

        StringLengthLambdaTwo stringLengthLambda2 = (s1, s2) -> (s1.length() + s2.length());
        length = stringLengthLambda2.getLength("Hello the simplest lambda expression.", " Another words.");
        System.out.println(length);
    }
}
