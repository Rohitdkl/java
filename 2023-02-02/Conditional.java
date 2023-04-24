public class Conditional {
    public static void main(String[] args){
        double sum[]=new double[5];
        
        sum[0]=1.4;
        sum[1]=1.2;
        sum[2]=1.6;
        double total=0;
        for (int i = 0; i < sum.length; i++) {
           total=total+sum[i]; 
        }
        System.out.println("the sum of array element are"+total);
    }
}
