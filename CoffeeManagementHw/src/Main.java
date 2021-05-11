


import CoffeeManagement.abstracts.BaseCustomerManager;
import CoffeeManagement.adapters.MernisServiceAdapter;
import CoffeeManagement.concretes.StarbucksCustomerManager;
import CoffeeManagement.entities.Customer;


public class Main {

	public static void main(String[] args) {
		 Customer customer = new Customer();
	        customer.setFirstName("Aslýcan");
	        customer.setLastName("Dönmez");
	        customer.setNationalityIdentity("11112223366");
	        customer.setDateOfBirth("1996,1,14");
        BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
       
        baseCustomerManager.save(customer);
        
	}

}
