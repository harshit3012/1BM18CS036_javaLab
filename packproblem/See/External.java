package See;
import java.util.*;
import Cie.*;
public class External extends Cie.Student{
	public int seemarks[];
	Scanner s = new Scanner(System.in);
	public External(){
		seemarks = new int[5];
		System.out.println("Enter the SEE marks of 5 subject: ");
		for(int i=0 ; i < 5 ; i++)
			seemarks[i] = s.nextInt();
	}
}
