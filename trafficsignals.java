import java.util.Scanner;
class trafficsignals
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String color=sc.nextLine();
        if(color.equals("red"))
            System.out.println("STOP");
        else if(color.equals("yellow"))
            System.out.println("GET READY...");
        else if(color.equals("green"))
            System.out.println("GO");
        else
            System.out.println("INVALID COLOR");

    }
}
