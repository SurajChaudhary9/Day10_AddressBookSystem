/*UC2:PROBLEM STATEMENT
 * Ability to add new contact to address book
 * User i/p
 * Print the added contact
 */

package com.adressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to the Address book system");
		ArrayList<Contacts> collection = new ArrayList<Contacts>();
		Scanner sc = new Scanner(System.in);// scanner for choice int
		Scanner sc1 = new Scanner(System.in);// scanner to take values from user
		{
			int choice;// make choice operation
			do {
				System.out.println("1.Add Contact");
				System.out.println("2.Display Contact");
				System.out.println("Enter your choice");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.print("Enter First Name: ");
					String firstName = sc1.nextLine();
					System.out.print("Enter last Name: ");
					String lastName = sc1.nextLine();
					System.out.print("Enter your address: ");
					String address = sc1.nextLine();
					System.out.print("Enter your city: ");
					String city = sc1.nextLine();
					System.out.print("Enter your state: ");
					String state = sc1.nextLine();
					System.out.print("Enter zip code : ");
					int zip = sc.nextInt();
					System.out.println("Enter phone number: ");
					String phoneNumber = sc1.nextLine();
					System.out.print("Enter your EMail ID: ");
					String emailId = sc1.nextLine();
					Contacts contacts = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber,
							emailId);// contacts object reference and parameterized constructor type3
					collection.add(contacts);
					break;
				case 2:

					System.out.print(collection + "\n");// display contact list
					break;

				}

			} while (choice != 0);
		}

	}// end of main
}// end of class
