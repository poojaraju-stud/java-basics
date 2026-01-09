import java.util.Scanner;
class q2 
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        double Score=sc.nextDouble();
        sc.nextLine();
        String dep=sc.nextLine();
        Score=Score/10;
        System.out.println("my name is "+name);
        System.out.println("my score is "+Score+"/10");
        System.out.println("my departement is "+dep);
    }
    
}
