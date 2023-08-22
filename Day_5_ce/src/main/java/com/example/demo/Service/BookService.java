package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;
import com.example.demo.Repo.BookRepo;

@Service
public class BookService {
@Autowired
  BookRepo br;
  public Book saveinfo(Book b)
  {
	  return br.save(b);
  }
  public List<Book> savedetails(List<Book> b)
  {
	  return br.saveAll(b);
  }
  public List<Book> showinfo()
  {
	  return br.findAll();
  }
  public Optional<Book> getid(int id)
	{
		return br.findById(id);
	}
  public Book changeinfo(Book b)
  {
	  return br.saveAndFlush(b);
  }
  public void deleteinfo(Book b)
  {
	  br.delete(b);
  }
  public void deleteid(int id)
  {
	  br.deleteById(id);
  }
  public String updateinfobyid(int id,Book b)
  {
  	br.saveAndFlush(b);
  	if(br.existsById(id))
		{		
	return "updated";
		}
		else
		{
	          return "enter valid id";
		}

  }
}
