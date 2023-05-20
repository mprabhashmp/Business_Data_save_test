package com.abccompany.Business.BusinessRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address_Request {
    private String line1;
    private String line2;
    private String state;
}
