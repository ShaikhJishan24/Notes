package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.Mobile;

@Repository
public interface MobileRepo extends JpaRepository<Mobile, Integer>{

}
