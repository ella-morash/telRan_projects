package com.example.dog_demo.service.impl;

import com.example.dog_demo.dto.DogDTO;
import com.example.dog_demo.dto.OwnerDTO;
import com.example.dog_demo.entity.Owner;
import com.example.dog_demo.repository.OwnerRepository;
import com.example.dog_demo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public void createOwner(OwnerDTO request) {

        Owner owner = Owner.builder().firstName(request.getFirstName())
                .lastName(request.getLastName())
                .dateOfBirth(request.getDateOfBirth())
                .build();

        ownerRepository.save(owner);

    }

    @Override
    public OwnerDTO getOwnerById(Long id) {

        Owner owner = ownerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        return  OwnerDTO.builder().firstName(owner.getFirstName()).
                lastName(owner.getLastName()).
                dateOfBirth(owner.getDateOfBirth())
                .build();
    }

    @Override
    public void addDog(Long id, Long dogId, DogDTO request) {
        Owner owner = ownerRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));


    }
}
