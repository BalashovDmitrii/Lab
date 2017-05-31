//Класс Palindrome
public class Palindrome {
	//Метод main. Принимает массив строк
    public static void main(String[] args) {
		//Цикл от i=0, до тех пор пока i < длинны массива args
        for (int i = 0; i < args.length; i++) {
            //Присваиваем переменной s значение элемента массива args с индексом i
			String s = args[i];
			//Если строка s равна развернутой строке s 
			if (s.equals(reverseString(s))){
				//то печатаем что эта строка - палиндром
				System.out.println(s+"---is Palindrome"); 
			}
			else { //иначе печатаем что строка не является палиндромом
				System.out.println(s+"---is Not Palindrome");
			}
        }
    }
	/*Метод reverseString. Принимает - строку (s), 
	возвращает строку (rs) развернутую в обратном порядке*/
	public static String reverseString(String s){
		//Объявление переменной
		String rs="";
		/*Цикл, в ходе которого, в переменную rs 
		посимвольно, начиная с конца заносится значения 
		входного аргумента s*/
		for (int i = 0; i < s.length(); i++){
			//s.charAt(0) - возвращает первый символ строки s
			//s.length() - возвращает длину строки s в символах
			rs+=s.charAt((s.length()-1)-i);
		}
		//Вывод результата
		return rs;
	}
}