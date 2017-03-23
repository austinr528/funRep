package edu.wmich.cs1120.la5;

import java.io.IOException;

import edu.wmich.cs1120.la3.Area;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromTxt implements IMapCreator {
	private TerrainScanner scanner = new TerrainScanner();
	private Area[][] terrain;

	@Override
	public TerrainScanner getScanner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		// TODO Auto-generated method stub

	}

}
