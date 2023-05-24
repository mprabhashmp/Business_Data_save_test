package com.abccompany.Business.Controller;


import com.abccompany.Business.BusinessRequest.Business_Request;
import com.abccompany.Business.Entity.AddressEntity;
import com.abccompany.Business.Entity.BusinessEntity;
import com.abccompany.Business.Entity.LocationEntity;
import com.abccompany.Business.Repository.BusinessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/savedata")
public class BusinessController {

    @Autowired
    private BusinessRepo businessRepo;
    @PostMapping("/save")
    public BusinessEntity createCompany(@RequestBody BussinessRequest request) {
        AddressEntity address = new AddressEntity();
        address.setLine1(request.getAddress().getLine1());
        address.setLine2(request.getAddress().getLine2());
        address.setState(request.getAddress().getState());

        LocationEntity location = new LocationEntity();
        location.setLat(request.getLocation().getLat());
        location.setLonga(request.getLocation().getLonga());

        BusinessEntity company = new BusinessEntity();
        company.setName(request.getName());
        company.setMobile(request.getMobile());
        company.setAddress(address);
        company.setLocation(location);

        return businessRepo.save(company);
    }
}

