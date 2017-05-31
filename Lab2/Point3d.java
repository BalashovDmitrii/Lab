import java.util.Objects;


/**
 * A two-dimensional point class.
 **/
public class Point3d {
    
    /** X coordinate of the point **/
    private double xCoord;
    private double yCoord;
	private double zCoord;

    /** Constructor to initialize point to (x, y, z) value. **/
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
		zCoord = z;
    }

    /** No-argument constructor:  defaults to a point at the origin. **/
    public Point3d() {
        // Call two-argument constructor and specify the origin.
        this(0, 0, 0);
    }

    /** Return the X coordinate of the point. **/
    public double getX() {
        return xCoord;
    }

    /** Return the Y coordinate of the point. **/
    public double getY() {
        return yCoord;
    }
	/** Return the Z coordinate of the point. **/
	public double getZ() {
        return zCoord;
    }

    /** Set the X coordinate of the point. **/
    public void setX(double val) {
        xCoord = val;
    }

    /** Set the Y coordinate of the point. **/
    public void setY(double val) {
        yCoord = val;
    }
	/** Set the Z coordinate of the point. **/
	public void setZ(double val) {
        zCoord = val;
    }
	
	// Метод equals сравнивает другой объект экземпляром
	public boolean equals(Object ob) {
		// Проверяем является ли принимаемый методом объект экземпляром класса Point3d
		if (ob.getClass()!=getClass()){
			// Если нет, выводим false
			return false;
		}
		// Иначе сравниваем  2 объекта
		else{
			Point3d p3d = (Point3d) ob;
			return p3d.getX() == xCoord && p3d.getY() == yCoord && p3d.getZ() == zCoord;
		}
		
    }
	// Метод distanceTo выводит расстояние между двумя точками
	public double distanceTo (Object ob){
		// Проверяем является ли принимаемый методом объект экземпляром класса Point3d
		if (ob.getClass()!=getClass()){
			return 0.0;
		}
		// Иначе вычисляем расстояние по формуле
		else{
			Point3d p3d = (Point3d) ob;
			return Math.sqrt(Math.pow((xCoord-p3d.getX()),2)+Math.pow((yCoord-p3d.getY()),2)+Math.pow((zCoord-p3d.getZ()),2));
		}
	}
}








