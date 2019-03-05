package com.cg.payroll.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.payroll.beans.Associate;

public interface AssociateDao extends JpaRepository<Associate,Integer>{
//	@Query(value="from Associate a where a.firstName=:name")
//	List<Associate>getAllAssociateByName(String name);
 }
