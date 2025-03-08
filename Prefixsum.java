import java.util.*;
public class Prefixsum{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int prefixsum[]=new int[n];
        System.out.println("enter array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}
            prefixsum[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixsum[i]=prefixsum[i-1]+arr[i];}
            System.out.println("enter queries:");
            int q=sc.nextInt();
            for(int i=0;i<=q;i++){
            int L=sc.nextInt();
            int R=sc.nextInt();
            int sum=(prefixsum[R]-(L>0?prefixsum[L-1]:0));

            System.out.println(sum );

        }
    }
}