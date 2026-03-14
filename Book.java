public class Book {
    String title;
    int price;
  Book(){
    title ="Unknown";
    price  = 0;
  } 
  Book(String t,int p) {
    title =t;
    price =p;
     }
     void display(){
       
         System.out.println("Title: "+title);
          System.out.println("Price:"+price);
     }
      public static void main(String[] args){
                Book s1 =new Book("Atom ", 300);
                s1.display();
}
}
