package CampusExercise;

public class DrawShape {
    public static void drawShape(int shapeSize) {
        System.out.println("******** Triangle **********");
        for (int i = 0; i < shapeSize; ++i){
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.print('\n');
        }

        System.out.println();
        for (int i = shapeSize; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.print('\n');
        }

        System.out.println();
        for (int i = 0; i < shapeSize; i++) {
            for (int j = 0; j < shapeSize; ++j) {
                if(j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }

        System.out.println();
        for (int i = shapeSize; i > 0; i--) {
            for (int j = 0; j < shapeSize; j++){
                if (j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.print('\n');
        }
    }
}
