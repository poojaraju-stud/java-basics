import java.util.Scanner;
class forloop2 
{ 
    public static void main(String[] args)
    {   
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a:");
    int a=sc.nextInt();
    System.out.print("enter b:");
    int b=sc.nextInt();
    {           
        for(int i=a;i<=b;i+=2)
        if(i%2==0)  
        {
            System.out.println("even number:"+i);
        }
        else
        {
            System.out.println("odd number:"+i);
        }   
    }

    }

    
}
