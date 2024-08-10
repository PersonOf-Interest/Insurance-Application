package com.lic.Springbootinsurancemanagementplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.lic.Springbootinsurancemanagementplatform.dto.Client;

@Component
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
