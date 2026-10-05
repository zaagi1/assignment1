import java.util.Date;

public class Loan {
    // Data fields (Attributes)
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // No-arg constructor with default values
    public Loan() {
        this(2.5, 1, 1000.0);
    }

    // Constructor with specified interest rate, years, and loan amount
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date(); // Automatically set to current date
    }

    // Getter methods
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    // Setter methods
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Calculate monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    // Calculate total payment
    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}
class LoanTest {
    public static void main(String[] args) {

        // Test no-argument constructor
        Loan loan1 = new Loan();

        System.out.println("===== LOAN 1 =====");
        System.out.println("Annual Interest Rate: "
                + loan1.getAnnualInterestRate() + "%");
        System.out.println("Number of Years: "
                + loan1.getNumberOfYears());
        System.out.println("Loan Amount: $"
                + loan1.getLoanAmount());
        System.out.println("Loan Date: "
                + loan1.getLoanDate());
        System.out.println("Monthly Payment: $"
                + loan1.getMonthlyPayment());
        System.out.println("Total Payment: $"
                + loan1.getTotalPayment());

        System.out.println();

        // Test constructor with specified values
        Loan loan2 = new Loan(5.0, 10, 50000);

        System.out.println("===== LOAN 2 =====");
        System.out.println("Annual Interest Rate: "
                + loan2.getAnnualInterestRate() + "%");
        System.out.println("Number of Years: "
                + loan2.getNumberOfYears());
        System.out.println("Loan Amount: $"
                + loan2.getLoanAmount());
        System.out.println("Loan Date: "
                + loan2.getLoanDate());
        System.out.println("Monthly Payment: $"
                + loan2.getMonthlyPayment());
        System.out.println("Total Payment: $"
                + loan2.getTotalPayment());

        System.out.println();

        // Test setters
        loan2.setAnnualInterestRate(6.0);
        loan2.setNumberOfYears(15);
        loan2.setLoanAmount(75000);

        System.out.println("===== AFTER USING SETTERS =====");
        System.out.println("Annual Interest Rate: "
                + loan2.getAnnualInterestRate() + "%");
        System.out.println("Number of Years: "
                + loan2.getNumberOfYears());
        System.out.println("Loan Amount: $"
                + loan2.getLoanAmount());
        System.out.println("Monthly Payment: $"
                + loan2.getMonthlyPayment());
        System.out.println("Total Payment: $"
                + loan2.getTotalPayment());
    }
}