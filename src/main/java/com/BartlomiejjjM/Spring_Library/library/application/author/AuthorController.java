package com.BartlomiejjjM.Spring_Library.library.application.author;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/authors")
public class AuthorController {

    private AuthorService service;

    public AuthorController(){}

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @ModelAttribute
    public AuthorDTO defaultAuthorDTO() {
        return new AuthorDTO(null, "Fill my name", "Fill my surname");
    }

    @GetMapping("/all")
    public String getAuthors (Model model) {
       model.addAttribute("authors",  service.findAll());
       return "authors";
    }

    @GetMapping("/byName/{name}")
    public String getAuthorsByName (@Valid @ModelAttribute AuthorDTO authorDTO, Model model) {
        model.addAttribute("authors", service.findAllByName(authorDTO));
        return "authors";
    }
    @GetMapping("/bySurname/{surname}")
    public String getAuthorsBySurame (@Valid @ModelAttribute AuthorDTO authorDTO, Model model) {
        model.addAttribute("authors", service.findAllBySurname(authorDTO));
        return "authors";
    }
    @GetMapping("/byId/{id}")
    public String getAuthorById (@PathVariable int id, Model model){
        model.addAttribute("authors", Arrays.asList(service.findAll().get(id)));
        return "authors";
    }
    @PostMapping("/add")
    @ResponseBody
    public void addAuthor (AuthorDTO authorDTO) {
        service.addNewAuthor(authorDTO);
    }
    @PostMapping("/remove")
    @ResponseBody
    public void removeAuthor (AuthorDTO authorDTO) {
        service.removeAuthor(authorDTO);

    }



}
