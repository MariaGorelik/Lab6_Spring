package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/readers")
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @GetMapping
    public String listReaders(Model model) {
        model.addAttribute("readers", readerService.getAllReaders());
        return "readers";
    }

    @GetMapping("/{id}")
    public String viewReader(@PathVariable("id") int id, Model model) {
        model.addAttribute("readers", readerService.getReaderById(id));
        return "readers";
    }

    @PostMapping("/{id}/delete")
    public String deleteReader(@PathVariable("id") int id) {
        readerService.deleteReader(id);
        return "redirect:/readers";
    }
}
