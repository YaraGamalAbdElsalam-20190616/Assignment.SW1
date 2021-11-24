package sw1;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class Admin {
    Store store1=new Store();
public boolean verifyDriver(Driver driver)
{
       boolean ver=false;
	if(suspendDriver(driver)==true)
           {
               ver=false;
           }
           else
           {
        	   store1.AddDriver(driver);
        	   ver=true;
               
           }
           return ver;
}
public boolean verifyPendingDriver(String name,String pass)
{
	boolean verify=false;
	for(int i=0;i<store1.PendingDrivers.size();i++)
	{
		if(name.equals(store1.displayPendingDrivers(i).getUserName())||pass.equals(store1.displayPendingDrivers(i).getPassword()))
		{
			verify=true;
                           System.out.println("You cannot log inPlease Register as a Driver again");
			break;
		}
	}
           return verify;

}
public boolean suspendDriver(Driver driver)
{
	boolean check=true;
	if(driver.getUserName()==null||driver.getPassword()==null||driver.getEmail()==null||driver.getMobileNum()==null||driver.getDrivingLicence()==null||driver.getNationalID()==null) {
               check = true ;
               store1.AddPendingDriver(driver);
	}
	else {
               store1.AddDriver(driver);
		check = false ;
	}
	return check ;
}
public boolean suspendCustomer(Customer customer)
{
	boolean check=true;
	if(customer.getUserName()==null||customer.getPassword()==null||customer.getEmail()==null||customer.getMobileNum()==null) {
		check = true ;
	}
	else {
               store1.AddCustomer(customer);
		check = false ;
	}
	return check ;
}

}