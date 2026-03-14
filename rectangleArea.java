public class rectangleArea {
    int length;
    int width;
    rectangleArea(int l,int w )
    { length = l;
        width =w;
    }
    void displayArea(){
        int area = length*width;
    System.out.println( "Area of the rectangle : "+ area);
    }
     public static void main(String[] args){
                rectangleArea s1 =new rectangleArea(5, 3);
                s1.displayArea();
}
}