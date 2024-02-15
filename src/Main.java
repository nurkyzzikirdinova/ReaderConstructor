import java.time.LocalDate;
import java.util.Scanner;

/**Cоздайте  класс  Reader  с  полями (fullName,  library(библиотека),
 cardNumber,  dateOfBirth,phoneNumber).
 Методы takeBook(), returnBook(). takeBook,  будет  принимать  в
 качестве  параметра  количество взятых  книг.  Выводит  на  консоль
 сообщение  "Петров  В.  В.  взял  3 книги".
 Mетод  returnBook().  Выводит  на консоль  сообщение  "Петров  В.  В.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your full name:");
        Reader reader = new Reader(scanner.nextLine(), "The City Library named after A.Osmonov", "2468", LocalDate.of(200, 5,6), "0773537353", 20000);
        System.out.println(reader+"\n"+"\nHistory: ");
        System.out.println("How many books do you need? ");
        reader.takeBook(scanner.nextInt());
        System.out.println("How many books do you return? ");
        reader.returnBook(scanner.nextInt());



    }
}




