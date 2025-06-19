import java.util.*;
/*
NOTE :- In case of larger numbers like 10^7 (1e7) or 10^6 (1e6) etc we need to realize that the
computer cant allocate this much memory in one go .
Like if i want to do arr[1e7] inside the main function (main string args one) then it wont be able to
allocate that much memory , inside the main function it can only allocate 1e6 (10^6) , but if i declare the
array globally like outside the main function then it can hold/allocate till 1e7 (10^7).
 */
public class HashTut1 {
    public static void hash1(int arr[], int q[], int hash[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<q.length;j++){
                if(arr[i]==q[j]){
                    hash[q[j]]=hash[q[j]]+1;
                }
                else{
                    continue;
                }
            }
        }
        for(int m=0;m< hash.length;m++){
            for(int p=0;p<q.length;p++){
                if(m==q[p]){
                    System.out.println("Frequency of "+m+" is "+hash[m]);
                }
                else{
                    continue;
                }
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //Array Input
        System.out.println("Enter size of array = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Input elements in array = ");
        for(int k=0;k<size;k++){
            arr[k]= sc.nextInt();
        }
        //Queries
        System.out.println("Enter number of queries = ");
        int n = sc.nextInt();
        int q[] = new int[n];
        System.out.println("Enter queries = ");
        for(int k=0;k<n;k++){
            q[k]= sc.nextInt();
        }
        // Hash Array
        int hash[] = new int[15];
        // Allocating all elements of hash array = 0
        for(int k=0;k<n;k++){
            hash[k]=0;
        }
        hash1(arr,q,hash);
    }
}