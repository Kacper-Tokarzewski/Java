package pl.pjatk;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String firstName, surname, pesel, NIP, bankAccountNumber, gender;
        Date dateOfBirth;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj! Podaj dane do faktury: ");
        System.out.print("Imię: ");
        firstName = scanner.next();
        System.out.println(firstName);
    }
}
