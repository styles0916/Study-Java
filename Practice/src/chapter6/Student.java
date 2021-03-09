package chapter6;

import java.util.ArrayList;

public class Student {

	String studentName;
	ArrayList<Book> readBookList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		
		readBookList = new ArrayList<Book>();
		
	}
	
	public void addBook(String title, String author) {
		
		Book book = new Book(title, author);
		
		readBookList.add(book);
		
	}

	public void showStudentInfo() {
		
		System.out.print(studentName + " �л��� ���� å�� : ");
		
		for(Book book : readBookList) {
			System.out.print(book.getTitle() + " ");
		}
		System.out.println("�Դϴ�.");
		}
	}
