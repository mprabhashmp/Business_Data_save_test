package com.abccompany.Business.Repository;

import com.abccompany.Business.Entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<LocationEntity,Long> {
}
