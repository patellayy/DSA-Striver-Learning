import java.util.Scanner;
public class HashingEg1{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i < n; i++){
            arr[i] = sc.nextInt(); 
        }
        //pre compute
        //if problem states 12 then take 13 if states 10^3 then take 1001 em

        int[] hash = new int[13]; // in java automatically default set ot ZERO only
        for( int i = 0; i < n; i++){
            hash[arr[i]] += 1;
        }

        System.out.print("Number of Queries to ask: ");
        int q = sc.nextInt();
        while(q>0){

            //Fetch
            int numb = sc.nextInt();
            System.out.print(hash[numb]);
            q--;

        }


    }
    
}