package com.example.conference.controller;

import com.example.conference.model.Registration;
import com.example.conference.model.RegistrationReports;
import com.example.conference.repository.RegistrationRepository;
import com.example.conference.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        return "registration";
    }

    @GetMapping("registrations")
    public @ResponseBody
    List<Registration>
    getRegistrations(@ModelAttribute("registration") Registration registration) {
        return registrationService.findAll();
    }

    @GetMapping("registration-reports")
    public @ResponseBody
    List<RegistrationReports>
    getRegistrationReports(@ModelAttribute("registration") Registration registration) {
        return registrationService.findAllReports();
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult result) {

        if (result.hasErrors()) {
            System.out.println("there were errors");
            return "registration";
        }
        registrationService.addRegistration(registration);

        System.out.println("registrated Name : " + registration.getName());
        return "redirect:registration";
    }

    @PostMapping("registration/update")
    public @ResponseBody
    Registration updateRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult result) {
        return registrationService.addRegistration(registration);
    }
}
