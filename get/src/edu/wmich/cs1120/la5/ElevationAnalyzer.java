package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
	private ArrayList<IArea> path;
	private String analysis;

	@Override
	public ArrayList<IArea> getPath() {
		
		return path;
	}

	@Override
	public void setPath(ArrayList<IArea> path) {
		this.path = path;

	}

	@Override
	public void analyzePath() {
		double ele = 0;
		for(int i=0; i<path.size(); i++){
			ele += path.get(i).getElevation();
		}
		double aveEle = ele/path.size();
		
		analysis = Double.toString(aveEle);

	}

	@Override
	public String getAnalysis() {
		
		return analysis;
	}

	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;

	}
	
	public String toString(){
		return analysis;
	}

}
