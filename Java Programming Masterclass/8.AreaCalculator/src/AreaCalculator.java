public class AreaCalculator {
    public static double area(double radius){
        if(radius < 0){
            return -1;
        }
        double circle = radius * radius * Math.PI;
        return circle;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }
        double size = x * y;
        return size;
    }
}
