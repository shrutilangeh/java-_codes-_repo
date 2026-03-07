import java.util.ArrayList;
import java .util.Scanner;

public class contain {
    public static void main(String []args){
    ArrayList<String>arl =new ArrayList<>();
    
        arl.add("Ram");
        arl.add("Sham");
        arl.add("Gansham");
        arl.add("radhesham");
        arl.add("Parshuram");

        String target;
        System.out.println("Enter a name:");
        Scanner sc = new Scanner(System.in);
        target = sc.nextLine();
        System.out.println(arl.contains(target));
    sc.close();
}
}