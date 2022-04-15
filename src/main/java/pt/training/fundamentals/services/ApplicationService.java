package pt.training.fundamentals.services;

import pt.training.fundamentals.entities.Application;

import java.util.List;

public interface ApplicationService {

    List<Application> listApplications();

    Application findApplication(Long id);

}
