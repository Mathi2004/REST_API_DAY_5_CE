package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Service.BookService;

@RestController
public class ApiController {
   @Autowired
   BookService bs;
   @PostMapping("addstudent")
   public Book add(@RequestBody Book b)
   {
	   return bs.saveinfo(b);
   }
   @PostMapping("addnstudent")
   public List<Book> addndetails(@RequestBody List<Book> b)
   {
	   return bs.savedetails(b);
   }
   @GetMapping("showdetails")
   public List<Book> show()
   {
	   return bs.showinfo();
   }
   @GetMapping("ShowByID/{id}")
   public  Optional<Book>  getmyid(@PathVariable int id)
   {
   	return bs.getid(id);
   }
   @PutMapping("update")
   public Book modify(@RequestBody Book b)
   {
	   return bs.changeinfo(b);
   }
   @PutMapping("updatebyid/{id}")
   public String modifybyid(@PathVariable int id,@RequestBody Book b)
   {
       return bs.updateinfobyid(id, b);		
   }
   @DeleteMapping("deletedatail")
   public String del(@RequestBody Book b)
   {
	   bs.deleteinfo(b);
	   return "deleted successfully";
   }
   @DeleteMapping("deleteid/{id}")
   public void deletemyid(@PathVariable int id)
   {
	   bs.deleteid(id);
   }
}
