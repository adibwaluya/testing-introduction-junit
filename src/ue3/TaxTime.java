package ue3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxTime {
    static int nFamilyMembers;
    static int famMember;
    static int exemption;
    static double income;
    static double taxTotal;

    public static void main(String[] args) {

        // A Reader stream to read from the console
        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println ("Welcome to the new Berlin tax calculator.");
        System.out.print   ("How much did you earn last year? ");
        try {
            income = Double.parseDouble(in.readLine());
        } catch (NumberFormatException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

//     check income
//     independent path: 2
        if (income < 0) {
            System.out.println ("Even in Berlin, no one has a negative income!");
            System.out.println ("Start over.");
            System.exit (-1);
        }

        System.out.print("Enter the number of dependents you have, including yourself: ");
        try {
            String s = in.readLine();
            nFamilyMembers = Integer.valueOf(s).intValue();
        } catch (IOException e) {
            e.printStackTrace();
        }

//     check number of family members
//     independent path: 2
        if (nFamilyMembers <= 0) {
            System.out.println("Did you forget to count yourself?");
            System.out.println ("Start over.");
            System.exit (-1);
        }

//    compute tax total
//     independent path: 3
        if (income < 10000)
        taxTotal = 0.12 * income;
      else if (income < 50000)
        taxTotal = 300.00 + 0.24 * (income - 10000);
      else
        taxTotal = 1500.00 + 0.36 * (income - 50000);

        for (int i = 0; i <= nFamilyMembers; i++){
            taxTotal = taxTotal - 100;
        }

//    check negative tax
//     independent path: 2
        if (taxTotal < 0) // In case of negative tax
        taxTotal=0;

        System.out.println ("=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬");
        System.out.println ("Berlin GmbH");
        System.out.println ("Tax bill");
        System.out.println ("Your income was " + income + " â‚¬.");
        System.out.println ("You have " + nFamilyMembers + " family members.");
        System.out.println ("Your total tax is " + taxTotal + " â‚¬.");
        System.out.println ("Family member tax saving is " + nFamilyMembers*100 + "â‚¬.");
        System.out.println ("=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬=â‚¬");
    }

    // Methods based on founded independent paths
    String checkIncome(int income) {
        if (income < 0) return "Even in Berlin, no one has a negative income!";
        return "Correct income input";
    }

    String checkFamilyMember(int nFamilyMembers) {
        if (nFamilyMembers <= 0) return "Did you forget to count yourself?";
        return "Valid input";
    }

    String checkComputeTaxTotal(int income) {
        famMember = 1;
        if (income < 10000) {
            taxTotal = 0.12 * income;
            taxTotal = taxTotal - ((famMember+1)*100);
            return "You have low income. Your tax is: " + taxTotal;
        } else if (income < 50000) {
            taxTotal = 300.00 + 0.24 * (income - 10000);
            taxTotal = taxTotal - ((famMember+1)*100);
            return "You have medium income. Your tax is: " + taxTotal;
        } else {
            taxTotal = 1500.00 + 0.36 * (income - 50000);
            taxTotal = taxTotal - ((famMember+1)*100);
            return "You have high income. Your tax is: " + taxTotal;
        }
    }

    Integer checkNegativeTaxTotal(int taxTotal) {
        int endTaxTotal;
        if (taxTotal >= 0) return taxTotal;
        return endTaxTotal = 0;
    }
}
