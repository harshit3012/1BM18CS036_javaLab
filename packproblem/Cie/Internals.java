package Cie;

import java.util.*;
public class Internals{
	public int marks[];
	Scanner s = new Scanner(System.in);
	public Internals(){
		marks = new int[5];
		System.out.println("Enter the CEE marks in 5 subjects: ");
		for(int i = 0 ; i < 5 ; i++)
			marks[i] = s.nextInt();
	}
}
