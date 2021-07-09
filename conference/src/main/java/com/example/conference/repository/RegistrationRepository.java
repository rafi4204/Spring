package com.example.conference.repository;

import com.example.conference.model.Registration;
import com.example.conference.model.RegistrationReports;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration,Long> {
    List<RegistrationReports> registrationReport();
}
