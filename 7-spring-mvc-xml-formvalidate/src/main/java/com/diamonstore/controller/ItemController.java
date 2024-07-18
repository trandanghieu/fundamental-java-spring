package com.diamonstore.controller;


import com.diamonstore.model.Item;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/item")
public class ItemController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);

    }

    @GetMapping("/show")
    public String show(Model model){

        model.addAttribute("item", new Item());

        return "item-form";
    }

    @PostMapping("/process")
    public String process(Model model, @Valid @ModelAttribute("item") Item item, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            System.out.println("error: " + bindingResult);
            return "item-form";
        }

        model.addAttribute("itemId", item.getItemId());
        model.addAttribute("name", item.getName());

        System.out.println("ID" + item.getItemId() + "-" + "Name " + item.getName());

        return "item-result";

    }


}
