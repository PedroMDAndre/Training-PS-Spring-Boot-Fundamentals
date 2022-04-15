package pt.training.fundamentals.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.training.fundamentals.entities.Release;
import pt.training.fundamentals.repositories.ReleaseRepository;

@Service
public class ReleaseServiceImpl implements ReleaseService {

    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public Iterable<Release> listReleases() {
        return releaseRepository.findAll();
    }

}
