package CampusExercise;

public class RandomProductPrice {
    public static void generateRandomPrice() {
        int randomPriceSize = (int)Math.floor(Math.random()*100 + 10);
        float[] randomPriceList = new float[randomPriceSize];
        for (int i = 0; i < randomPriceSize; i++) {
            randomPriceList[i] = (float)(Math.random()*100);
        }
        double totalPrice = 0;
        for (float price: randomPriceList)
            totalPrice += price;
        for (float price: randomPriceList)
            System.out.println(price);
        System.out.println("Total Price: $" + totalPrice);
    }
}
