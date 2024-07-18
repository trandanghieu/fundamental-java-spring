package com.diamonstore.controller;

import com.diamonstore.common.Application;
import com.diamonstore.model.MockUpData;
import com.diamonstore.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("user", new User());

        model.addAttribute("countries", MockUpData.countries());
        model.addAttribute("gender", MockUpData.gender());
        model.addAttribute("hobbies", MockUpData.hobbies());


        return Application.REGISTER_PAGE;
    }

    @PostMapping("/register")
    public String processRegister(@Valid @ModelAttribute("user") User user,
                                  BindingResult bindingResult,
                                  Model model) {
        if(bindingResult.hasErrors()){
            System.out.println("Error"+bindingResult);
            return Application.REGISTER_PAGE;
        }

        System.out.println(user.getFirstName() + "\n" + user.getLastName() + "\n" + user.getEmail() + "\n" + user.getCountry() + "\n" + user.getPassword());
        model.addAttribute("user", user);
        return Application.RESULT;
    }
}
