package com.alex.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @Classname CircularDependencyA
 * @Description TODO
 * @Date 2020/5/21 14:34
 * @Author ALexNi
 */
@Component
public class CircularDependencyA {
    private CircularDependencyB circB;

    @Autowired
    public CircularDependencyA(@Lazy CircularDependencyB circB) {
        this.circB = circB;
    }
}
