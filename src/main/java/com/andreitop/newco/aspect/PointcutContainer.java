package com.andreitop.newco.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutContainer {

    @Pointcut("execution( * com.andreitop.newco.repository.*Repo*.find*())")
    public void repositoryFind() {    }

    @Pointcut("execution( * com.andreitop.newco.repository.*Repo*.save(..))")
    public void repositorySave() {    }

    @Pointcut("execution( * com.andreitop.newco.controller.*Control*.find*())")
    public void controllerFind() {    }

    @Pointcut("execution( * com.andreitop.newco.controller.*Repo*.save(..))")
    public void controllerSave() {    }

}
