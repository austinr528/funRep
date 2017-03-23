package edu.wmich.cs1120.la5;

public class LowArea extends Area {
	
	public LowArea(double energy, double elevation, double radiation){
		setBasicEnergyCost(energy);
		setElevation(elevation);
		setRadiation(radiation);
	}
	@Override
	public double calcConsumedEnergy(){
		return getBasicEnergyCost()*2;
	}

}
