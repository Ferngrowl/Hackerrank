import java.util.Scanner;

public class JavaStaticInitializerBlock {
	static int B;
	static int H;
	static boolean flag;
	static {   
	    Scanner scan = new Scanner(System.in);
	    B = scan.nextInt();
	    H = scan.nextInt();
	    if (B < 1 || H < 1) {
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	    } else {
	        flag = true;
	    }
	    scan.close();
	}
}
