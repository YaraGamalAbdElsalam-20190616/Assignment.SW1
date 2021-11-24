package sw1;

import java.util.*;

public  class Driver implements User {

    private String DrivingLicence ; 
    private String NationalID ;
    Admin admin=new Admin();	
    
    private String UserName;
    private String MobileNum ;
    private String Email  ;
    private String Password;	
    
    Offer offer1=new Offer();
    Store store2=new Store();
    //Notification notification=new Notification();
    
    Scanner sc= new Scanner(System.in);
    public Driver()
    {
        
    }
    public Driver(String name,String pass,String email,String mobilenum,String drivingLicence,String nationalID)
	{
		UserName = name;
		Password=pass;
                Email=email;
                MobileNum=mobilenum;
                DrivingLicence=drivingLicence;
                NationalID=nationalID;
                
	}
    @Override
    public String getUserName() {
        return UserName;
    }
    @Override
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    @Override
    public String getPassword() {
        return Password;
    }

    @Override
    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String getMobileNum() {
        return MobileNum;
    }

    @Override
    public void setMobileNum(String MobileNum) {
        this.MobileNum = MobileNum;
    }
    
	
	public void setPrice()
     {
        System.out.println("Please enter the price that you want to set it");
         double price=sc.nextDouble();
         offer1.setPrice(price);
     }
	public double Notify()
	{
		return offer1.getPrice();
        }
	public void setDrivingLicenec (String DrivingLicence) {
		this.DrivingLicence = DrivingLicence ;
	}
	
	public void setNationalID (String NationalID) {
		this.NationalID = NationalID ;
	}
	
	public String getDrivingLicence () {
		return DrivingLicence ;
	}
	
	public String getNationalID () {
		return NationalID ;
	}
      public boolean logIn(String name,String pass)
        {
            boolean flag=false;
            for(int i=0;i<store2.drivers.size();i++)
            {
               if(store2.displayDrivers(i).getUserName().equals(name)&&store2.displayDrivers(i).getPassword().equals(pass))
        	      {
                        flag=true;
                        break;
        	      } 
            }
            return flag;
        }
      
      /*public void suspendCheck(Driver driver)
        {
        	if(admin.suspendDriver(driver)==true)
        	{
        		System.out.println("You cannot login");
        		
        	}
        }*/
	 
}

