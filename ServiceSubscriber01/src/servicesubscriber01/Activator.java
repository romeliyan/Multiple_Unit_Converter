package servicesubscriber01;

import datatransferrateprovider.DataRateService;
import lengthprovider.Length;
import massprovider.Mass;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import temperatureprovider.Temperature;

public class Activator implements BundleActivator {

	// private static BundleContext context;

	private BundleContext context = null;
	private ServiceTracker DRT_tracker = null;
	private ServiceTracker TEMP_tracker = null;
	private ServiceTracker MASS_tracker = null;
	private ServiceTracker LENGTH_tracker = null;

//	static BundleContext getContext() {
//		return context;
//	}

	public void start(BundleContext bundleContext) throws Exception {
		// Activator.context = bundleContext;

		context = bundleContext;

		// get DRT_tracker Object
		DRT_tracker = new ServiceTracker(context,
				context.createFilter("(&(objectClass=" + DataRateService.class.getName() + ")" + "(Language=*))"),
				null);
		DRT_tracker.open();

		// get TEMP_tracker Object
		TEMP_tracker = new ServiceTracker(context,
				context.createFilter("(&(objectClass=" + Temperature.class.getName() + ")" + "(Language=*))"), null);
		DRT_tracker.open();

		// get MASS_tracker Object
		MASS_tracker = new ServiceTracker(context,
				context.createFilter("(&(objectClass=" + Mass.class.getName() + ")" + "(Language=*))"), null);
		DRT_tracker.open();

		// get LENGTH_tracker Object
		LENGTH_tracker = new ServiceTracker(context,
				context.createFilter("(&(objectClass=" + Length.class.getName() + ")" + "(Language=*))"), null);
		DRT_tracker.open();

	}

	public void stop(BundleContext bundleContext) throws Exception {
		// Activator.context = null;
	}

}
