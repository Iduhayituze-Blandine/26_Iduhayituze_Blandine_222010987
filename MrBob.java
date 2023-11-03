class Interest{
    public double SimpleInterest(int principal, int years, double interest_rate){
        return principal * years * interest_rate/100;
    }

    public double LoanInterest(int principal, int years, double interest_rate, int compoundedperiod){
        return principal * Math.pow(( 1 + (interest_rate/100)/compoundedperiod), (compoundedperiod * years));
    }
}
public class MrBob {
    public static void main(String[] args){
        Interest OfBob = new Interest();
        
        double BobInterst = OfBob.SimpleInterest(100000, 5, 5);
        System.out.println("\nThe simple interest of Mr. Bob after 5 years is Rwf " + Math.round(BobInterst));

        double BobPaid = OfBob.LoanInterest(500000, 3, 18, 12);
        System.out.println("\nThe amount on the loan, Mr. Bob will have paid after 3 years is Rwf " + Math.round(BobPaid) + "\n");
    }
}
