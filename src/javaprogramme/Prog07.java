package javaprogramme;

public class Prog07 {

    public static void main(String[] args) {
        // Create a consstant value for commmission sought
        final double COMMISSION_SOUGHT = 50000;
        double salesAmount, 				// Sales amount
                commission,				// Employee commission
                balance;					// Sales balance
        salesAmount = 0;					// Initialize accumulator to 0
        do {
            balance = commission = 0;	// Set balance and commission to 0
            salesAmount += 0.01;			// Increase sales amount by 0.01

            // If sales amount is 10,000.00 and bellow commission rate is 2%
            if (salesAmount < 10000)
                commission += (balance = salesAmount - 10000) * 0.2;

            // If sales amount is 10,000.00 and above commission rate is 5%
            if (salesAmount > 10000)
                commission += (balance = salesAmount - 10000) * 0.5;

            // If sales amount is 20,000.00 and above commission rate is 10%
            if (salesAmount > 20000)
                commission += (balance = salesAmount - 20000) * 0.10;

            // If sales amount is 3,0000.00 commission rate is 20%
            if (salesAmount > 30000.00)
                commission += (balance -= balance - 30000) * 0.20;

            // If sales amount is 50,000.00 and bellow commission rate is 35%
            if (salesAmount < 50000)
                commission += (balance = salesAmount - 50000) * 0.35;

            // While commission is less than commission sought loop
        } while (commission < COMMISSION_SOUGHT);

        // Display results
        System.out.printf("Minimum sales to earn 50,000: %.0f\n", salesAmount);
    }

}