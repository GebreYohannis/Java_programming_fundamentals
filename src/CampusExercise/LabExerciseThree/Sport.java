package CampusExercise.LabExerciseThree;

public abstract class Sport {
    private String name;

    protected Sport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayStatistics();
}
