package org.example.services;

import org.example.repositories.IssueRepository;
import org.example.repositories.ReaderRepository;
import org.example.entities.Book;
import org.example.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ReaderRepository readerRepository;

    @Autowired
    private IssueRepository issueRepository;

    public List<Book> getAllBooks() {
        List<Book> books = bookRepository.findAllBooks();
        System.out.println(books);
        return bookRepository.findAllBooks();
    }

    /*public List<Request> getUnprocessedRequests() {
        return requestRepository.findUnprocessedRequests();
    }*/

    public Book getBookById(int id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(null);
    }

    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    /*public void processBook(int bookId) {
        Book book = getBookById(bookId);
        if (book != null) {
            List<Reader> readers = readerRepository.findByProfile(book.getWorkType());
            if (!readers.isEmpty()) {
                book.setStatus("processed");
                saveRequest(book);

                Worker worker = readers.get(0);
                WorkerRequest workerRequest = new WorkerRequest();
                workerRequest.setWorker(worker);
                workerRequest.setRequest(book);
                workerRequestRepository.save(workerRequest);
            }
        }
    }*/
}
