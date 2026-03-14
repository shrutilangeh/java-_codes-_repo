public class employee {
    String name;
    String designation;
    int salary;
    employee( String n, String d, int s){
        name = n;
        designation = d;
        salary = s;
    }
    void display(){
        
        System.out.println("Name: "+name);
        System.out.println("Designation: "+designation);
        System.out.println("Salary : "+salary);
    }
    public static void main(String[] args){
                employee s1 =new employee("Anupam","CEO", 500000);
                s1.display();
}
}