package com.project.library.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "books")
public class Book implements Serializable{
	 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "book_id")
	    private Long id;

	    @NotNull(message = "*Please enter book code")
	    @NotBlank(message = "*Please enter book code")
	    @Column(name = "book_code", length = 10, nullable = false)
	    private String bookCode;

	    @NotNull(message = "*Please enter book name")
	    @NotBlank(message = "*Please enter book name")
	    @Column(name = "book_name", length = 100, nullable = false)
	    private String bookName;

	    @ManyToOne
	    @JoinColumn(name = "author_id")
	    @NotNull(message = "*Please select book author")
	    private Author author;

	    @ManyToOne
	    @JoinColumn(name = "producer_id")
	    @NotNull(message = "*Please select book producer")
	    private Producer producer;

	    @ManyToOne
	    @JoinColumn(name = "book_category_id")
	    @NotNull(message = "*Please select book category")
	    private BookCategory bookCategory;

	    @ManyToOne
	    @JoinColumn(name = "book_store_id")
	    @NotNull(message = "*Please select book store")
	    private BookStore bookStore;
	    
	    @Range(min=1000,max=2022)
	    @Column(name = "yearOfManufucture", length = 4, nullable = false)
	    private String yearOfManufucture;
	    
	    @Column(name = "createDate")
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date createDate;
	    
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBookCode() {
			return bookCode;
		}

		public void setBookCode(String bookCode) {
			this.bookCode = bookCode;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public Author getAuthor() {
			return author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public Producer getProducer() {
			return producer;
		}

		public void setProducer(Producer producer) {
			this.producer = producer;
		}

		public BookCategory getBookCategory() {
			return bookCategory;
		}

		public void setBookCategory(BookCategory bookCategory) {
			this.bookCategory = bookCategory;
		}

		public BookStore getBookStore() {
			return bookStore;
		}

		public void setBookStore(BookStore bookStore) {
			this.bookStore = bookStore;
		}

		public String getYearOfManufucture() {
			return yearOfManufucture;
		}

		public void setYearOfManufucture(String yearOfManufucture) {
			this.yearOfManufucture = yearOfManufucture;
		}

		public Date getCreateDate() {
			return createDate;
		}

		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}


	    
	    

}
