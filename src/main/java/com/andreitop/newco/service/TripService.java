package com.andreitop.newco.service;

import com.andreitop.newco.dto.TripDto;
import com.andreitop.newco.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TripService {

    private final TripRepository tripRepository;

    @Autowired
    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<TripDto> findAll() {
        return tripRepository.findAll();
    }

    public TripDto findById(Long id) {
        return tripRepository.findById(id).get();
    }
    @Transactional
    public void save(TripDto trip) {
        tripRepository.save(trip);
    }
    @Transactional
    public void delete(Long id) {
        tripRepository.deleteById(id);
    }
    @Transactional
    public void update(TripDto newTrip) {
        tripRepository.save(newTrip);
    }
}
