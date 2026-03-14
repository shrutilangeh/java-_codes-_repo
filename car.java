public class car {
    String brand;
    int price;
    car(String b, int p){
        brand = b;
        price = p;
    }
    car(){
    this("unknown",0);
    
    }
 void display(){
       
         System.out.println("Brand: "+brand);
          System.out.println("Price:"+price);
     }
      public static void main(String[] args){
                car s1 =new car("Range Rover",4000000);
                s1.display();
}
    }