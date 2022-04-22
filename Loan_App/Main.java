package pl.pjatk;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String firstName, surname, pesel, NIP, bankAccountNumber, gender;
        Date dateOfBirth;
        Scanner scanner = new Scanner(System.in);
        WordCheck wordCheck = new WordCheck();

        System.out.println("Welcome! Please enter billing information : ");
        System.out.print("Name: ");
        firstName = scanner.next();
        while(wordCheck.StringIsValid(firstName)==false) {
            System.out.println("Information incorrect, please use only letters!");
            System.out.print("Name: ");
            firstName = scanner.next();
        }
        System.out.print("Surname: ");
        surname = scanner.next();
        while(wordCheck.StringIsValid(surname)==false) {
            System.out.println("Information incorrect, please use only letters!");
            System.out.print("Surname: ");
            surname = scanner.next();
        }
        System.out.print("Pesel: ");
        pesel = scanner.next();
        while(wordCheck.PeselIsValid(pesel)==false) {
            System.out.print("Pesel: ");
            pesel = scanner.next();
        }
        System.out.print("NIP number: ");
        NIP = scanner.next();
        System.out.print("Bank Account: ");
        bankAccountNumber = scanner.next();
        System.out.print("Gender: ");
        gender = scanner.next();

    }
}
