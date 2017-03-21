package get;

import java.io.IOException;

public interface IMapCreator {
	TerrainScanner getScanner();
	void scanTerrain(String fileName, int threshold) throws IOException;
	void setScanner(TerrainScanner scanner);

}
