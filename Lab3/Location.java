
/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
	//Принемает тип Объект, возвразает тип boolean
	public boolean equals(Object loc){
		if (getClass()!=loc.getClass()){//Если Объект не является потомком класса
			return false; // то выводим false
		}
		else {
			Location lc = (Location) loc;
			return xCoord==lc.xCoord && yCoord==lc.yCoord; // Иначе сравниваем атрибуты объектов
			}
	}
	
	public int hashCode() {
        int result = 20; // Зададим некоторое значение
        // Используя уникальные данные экземпляра изменим это значение
        result = 21 * result + xCoord;
        result = 21 * result + yCoord;
        return result; // Выведем это значение
    }
}
