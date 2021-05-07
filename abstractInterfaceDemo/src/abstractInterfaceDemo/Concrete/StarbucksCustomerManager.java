package abstractInterfaceDemo.Concrete;

import abstractInterfaceDemo.Abstract.BaseCustomerManager;
import abstractInterfaceDemo.Abstract.CustomerCheckService;
import abstractInterfaceDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	CustomerCheckService customerCheckService;
	BaseCustomerManager baseCustomerManager;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	public void Save(Customer customer) {
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			
			baseCustomerManager.Save(customer);
			
		} else {
			
			System.out.println("Not a valid person!");

		}
	}
}
