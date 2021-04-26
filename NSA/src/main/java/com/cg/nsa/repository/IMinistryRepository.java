package com.cg.nsa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.nsa.entity.Ministry;

/**********************************************************************************************************
 * 
 * @author VASUPPRADHA
 * Version: 1.0
 * Description: This is the Ministry Repository Interface. It extends the JpaRepository.
 * Created date: 19-04-2021
 * 
 *********************************************************************************************************/

@Repository
public interface IMinistryRepository extends JpaRepository<Ministry, String>
{
	
	
}
