package edu.wmich.cs1120.la5;

import java.util.ArrayList;




public class RadiationAnalyzer implements IRover {
	
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
		double rad = 0;
		for(int i=0; i<path.size(); i++){
			rad += path.get(i).getRadiation();
		}
		
		analysis = Double.toString(rad);

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
		String st = analysis;
		return st;
	}

}
