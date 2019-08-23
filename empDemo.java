//Program to Calculate Net Salary of employers and Display them
//1BM18CS036
import java.util.*;
import java.io.PrintStream;
class employee{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    Scanner sc=new Scanner(System.in);
    String name, empnum;
    double basic, gs, it, ns;
    int a;
    void employee(){
        name="";
        empnum="";
        basic=0;
        gs=0;
        it=0;
        ns=0;

    }
    void input(int i){
        a=i;
        System.out.println(ANSI_RESET+"Enter the name of the Employee "+ (a+1) + " -");
        name = sc.next();
        System.out.println("Enter the Employer number of "+ ANSI_RED + name + ANSI_RESET+" -");
        empnum = sc.next();
        System.out.println("Enter the Basic salary "+ ANSI_RED+name+ANSI_RESET + " -");
        basic = sc.nextDouble();
    }
    void calc(){
        gs=basic+(0.75*basic);
        it=gs*0.3;
        ns=gs-it;
    }
    void display(){
        System.out.print("\nSalary details of "+ ANSI_RED+name+" (Employer Number - "+empnum+")"+ANSI_RESET);
        System.out.print("\n\nBasic Salary                       +");
        System.out.printf("%28.3f%n", basic);
        System.out.print("Dearness Allowance                 +");
        System.out.printf("%28.3f%n", 0.75*basic);
        System.out.print("________________________________________________________________\n");
        System.out.print("Gross Salary                       =");
        System.out.printf("%28.3f%n",gs);
        System.out.print("Income Tax                         -");
        System.out.printf("%28.3f%n",it);
        System.out.print("________________________________________________________________");
        System.out.print("\nNet Salary                         = ");
        System.out.printf("%27.3f%n", ns);
        System.out.print("________________________________________________________________\n\n");
    }
}
class empDemo{
    public static void main(String[] args){
        int n, choice;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of employees- ");
        n=s.nextInt();
        employee emp=new employee();
        System.out.println("Inputting data-");
        for(int i=0; i<n; i++){
            emp.input(i);
            emp.calc();
            emp.display();
        }
    }
}
