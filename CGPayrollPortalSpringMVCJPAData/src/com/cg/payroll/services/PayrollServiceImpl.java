package com.cg.payroll.services;
import com.cg.payroll.daoservices.*;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.exception.AssociateDetailNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("payrollServices")
public class PayrollServiceImpl implements payrollServices  {
	@Autowired
	private AssociateDao associateDao;

	@Override
	public Associate acceptAssociateDetails(Associate associate) {
	    associate=associateDao.save(associate);
		return associate;
	}
	
	@Override
	public int calculateNetSalary(int associateId) throws AssociateDetailNotFoundException {
		Associate associate=getAssociateDetails(associateId);
		
		return 0;
	}

	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailNotFoundException {
			return associateDao.findById(associateId).orElseThrow(()->new AssociateDetailNotFoundException("Associate details not found for id"+associateId));

	}

	@Override
	public List<Associate>getAssociateDetails() {
		
		return associateDao.findAll();
	}
	
	
} 

	