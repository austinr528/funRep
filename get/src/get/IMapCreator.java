package get;

import java.io.IOException;

import edu.wmich.cs1120.la5.TerrainScanner;

public interface IMapCreator {
	TerrainScanner getScanner();
	void scanTerrain(String fileName, int threshold) throws IOException;
	void setScanner(TerrainScanner scanner);

}
