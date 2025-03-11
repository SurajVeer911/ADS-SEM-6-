import java.util.*;
public class test{
    public static void test(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int arr[] =new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int max= arr[0];
        int secondmax= 0;
        for(int i=0;i<a;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
        }
        System.out.println("second largest no. is: "+secondmax);
    }

}

