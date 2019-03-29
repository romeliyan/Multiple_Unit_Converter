package lengthprovider;

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
		System.out.println("Length provider started");
		Length lengthService = new LengthImplementation();
		serviceRegistration = context.registerService(Length.class.getName(),  lengthService, null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Length provider stopped");
		serviceRegistration.unregister();
	}

}
