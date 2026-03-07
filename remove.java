import java.util.ArrayList;
import java.util.Scanner;

public class remove {
    public static void main(String []args){
       ArrayList<Integer>numbers =new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);            
    
       int target;
       System.out.println("Enter a number:");
       Scanner sc = new Scanner(System.in);
       target = sc.nextInt();
       numbers.removeIf(n->n == target);
       System.out.println(numbers);

    
}
}