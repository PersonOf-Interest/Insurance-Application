package com.lic.Springbootinsurancemanagementplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.lic.Springbootinsurancemanagementplatform.dto.InsurancePolicy;

@Component
public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Integer>{

}
