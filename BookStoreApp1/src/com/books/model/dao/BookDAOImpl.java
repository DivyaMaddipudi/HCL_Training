package com.books.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookDAOImpl implements BookDao {

	private BufferedReader br = null;
	private BufferedWriter bw = null;
	private FileOutputStream fos = null;
	File oldName = null;
	File newName = null;
	// id:name:price:discount:author:category

	public BookDAOImpl() {
		try {
			br = new BufferedReader(new FileReader("data.txt"));
			bw = new BufferedWriter(new FileWriter("data.txt", true));
			fos = new FileOutputStream("data1.txt", true);

			newName = new File("E:\\HCL Training\\BookStoreApp1\\data.txt");
			oldName = new File("E:\\HCL Training\\BookStoreApp1\\data1.txt");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Book> getAllBooks() throws DataAccessException {
		List<Book> books = new ArrayList<>();
		String line = null;

		try {
			while ((line = br.readLine()) != null) {

				String tokens[] = line.split(":");
				Book book = new Book(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]),
						Double.parseDouble(tokens[3]), tokens[4], tokens[5]);
				books.add(book);

			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new DataAccessException("some prblm with processing");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return books;
	}

	@Override
	public void addBook(Book book) throws DataAccessException {
		StringBuilder booksString = new StringBuilder().append(book.getId()).append(":").append(book.getTitle())
				.append(":").append(book.getPrice()).append(":").append(book.getDiscount()).append(":")
				.append(book.getAuthor()).append(":").append(book.getCategory() + "\n");

		try {
			bw.append(booksString);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Book deleteBook(int id) throws DataAccessException {
		List<Book> books = getAllBooks();
		Book book = new Book();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == id) {
				book = new Book(books.get(i).getId(), books.get(i).getTitle(), books.get(i).getPrice(),
						books.get(i).getDiscount(), books.get(i).getAuthor(), books.get(i).getCategory());
			} else {
				StringBuilder booksString = new StringBuilder().append(books.get(i).getId()).append(":")
						.append(books.get(i).getTitle()).append(":").append(books.get(i).getPrice()).append(":")
						.append(books.get(i).getDiscount()).append(":").append(books.get(i).getAuthor()).append(":")
						.append(books.get(i).getCategory() + "\n");

				try {
					// bw.write(booksString.toString());
					fos.write(booksString.toString().getBytes());

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		try {
			fos.close();
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean b = newName.delete();
		if (b) {
			oldName.renameTo(newName);
			System.out.println("renamed successfully...!");
		} else {
			System.out.println("rename failed...!");
		}
		return book;
	}

	@Override
	public void updateBook(Book book) throws DataAccessException {
		
			System.out.println("books updated successfully..!");
	}

}
