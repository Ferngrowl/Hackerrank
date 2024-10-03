import java.util.Scanner;

public class JavaEndofFile {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int a = 1;
        
        while (scan.hasNext()) {  
            System.out.println(a + " " + scan.nextLine());  
            a++;
        } 
        scan.close();  
    }
}
