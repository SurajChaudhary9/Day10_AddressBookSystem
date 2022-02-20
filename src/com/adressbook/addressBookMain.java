package com.adressbook;
/*Ability to edit contact in  address book
 * by using name
 * i/p form user
 */

import java.util.LinkedList;
import java.util.Scanner;

public class addressBookMain {
	static Scanner scanner = new Scanner(System.in);
	LinkedList<addressBook> person = new LinkedList<>();

	public void addPerson() {
		System.out.println("Enter the First Name");
		String firstName = scanner.next();
		System.out.println("Enter the Last Name");
		String lastName = scanner.next();
		System.out.println("Enter the Address");
		String address = scanner.next();
		System.out.println("Enter the City");
		String city = scanner.next();
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the Zip");
		String zip = scanner.next();
		System.out.println("Enter the PhoneNumber");
		String phoneNumber = scanner.next();
		System.out.println("Enter the Email");
		String email = scanner.next();
//creating addressBook object and passing arguments inside constructor
		addressBook p = new addressBook(firstName, lastName, address, city, state, zip, phoneNumber, email);
//adding p object into the linked list with Contact class data type
		person.add(p);
//printing person array list
		System.out.println(person);

	}

///editing contact by searching for names
	public void editPerson() {
		System.out.println("Enter the name to edit");
		String s = scanner.next();

		for (int i = 0; i < person.size(); i++) {
			addressBook p = person.get(i);
			if (s.equals(p.getFirstName())) {
				while (true) {
					System.out.println("Enter choice to edit 1)firstName\n2)lastName\n3)address\n"
							+ "4)city\n5)state\n6)zip\n7)phoneNumber\n8)email9)exit");/// choices as per user i/p
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						p.setFirstName(scanner.next());
						break;
					case 2:
						p.setLastName(scanner.next());
						break;
					case 3:
						p.setAddress(scanner.next());
						break;
					case 4:
						p.setCity(scanner.next());
						break;
					case 5:
						p.setState(scanner.next());
						break;
					case 6:
						p.setZip(scanner.next());
						break;
					case 7:
						p.setPhoneNumber(scanner.next());
						break;
					case 8:
						p.setEmail(scanner.next());
						break;
					default:
						System.out.println("select correct choice");
						break;
					}// end of switch case
					if (choice == 9)
						break;
				} // end of while
				person.set(i, p);
				System.out.println("person after editing");
				System.out.println(person);

			} // end of if
		} // end of for loop

	}

	public static void main(String[] args) {
		addressBookMain addressBook = new addressBookMain();
		System.out.println("Welcome to Address Book Program in AddressBookMain class");
		addressBook.addPerson();
		addressBook.editPerson();

	}
}/// end of class
