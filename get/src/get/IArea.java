package get;

public interface IArea {
	public double getBasicEnergyCost();
	void setBasicEnergyCost(double basicEnergyCost);
	double getElevation();
	void setElevation(double elevation);
	double getRadiation();
	void setRadiation();
	double calcConsumedEnergy();
	

}
