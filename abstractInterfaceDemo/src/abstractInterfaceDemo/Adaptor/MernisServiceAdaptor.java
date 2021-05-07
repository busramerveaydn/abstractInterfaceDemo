package abstractInterfaceDemo.Adaptor;


import abstractInterfaceDemo.Abstract.CustomerCheckService;
import abstractInterfaceDemo.Entities.Customer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
		
		try {
			return kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalID()),
					customer.getFirstName(),
					customer.getLastName(), 
					customer.getDateOfBirth());
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			return false;
		}
		
	}

	

}
