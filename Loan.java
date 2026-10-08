import java.util.Date;
public class Loan {
    private double anualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // constructors
    public Loan() {
        anualInterestRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000;
        loanDate = new Date();
    }

    public Loan(double anualInterestRate, int numberOfYears, double loanAmount) {
        this.anualInterestRate = anualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    //getters and setters
    public double getAnualInterestRate() {
        return anualInterestRate;
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

    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = anualInterestRate / 1200;
        int numberOfPayments = numberOfYears * 12;

        return loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate,
                        numberOfPayments));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}

     class Test{

        public static void main(String[] args) {

            Loan loan = new Loan();

            System.out.println("Annual Interest Rate: "
                    + loan.getAnualInterestRate());

            System.out.println("Number of Years: "
                    + loan.getNumberOfYears());

            System.out.println("Loan Amount: "
                    + loan.getLoanAmount());

            System.out.println("Monthly Payment: "
                    + loan.getMonthlyPayment());

            System.out.println("Total Payment: "
                    + loan.getTotalPayment());

            System.out.println("Loan Date: "
                    + loan.getLoanDate());
        }
    }

