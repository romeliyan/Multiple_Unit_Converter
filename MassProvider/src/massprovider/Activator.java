package massprovider;

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
		System.out.println("Mass provider started");
		Mass massService = new MassImplementation();
		serviceRegistration = context.registerService(Mass.class.getName(),  massService, null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Mass provider stopped");
		serviceRegistration.unregister();
	}
}
