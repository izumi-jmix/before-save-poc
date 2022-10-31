package org.izumi.prepersistpoc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.jmix.core.metamodel.annotation.JmixEntity;

@JmixEntity
@Table(name = "CHILD2")
@Entity
public class Child2 extends Parent {

    @Column(name = "HEIGHT")
    private Integer height;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}