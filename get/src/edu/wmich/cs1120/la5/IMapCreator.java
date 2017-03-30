package edu.wmich.cs1120.la5;

import java.io.IOException;

import edu.wmich.cs1120.la5.TerrainScanner;

public interface IMapCreator {
	/**
	 * returns scanner
	 * @return scanner of type TerrainScanner
	 */
	TerrainScanner getScanner();
	/**
	 * this gets the file you want to scan and threshold and reads the file and puts the 
	 * info into an array of area objects
	 * @param fileName a string the name of the file you want to read
	 * @param threshold the highest allowable elevation
	 * @throws IOException
	 */
	void scanTerrain(String fileName, int threshold) throws IOException;
	/**
	 * sets the scanner
	 * @param scanner a TerrainScanner
	 */
	void setScanner(TerrainScanner scanner);

}
