package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public interface IRover {
	/**
	 * this method returns an ArrayList<iArea> named path
	 * @return an ArrayList<IArea> 
	 */
	ArrayList<IArea> getPath();
	/**
	 * sets the path an ArrayList<IArea>
	 * @param path an ArrayList<IArea>
	 */
	void setPath(ArrayList<IArea> path);
	/**
	 * this method does the math to determine stats about elevation, radiation, and energy
	 */
	void analyzePath();
	/**
	 * this method returns a string of numbers
	 * @return analysis a string of numbers taken from what you got in analyzePath
	 */
	String getAnalysis();
	/**
	 * this sets the string analysis
	 * @param analysis a string of numbers
	 */
	void setAnalysis(String analysis);
	/**
	 * converts the analysis to a string
	 * @return a string of numbers
	 */
	String toString();
	

}
