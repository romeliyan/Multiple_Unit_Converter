package datatransferrateprovider;

import java.util.Hashtable;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		
		Hashtable<String, String> props = new Hashtable<String, String>();
        props.put("Language", "English");
        context.registerService(
        		DataRateService.class.getName(), new DataRateImpl(), props);
		System.out.println("Dictionary service registered and started successfully");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
