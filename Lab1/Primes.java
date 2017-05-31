
//Класс Primes
public class Primes 
{
	//Метод main. Принимает массив строк
    public static void main(String[] args) 
	{
		//Перебор чисел от 2 до 100
		for	(int i = 2; i<=100; i++)
		{
			//Вывод простых чисел
			if (isPrime(i)==true)
			{
				System.out.println(i+"---is Prime");
			}
		}
    }
	//Метод isPrime. Принимает целое число, возвращает true если число простое и false если сложное 
	public static boolean isPrime(int n) 
	{
		if (n!=2) //Если не равно 2, то выполняем проверку
		{
			for (int i=2; i<n; i++) //Цикл от 2 до n
			{
				if (n%i == 0)//Делим на i. Если остаток - 0, возвращаем false
				{
					return false;
				}
			}
			return true;//Если на предыдущем блоке не было ничего возвращено, то возвращаем true (число простое)
		}
		else
		{
			return true; //Иначе (если (n!=2)=false) выводим true (2 - простое число)
		}
	}
}