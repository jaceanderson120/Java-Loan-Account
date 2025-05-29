
package loanaccount;


public class LoanAccount {
    static double annualInterestRate;
    private double principal;
    public LoanAccount(double principal){
        this.principal = principal;
    }
    public double calculateMonthlyPayment(int numberOfPayments){
        double monthlyInterest = annualInterestRate / 12;
        double monthlyPayment = principal * (monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -numberOfPayments)));
        return monthlyPayment;
    }
    public static void setAnnualInterestRate(double rate){
        annualInterestRate = rate;
    }
    public static void main(String[] args) {
        LoanAccount loan1 = new LoanAccount(5000.00);
        LoanAccount loan2 = new LoanAccount(31000.00);
        setAnnualInterestRate(0.01);
        double amountOne36 = loan1.calculateMonthlyPayment(36);
        double amountOne60 = loan1.calculateMonthlyPayment(60);
        double amountOne72 = loan1.calculateMonthlyPayment(72);
        double amountTwo36 = loan2.calculateMonthlyPayment(36);
        double amountTwo60 = loan2.calculateMonthlyPayment(60);
        double amountTwo72 = loan2.calculateMonthlyPayment(72);
        System.out.println("Monthly payments for loan1 of $" + loan1.principal + "0 and loan2 of $" + loan2.principal + "0 for 3, 5, and 6 years at 1% interest.");
        System.out.printf("Loan\t%1s\t%s\t%s%n", "3 Years", "5 Years", "6 Years");
        System.out.printf("Loan1\t%.2f\t%.2f\t%.2f%n",amountOne36,amountOne60,amountOne72);
        System.out.printf("Loan2\t%.2f\t%.2f\t%.2f%n",amountTwo36,amountTwo60,amountTwo72);
        setAnnualInterestRate(0.05);
        amountOne36 = loan1.calculateMonthlyPayment(36);
        amountOne60 = loan1.calculateMonthlyPayment(60);
        amountOne72 = loan1.calculateMonthlyPayment(72);
        amountTwo36 = loan2.calculateMonthlyPayment(36);
        amountTwo60 = loan2.calculateMonthlyPayment(60);
        amountTwo72 = loan2.calculateMonthlyPayment(72);
        System.out.println("Monthly payments for loan1 of $" + loan1.principal + "0 and loan2 of $" + loan2.principal + "0 for 3, 5, and 6 years at 5% interest.");
        System.out.printf("Loan\t%1s\t%s\t%s%n", "3 Years", "5 Years", "6 Years");
        System.out.printf("Loan1\t%.2f\t%.2f\t%.2f%n",amountOne36,amountOne60,amountOne72);
        System.out.printf("Loan2\t%.2f\t%.2f\t%.2f%n",amountTwo36,amountTwo60,amountTwo72);
    }
    
}
