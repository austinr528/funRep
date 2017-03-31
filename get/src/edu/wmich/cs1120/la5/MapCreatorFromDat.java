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
		
		double energy = 0;
		double radiation;
		double elevation;
		terrain = new Area[10][10];
		char operator;
		int int1;
		int int2;
		int sum = 0;
		
		int i=0;
		RandomAccessFile randFile = new RandomAccessFile("terrain.dat", "r");
	
		while(sum != -1){
			for(int j=0; j<10; j++){
			energy = randFile.readDouble();
			elevation = randFile.readDouble();
			radiation = randFile.readDouble();
			operator = randFile.readChar();
			int1 = randFile.readInt();
			int2 = randFile.readInt();
			
			if(radiation>=.5){
				terrain[i][j] = new HighArea(energy, elevation, radiation);
				
			}
			else if(elevation>threshold*.5){
				terrain[i][j] = new HighArea(energy, elevation, radiation);
			}
			else{
				terrain[i][j] = new LowArea(energy, elevation, radiation);
			}
			
			IExpression l = ExpressionFactory.getExpression(operator, int1, int2);
			sum = l.getValue();
			if(sum==-1){
				
			}
			else
				randFile.seek(sum*34);
			
		}
			i++;
		}

		
		
		
		scanner.setTerrain(terrain);
		randFile.close();

	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;

	}

}
