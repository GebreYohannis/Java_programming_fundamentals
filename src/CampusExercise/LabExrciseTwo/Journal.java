package CampusExercise.LabExrciseTwo;

public class Journal {
    private String authorName;
    private String paperTitle;
    private String submissionDate;

    // Constructor to initialize instance variables
    public Journal(String authorName, String paperTitle, String submissionDate) {
        this.authorName = authorName;
        this.paperTitle = paperTitle;
        this.submissionDate = submissionDate;
    }

    // Method to display all instance variables
    public void displayDetails() {
        System.out.println("Author Name: " + authorName);
        System.out.println("Paper Title: " + paperTitle);
        System.out.println("Submission Date: " + submissionDate);
    }

    // Method to return the title of the paper with each word capitalized
    public String getSubmissionDetails() {
        String[] words = paperTitle.split(" ");
        StringBuilder capitalizedTitle = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                capitalizedTitle.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return capitalizedTitle.toString().trim();
    }

    public static void test() {
        // Create a Journal object and test the methods
        Journal paper = new Journal("John Doe", "understanding artificial intelligence", "2024-11-25");
        paper.displayDetails();
        System.out.println("Capitalized Paper Title: " + paper.getSubmissionDetails());
    }
}
