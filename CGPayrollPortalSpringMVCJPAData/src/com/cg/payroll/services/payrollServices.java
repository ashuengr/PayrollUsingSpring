package com.cg.payroll.services;
import java.util.List;
import com.cg.payroll.exception.*;
import com.cg.payroll.beans.Associate;
public interface payrollServices {
 Associate  acceptAssociateDetails(Associate associate);
 
 int calculateNetSalary(int associateId) throws AssociateDetailNotFoundException;
 Associate getAssociateDetails(int associateId) throws AssociateDetailNotFoundException;
 List<Associate>getAssociateDetails();
}
