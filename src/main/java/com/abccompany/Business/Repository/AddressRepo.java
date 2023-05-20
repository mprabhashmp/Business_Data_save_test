package com.abccompany.Business.Repository;

import com.abccompany.Business.Entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<AddressEntity,Long> {
}
