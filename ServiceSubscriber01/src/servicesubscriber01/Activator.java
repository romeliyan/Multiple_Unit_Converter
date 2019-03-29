package servicesubscriber01;

import datatransferrateprovider.DataRateImpl;
import lengthprovider.Length;
import massprovider.Mass;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import temperatureprovider.Temperature;

public class Activator implements BundleActivator {

	private static BundleContext context;
	ServiceReference TemperatureReference;
	ServiceReference MassReference;
	ServiceReference LengthReference;
	ServiceReference DTRReference;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		
		System.out.println("Start Subscriber Service");
		
		TemperatureReference = context.getServiceReference(Temperature.class.getName());
		Temperature temperature = (Temperature) context.getService(TemperatureReference);
		
		MassReference = context.getServiceReference(Mass.class.getName());
		Mass mass = (Mass) context.getService(MassReference);
		
		LengthReference = context.getServiceReference(Length.class.getName());
		Length length = (Length) context.getService(LengthReference);
		
		DTRReference = context.getServiceReference(DataRateImpl.class.getName());
		DataRateImpl dataRate = (DataRateImpl) context.getService(DTRReference);
		
		//User interaction panel
		try {
			 
			 
			 System.out.println("------------------------------------------");
			 System.out.println("\n\n\n");
			 System.out.println("Select Number to Proceed");
			 System.out.println("01 - Data Rate Conversions");
			 System.out.println("02 - Length Conversions");
			 System.out.println("03 - Temperature Rate Conversions");
			 System.out.println("04 - Mass Conversions");
			 System.out.println("\n\n");
			 System.out.println("------------------------------------------");
			 System.out.println("Enter blank line to exit program");
			 
			 String inputStream = "";
			 BufferedReader bufferedStream = new BufferedReader(new InputStreamReader(System.in));
			 
			 
			 
			 while(true) {
				 
				 System.out.println("Select option Number : \n");
				inputStream = bufferedStream.readLine();
				 
				if(inputStream.isEmpty()) {
					System.out.println("Exiting......");
					break;
				} 
				else if(inputStream.equals("1")) {
					//your comment here ..
					System.out.println("DTR - Login page ");
					
				}
				else if(inputStream.equals("2")) {
					//your comment here ..
					
				}
				else if(inputStream.equals("3")) {
					//your comment here ..
					
				}else if(inputStream.equals("4")) {
					//your comment here ..
					
				}
				
				 
			 }
			 
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
	}
		
	public void stop(BundleContext bundleContext) throws Exception {
		
		context.ungetService(TemperatureReference);
		context.ungetService(MassReference);
		context.ungetService(DTRReference);
		context.ungetService(LengthReference);
		System.out.println("Serivce Stopped");
	}

}
