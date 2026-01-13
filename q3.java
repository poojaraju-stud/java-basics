import java.util.Scanner;
class q3
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int a=ip.nextInt();
        int b =ip.nextInt();
        if(a==b)
                System.out.println("a and b are equal");
        else if (a>b)
            System.out.println("a is greater than b");
        else
            System.out.println("b is greater than a");

    
    }
}
