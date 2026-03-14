import java.util.Scanner;
class Message{
    String text;
    Message(String t){
        text=t;
    }
    
    void displayLength(){
        System.out.println("Length of the message: "+text.length());
    }
    void displayUppercase (){
        System.out.println("upercase string:"+text.toUpperCase());
    }
}
public class StringProgram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a message:");
        String input=sc.nextLine();
        Message msg=new Message(input);
        msg.displayLength();
        msg.displayUppercase();
    }
}    