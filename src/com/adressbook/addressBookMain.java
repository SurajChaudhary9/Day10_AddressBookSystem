package com.adressbook;
/*Ability to add new contact to address book
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
//adding p object into the linked list with addressBook class data type
		person.add(p);
//printing person's array list
		System.out.println(person);

	}

	public static void main(String[] args) {
		addressBookMain addressBook = new addressBookMain();
		System.out.println("Start with Displaying Welcome to Address Book Program in AddressBookMain class");
		addressBook.addPerson();

	}

}
