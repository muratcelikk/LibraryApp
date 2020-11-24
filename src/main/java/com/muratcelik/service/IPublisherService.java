package com.muratcelik.service;

import com.muratcelik.entity.Publisher;

import java.util.List;
import java.util.Optional;

public interface IPublisherService {

    List<Publisher> getAllPublisher();

    void addPublisher(Publisher publisher);

    void deletePublisherById(long id);

    Optional<Publisher> getPublisherById(long id);

    void updatePublisher(Publisher publisherUpdate);
}
