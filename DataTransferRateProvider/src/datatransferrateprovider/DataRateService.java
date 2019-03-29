package datatransferrateprovider;

public interface DataRateService {
	
	public double KbPsToMbPs(double amount);
	public double MbPsToKbPs(double amount);
	public double MbPsToGbPs(double amount);
	public double GbPsToMbPs(double amount);
	public double KbPsToGbPs(double amount);
	public double GbPsToKbPs(double amount);

}
