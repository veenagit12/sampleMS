package com.Tekarch.factoryDb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee implements Serializable
{
    private static final long serialVersionUID = -827016060425383632L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = " first_name")
    private String firstName;

    private String city;

   // @OneToOne(mappedBy = "",fetch= FetchType.LAZY,cascade = CascadeType.ALL)
   //new changes done by praveena
    // made changes to employee



}
