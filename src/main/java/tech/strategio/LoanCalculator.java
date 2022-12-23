package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * 
     * @param ???
     * @return ???
     */
    static int getRemainingAmountIn3Months(int amount) {
        int remainingAmount = amount;
        int payment = 0;

        for(int i =0; i<3; i++){
            payment = (remainingAmount/10);
            remainingAmount = remainingAmount - payment;


        }
        return remainingAmount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
