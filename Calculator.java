
class Calculator {

    static int addition(int a, int b) {
        return a + b;
    }

    static int substraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int add_res = addition(7, 8);
        int sub_res = substraction(8, 7);
        int mult_res = multiplication(8, 7);
        int div_res = division(8, 2);

        System.out.println("Addition of 7,8 = " + add_res);
        System.out.println("Substraction of 8,7 = " + sub_res);
        System.out.println("Multiplication of 8,7 = " + mult_res);
        System.out.println("Divistion of 8,2 = " + div_res);
    }
}
