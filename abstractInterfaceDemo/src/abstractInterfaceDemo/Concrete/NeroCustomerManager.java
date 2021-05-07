package abstractInterfaceDemo.Concrete;

import abstractInterfaceDemo.Abstract.BaseCustomerManager;
import abstractInterfaceDemo.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	public void Save(Customer customer) {
		
		System.out.println("Nero kullanýcýsý veri tabanýna kaydedildi :" + customer.getFirstName() + " " + customer.getLastName());
		 
	

	}
}
