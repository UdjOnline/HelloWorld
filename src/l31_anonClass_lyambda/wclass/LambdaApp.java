package l31_anonClass_lyambda.wclass;

public class LambdaApp {
    public static void main(String[] args) {
        Operationable operation;
        operation = (x,y) -> x+y;
        Operationable operation1;
        operation1 = (int x, int y) -> x-y;
        Operationable operation2;
        operation2 = (int x, int y) -> x*y;

        int result = operation.calculate (10,20);
        System.out.println(result); //30
        System.out.println(operation1.calculate(20,10)); //10
        System.out.println(operation2.calculate(20,10)); //200
    }
}

interface Operationable{
    int calculate(int x, int y);
}