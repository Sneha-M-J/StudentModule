package com.cg.nsa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.nsa.entity.User;

/**********************************************************************************************************
 * 
 * @author Rajkumar V
 * Version: 1.0
 * Description: This is the User Repository Interface. It extends the JpaRepository.
 * Created date: 19-04-2021
 * 
 *********************************************************************************************************/

@Repository
public interface IUserRepository extends JpaRepository<User, String>
{
	 User findByUserId(String user);
		
}