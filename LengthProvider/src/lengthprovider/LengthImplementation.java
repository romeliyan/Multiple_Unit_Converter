package lengthprovider;

public class LengthImplementation implements Length {

	// Km --> miles
	// Miles ---> Km

	@Override
	public double KMtoMiles(double amount) {
		// TODO Auto-generated method stub
		try {

			return (amount / 1.609);

		} catch (NumberFormatException e) {
			System.out.println("[LENGTH] Invalid set of Arguments");
			return  0;
		}
	}

	@Override
	public double MilestoKM(double amount) {
		try {
			return (amount * 1.609);

		} catch (NumberFormatException e) {
			System.out.println("[LENGTH] Invalid set of Arguments");
			return 0;
		}
	}

	@Override
	public double MetertoFeet(double amount) {
		try {
			return (amount * 3.281);

		} catch (NumberFormatException e) {
			System.out.println("[LENGTH] Invalid set of Arguments");
			return 0;
		}
	}

	@Override
	public double FeettoMeter(double amount) {
		try {
			return (amount / 3.281);

		} catch (NumberFormatException e) {
			System.out.println("[LENGTH] Invalid set of Arguments");
			return 0;
		}
	}

	@Override
	public double CMtoInches(double amount) {
		try {
			return (amount / 2.54);

		} catch (NumberFormatException e) {
			System.out.println("[LENGTH] Invalid set of Arguments");
			return 0;
		}
	}

	@Override
	public double InchestoCM(double amount) {
		try {
			return (amount * 2.54);

		} catch (NumberFormatException e) {
			System.out.println("[LENGTH] Invalid set of Arguments");
			return 0;
		}
	}

	@Override
	public double YardstoMeters(double amount) {
		try {
			return (amount / 1.094);

		} catch (NumberFormatException e) {
			System.out.println("[LENGTH] Invalid set of Arguments");
			return 0;
		}
	}

	@Override
	public double MeterstoYards(double amount) {
		try {
			return (amount * 1.094);

		} catch (NumberFormatException e) {
			System.out.println("[LENGTH] Invalid set of Arguments");
			return 0;
		}
	}

	@Override
	public double YardstoKM(double amount) {
		try {
			return (amount / 1093.613);

		} catch (NumberFormatException e) {
			System.out.println("[LENGTH] Invalid set of Arguments");
			return 0;
		}
	}

	@Override
	public double KMtoYards(double amount) {
		try {
			return (amount * 1093.613);

		} catch (NumberFormatException e) {
			System.out.println("[LENGTH] Invalid set of Arguments");
			return 0;
		}
	}
	

	@Override
	public double YardstoMiles(double amount) {
		try {
			return (amount / 1760);

		} catch (NumberFormatException e) {
			System.out.println("[LENGTH] Invalid set of Arguments");
			return 0;
		}
	}

	@Override
	public double MilestoYards(double amount) {
		try {
			return (amount * 1760);

		} catch (NumberFormatException e) {
			System.out.println("[LENGTH] Invalid set of Arguments");
			return 0;
		}
	}

}
