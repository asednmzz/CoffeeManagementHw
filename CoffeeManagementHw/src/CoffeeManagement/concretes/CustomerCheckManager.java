package CoffeeManagement.concretes;

import CoffeeManagement.abstracts.ICustomerCheckService;
import CoffeeManagement.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean checkifperson(Customer customer) {
		
		return true;
	}
}
