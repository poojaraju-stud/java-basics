import java.util.*;
class TemperatureAnomaly {
    public static void main(String[] args)
    {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        double[] temp=new double[n];
        System.out.println("Enter temperature readings: ");
        double sum=0;
        for(int i=0;i<n;i++)
        {
            temp[i]=r.nextDouble();
            sum+=temp[i];
        }
    double avg=sum/n;
    double threshold=5.0;
    System.out.println("\n Average Temp:"+avg+"'C");
    System.out.println("Anomaly Threshold:"+threshold+"'C");
    System.out.println("Temperature ");
    boolean anomalyFound=false;
    for(int i=0;i<n;i++){
    double difference=temp[i]-avg;
    if(Math.abs(difference)>threshold){
        anomalyFound=true;
        if(difference>0){
            System.out.println("Reading"+(i+1)+":"+temp[i]+"'C -> HIGH TEMPERATURE ANOMALY");

        }
        else{
            System.out.println("Reading"+(i+1)+":"+temp[i]+"'C->LOW TEMPERATURE ANOMALY");
        }
    }
    else{
        System.out.println("Reading"+(i+1)+":"+temp[i]+"'C->Normal");
    }
    }    
    if(!anomalyFound){
        System.out.println("\nNo temperature anomalies detected...");
    }
}

}