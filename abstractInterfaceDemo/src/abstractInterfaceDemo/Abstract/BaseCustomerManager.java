package abstractInterfaceDemo.Abstract;

import abstractInterfaceDemo.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerServices{
	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to DB: " + customer.getFirstName());		
	}
}
