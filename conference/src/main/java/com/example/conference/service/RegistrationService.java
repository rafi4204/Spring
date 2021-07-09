package com.example.conference.service;

import com.example.conference.model.Registration;
import com.example.conference.model.RegistrationReports;

import java.util.List;

public interface RegistrationService {
    Registration addRegistration(Registration registration);

    List<Registration> findAll();

    List<RegistrationReports> findAllReports();
}
