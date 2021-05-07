package abstractInterfaceDemo.Abstract;

import abstractInterfaceDemo.Entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
