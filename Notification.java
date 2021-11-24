package sw1;

public  class Notification {
    Store store=new Store();
    Driver driver=new Driver();
    Customer customer=new Customer();
    public Notification()
    {
        
    }
    public void notifyRide()
    {
        for(int i=0;i<store.AllRides.size();i++)
        {
            store.displayAllRidess(i);
        }
        
    }
    public  void updateDriver()
    {
        
        System.out.println("your rate is: "+ customer.Notify());
    }
    public  void updateCustomer()
    {
        System.out.println("the price of the trip is: "+driver.Notify());
    }
}