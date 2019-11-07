package com.javalec.ex.springboot.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {
	
	@Autowired
	BookRepository repository;
	
	@Test
	public void testSave() {
		Book book = new Book();
		book.setName("book-spring-boot");
		book.setIsbn10("0123456789");
		book.setIsbn13("0123456789012");
		
		assertThat(book, isNew().isTrue());
	}
}