package com.andreitop.newco.service;

import com.andreitop.newco.dto.TripDto;
import com.andreitop.newco.repository.TripRepository;
import com.shelpablo.webcarcass.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService extends AbstractService<TripDto, TripRepository> {
    @Autowired
    public TripService(TripRepository tripRepository) {
        super(tripRepository);
    }
}
