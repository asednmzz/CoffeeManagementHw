package CoffeeManagement.concretes;
import CoffeeManagement.abstracts.BaseCustomerManager;
import CoffeeManagement.abstracts.ICustomerCheckService;
import CoffeeManagement.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService=customerCheckService;
		
	}
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkifperson(customer)){
			
			super.save(customer);
		
		}
		else {
			
			System.out.println("Not a valid person!");
		}
	}

	
}
