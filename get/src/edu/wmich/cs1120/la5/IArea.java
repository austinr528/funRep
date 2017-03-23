package edu.wmich.cs1120.la5;

public interface IArea {
	public double getBasicEnergyCost();
	void setBasicEnergyCost(double basicEnergyCost);
	double getElevation();
	void setElevation(double elevation);
	double getRadiation();
	
	double calcConsumedEnergy();
	void setRadiation(double radiation);
	

}
