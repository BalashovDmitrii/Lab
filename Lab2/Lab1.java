import java.io.*;

public class Lab1 
{
	

    public static void main(String[] args) 
	{
		// Создадим экземпляры класса Point3d
		Point3d A = new Point3d();
		Point3d B = new Point3d();
		Point3d C = new Point3d();
		
		// Задаем координаты каждому экземпляру
		
		System.out.println("\nPoint A");
		A.setX(inputvar(" x: "));
		A.setY(inputvar(" y: "));
		A.setZ(inputvar(" z: "));
		
		System.out.println("\nPoint B");
		B.setX(inputvar(" x: "));
		B.setY(inputvar(" y: "));
		B.setZ(inputvar(" z: "));
		
		System.out.println("\nPoint C");
		C.setX(inputvar(" x: "));
		C.setY(inputvar(" y: "));
		C.setZ(inputvar(" z: "));
		
		// Если А=B или B=C или C=A, то выводим ошибку и ничего больше не делаем
		if (A.equals(B)||B.equals(C)||C.equals(A)) {
			System.out.println("\nERROR: Two or three points are equals.\n");
		}
		// Иначе выводим все введенные координаты точек, выводим дистанцию между 3 парами точек (с помощью метода distanceTo)
		// и площадь треугольника (при помощи метода computeArea)
		else {	
			System.out.println("\nA: ("+A.getX()+","+A.getY()+"," + A.getZ()+")");
			System.out.println("B: ("+B.getX()+","+B.getY()+"," + B.getZ()+")");
			System.out.println("C: ("+C.getX()+","+C.getY()+"," + C.getZ()+")\n");
			System.out.println("AB="+A.distanceTo(B)+"\nAC="+A.distanceTo(C)+"\nBC="+B.distanceTo(C));
			System.out.println("\nS="+computeArea(A,B,C));
		}
    }

	
	public static double inputvar (String txt){
		System.out.print(txt);
		return getDouble();
	} 
	// Метод computeArea, вычисляет площадь треугольника по заданным координатам
	// координаты задаются объектами типа Point3d
	public static double computeArea (Point3d a, Point3d b, Point3d c) {
		// Высчитываем расстояние между точками с помощью метода distanceTo
		double AB = a.distanceTo(b);
		double AC = a.distanceTo(c);
		double BC = b.distanceTo(c);
		// Используя формулу Герона, выводим площадь треугольника
		double p=(AB+AC+BC)/2;
		return Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
	}
	 
	 
    public static double getDouble() {

        // There's potential for the input operation to "fail"; hard with a
        // keyboard, though!
        try {
            // Set up a reader tied to standard input.
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

            // Read in a whole line of text.
            String s = br.readLine();

            // Conversion is more likely to fail, of course, if there's a typo.
            try {
                double d = Double.parseDouble(s);

                //Return the inputted double.
                return d;
            }
            catch (NumberFormatException e) {
                // Bail with a 0.  (Simple solution for now.)
                return 0.0;
            }
        }
        catch (IOException e) {
            // This should never happen with the keyboard, but we'll
            // conform to the other exception case and return 0 here,
            // too.
            return 0.0;
        }
    }
}