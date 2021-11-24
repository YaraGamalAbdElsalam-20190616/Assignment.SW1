package sw1;

import java.util.ArrayList;

public class Store {
	ArrayList <Customer>  customers=new ArrayList<>(); 
	ArrayList <Driver>  drivers=new ArrayList<>(); 
	ArrayList <Driver>  PendingDrivers=new ArrayList<>();
	ArrayList <Rating>  ratings=new ArrayList<>();
	ArrayList <String> AllRides=new ArrayList<>();
        ArrayList <String> FavouritreAreas = new ArrayList <>() ;
	public Store()
	{
		
	}
	public void AddCustomer(Customer customer)
	{
		customers.add(customer);
	}
	public void AddDriver(Driver driver)
	{
		drivers.add(driver);
	}
	public void AddPendingDriver(Driver pendingDriver)
	{
		PendingDrivers.add(pendingDriver);
	}
	public void AddRatings(Rating rating)
	{
		ratings.add(rating);
	}
	public void AddAllRides(String ride)
	{
		AllRides.add(ride);
	}
	public Driver displayDrivers( int i)
	{
		
		return drivers.get(i);
	}
	public Customer displayCustomer(int i)
	{
		
		return customers.get(i);
	}
	public Driver displayPendingDrivers(int i)
	{
		
		return PendingDrivers.get(i);
	}
	public Rating displayRatings(int i)
	{
		
		return ratings.get(i);
	}
	public String displayAllRidess(int i)
	{
		
		return AllRides.get(i);
	}
     public void addFavouritreAreas(String favArea){
                FavouritreAreas.add(favArea);
            
        }
     public String displayFavouritreAreas(int i)
        {
            return FavouritreAreas.get(i);
        }

}