package sw1;

import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public interface User {
	public static final String UserName = "";
	public String MobileNum = " ";
	public String Email = " " ;
	public String Password = " ";
	
	 public void setUserName(String UserName);
	 public void setPassword(String Password);
	 public void setMobileNum(String MobileNum);
	 public void setEmail(String Email);
	 
	 public String getUserName ();
     public String getPassword();
     public String getEmail();
     public String getMobileNum();
 	
}
