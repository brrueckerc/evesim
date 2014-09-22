package org.evesim.jung;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections15.Transformer;

import edu.uci.ics.jung.algorithms.metrics.Metrics;
import edu.uci.ics.jung.algorithms.shortestpath.DistanceStatistics;
import edu.uci.ics.jung.graph.Graph;

public class EveCalculateJungProperties {
	public EveCalculateJungProperties() {

	}
	public ArrayList<Double> calculate(Graph<String,String> g){
		ArrayList<Double> array = new ArrayList<Double>();
		//		Graph<Integer, String> g = new SparseMultigraph<Integer, String>();
		//		g = this.getGraph();

		//Calculate the properties for the given graph
		Transformer<String,Double> data =  DistanceStatistics.averageDistances(g);
		Map<String,Double> map = Metrics.clusteringCoefficients(g);

		Double averagePathLength = new Double(0.0);
		//System.out.println(g.getVertexCount());
		Collection<String> col = g.getVertices();
		Iterator<String> it = col.iterator();
		while(it.hasNext()){
			String tempPath = it.next();
			//System.out.println(data.transform(tempPath));
			averagePathLength = averagePathLength + data.transform(tempPath);
		}
		averagePathLength = averagePathLength/Double.valueOf(g.getVertexCount());
		//add the average path length
		array.add(averagePathLength);

		//System.out.println(averagePathLength);

		Double averageclusteringCoefficient = new Double(0.0);

		for(Iterator<String> iter = map.keySet().iterator(); iter.hasNext();) {
			String key = iter.next();
			Double value = map.get(key);
			//			System.out.println(value);
			averageclusteringCoefficient = averageclusteringCoefficient + value;
		}
		averageclusteringCoefficient = averageclusteringCoefficient/g.getVertexCount();
		//add the average clustering coefficient
		array.add(averageclusteringCoefficient);
		//System.out.println(averageclusteringCoefficient);
		//array.add(averagePathLength/averageclusteringCoefficient);

		//		//create random graph
		//		Factory<Integer> facInt = new Factory<Integer>() {
		//			int i=0;
		//			@Override
		//			public Integer create() {
		//				return i++;
		//			}
		//		};
		//
		//		Factory<String> facStr = new Factory<String>(){
		//			int i=0;
		//			@Override
		//			public String create() {		
		//				return "V"+i++;
		//			}
		//
		//		};
		//		Factory<UndirectedGraph<Integer, String>> facGraph = new Factory<UndirectedGraph<Integer, String>>(){
		//
		//			@Override
		//			public UndirectedGraph<Integer, String> create() {
		//				return new UndirectedSparseGraph<Integer, String>();
		//			}
		//
		//		};
		//
		//		ErdosRenyiGenerator<Integer, String> gen = new ErdosRenyiGenerator<Integer, String>(facGraph,facInt,facStr,g.getVertexCount(),0.25);
		//		Graph<Integer, String> graph = gen.create();
		//
		//		//calculate for the random graph
		//		Transformer<Integer,Double> data_gen =  DistanceStatistics.averageDistances(graph);
		//		Map<Integer,Double> map_gen = Metrics.clusteringCoefficients(graph);
		//
		//		Double averagePathLength_gen = new Double(0);
		//		Collection<Integer> col_gen = graph.getVertices();
		//		Iterator<Integer> it_gen = col_gen.iterator();
		//		while(it_gen.hasNext()){
		//			Integer tempPath_gen = it_gen.next();
		//			//			System.out.println(data_gen.transform(tempPath_gen));
		//			averagePathLength_gen += data_gen.transform(tempPath_gen);
		//		}
		//		//System.out.println(averagePathLength_gen);
		//		averagePathLength_gen = averagePathLength_gen/graph.getVertexCount();
		//
		//		//System.out.println(averagePathLength_gen);
		//		array.add(averagePathLength_gen);
		//
		//		Double averageclusteringCoefficient_gen = new Double(0);
		//
		//		for(Iterator<Integer> iter_gen = map_gen.keySet().iterator(); iter_gen.hasNext();) {
		//			Integer key_gen = iter_gen.next();
		//			Double value_gen = map_gen.get(key_gen);
		//			//			System.out.println(value_gen);
		//			averageclusteringCoefficient_gen += value_gen;
		//		}
		//		averageclusteringCoefficient_gen = averageclusteringCoefficient_gen/graph.getVertexCount();
		//		//System.out.println(averageclusteringCoefficient_gen);

		//		array.add(averageclusteringCoefficient_gen);
		//		array.add(averagePathLength/averagePathLength_gen);
		//		array.add(averageclusteringCoefficient/averageclusteringCoefficient_gen);
		Double k = Double.valueOf(g.getEdgeCount())/Double.valueOf(g.getVertexCount());
		Double n = Double.valueOf(g.getVertexCount());
		Double averagePathLengthGen = Math.log(n)/Math.log(k);
		Double averageclusteringCoefficientGen = k/n;

		array.add(averagePathLengthGen);
		array.add(averageclusteringCoefficientGen);

		array.add(averagePathLength/averagePathLengthGen);
		array.add(averageclusteringCoefficient/averageclusteringCoefficientGen);



		return array;
	}
}
