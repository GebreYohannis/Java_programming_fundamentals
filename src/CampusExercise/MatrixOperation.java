package CampusExercise;

public class MatrixOperation {
    public static void doOperation() {
        int randomArraySize = (int) Math.floor(Math.random()* 100 + 10);
        long[][] randomNumbers = new long[randomArraySize][randomArraySize];
        for (int i = 0; i < randomArraySize; i++) {
            for (int j = 0; j <randomArraySize; j++) {
                randomNumbers[i][j] = (long)Math.floor(Math.random()*100);
            }
        }

        long[][] anotherRandomNumbers = new long[randomArraySize][randomArraySize];
        for (int i = 0; i < randomArraySize; i++) {
            for (int j = 0; j <randomArraySize; j++) {
                anotherRandomNumbers[i][j] = (long)Math.floor(Math.random()*100);
            }
        }
        // Addition of two matrix
        long[][] additionResultOfRandomNumbers = new long[randomArraySize][randomArraySize];
        for (int i = 0; i < randomArraySize; i++) {
            for (int j = 0; j <randomArraySize; j++) {
                additionResultOfRandomNumbers[i][j] = randomNumbers[i][j] + anotherRandomNumbers[i][j];
            }
        }

        // Display addition result
        for (int i = 0; i < randomArraySize; i++) {
            for (int j = 0; j < randomArraySize; j++) {
                System.out.println(additionResultOfRandomNumbers[i][j]);
            }
        }
    }

}
