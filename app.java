import java.util.Scanner;

public class app {
public static void main(String[] args) {
Scanner newScanner = new Scanner(System.in);

/* 
System.out.println("Divisions Program: ");

System.out.print("Ange första tal ");
int firstNum = newScanner.nextInt();


System.out.print("Ange andra tal ");
int secondNum = newScanner.nextInt();

double division = (double) firstNum / secondNum;
System.out.println("Kvoten är " + division);
*/

System.out.print("Ange ett substantiv: ");
String noun = newScanner.nextLine();

System.out.print("Ange substantivets pluralhändelse: ");
String pluralForm = newScanner.nextLine();

System.out.println("En " + noun + ", " + "flera " + noun + pluralForm);





}

}
