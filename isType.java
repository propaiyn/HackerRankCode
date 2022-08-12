import java.util.*;

public class isType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names would you like to enter?: ");
        int x = sc.nextInt();

        String[] name = new String[x];

        for(int i = 0; i < x; i++){
            System.out.println("Please enter name: " + i);
            name[i] = sc.nextLine(); // the index in the name array is equal to the users input
            
        }
        System.out.println(Arrays.toString(name));
        sc.close(); // close
    }
};