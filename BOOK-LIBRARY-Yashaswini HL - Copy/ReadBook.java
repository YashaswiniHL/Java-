

import java.util.*;

/*
 * This is the  class for storing the information of read-only books which implements library interface
 */

public class ReadBook implements Library {

	// declaring the variables for book information
	protected String bookId, bookIsbn, bookTitle, authorName, publisherName;

	// creating a stack for books
	Stack<Stack<String>> book = new Stack<>();

	/*
	 * This method overrides the library interface.
	 */

	@Override
	public void add() {

	}

	/*
	 * This method overrides the library interface. Remove the top most book information.
	 */

	@Override
	public void remove() {
		try {
			Stack<String> temp = book.pop();
			this.popElement(temp);
		} catch (EmptyStackException e) {
			System.out.println("The stack is empty");
		}
	}

	/*
	 * This method display the information of the top most book.
	 */

	@Override
	public void displayTop(BorrowBook obj) {

		try {
			Stack<String> temp = book.pop();
			this.popElement(temp);

			if (!temp.isEmpty()) {
				System.out.println("Checkout Date: " + temp.pop());
				System.out.println("Due Date: " + temp.pop());
				System.out.println("************");
				obj.add();
			} else {
				this.add();
			}
		} catch (EmptyStackException e) {
			System.out.println("The stack is empty");
		}

	}

	/*
	 * This method shows information of all the books present in stack
	 */

	@Override
	public void showAll() {
		Stack<Stack<String>> tempBook = book;

		if (tempBook.isEmpty())
			System.out.println("The stack is empty");

		while (!tempBook.isEmpty()) {

			Stack<String> temp = tempBook.pop();

			while (!temp.isEmpty()) {
				this.popElement(temp);
				if (!temp.isEmpty()) {
					System.out.println("Checkout Date: " + temp.pop());
					System.out.println("Due Date: " + temp.pop());
					System.out.println("************");
				}
			}
		}

	}

	/*
	 * This is a  method simply pops the information of the respective book.
	 */

	private void popElement(Stack<String> temp) {

		System.out.println("\n---------------");
		System.out.println("Book ID: " + temp.pop());
		System.out.println("Book ISBN: " + temp.pop());
		System.out.println("Book title: " + temp.pop());
		System.out.println("Author: " + temp.pop());
		System.out.println("Publisher: " + temp.pop());
		if (temp.isEmpty()) {
			System.out.println("--------------");
		}

	}

	/*
	 * This is a setter method. It helps to set the input values to the respective
	 * variables.
	 */
	public void setBook(String bookId, String bookIsbn, String bookTitle, String authorName, String publisherName) {
		this.bookId = bookId;
		this.bookIsbn = bookIsbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.publisherName = publisherName;

	}

	/*
	 * These are getter methods. It helps to get values of the respective variables.
	 */
	protected String getBookId() {
		return bookId;
	}

	protected String getBookIsbn() {
		return bookIsbn;
	}

	protected String getBookTitle() {
		return bookTitle;
	}

	protected String getAuthor() {
		return authorName;
	}

	protected String getPublisher() {
		return publisherName;
	}

}

