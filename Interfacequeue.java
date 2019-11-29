import java.util.*;
interface IQueue {
	void insert(int ele);
	void delete();
	boolean isEmpty();
} 

class Queue implements IQueue {
	Scanner s = new Scanner (System.in);
   	int f = 0,r = -1,n;
	
	int a [];	
	Queue() {
   	System.out.println("Enter the size:  \n");
	n = s.nextInt();
	a = new int[n];
   }
   public void insert(int ele) {
	if(r == n-1) {
		System.out.println("Queue is full!");
		int temp[] = new int[2*n];
		int i;
		for(i=0;i<n;i++) temp[i] = a[i];
		a=temp;
		n = 2*n;
		a[i++] = ele;
	}
	else {
		a[++r] = ele;
	}
   }

	public void delete() {
	 if(isEmpty()) {
		System.out.println("Queue is empty!");
   		}
	else {
   		int ele = a[f++];
		System.out.println("Deleted element: " + ele);
		}
	}
	public boolean isEmpty() {
		if(f>=r) return true;
		else return false;
	}
	void display() {
		if(f>=r) {
			System.out.println("Queue Empty!");
		}
		else {
			int i;
			for(i=f;i<=r;i++) System.out.println(a[i]);
		}
	}
}

class Interfacequeue {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		Queue ob = new Queue();
		while(true) {
		System.out.println("Enter 1 to insert\n2 to delete\n3 to display\n");
	   	int n = s.nextInt();
		switch(n) {
			case 1:	System.out.println("Enter the element: ");
					int ele = s.nextInt();
					ob.insert(ele);
					break;
			case 2:ob.delete();
					break;
			case 3: ob.display();
					break;
			default: System.out.println("INVALID ENTRY!");
			}	
	}
	}
}	

