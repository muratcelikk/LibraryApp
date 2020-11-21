package com.muratcelik.service.implementation;

import com.muratcelik.entity.Publisher;
import com.muratcelik.repository.PublisherRepo;
import com.muratcelik.service.IPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublisherService implements IPublisherService {

    private PublisherRepo publisherRepo;

    @Autowired
    public PublisherService(PublisherRepo publisherRepo) {
        this.publisherRepo = publisherRepo;
    }

    @Override
    public List<Publisher> getAllPublisher() {
        return publisherRepo.findAll();
    }

    @Override
    public void addPublisher(Publisher publisher) {
        publisherRepo.save(publisher);
    }

    @Override
    public void deletePublisherById(long id) {
        publisherRepo.deleteById(id);
    }

    @Override
    public Optional<Publisher> getPublisherById(long id) {
        return publisherRepo.findById(id);
    }

    @Override
    public void updatePublisher(Publisher publisherUpdate) {
        Publisher publisher = publisherRepo.getOne(publisherUpdate.getId());
        publisher.setName(publisherUpdate.getName());
        publisher.setExplanation(publisherUpdate.getExplanation());
        publisher.setBook(publisherUpdate.getBook());
        publisherRepo.save(publisher);
    }
}
