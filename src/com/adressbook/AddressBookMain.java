/*UC5:PROBLEM STATEMENT
 * Ability to ADD MULTIPLE contact in address book using first name
 * i/p from user for choice operation
 */
package com.adressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBookMain {
	static Scanner sc = new Scanner(System.in);
	static Scanner sc1 = new Scanner(System.in);

	public void addMultiplePerson() {
		List<Contacts> collection = new ArrayList<Contacts>();

		int choice;
		do {
			System.out.println("Enter the option \n1)To Add Contect\n2)To Display Contact"
					+ "\n3)To Update Contact\n4)To Delete Contact");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter First Name: ");
				String firstName1 = sc1.nextLine();
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
				System.out.print("Enter phone number: ");
				String phoneNumber = sc1.nextLine();
				System.out.print("Enter your EMail ID: ");
				String emailId = sc1.nextLine();
				Contacts contacts = new Contacts(firstName1, lastName, address, city, state, zip, phoneNumber, emailId);
				collection.add(contacts);
				break;
			case 2:
				System.out.println("______________________________________");
				java.util.Iterator<Contacts> i = collection.iterator();
				while (i.hasNext()) {
					contacts = i.next();
					System.out.println(contacts);
				}
				System.out.println("________________________________________");

				break;
			case 3:
				boolean found = false;
				System.out.println("Enter first name of the person for update ");
				firstName1 = sc1.nextLine();
				System.out.println("___________________________________________");

				ListIterator<Contacts> listIterator = collection.listIterator();
				/*
				 * It is a java iterator which is used to traverse all types of lists including
				 * ArrayList, Vector, LinkedList, Stack
				 */

				while (listIterator.hasNext()) {
					contacts = listIterator.next();

					if (contacts.getFirstName().equals(firstName1)) {// check for first name and check for same

						System.out.print("Enter new last Name: ");
						lastName = sc1.nextLine();
						System.out.print("Enter your new address: ");
						address = sc1.nextLine();
						System.out.print("Enter your new city: ");
						city = sc1.nextLine();
						System.out.print("Enter your state: ");
						state = sc1.nextLine();
						System.out.print("Enter zip code : ");
						zip = sc.nextInt();
						System.out.print("Enter phone number: ");
						phoneNumber = sc.nextLine();
						System.out.print("Enter your EMail ID: ");
						emailId = sc1.nextLine();
						listIterator.set(
								new Contacts(firstName1, lastName, address, city, state, zip, phoneNumber, emailId));
						found = true;
					}
				}
				System.out.println("___________________________________");

				if (!found) {
					System.out.println("Record not found");
				} else {
					System.out.println("Record is updated successfully");
				}
				System.out.println("___________________________________");
				break;
			case 4:
				found = false;
				System.out.println("Enter first name of the person for delete ");
				firstName1 = sc1.nextLine();
				System.out.println("____________________________________");
				i = collection.iterator();
				while (i.hasNext()) {
					contacts = i.next();
					if (contacts.getFirstName().equals(firstName1)) {
						i.remove();
						found = true;
					}
				}
				System.out.println("____________________________________");
				if (!found) {
					System.out.println("Record not found");
				} else {
					System.out.println("Record is deleted successfully");
				}
				System.out.println("_____________________________________");
				break;
			default:
				System.out.println("default");
			}
		} while (choice != 0);
	}

}// end of class