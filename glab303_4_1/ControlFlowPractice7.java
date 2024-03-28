package glab303_4_1;

import java.util.Scanner;

public class ControlFlowPractice7 {
    /*
        Create a program that lets the users input their filing status and
        income. Display how much tax the user would have to pay
        according to status and income.
        ❑ The U.S. federal personal income tax is calculated based
        on the filing status and taxable income.
        ❑ There are four filing statuses: Single, Married Filing Jointly,
        Married Filing Separately, and Head of Household.
        ❑ The tax rates for 2009 are shown below.

     */

    public static void main(String[] args) {


        double[][] brackets = {
                {8350, 8351, 33951, 82251, 171551, 372951}, //Single
                {16701, 67901, 137051, 208851, 372951}, //Married Filing Jointly
                {8351, 33951, 68526, 104426, 186476}, //Married Filing Seperately
                {11951, 45501, 117451, 190201, 372951} //Head of Household
        };

        double[] rates = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35}; //Tax  rates

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your filing status (Single,  Married Filing Jointly, Married filing separately,  Head of Household: ");
        String status = scanner.nextLine();
        System.out.println("Enter your taxable income: ");
        double income = scanner.nextDouble();

        // Calculate tax amount based on filing status and income.

        int statusIndex = getStatusIndex(status);
        double tax = calculateTax(income, brackets[statusIndex], rates);

        //Displays the calculated tax amount
        System.out.println("Your tax amount is: $" + tax);
    }

        private static int getStatusIndex(String status) {
            switch (status.toLowerCase()) {
                case "single":
                    return 0;
                case "married filing jointly":
                    return 1;
                case "married filing separately":
                    return 2;
                case "head of household":
                    return 3;
                default:
                   throw new IllegalArgumentException("Invalid filing status");
            }
        }
        // This  method calculates tax amount based on income and tax brackets
        private static double calculateTax(double income, double[] brackets, double[] rates) {
            double tax = 0;
            for (int i = 0; i < brackets.length - 1; i++) {
                if (income <= brackets[i + 1]) {
                    tax += (income - brackets[i]) * rates[i];
                    break;
                } else {
                    tax += (brackets[i + 1] - brackets[i]) * rates[i];
                }
            }
            return tax;


        }


    }

