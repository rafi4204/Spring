package com.example.conference.service;

import com.example.conference.model.Course;
import com.example.conference.model.Registration;
import com.example.conference.model.RegistrationReports;
import com.example.conference.repository.CourseRepository;
import com.example.conference.repository.CourseRepositoryImpl;
import com.example.conference.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationServiceImp implements RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration) {
        registration = registrationRepository.save(registration);
        if(registration.getId()==null) {
            Course course = new Course();
            course.setName("Introductory");
            course.setDescription("Every new attendee have to do this course!!");
            course.setRegistration(registration);
            courseRepository.save(course);
        }
        return registration;
    }

    @Override
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    @Override
    public List<RegistrationReports> findAllReports() {
        return registrationRepository.registrationReport();
    }
}
