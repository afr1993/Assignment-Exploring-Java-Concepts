public class Part_5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Part 5");
        double result = 0;
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select your operation OPTIONS:(+,-,*,/)");
        char operation = scanner.next().charAt(0);

        switch (operation){
            case '+': result = num1+num2; break;
            case '-': result = num1-num2; break;
            case '*': result = num1*num2; break;
            case '/':
                if(num2==0){
                    System.out.println("Divide by Zero not define");
                }else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Invalid Operation"); break;
        }

        System.out.println("Result :"+result);

        System.out.println("Increment result (+) or Decrement result(-)");
        char option = scanner.next().charAt(0);

        if(option == '+'){
            result++;
        }else if(option == '-') {
            result--;
        }

        System.out.println("Final result :"+result);

        scanner.close();
    }
}
