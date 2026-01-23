import java.util.Scanner;
class ternary 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String max=a>b?"a is greater":"b is greater" ;
        System.out.println(max);
    }
}
