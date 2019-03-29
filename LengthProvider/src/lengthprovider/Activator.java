package lengthprovider;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	

	public void start(BundleContext bundleContext) throws Exception {
		Hashtable<String, String> props = new Hashtable<String, String>();
        props.put("Language", "English");
        bundleContext.registerService(
            Length.class.getName(), new LengthImplementation(), props);
		System.out.println("Coffee service registered and started successfully");		
    }
	

	public void stop(BundleContext bundleContext) throws Exception {
//		Activator.context = bundleContext;
		System.out.println("Length provider stopped");
//		serviceRegistration.unregister();
	}
}