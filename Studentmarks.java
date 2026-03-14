import java.util.Scanner;
class Student{
    int[] marks = new int[5];

    Student(int[] m){
        for(int i=0; i<5; i++){
            marks[i] = m[i];
        } 
    }
    double calculateAverage() {
int sum =0;
for(int i=0; i<5; i++){
    sum += marks[i];
}
return (double) sum / 5;
    }
}
public class Studentmarks{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int[] m = new int[5];
System.out.println("enter marks of 5 subjects:");
for(int i = 0; i<5 ; i++){
    m[i]=sc.nextInt();
}
 Student s = new Student(m);
System.out.println("Average marks:"+s.calculateAverage());
 sc.close();}
}
