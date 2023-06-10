// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 1 + 2 + 3 1*2*3

 //import java.util.Scanner;

// import java.util.Scanner;

// public class homeWork1 {
//         public static void main(String[] args){
//            System.out.printf("Введите число n: ");
//         Scanner num = new Scanner(System.in);
//         int n = num.nextInt();
//         int sum = 0;
//         int mult = 1;
//         for (int i = 1; i <= n; i++) {
//             sum += i;
//             mult *= i;            
//         }
//         System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
//         System.out.printf("Произведение чисел от 1 до %d: %d%n", n, mult);
//         num.close();
//      }
        
// }
    // Задание 2
    // 2) Вывести все простые числа от 1 до 1000
     

// public class homeWork1 {
//         public static void main(String[] args) {

//           for (int i = 1; i <= 1000; i++)

//               if (i % 2 != 0 && i % 3 != 0) {
//                  System.out.print(i + " ");
              
                
//             }
          
            

//             }
//           } 

//  Реализовать простой калькулятор (+-/*)
// sc.next() - считывает 1 элемент
// sc.nextInt() - считывает только число
// sc.nextLine() - считывает строчку
// Введите число: 4 \n
// Введите знак:
import java.util.Scanner;
public class homeWork1{
  public static void main(String[] args) {

   int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        num1 = input.nextInt();

        System.out.println("Введите второе число: ");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Введите знак: ");
        operation = op.next();

        if (operation == "+")
        {
            System.out.println(num1 + num2);
        }
        if (operation == "-")
        {
            System.out.println(num1 - num2);
        }

        if (operation == "/")
        {
            System.out.println(num1 / num2);
        }
        if (operation == "*")
        {
            System.out.println("your answer is" + (num1 * num2));
        }

      }
}





            



 