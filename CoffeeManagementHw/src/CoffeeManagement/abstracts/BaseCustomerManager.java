package CoffeeManagement.abstracts;

import CoffeeManagement.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		
		System.out.println("Saved to db" + " "  + customer.getFirstName());
	}

}