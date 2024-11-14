public class Bank {
    protected double transactionCharge = 50.0;

    public double getTransactionCharges() {
        return transactionCharge;
    }
}

public class ICICI extends Bank {
    @Override
    public double getTransactionCharges() {
        return transactionCharge + 20.0; // Custom logic for ICICI
    }
}

public class HDFC extends Bank {
    @Override
    public double getTransactionCharges() {
        return transactionCharge + 15.0; 
    }
}
public class Main {
    public static void main(String[] args) {
        Bank iciciBank = new ICICI();
        Bank hdfcBank = new HDFC();

        System.out.println("ICICI Transaction Charges: " + iciciBank.getTransactionCharges());
        System.out.println("HDFC Transaction Charges: " + hdfcBank.getTransactionCharges());
    }
}

