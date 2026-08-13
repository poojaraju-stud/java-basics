import java.util.*;
class GradeAnalyzer {
    
    public static void main(String[] args)
    {
        Scanner r=new Scanner(System.in);
        int sum=0;
        int c=0;
        int n=r.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=r.nextInt();
        }
        for(int m:a)
        {
            if(m>10)
            {
                c++;
                sum+=m;

            }
        }
            double avg=sum/n;
            System.out.println("Average mark is:"+avg);
            System.out.println("Count:"+c);
        
    }
}
