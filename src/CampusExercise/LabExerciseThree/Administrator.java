package CampusExercise.LabExerciseThree;

public class Administrator extends Employee {

    public Administrator(int id, String name) {
        super(id, name);
    }

    @Override
    public void performance() {
        System.out.println("Administrator");
    }
}
