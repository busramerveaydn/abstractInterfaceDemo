package abstractInterfaceDemo.Concrete;

import abstractInterfaceDemo.Abstract.BaseCustomerManager;
import abstractInterfaceDemo.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	public void Save(Customer customer) {
		
		System.out.println("Nero kullanıcısı veri tabanına kaydedildi :" + customer.getFirstName() + " " + customer.getLastName());
		 
	

	}
}
