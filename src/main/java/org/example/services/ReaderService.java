package org.example.services;

import org.example.entities.Reader;
import org.example.repositories.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReaderService {

    @Autowired
    private ReaderRepository readerRepository;

    public List<Reader> getAllReaders() {
        List<Reader> readers = readerRepository.findAllReaders();
        System.out.println(readers);
        return readerRepository.findAllReaders();
    }

    public Reader getReaderById(int id) {
        Optional<Reader> reader = readerRepository.findById(id);
        return reader.orElse(null);
    }

    public Reader saverReader(Reader reader) {
        return readerRepository.save(reader);
    }

    public void deleteReader(int id) {
        readerRepository.deleteById(id);
    }
}
