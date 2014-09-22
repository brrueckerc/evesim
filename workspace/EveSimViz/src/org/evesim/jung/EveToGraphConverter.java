package org.evesim.jung;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.evesim.EveAgent;
import org.evesim.EveComponent;
import org.evesim.EveConnection;

import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;

public class EveToGraphConverter {

	public EveToGraphConverter() {

	}

	public String getEdgeName(EveConnection connection) {
		return connection.getParent().getName() + " - " + connection.getConnectedComponent().getName();
	}

	public Graph<String, String> convert(EveComponent base) {
		Graph<String, String> g = new SparseMultigraph<String, String>();
		
		ArrayList<EveAgent> agent_list = new ArrayList<EveAgent>();
		
		traverseAgentTree(base, agent_list);

		for (EveAgent agent : agent_list) {
			if (agent.getName().length() > 0) {
				g.addVertex(agent.getName());
			} else {
				g.addVertex(agent.getUuid().toString());
			}
		}

		for (EveAgent agent : agent_list) {
			for (EveConnection connection : agent.getConnections()) {
				if (connection.isValid()) {
					g.addEdge(getEdgeName(connection), connection.getParent().getName() , connection.getConnectedComponent().getName(), (connection
							.isDirectional() ? EdgeType.DIRECTED : EdgeType.UNDIRECTED));					
				}
			}
		}
		return g;
	}

	// clear all vertices that have no connection
	// ArrayList<Pair<String>> endpoint_list = new
	// ArrayList<Pair<String>>();
	// Collection<String> edges = g.getEdges();
	// Iterator<String> it = edges.iterator();
	// while(it.hasNext()){
	// Pair<String> pair = g.getEndpoints(it.next());
	// endpoint_list.add(pair);
	// }
	// ArrayList<String> vertices = new ArrayList<String>();
	// for(int j = 0; j < endpoint_list.size(); j++){
	// vertices.add(endpoint_list.get(j).getFirst());
	// vertices.add(endpoint_list.get(j).getSecond());
	// }
	//
	// ArrayList<String> vertices_toRemove = new ArrayList<String>();
	// Collection<String> vtices = g.getVertices();
	// System.out.println(vertices.size());
	// System.out.println(vtices.size());
	// Iterator<String> itv = vtices.iterator();
	// while(itv.hasNext()){
	// System.out.println("While started");
	// String vertex = itv.next();
	// if(vertices.contains(vertex)){
	// System.out.println(vertex);
	// }
	// else{
	// System.out.println(vertex);
	// vertices_toRemove.add(vertex);
	// }
	// }
	// for(int i = 0; i < vertices_toRemove.size();i++){
	// g.removeVertex(vertices_toRemove.get(i));
	// }

	private void traverseAgentTree(EveComponent base, ArrayList<EveAgent> agentList) {
		EList<EveComponent> children = base.getChildren();
		Iterator<EveComponent> iter = children.iterator();

		while (iter.hasNext()) {
			EveComponent cmp = iter.next();
			if (cmp instanceof EveAgent) {
				EveAgent agent = (EveAgent) cmp;
				// System.out.println(agent.toString());
				// only agent with connections or services will be added
				agentList.add(agent);

			}
			traverseAgentTree(cmp, agentList);
		}
	}
}
