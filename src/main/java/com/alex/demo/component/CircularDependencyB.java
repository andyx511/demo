package com.alex.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname CircularDependencyB
 * @Description TODO
 * @Date 2020/5/21 14:34
 * @Author ALexNi
 */
@Component
public class CircularDependencyB {

    private CircularDependencyA circA;

    @Autowired
    public CircularDependencyB(CircularDependencyA circA) {
        this.circA = circA;
    }
}