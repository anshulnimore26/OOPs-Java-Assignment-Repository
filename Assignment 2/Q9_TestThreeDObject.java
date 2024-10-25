abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}
class Box extends ThreeDObject {
    double length, width, height;
    Box(double l, double w, double h) {
        length = l; width = w; height = h;
    }
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
    double volume() {
        return length * width * height;
    }
}
class Cube extends ThreeDObject {
    double side;
    Cube(double s) {
        side = s;
    }
    double wholeSurfaceArea() {
        return 6 * side * side;
    }
    double volume() {
        return side * side * side;
    }
}
class Cylinder extends ThreeDObject {
    double radius, height;
    Cylinder(double r, double h) {
        radius = r; height = h;
    }
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    double volume() {
        return Math.PI * radius * radius * height;
    }
}
class Cone extends ThreeDObject {
    double radius, height;
    Cone(double r, double h) {
        radius = r; height = h;
    }
    double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }
    double volume() {
        return Math.PI * radius * radius * height / 3;
    }
}
public class Q9_TestThreeDObject {
    public static void main(String[] args) {
        ThreeDObject box = new Box(2, 3, 4);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());
        ThreeDObject cube = new Cube(3);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());
    }
}
