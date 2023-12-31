public class Main {
    public static void main(String[] args) {
        ShapFactory shapFactory=new ShapFactory();
        Shape shapeObj=shapFactory.getShape("Rectangle");
        shapeObj.draw();
    }
}