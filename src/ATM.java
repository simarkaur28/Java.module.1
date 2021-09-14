/*Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance after an attempted transaction.
  Input:
  Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.
  Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.
*/
//question from codechef pravtice beginners
public class ATM
{
    public static void main(String[] args)
    {
        double withdraw_amt = 20, account_balance = 1000;

        //check input
        if(withdraw_amt > 0 && withdraw_amt <= 2000 && withdraw_amt%5==0 && account_balance > 0 && account_balance > withdraw_amt);
        {
            account_balance=account_balance- withdraw_amt-.5;
        }
        System.out.println("Balance :"+account_balance);
    }
}


/*
1.input amt 0 to 2000
2.amt should be multiple of 5 and non negative, two digit precision
3. balance >cash withdrawn
4. deduct charges 0.50 dollars US
5. calculate
6. output
 */