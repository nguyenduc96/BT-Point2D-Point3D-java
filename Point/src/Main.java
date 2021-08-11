import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5, 5);
        System.out.println("init X Y");
        System.out.println(point2D.toString());
        System.out.println("X = " + point2D.getX());
        System.out.println("Y = " + point2D.getY());
        System.out.println("Array XY = " +Arrays.toString(point2D.getXY()) + "\n");
        point2D.setX(6);
        System.out.println("Edit X");
        System.out.println(point2D.toString());
        System.out.println("X = " + point2D.getX());
        System.out.println("Y = " + point2D.getY());
        System.out.println("Array XY = " +Arrays.toString(point2D.getXY()) + "\n");
        point2D.setY(7);
        System.out.println("Edit Y");
        System.out.println(point2D.toString());
        System.out.println("X = " + point2D.getX());
        System.out.println("Y = " + point2D.getY());
        System.out.println("Array XY = " +Arrays.toString(point2D.getXY()) + "\n");
        point2D.setXY(10, 10);
        System.out.println("Edit X Y");
        System.out.println(point2D.toString());
        System.out.println("X = " + point2D.getX());
        System.out.println("Y = " + point2D.getY());
        System.out.println("Array XY = " +Arrays.toString(point2D.getXY()) + "\n");


        Point3D point3D = new Point3D(point2D.getX(), point2D.getY(), 4);
        System.out.println("Init X Y Z");
        System.out.println(point3D.toString());
        System.out.println("X = " + point3D.getX());
        System.out.println("Y = " + point3D.getY());
        System.out.println("Z = " + point3D.getZ());
        System.out.println("Array XYZ = " + Arrays.toString(point3D.getXYZ()) + "\n");
        point3D.setX(15);
        System.out.println("Edit X");
        System.out.println(point3D.toString());
        System.out.println("X = " + point3D.getX());
        System.out.println("Y = " + point3D.getY());
        System.out.println("Z = " + point3D.getZ());
        System.out.println("Array XYZ = " + Arrays.toString(point3D.getXYZ()) + "\n");
        point3D.setY(15);
        System.out.println("Edit Y");
        System.out.println(point3D.toString());
        System.out.println("X = " + point3D.getX());
        System.out.println("Y = " + point3D.getY());
        System.out.println("Z = " + point3D.getZ());
        System.out.println("Array XYZ = " + Arrays.toString(point3D.getXYZ()) + "\n");
        point3D.setZ(15);
        System.out.println("Edit Z");
        System.out.println(point3D.toString());
        System.out.println("X = " + point3D.getX());
        System.out.println("Y = " + point3D.getY());
        System.out.println("Z = " + point3D.getZ());
        System.out.println("Array XYZ = " + Arrays.toString(point3D.getXYZ()) + "\n");
        point3D.setXYZ(20, 20, 20);
        System.out.println("Edit XYZ");
        System.out.println(point3D.toString());
        System.out.println("X = " + point3D.getX());
        System.out.println("Y = " + point3D.getY());
        System.out.println("Z = " + point3D.getZ());
        System.out.println("Array XYZ = " + Arrays.toString(point3D.getXYZ()) + "\n");
    }
}
