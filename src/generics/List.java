package generics;

// The problem with the following code is
// that it only stores int object nothing more

public class List {
    private int[] items = new int[10];
    private int count = 0;

    public void add(int item) {
        items[count++] = item;
    }

    public int get(int index) {
        return items[index];
    }
}

// This can store any data types in a weak manner

class WeakSolutionForTheAboveProblem {
    private Object[] items = new Object[10];
    private int count = 0;

    public void add(Object item){
        items[count--] = item;
    }

    public Object get(int index) {
//        In a real implementation you have to check the validity for the index
        return items[index];
    }
}

class TestCode {
    public static void test() {
//        It works as we need, but it has some problem
        WeakSolutionForTheAboveProblem objectList = new WeakSolutionForTheAboveProblem();
        objectList.add(1);
        objectList.add(new Customer("@demisgech"));
        objectList.add(Integer.valueOf(3));
        objectList.add(Double.valueOf(3.5));
        objectList.add(Character.valueOf('a'));
        objectList.add(Boolean.valueOf(true));

//        int value = objectList.get(0);  // Compilation error
        int value = (int)objectList.get(0);

//        This is where Generics comes to the rescue.
//        Check it in the GenericList class
    }
}