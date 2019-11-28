package See;
import java.util.*;
import Cie.*;
public class External extends Cie.Student{
	public int seemarks[];
	public External(){
		Scanner s = new Scanner(System.in);
		seemarks = new int[5];
		System.out.println("Enter the SEE marks of 5 subject: \n");
		for(int i=0;i<5;i++) seemarks[i] = s.nextInt();
	}
}
