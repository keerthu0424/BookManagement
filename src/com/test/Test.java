package com.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Book book = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book id: ");
		int bid = sc.nextInt();
		System.out.println("Enter book author: ");
		String bauth = sc.next();
		System.out.println("Enterno of copies: ");
		int ncps = sc.nextInt();
		System.out.println("Enter book title: ");
		String bttl = sc.next();
		System.out.println("Enterpublish year: ");
		int py = sc.nextInt();
		book.setIdNum(bid);
		book.setAuthor(bauth);
		book.setNumCopies(ncps);
		book.setTitle(bttl);
		book.setPubYear(py);
		book.print();
		// TODO Auto-generated method stub

	}

}
