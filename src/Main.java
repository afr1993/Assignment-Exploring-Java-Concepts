
public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        //Adrian Flores Rangel - Assignment: Exploring Java Concepts
        // Part 1=======================================================================================================

        System.out.println("Part 1");
        int age = 31;
        double height =  68.89;
        char initial = 'A';
        boolean isStudent = false;

        System.out.println("Age: "+age+"\n"+"Height: "+height+"\n"+"Initial: "+initial+"\n"+"Student: "+isStudent);

        //Part 2=====================================================================================================
        System.out.println("\nPart 2");
        int counter = 10;
        counter++;
        System.out.println("Counter++: "+counter);
        counter--;
        System.out.println("Counter--: "+counter);

        System.out.println("Counter For");
        for(counter=counter; counter<=15; counter++){
            System.out.println(counter);
        }
        System.out.println("\nCounter While");
        while (counter>10){
            counter--;
            System.out.println(counter);
        }

        //Part 3=====================================================================================================
        System.out.println("\nPart 3");
        System.out.println("Write your Name");
        String firstName = scanner.nextLine();

        System.out.println("Write your Last Name");
        String lastName = scanner.nextLine();

        String fullName = firstName+" "+lastName;
        System.out.println("Full Name: "+fullName);

        String upperCaseName = fullName.toUpperCase();
        System.out.println("Name In Upper Case: "+upperCaseName);

        char firstChar = upperCaseName.charAt(0);
        int countFirstChar = 0;

        for (int i = 0; i < fullName.length();i++){
            if(upperCaseName.charAt(i) == firstChar){
                countFirstChar++;
            }
        }

        System.out.println("First Character appears :"+countFirstChar+" Times");

        //Part 4=====================================================================================================
        System.out.println("\nPart 4");
        int score1 =75, score2=64, score3=82;
        int averageScore = (score1+score2+score3)/3;

        if (averageScore >= 90) {
            System.out.println("Excellent");
        } else if (averageScore >= 70) {
            System.out.println("Good");
        } else if (averageScore >= 50) {
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }
        int day = 7;
        switch (day){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day"); break;
        }

        //Part 5=====================================================================================================
        System.out.println("\nPart 5");
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