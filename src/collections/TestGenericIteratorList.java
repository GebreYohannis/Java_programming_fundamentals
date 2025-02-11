package collections;

public class TestGenericIteratorList {
    public static void test() {
        GenericList<Integer> list = new GenericList<>();
        list.add(12);
        list.add(13);
        list.add(15);
        for (var current : list) {
            System.out.println(current);
        }

        // or
        var iterator = list.iterator();
        while(iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }
    }
}
