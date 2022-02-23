package com.adressbook;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	HashMap<String, AddressBookMain> addressbook = new HashMap<>();

	/*
	 * Ability to add multiple addressbooks
	 * 
	 */

	public void addMultipleAddressBook() {
		while (true) {

			System.out.println("Enter selection \n1)To Access adress book\n2)exit and add");// add new if running for
																							// first time
			int selection = sc.nextInt();
			switch (selection) {
			case 1:
				String name = sc.next();
				if (addressbook.containsKey(name)) {
					System.out.println("Entered addressbook name already present");
				} else {
					AddressBookMain addr = new AddressBookMain();
					addr.addMultiplePerson();
					System.out.println("Welcome to addressbook" + name);
					addressbook.put(name, addr);
				}
				break;

			case 2:
				System.out.println("exiting");
				System.exit(0);
			}

		}

	}

	public static void main(String[] args) {
		Main main = new Main();
		System.out.println("Welcome to the address book system");
		main.addMultipleAddressBook();
	}

}
