import java.util.Scanner;
class t3
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your score:");
        int score=sc.nextInt();
        if(score<50)
            System.out.println(" need to improve your skill");
        else if(score>=50 && score<=70)
            System.out.println(" doing well");
        else
            System.out.println(" excellent performance");
    }
    
}
