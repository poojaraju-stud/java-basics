import java.util.*;
class Dynamic {
public static double calculateFare(double baseFare,int hour,boolean isRaining){
    double finalFare=baseFare;
    boolean isPeakHour=(hour >= 7 && hour <=9)||(hour >=17 && hour<=20);
    if(isPeakHour){
        finalFare*=1.20;
    }
    if(isRaining){
    finalFare*=1.10;
    }
    return Math.round (finalFare*100.0)/100.0;
}   
public static void main(String[] args)
{
    Scanner s= new Scanner(System.in);
    double baseFare=s.nextDouble();
    int hour =s.nextInt();
    boolean isRaining =s.nextBoolean();
    double finalFare= calculateFare(baseFare,hour,isRaining);
    System.out.println("Final Fare:"+finalFare);
} 
}
