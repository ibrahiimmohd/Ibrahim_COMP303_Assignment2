/*  
 * Ibrahim Ali
 * 301022172
 * 20-03-2021
 * */
 
package com.assignment.mvc;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assignment.mvc.Members;


public interface MembersRepository extends JpaRepository<Members, Integer> {
	
	@Query("select e from Members e where e.email like %?1 and e.password like %?2")
    Members memberLogIn(String email, String password);
	
}
