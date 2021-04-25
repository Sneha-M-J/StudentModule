package com.cg.nsa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.nsa.entity.Institution;
import com.cg.nsa.exception.InvalidInstitutionException;


@Repository
public interface IInstituteRepository extends JpaRepository<Institution, String>
{

	Institution findByUserId(String userId);
	
	Institution findByName(String name);
	
}
