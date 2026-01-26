import java.util.Scanner;
class forloop1 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        for (int i = a;i<=b;i++)
        {
            System.out.println(i);
        }
    }
}