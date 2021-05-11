package CoffeeManagement.adapters;
import CoffeeManagement.abstracts.ICustomerCheckService;
import CoffeeManagement.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
public boolean checkifperson(Customer customer) {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=false;
	
	try {
		return client.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityIdentity()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), 
				customer.getDateOfBirth().getYear());
	} catch (Exception e) {
		
		System.out.println("Not a volid person");
	}
	return result;
	
	


		
	}
	
	
}
