package com.shelpablo.webcarcass;


import java.util.List;

public abstract class AbstractService<D extends AbstractDto, R extends AbstractRepository> {

    private final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }


    public List<D> findAll() {
        return repository.findAll();
    }

    public D findById(Long id) {
        return (D)repository.findById(id);
    }

    public void save(D trip) {
        repository.save(trip);
    }

    public void delete(Long id) {
        repository.delete(id);
    }

    public void update(D newTrip) {
        repository.update(newTrip);
    }
}
