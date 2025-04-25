public class Part_4 {
    public static void main(String[] args) {
        System.out.println("Part 4");
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

        int day = 4;
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

    }
}
