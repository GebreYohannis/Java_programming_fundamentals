package CampusExercise;

public class PuppyAge {
    public void pupAge() {
        int age = 20;
        age += 7;
        System.out.println("Puppy Age: " + age);
    }

    public void showResult() {
        PuppyAge puppyAge = new PuppyAge();
        puppyAge.pupAge();
    }
}
