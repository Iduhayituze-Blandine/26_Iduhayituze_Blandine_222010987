class Interest{

    // This object called Interest is going to implement two methods

    // This method: SimpleInterest, calculates Mr. Bob's simple interest on deposit 

    public double SimpleInterest(int principal, int years, double interest_rate){
        return principal * years * interest_rate/100;
    }
    /* This method: Amount, calculates the amount Mr. Bob will have paid on a loan after certain 
    period of time with the principal amount included using compound interest */

    public double Amount(int principal, int years, double interest_rate, int compoundedperiod){
        int m = years * compoundedperiod;
        for (int n = 1; n <= m; n++){
            principal += principal * (interest_rate/100) /compoundedperiod;
        }
        return principal; 
    }
}
public class MrBob {
    public static void main(String[] args){
        Interest OfBob = new Interest();
        
        double BobInterst = OfBob.SimpleInterest(100000, 5, 5);
        System.out.println("\nThe simple interest of Mr. Bob after 5 years is Rwf " + Math.round(BobInterst));

        double BobPaid = OfBob.Amount(500000, 3, 18, 12);
        System.out.println("\nThe amount on the loan, Mr. Bob will have paid after 3 years is Rwf " + Math.round(BobPaid) + "\n");
    }
}
