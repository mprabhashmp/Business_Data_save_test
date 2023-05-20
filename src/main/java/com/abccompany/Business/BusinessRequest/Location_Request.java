package com.abccompany.Business.BusinessRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Location_Request {
    private String lat;
    private String longa;
}
