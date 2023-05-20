package com.abccompany.Business.BusinessRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Business_Request {
    private String name;
    private int mobile;
    private AddressRequest address;
    private LocationRequest location;


}
