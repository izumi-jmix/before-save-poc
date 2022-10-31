package org.izumi.prepersistpoc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.jmix.core.metamodel.annotation.JmixEntity;

@JmixEntity
@Table(name = "CHILD1")
@Entity
public class Child1 extends Parent {

    @Column(name = "AGE")
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}