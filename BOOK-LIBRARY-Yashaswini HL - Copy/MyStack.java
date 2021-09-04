

import java.util.*;

/*
 * Its the driver class, which helps to get inputs and calling methods
 */
public class MyStack {
	// created a static members for getting the input
	static String bookId, bookIsbn, bookTitle, authorName, publisherName, checkOutDate, dueDate;

	// scanner class is used to get console input.
	static Scanner s = new Scanner(System.in);

	/*
	 * Getting input info from user
	 */
	public static void input() {
		s.nextLine();
		System.out.println("Enter Book ID:");
		bookId = s.nextLine();
		System.out.println("Enter Book ISBN:");
		bookIsbn = s.nextLine();
		System.out.println("Enter Book Title:");
		bookTitle = s.nextLine();
		System.out.println("Enter Author Name:");
		authorName = s.nextLine();
		System.out.println("Enter Publisher Name");
		publisherName = s.nextLine();
	}

	/*
	 * Getting dates information from user.
	 */
	public static void date() {
		System.out.println("Enter Check Out  Date:");
		checkOutDate = s.next();
		System.out.println("Enter Due Date:");
		dueDate = s.next();
	}

	/*
	 * This is the  Main method, object created for subclass and invoke respective
	 * methods using switch case.
	 */

	public static void main(String[] args) {

		// object creation
		BorrowBook ob = new BorrowBook();

		boolean flag = true;

		// loop used for repeated process until user want to stop.
		while (flag) {
			System.out.println(" ");
			System.out.println("LIBRARY MANAGAEMENT");
			System.out.println("-------------------");
			System.out.println("1. ADD A BOOK");
			System.out.println("2. REMOVE A BOOK");
			System.out.println("3. DISPLAY THE BOOK AT TOP");
			System.out.println("4. SHOW ALL BOOKS");
			System.out.println("ENTER THE CHOICE:");
			int choice = s.nextInt();
			/*
			 * switch used to make a choice based on user input.
			 */
			switch (choice) {
			case 1:
				while (true) {
					System.out.println("================");
					System.out.println("CHOOSE BOOK TYPE");
					System.out.println("================");
					System.out.println("1. READ ONLY BOOK");
					System.out.println("2. BORROWABLE BOOK");
					System.out.println("ENTER THE CHOICE:");
					int ch = s.nextInt();
					if (ch == 1) {
						input();
						ob.setBook(bookId, bookIsbn, bookTitle, authorName, publisherName);
						ob.initial();
						ob.add();
						ob.displayTop(ob);
						break;
					} else if (ch == 2) {
						input();
						date();
						ob.setBook(bookId, bookIsbn, bookTitle, authorName, publisherName);
						ob.setDate(checkOutDate, dueDate);
						ob.add();
						ob.displayTop(ob);
						break;
					} else {
						System.out.println("\nEnter Valid Choice!");
						continue;
					}
				}
				break;
			case 2:
				ob.remove();
				break;
			case 3:
				ob.displayTop(ob);
				break;
			case 4:
				ob.showAll();
				break;
			default:
				System.out.println("\nEnter valid Choice");
			}

			while (true) {
				System.out.println("\nDo you want to continue?" + "" + "\nType - YES/NO");
				String str = s.next();
				if (str.equalsIgnoreCase("no")) {
					flag = false;
					s.close();
					break;
				} else if (str.equalsIgnoreCase("yes"))
					break;
				else {
					System.out.println("\nInvalid choice");
					continue;
				}

			}

		}
	}

}
