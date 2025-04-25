public class Part_2 {
    public static void main(String[] args) {

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

    }
}
