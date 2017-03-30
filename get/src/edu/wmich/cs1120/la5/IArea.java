package edu.wmich.cs1120.la5;

public interface IArea {
	/**
	 * gets basic energy cost
	 * @return returns a double the basic energy cost
	 */
	public double getBasicEnergyCost();
	/**
	 * sets the basic energy cost a double
	 * @param basicEnergyCost a double
	 */
	void setBasicEnergyCost(double basicEnergyCost);
	/**
	 * gets the elevation a double
	 * @return a double the elevation
	 */
	double getElevation();
	/**
	 * sets the elevation a double
	 * @param elevation a double
	 */
	void setElevation(double elevation);
	/**
	 * gets the radiation a double
	 * @return a double the radiation
	 */
	double getRadiation();
	/**
	 * takes the basic energy cost and if multiplys it by something depending on if it is 
	 * highArea or lowArea
	 * @return a double
	 */
	double calcConsumedEnergy();
	/**
	 * sets the radiation 
	 * @param radiation a double
	 */
	void setRadiation(double radiation);
	

}
