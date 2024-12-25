package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public String listBook(Model model) {
        Iterable<Book> books = bookService.getAllBooks();
        System.out.println(books);
        model.addAttribute("books", books);
        return "books";
    }

    /*@GetMapping("/unprocessed")
    public String listUnprocessedRequests(Model model) {
        model.addAttribute("requests", requestService.getUnprocessedRequests());
        return "requests";
    }*/

    /*@GetMapping("/{id}")
    public String viewBook(@PathVariable("id") int id, Model model) {
        model.addAttribute("book", bookService.getBookById(id));
        return "book";
    }

    @PostMapping("/{id}/process")
    public String processRequest(@PathVariable("id") int id) {
        requestService.processRequest(id);
        return "redirect:/requests";
    }*/
}
