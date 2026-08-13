import java.util.*;
class EligiblityEngine {
    public static void main(String[] args)
    {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter CreditScore: ");
        int c=r.nextInt();
        System.out.print("Enter AnnualIncome: $");
        int a=r.nextInt();
        System.out.println("Enter ExistingDefault status:");
        boolean ExistingDefault=r.nextBoolean();
        if(ExistingDefault==false){
        if(c>700 && a>40000 )
            System.out.println("APProved");
        else if(c>600 && c<=700 && a>60000)
            System.out.print("Conditionally Approved");
        else
            System.out.println("Rejected.....");
        }

    
}
}
