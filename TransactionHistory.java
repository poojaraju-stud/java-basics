import java.util.*;
class TransactionHistory {
public static void main(String[] args) {
    Scanner r=new Scanner(System.in);
    System.out.println("enter amount to deposite:");
    int amount;
    int balance=0;
    while(true)
    {
        amount=r.nextInt();
        if(amount==0)
        {
            break;
        }
            balance+=amount;
    }
            System.out.println("Deposited: $"+balance);
    }
}