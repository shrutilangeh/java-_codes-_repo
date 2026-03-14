
public class student {
           String name;
            int rollno;
            student(String n, int r)
            {name =n;
                rollno =r;
            }
           
            void display(){
            System.out.println("Name :" +name);
            System.out.println("Rollno: " +rollno);}
            public static void main(String[] args){
                student s1 =new student("ram", 23);
                s1.display();
            }
            }
