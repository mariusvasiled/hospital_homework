package com.sda.entities;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "physicians")
public class Physician {
    @Id
    @GenericGenerator(name="gen" , strategy="increment")
    @GeneratedValue(generator="gen")
    private Integer employee_id;
    @Column(name = "`name`")
    private String name;
    @Column(name = "position")
    private String position;
    @Column(name = "ssn")
    private Integer ssn;


    public Physician(){};

    public Physician(Integer employee_id, String name, String position, Integer ssn) {
        this.employee_id = employee_id;
        this.name = name;
        this.position = position;
        this.ssn = ssn;
    }


    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }
}
