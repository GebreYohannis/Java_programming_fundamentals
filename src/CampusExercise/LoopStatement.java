package CampusExercise;

public class LoopStatement {
    public static void doOperation() {
        // for loop

        int[] numbers  = new int[11];
        for(int i = 0; i < 11; ++i)
            numbers[i] = i*2;
        for (int i = 0; i < 11; ++i)
            System.out.println(numbers[i] + " " );

        // Range based for loop

        String[] nameList = new String[] {"Demis", "John", "Abebe", "kebede", "Alex", "Mark"} ;
        System.out.println("Name list:");
        for(String name: nameList)
            System.out.println(name);

        double[] prices = new double[] {12.3,45.6,65.5,65.6,45,65.5};
        double totalPrice = 0;
        for (double price: prices)
            totalPrice += price;
        System.out.println("Total Price: $" + totalPrice);

        // while loop

        int sum = 0;
        int i = 0;
        while (i <= 10) {
            sum += i;
            ++i;
        }
        System.out.println("Sum: " + sum);

        int anotherSum = 0;
        int j  = 0;
        boolean isRunning = true;
        while (isRunning) {
            if(j == 11)
                break;
            anotherSum += j;
            ++j;
        }
        System.out.println("AnotherSum: " + anotherSum);

        // do...while loop

        int k = 0;
        do {
            System.out.println("This loop executed at least one");
        } while(k >= 1);
    }
}
