package pt.training.fundamentals.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pt.training.fundamentals.entities.Application;
import pt.training.fundamentals.repositories.ApplicationRepository;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private ApplicationRepository applicationRepository;

    public Query(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Iterable<Application> findAllApplications() {
        return applicationRepository.findAll();
    }

    public long countApplications() {
        return applicationRepository.count();
    }
}

