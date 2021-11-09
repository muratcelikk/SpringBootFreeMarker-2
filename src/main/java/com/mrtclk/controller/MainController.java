package com.mrtclk.controller;

import com.mrtclk.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private static List<Person> persons = new ArrayList<>();

    static {
        persons.add(new Person("Murat", "Celik"));
        persons.add(new Person("Fırat", "Celik"));
        persons.add(new Person("Mesut", "Celik"));
    }

    @Value("${welcome.message}")
    private String message;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", message);
        return "index";
    }
    @RequestMapping(value = {"/personList"}, method = RequestMethod.GET)
    public String personList(Model model){
        model.addAttribute("persons", persons);
        return "personList";
    }
}
