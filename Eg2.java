import java.util.Scanner;

public class Eg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print("Number of Queries to ask: ");
        int q = sc.nextInt();

        //precompute
        int[] hash = new int[26];
        for(int i = 0; i < str.length(); i++){
            hash[str.charAt(i) - 'a'] += 1;
        }

         while(q>0){

            //Fetch
            char ch = sc.next().charAt(0);
            //fetch
            System.out.println(hash[ch - 'a']);
            q--;
        
 
         }
    }
    
}
