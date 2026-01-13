import java .util.Scanner;
class t1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num%3==0&&num%5==0)
            System.out.println("The number is divisible");
        else
            System.out.println("Not divisible");
    }
    
}
