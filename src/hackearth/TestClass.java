package hackearth;

/* IMPORTANT: Multiple classes and nested static classes are supported */


//import java.io.BufferedReader;
//import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();       // Reading input from STDIN
     

        

        // Write your code here
       String[] a =name.split(" ");
        for(String b:a){
        	System.out.println(b.trim());
        }
        
      

    }
}

