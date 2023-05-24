package com.abccompany.Business.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class LocationEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private long location_id;
    private String lat;
    private String longa;

    @OneToOne(mappedBy = "location")
    private BusinessEntity business;
}
