package CampusExercise;

public class Teacher extends  Person{
    private String title;

    public Teacher(String title, String firstName, String lastName) {
        super(firstName, lastName);
        this.title = title;
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
