import java.util.Scanner;
class insertion{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int[] arr={10,20,30,40};
        int[] newarr=new int[arr.length+1];
    System.out.print("enter position(0 to"+arr.length+"):");   
int pos=ip.nextInt();
System.out.print("enter element");
int value=ip.nextInt();
for(int i=0;i<pos;i++){
    newarr[i]=arr[i];

}
newarr[pos]=value;
for(int i=pos;i<arr.length;i++)
{
    newarr[i+1]=arr[i];
}
    System.out.println("array after insertion:");
    for(int num:newarr){
        System.out.println(num+"");
    }
}
}