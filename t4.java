import java.util.Scanner;
class t4 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the marks of five subjects:");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();
        int Totalmark=sub1+sub2+sub3+sub4+sub5;
        double avg=Totalmark/5; 
        System.out.println("The average is  "+avg);
        if(avg<35)
            System.out.println("Additional class is required");
        else
            System.out.println("you are good to go");

    }
}
