package pt.training.fundamentals.mutators;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pt.training.fundamentals.entities.Application;
import pt.training.fundamentals.exception.ApplicationNotFoundException;
import pt.training.fundamentals.repositories.ApplicationRepository;

import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private ApplicationRepository applicationRepository;

    public Mutation(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Application newApplication(String name, String owner,
                                      String description) {
        Application app = new Application(name, owner, description);
        applicationRepository.save(app);
        return app;
    }

    public boolean deleteApplication(Long id) {
        applicationRepository.deleteById(id);
        return true;
    }

    public Application updateApplicationOwner(String newOwner, Long id) {
        Optional<Application> optionalApplication =
                applicationRepository.findById(id);

        if(optionalApplication.isPresent()) {
            Application application = optionalApplication.get();
            application.setOwner(newOwner);
            applicationRepository.save(application);
            return application;
        } else {
            throw new ApplicationNotFoundException("Application Not Found", id);
        }
    }
}
