
package DataTypes;

import java.util.Arrays;

public class ArrayDataTypes {
    public ArrayDataTypes() {
    }

    public void doOperation() {
        int[] numbers = new int[]{1, 0, 3, 0, 0};
        String convertedNumbers = Arrays.toString(numbers);
        System.out.println(numbers);
        System.out.println(convertedNumbers);
        double[] lists = new double[]{12.2, 34.3, 56.5, 34.0};
        int length = lists.length;
        System.out.println(length);
        double[] cloned = lists.clone();
        String stringCloned = Arrays.toString(cloned);
        System.out.println(stringCloned);
        Arrays.sort(lists);
        System.out.println(Arrays.toString(lists));
        char[][] letters = new char[2][3];
        letters[0][0] = 'a';
        letters[0][1] = 'b';
        letters[0][2] = 'c';
        letters[1][0] = 'd';
        char[][] sameAsAbove = new char[][]{{'a', 'b', 'c'}, {'d'}};
        System.out.println(Arrays.deepToString(letters));
        System.out.println(Arrays.deepToString(sameAsAbove));
    }
}
