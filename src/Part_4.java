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
    }
}
