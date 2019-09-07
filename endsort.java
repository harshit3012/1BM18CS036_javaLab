import java.util.*;
class endsort {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    static void work(int array[], int smallest){
        int a;
        for (a = 0; a < (array.length - 1); a++){
            if(array[a] == smallest){
                break;
            }
        }
        int i;
        for (i = a; i < (array.length - 1); i++){
            array[i] = array[(i + 1)];
        }
        array[(array.length - 1)] = smallest;
    }
    static boolean check(int array[]){
        int ch = 1;
        for (int i = 0; i < (array.length - 1); i++){
            if (array[i] > array[i+1]){
                ch = 0;
            }
        }
        if (ch == 0){
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args){
        String line;
        Scanner sc = new Scanner(System.in);
        System.out.println(ANSI_CYAN + "----------------------- END SORT PROGRAM -----------------------");
        System.out.println(ANSI_RESET + "Enter the integers to be sorted " + ANSI_YELLOW + "(Separated by whitespace) -");
        line = sc.nextLine();
        String arr[] = line.split(" ");
        int ints[] = new int[arr.length];
        for(int i = 0; i < ints.length; i++){
            ints[i] = Integer.parseInt(arr[i]);
        }
        boolean done = false;
        while(!done){
            done = check(ints);
            if(done){
                break;
            }
            else {
                int no_of_smalls = 0;
                int smalls[] = new int[ints.length];
                int i, j, k;
                for (i = 0; i < (ints.length - 1); i++) {
                    for (j = (i + 1); j < ints.length; j++) {
                        if (ints[i] > ints[j]) {
                            smalls[no_of_smalls] = ints[i];
                            no_of_smalls += 1;
                            break;
                        }
                    }
                }
                int smallest = 2147483647;              //This makes sure smallest is initialized
                for (k = 0; k < no_of_smalls ; k++){
                    if(k == 0){
                        smallest = smalls[0];
                    }
                    else {
                        if (smallest > smalls[k]){
                            smallest = smalls[k];
                        }
                    }
                }
                work(ints, smallest);
            }
        }
        System.out.println(ANSI_YELLOW + "\nThe sorted elements are -\n" + ANSI_CYAN);
        for (int z : ints){
            System.out.print(z + " ");
        }
        System.out.print("\n");
    }
}