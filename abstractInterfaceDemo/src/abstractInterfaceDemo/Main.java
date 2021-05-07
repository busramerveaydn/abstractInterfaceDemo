package abstractInterfaceDemo;

import java.time.LocalDate;

import abstractInterfaceDemo.Abstract.BaseCustomerManager;
import abstractInterfaceDemo.Adaptor.MernisServiceAdaptor;
import abstractInterfaceDemo.Concrete.NeroCustomerManager;
import abstractInterfaceDemo.Concrete.StarbucksCustomerManager;
import abstractInterfaceDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdaptor());
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		
		Customer customer = new Customer("Büþra Merve","Aydýn",LocalDate.of(1997, 10, 12),"12345678910");
		
		Customer customer2 = new Customer("Büþra Merve","Aydýn",LocalDate.of(1997, 10, 12),"12345678910");
		customerManager.Save(customer);
		customerManager2.Save(customer2);

	}

}
