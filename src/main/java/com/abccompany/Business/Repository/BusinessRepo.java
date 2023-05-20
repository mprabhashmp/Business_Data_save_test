package com.abccompany.Business.Repository;

import com.abccompany.Business.Entity.AddressEntity;
import com.abccompany.Business.Entity.BusinessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepo extends JpaRepository<BusinessEntity, Long> {

}
