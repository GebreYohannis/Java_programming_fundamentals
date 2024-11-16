package ControlFlow;

public class LogicalOperators {
    public static void doOperation() {
        float temperature = 30.1f;

        // Logical AND(&&)
        boolean isWarm = temperature > 20 && temperature < 40;
        System.out.println(isWarm);

        // Logical OR(||)

        byte age = 20;
        boolean hasDriverLicense = false;
        boolean isEligibleForDriving = age > 18 || hasDriverLicense;

//        Combined form
        boolean hasHighIncome = false;
        boolean hasGoodCreditScore = false;
        boolean hasCriminalRecord = false;
        boolean isEligibleForLoan = (hasGoodCreditScore || hasHighIncome) && !hasCriminalRecord;
        System.out.println(isEligibleForLoan);

        boolean isNotApprovedForLoan = !isEligibleForLoan;

        boolean isGithubUser = false;
        boolean hasUsername = true;
        boolean passwordMatch = false;
        boolean authenticated = isGithubUser && hasUsername && passwordMatch;
        System.out.println(authenticated);


    }
}
