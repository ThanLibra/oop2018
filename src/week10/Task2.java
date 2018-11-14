package week10;


/**
 *
 * @author Admin
 */
public class Task2 {

    public double[] sort(double[] arr,int n){
        double tem;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Task2 lap=new Task2();
        double[]arr=new double[1000];
        for(int i=0;i<1000;i++){
            //arr[i]= random()*1000;
            arr[i] = 1000-i;
        }
        arr=lap.sort(arr,1000);
        for(int j=0;j<1000;j++)
        {
            System.out.println(arr[j]);
        }
    }

}
