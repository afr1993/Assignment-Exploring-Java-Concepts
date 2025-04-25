public class Part_3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Part 3");
        System.out.println("Write your Name");
        String firstName = scanner.nextLine();

        System.out.println("Write your Last Name");
        String lastName = scanner.nextLine();

        String fullName = firstName+" "+lastName;
        System.out.println("Full Name: "+fullName);

        String upperCaseName = fullName.toUpperCase();
        System.out.println("Name In Upper Case: "+upperCaseName);

        char firstChar = upperCaseName.charAt(0); //First Character
        int countFirstChar = 0;//Counter of the first character

        for (int i = 0; i < fullName.length();i++){
            //Compare all the letters in the name with the first character
            if(upperCaseName.charAt(i) == firstChar){
                //Counts the times it appears
                countFirstChar++;
            }
        }

        System.out.println("First Character appears :"+countFirstChar+" Times");

        scanner.close();
    }
}
