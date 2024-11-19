package CampusExercise;

public class TestEmployee {
    public static void test() {
        Employee employee = new Employee();
        employee.setName("Demis");
        employee.setSalary(100_000);
        employee.showResult();

        Employee employee1 = new Employee();
        employee1.setName("John");
        employee1.setSalary(120_900);
        employee1.showResult();
    }
}
