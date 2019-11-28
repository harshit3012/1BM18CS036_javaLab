import Cie.*;
import See.*;
import java.util.*;
class packDemo{
	public static void main(String args[]){
		Student stuOb = new Student();							
		Internals intOb = new Internals();
		External extOb = new External();
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Student Info : \nName : " + stuOb.name + "\nUSN : " + stuOb.usn + "\nSem : " + stuOb.sem + "\nFinal Marks in 5 courses :");
		for(i = 0; i < 5; i++){
			System.out.println("Sub " + (i+1) + " : " + ((extOb.seemarks[i]) + intOb.marks[i]));
		}
	}
}
