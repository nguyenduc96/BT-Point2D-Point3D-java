public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] point3DS = new float[3];
        point3DS[0] = super.getXY()[0];
        point3DS[1] = super.getXY()[1];
        point3DS[2] = this.z;
        return point3DS;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x = " + super.getX() +
                ", y = " + super.getY() +
                ", z = " + z +
                '}';
    }
}
