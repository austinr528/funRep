package edu.wmich.cs1120.la5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromTxt implements IMapCreator {
	private TerrainScanner scanner = new TerrainScanner();
	private Area[][] terrain;

	@Override
	public TerrainScanner getScanner() {
		
		return scanner;
	}

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		double energy;
		double radiation;
		double elevation;
		
		File f = new File(fileName);
		Scanner inFile = new Scanner(f);
		terrain = new Area[10][10];
		
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				
				energy = inFile.nextDouble();
				elevation = inFile.nextDouble();
				radiation = inFile.nextDouble();
				
				if(radiation>=.5){
					terrain[i][j] = new HighArea(energy, elevation, radiation);
					
				}
				else if(elevation>threshold*.5){
					terrain[i][j] = new HighArea(energy, elevation, radiation);
				}
				else{
					terrain[i][j] = new LowArea(energy, elevation, radiation);
				}
			}
		}
		inFile.close();
		scanner.setTerrain(terrain);

	}

	/**
	 * gets the terrain
	 * @return terrain a 2 d array of area objects
	 */
	public Area[][] getTerrain() {
		return terrain;
	}

	/**
	 * sets the terrain
	 * @param terrain an 2d array of area objects
	 */
	public void setTerrain(Area[][] terrain) {
		this.terrain = terrain;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;

	}

}
