package edu.wmich.cs1120.la5;

import java.io.IOException;

import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromDat implements IMapCreator {
	private TerrainScanner scanner = new TerrainScanner();
	private Area[][] terrain;

	@Override
	public TerrainScanner getScanner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		
		
		
		scanner.setTerrain(terrain);

	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		// TODO Auto-generated method stub

	}

}
