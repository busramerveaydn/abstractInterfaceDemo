package abstractInterfaceDemo.Concrete;

import abstractInterfaceDemo.Abstract.CustomerCheckService;
import abstractInterfaceDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
