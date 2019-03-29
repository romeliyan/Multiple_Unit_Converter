package datatransferrateprovider;

import java.util.Hashtable;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {


	private static BundleContext context;
	private ServiceRegistration serviceRegistration;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Data rate provider started");
		DataRateService dataRateService = new DataRateImpl();
		serviceRegistration = context.registerService(DataRateService.class.getName(),  dataRateService, null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Data rate provider stopped");
		serviceRegistration.unregister();
	}

}
