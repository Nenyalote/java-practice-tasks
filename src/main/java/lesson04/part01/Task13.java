package lesson04.part01;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * int[] m = new int[2];
 * m[8] = 5;
 *
 * Требования:
 * 1.	Программа должна выводить сообщение на экран.
 * 2.	В программе должен быть блок try-catch.
 * 3.	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
 * 4.	Выведенное сообщение должно содержать тип возникшего исключения.
 * 5.	Имеющийся код в методе main не удалять.
 */

public class Task13 {

  public static void main(String[] args) {
    try {
      int[] m = new int[2];
      m[8] = 5;
    } catch (ArrayIndexOutOfBoundsException exept){
      System.out.println(exept.getMessage());
      System.out.println("Array index out of bounds exeption processed");
    }
  }
}
