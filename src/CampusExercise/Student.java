package CampusExercise;

public class Student extends Person{
    private String title;

    public String getTitle() {
        return title;
    }

    public Student(String title, String firstName, String lastName) {
        super(firstName, lastName);
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullName() {
        return title + " " + super.getFullName();
    }

}
