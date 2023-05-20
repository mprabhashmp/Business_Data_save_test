package com.abccompany.Business.Controller;


import com.abccompany.Business.Entity.AddressEntity;
import com.abccompany.Business.Entity.BusinessEntity;
import com.abccompany.Business.Entity.LocationEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BusinessController {

    @RequestMapping(path="/savedata/save", method= RequestMethod.POST)
    public ResponseEntity<String> SaveData(@RequestBody BusinessEntity b){

        return ResponseEntity.ok(b.getName()+"|"+b.getMobile());

    }


}
