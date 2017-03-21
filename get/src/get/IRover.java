package get;

import java.util.ArrayList;

public interface IRover {
	ArrayList<IArea> getPath();
	void setPath(ArrayList<IArea> path);
	void analyzePath();
	String getAnalysis();
	void setAnalysis(String analysis);
	String toString();

}
