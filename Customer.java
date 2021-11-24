package sw1;

import java.util.*;

public class Customer implements User //implements Notification {
{Scanner sc= new Scanner(System.in);
Order order = new Order () ;
Rating rate1 = new Rating ();
    //Notification notification=new Notification();
Admin admin=new Admin();
    Store store3=new Store();
private String UserName;
private String MobileNum ;
private String Email  ;
private String Password;
    public Customer()
    {
        
    }
    public Customer(String name,String pass,String email,String mobilenum)
    {
        UserName = name;
        Password=pass;
        Email=email;
        MobileNum=mobilenum;
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


public void AddRide () {
    String sourceArea = sc.next();
String distinationArea = sc.next();
    order.setSourceArea(sourceArea);
order.setDistinationArea(distinationArea);
}

public double Notify(){
    return rate1.getRate();
}
public void suspendCheck(Customer customer) {
if(admin.suspendCustomer(customer)==true)
	{
		System.out.println("You cannot login");
		
	}
    else
    {
            System.out.println("You logged in Successfully");
            store3.AddCustomer(customer);

    }
}

public boolean logIn(String name,String pass)
    {
        boolean flag=false;
        for(int i=0;i<store3.customers.size();i++)
        {
           if(store3.displayCustomer(i).getUserName().equals(name)&&store3.displayCustomer(i).getPassword().equals(pass))
              	{
    		
                    flag=true;
                    break;
               	} 
        }
        return flag;
    }
}