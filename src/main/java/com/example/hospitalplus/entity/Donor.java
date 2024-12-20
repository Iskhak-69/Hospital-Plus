package com.example.hospitalplus.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@Entity
@Table(name = "donor")
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @CreationTimestamp
    @Column(nullable = false)
    private Date date;

    @Column(name = "message")
    private String message;


    @ManyToOne
    private Laboratory laboratory;

    public Donor() {
    }

    public Donor(String firstName, String email, Date date, String message, Laboratory laboratory) {
        this.fullName = firstName;
        this.email = email;
        this.date = date;
        this.message = message;
        this.laboratory = laboratory;
    }
}
