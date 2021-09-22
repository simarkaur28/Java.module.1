/*Exp no 1

    Write a Menu driven program in java to implement simple banking applications.
    Application should read the customer name, account number, initial balance,
    rate of interest, contact number and address field etc.
    Application should have following methods.
            1. createAccount()
            2. deposit()
            3. withdraw()
            4. computeInterest()
            5. displayBalance()
*/


import java.util.Scanner;
public class Bankingsys1
{
    static int deposit(int amt, int cbal)           //method deposit()
    {
        cbal = cbal + amt;
        return cbal;
    }

    static int withdrawn(int amt, int cbal)           //method withdraw()
    {
        cbal = cbal - amt;
        return cbal;
    }

    static int computeInterest(int cbal, int years)    //method computeInterest()
    {
        cbal = (int) (cbal + cbal* 0.03 * years);           //rate=0.03
        return cbal;
    }

    public static void main(String[] args) {
        int choice, amt, years;
        String cbal, cid;
        String cphoneno, cadd, cname;
        boolean quit = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Customer ID:");
        cid = in.nextLine();
        System.out.println("Customer Name:");
        cname = in.nextLine();
        System.out.println("Address:");
        cadd = in.nextLine();
        System.out.println("Contact Number:");
        cphoneno = in.nextLine();
        System.out.print("Initial Balance: Rs ");
        cbal = in.nextLine();
        int bal = Integer.parseInt(cbal);

        System.out.println("Customer Name: " + cname);
        System.out.println("Customer ID: " + cid);
        System.out.println("Contact number: " + cphoneno);
        System.out.print("Initial Balance: Rs " + cbal);
        System.out.println("Address: " + cadd);
        do {
            System.out.println("\n1.Create account. \n2.Deposit Amount. \n3.Withdraw amount.\n4.Compute Interest \n5.Display balance.\n0 to Quit");
            System.out.println("Enter the choice you want to execute:");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Account is created.");
                    break;
                case 2:
                    System.out.print("Enter Amount To be deposited:Rs ");
                    amt = in.nextInt();
                    bal = deposit(amt, bal);                                    //method calling ; b is to store new balance
                    System.out.println("Amount Deposited! Current Balance:" +bal);
                    break;
                case 3:
                    System.out.print("Enter Amount To be Withdrawn:Rs ");
                    amt = in.nextInt();
                    bal = withdrawn(amt, bal);
                    System.out.print("Amount Withdrawn! Current Balance: Rs" +bal);
                    break;
                case 4:
                    System.out.print("Enter No. of years: ");
                    years = in.nextInt();
                    bal = computeInterest(bal, years);
                    System.out.print("Total amount accured is: Rs" + bal);
                    break;
                case 5:
                    System.out.print("Balance: Rs" + bal);
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Input. Try again!");

            }
        }
        while (!quit);
        System.out.println("Sayonara!");
    }
}