import java.util.Arrays;
public class LCM {

public static int lcmofarray(int[] arr, int start, int end){
        if ((end-start)==1){
            return lcm(arr[start],arr[end-1]);
        }
        else{ 
            return (lcm (arr[start], lcmofarray(arr, start+1, end)));

        }
}
    public static int lcm(int a, int b){
        int num1, num2;
        if(a>b){
            num1 = a;
            num2 = b;
        }else{
            num1 = b;
            num2 = a;
        }
        for (int i=1; i<= num2; i++){
            if((num1*i) % num2==0){
            return i* num1;
            }
        }
        return -1;
    } 


  
    public static void main(String[] args) {
      
       System.out.println(lcmofarray(new int []{1,2,3,4,5},0,5));
    }     
}
