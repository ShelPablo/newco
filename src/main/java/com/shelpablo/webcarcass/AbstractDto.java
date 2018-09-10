package com.shelpablo.webcarcass;

import java.io.Serializable;

public abstract class AbstractDto implements Serializable {

    protected Long id;

    public Long getId(){return id;}

    public void setId(Long id) {
        this.id = id;
    }
}
