package com.databaserelationship.dbrelationonetomany.service;

import com.databaserelationship.dbrelationonetomany.repository.InternDetailsRepository;
import com.databaserelationship.dbrelationonetomany.repository.InternRepository;
import com.databaserelationship.dbrelationonetomany.resources.entity.InternDetails;
import com.databaserelationship.dbrelationonetomany.resources.entity.Interns;
import com.databaserelationship.dbrelationonetomany.resources.request.InternDetailsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InternDetailsService {

    @Autowired
    InternDetailsRepository internDetailsRepository;

    @Autowired
    InternRepository internRepository;


    public Interns createInternDetails(InternDetailsRequest request) {

        InternDetails details = new InternDetails(
                request.getAddress(),
                request.getZipCode()
        );
        Optional<Interns> optionalIntern = internRepository.findById(request.getId());

        Interns intern = null;
        if (optionalIntern.isPresent()) {
            intern = optionalIntern.get();
        }
        intern.setInternDetails(details);
        return internRepository.save(intern);
    }


    public InternDetails getInternDetails(Long id) {
        Optional<InternDetails> optionalInternDetails = internDetailsRepository.findById(id);
        System.out.println(optionalInternDetails.get());

        InternDetails internDetails = null;
        if (optionalInternDetails.isPresent()) {
            internDetails = optionalInternDetails.get();
        }
        return internDetails;
    }
}