import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String name = ip.nextLine();
        int age = ip.nextInt();
        ip.nextLine();
         String address = ip.nextLine();

        System.out.println("my name is "+name);
        System.out.println("my age is"+age);
        System.out.println("my address"+address);
    }
}
