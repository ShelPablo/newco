package com.shelpablo.webcarcass;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository<D extends AbstractDto> {
    private final List<D> dtoList = new ArrayList<>();

    public List<D> findAll() {
        return dtoList;
    }

    public D findById(final Long id) {
        return dtoList.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void save(final D trip) {
        trip.setId((long) (dtoList.size() + 1));
        dtoList.add(trip);
    }

    public void delete(final Long id) {
        dtoList.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .ifPresent(dtoList::remove);
    }

    public void update(final D newDto) {
        dtoList.stream()
                .filter(t -> t.getId().equals(newDto.getId()))
                .findFirst()
                .ifPresent(t -> dtoList.set(dtoList.indexOf(t), newDto));
    }
    
    
}
