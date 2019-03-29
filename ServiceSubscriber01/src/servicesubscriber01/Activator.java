package servicesubscriber01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import lengthprovider.Length;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {

	// private static BundleContext context;

	private BundleContext m_context = null;
	// private ServiceTracker DRT_tracker = null;
//	private ServiceTracker TEMP_tracker = null;
//	private ServiceTracker MASS_tracker = null;
	private ServiceTracker LENGTH_tracker = null;

//	static BundleContext getContext() {
//		return context;
//	}

	public void start(BundleContext bundleContext) throws Exception {
		// Activator.context = bundleContext;

		// get DRT_tracker Object
//		DRT_tracker = new ServiceTracker(context,
//				context.createFilter("(&(objectClass=" + DataRateService.class.getName() + ")" + "(Language=*))"),
//				null);
//		DRT_tracker.open();
//
//		// get TEMP_tracker Object
//		TEMP_tracker = new ServiceTracker(context,
//				context.createFilter("(&(objectClass=" + Temperature.class.getName() + ")" + "(Language=*))"), null);
//		DRT_tracker.open();
//
//		// get MASS_tracker Object
//		MASS_tracker = new ServiceTracker(context,
//				context.createFilter("(&(objectClass=" + Mass.class.getName() + ")" + "(Language=*))"), null);
//		DRT_tracker.open();

		// get LENGTH_tracker Object
//		LENGTH_tracker = new ServiceTracker(context,
//				context.createFilter("(&(objectClass=" + Length.class.getName() + ")" + "(Language=*))"), null);
//		LENGTH_tracker.open();

		m_context = bundleContext;

		// Create a service tracker to monitor dictionary services.
		LENGTH_tracker = new ServiceTracker(m_context,
				m_context.createFilter("(&(objectClass=" + Length.class.getName() + ")" + "(Language=*))"), null);
		LENGTH_tracker.open();

		// User interaction panel
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

			// coffeeService coffee = (coffeeService) m_tracker.getService();
			Length len = (Length) LENGTH_tracker.getService();
			while (true) {

				System.out.println("Select option Number : \n");
				inputStream = bufferedStream.readLine();

				if (inputStream.isEmpty()) {
					System.out.println("Exiting......");
					break;
				} else if (inputStream.equals("1")) {
					// your comment here ..
					System.out.println("DTR - Login page ");
					System.out.println(len.CMtoInches(455));

				} else if (inputStream.equals("2")) {
					// your comment here ..

				} else if (inputStream.equals("3")) {
					// your comment here ..

				} else if (inputStream.equals("4")) {
					// your comment here ..

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void stop(BundleContext bundleContext) throws Exception {
		// Activator.context = null;
	}

}