class shape{
    void getArea(){
        System.out.println("Area of Shape");
    }
}
class rectangle{
    void getArea(){
        System.out.println("Area of rectangle");
    }
}
public class override {
    public static void main(String[] args) {
        shape shp = new shape();
        rectangle rec = new rectangle();
        shp.getArea();
        rec.getArea();
    }
}
