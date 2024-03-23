import java.util.Scanner;
public class Bai41a {
    public static int[] inputArr(Scanner sc){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i< n ; i++){
            arr[i] = sc.nextInt();
        }return arr;
    }
    // y a
    public static void printArr(int arr[]){
        for(int i =0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }   
    }
    // y b
    public static int findMax(int arr[]){
        int max = arr[0];
        for(int i =0; i< arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }return max; 
    } 
    //y c
    public static int sumArr(int arr[]){
        int sum =0;
        for(int i =0; i< arr.length ; i++){
            sum +=arr[i] ;
        }return sum;
    }
    //y d
    public static void sortInc(int[] arr){
        int temp = 0;
        for(int i =0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static int findMinN(int[] arr, int n){
        sortInc(arr);
        int count=1;
        if(n==1){
            return arr[0];
        }
        for(int i =0; i< arr.length -1; i++){
            if (arr[i] == arr[i+1]){
                continue;
            }
            count ++;
            if(count == n){
                return arr[i+1];
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void printMinN(int[] arr, int n){
        int check = findMinN(arr, n);
        if(check < Integer.MAX_VALUE){
            System.out.print(check);
        }
        else{
            System.out.print("khong co");
        }
    }
    //y e
    public static boolean check(int[] arr){
        int diff =(arr[1]-arr[0]);
        for(int i =0; i< arr.length-1 ; i++){
            if( arr[i+1]- arr[i] !=diff){
                return false;
            }
        }return true;
    }
    //y f
    public static void sortDec(int[] arr){
        int temp = 0;
        for(int i =0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    temp = arr[j+1];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }printArr(arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr =inputArr(sc);
        printArr(arr);
        System.out.println(findMax(arr));       
        System.out.println(sumArr(arr));
        System.out.println(check(arr));
        sortDec(arr);
        /* y d
        sortInc(arr);
        int n = sc.nextInt();
        findMinN(arr,n);
        printMinN(arr,n);
        */
    }
}
