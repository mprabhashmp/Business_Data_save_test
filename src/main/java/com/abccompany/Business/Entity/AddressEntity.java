package com.abccompany.Business.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AddressEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

private long address_id;

 private String line1;
 private String line2;
 private String status;

    @OneToOne(mappedBy = "address")
    private BusinessEntity business;

}
