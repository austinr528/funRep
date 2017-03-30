package edu.wmich.cs1120.la5;

import java.io.IOException;
import java.io.RandomAccessFile;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromDat implements IMapCreator {
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
		char operator;
		int int1;
		int int2;
		int sum = 0;
		RandomAccessFile randFile = new RandomAccessFile("terrain.dat", "r");
	
		while(sum != -1){
			energy = randFile.readDouble();
			elevation = randFile.readDouble();
			radiation = randFile.readDouble();
			operator = randFile.readChar();
			int1 = randFile.readInt();
			int2 = randFile.readInt();
			
			if(radiation>=.5){
				terrain[int1][int2] = new HighArea(energy, elevation, radiation);
				
			}
			else if(elevation>threshold*.5){
				terrain[int1][int2] = new HighArea(energy, elevation, radiation);
			}
			else{
				terrain[int1][int2] = new LowArea(energy, elevation, radiation);
			}
			
			ExpressionFactory.getExpression(operator, int1, int2);
			
		}

		
		
		
		scanner.setTerrain(terrain);

	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;

	}

}
