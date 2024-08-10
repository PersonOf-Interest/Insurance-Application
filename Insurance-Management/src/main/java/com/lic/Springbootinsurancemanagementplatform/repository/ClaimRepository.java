package com.lic.Springbootinsurancemanagementplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.lic.Springbootinsurancemanagementplatform.dto.Claim;

@Component
public interface ClaimRepository extends JpaRepository<Claim, Integer>{

}
