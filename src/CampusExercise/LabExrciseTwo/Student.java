package CampusExercise.LabExrciseTwo;

public class Student {
    public Student(String name,
                   short age,
                   double width,
                   double height,
                   String type) {
        this.name = name;
        this.age = age;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    private String name;
    private short age;
    private double width;
    private double height;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void insert() {
        System.out.println("insert....");
    }

    public void filter(){
        System.out.println("filter....");
    }

    public void display() {
        System.out.println("display....");
    }

    public String undergraduate() {
        return type;
    }

    public double calculateBMI() {
        return (width) / (height * height);
    }
}
