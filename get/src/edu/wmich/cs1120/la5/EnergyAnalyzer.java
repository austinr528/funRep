package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {
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
		double ene = 0;
		for(int i=0; i<path.size(); i++){
			ene += path.get(i).calcConsumedEnergy();
		}
		
		analysis = Double.toString(ene);

	}

	@Override
	public String getAnalysis() {
		
		return analysis;
	}

	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;

	}
	@Override
	public String toString(){
		return analysis;
	}

}
