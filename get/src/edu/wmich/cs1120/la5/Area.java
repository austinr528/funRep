package edu.wmich.cs1120.la5;

public abstract class Area implements IArea {
	private double basicEnergyCost;
	private double elevation;
	private double radiation;

	@Override
	public double getBasicEnergyCost() {
		
		return basicEnergyCost;
	}

	@Override
	public void setBasicEnergyCost(double basicEnergyCost) {
		this.basicEnergyCost = basicEnergyCost;

	}

	@Override
	public double getElevation() {
		
		return elevation;
	}

	@Override
	public void setElevation(double elevation) {
		this.elevation = elevation;

	}

	@Override
	public double getRadiation() {
		
		return radiation;
	}

	@Override
	public void setRadiation(double radiation) {
		this.radiation = radiation;

	}

	@Override
	public double calcConsumedEnergy() {
		// TODO Auto-generated method stub
		return 0;
	}

}
