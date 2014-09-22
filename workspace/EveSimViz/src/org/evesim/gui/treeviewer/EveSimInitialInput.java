package org.evesim.gui.treeviewer;

import java.net.URI;

import org.evesim.EveAgent;
import org.evesim.EveConnection;
import org.evesim.EvePrototype;
import org.evesim.EveService;
import org.evesim.EveSimulation;
import org.evesim.EvesimFactory;
import org.evesim.gui.properties.EveSimPropertyChangeListener;


public class EveSimInitialInput {
	public EveSimulation getInitialInput(EveSimPropertyChangeListener listen){

		// Retrieve the default factory singleton
		EvesimFactory factory = EvesimFactory.eINSTANCE;


		EveSimulation base = factory.createEveSimulation();
		EveSimulation sim = factory.createEveSimulation();
		sim.setParent(base);
		sim.eAdapters().add(listen);

		sim.setName("EvESimulation");
		sim.setDescription("This is the basis simulation");

		sim.setUri(URI.create("org.evesim"));

		for(int i = 0; i < 3; i++){
			EvePrototype proto = factory.createEvePrototype();
			proto.setParent(sim);
			proto.setName("Proto"+i);
			proto.eAdapters().add(listen);

			for(int j = 0; j < 3; j++){
				EveAgent agent = factory.createEveAgent();
				agent.setParent(proto);
				agent.setName("Agent"+i+j);
				agent.eAdapters().add(listen);
				proto.addChild(agent);

				for(int k = 0; k < 1; k++){
					EveConnection con = factory.createEveConnection();
					con.setParent(agent);
					con.setName("Connection"+i+j+k);
					con.eAdapters().add(listen);
					agent.addChild(con);

					EveService ser = factory.createEveService();
					ser.setParent(agent);
					ser.setName("Service"+i+j+k);
					ser.eAdapters().add(listen);
					agent.addChild(ser);

				}
			}
			sim.addChild(proto);
		}


		base.addChild(sim);

		return base;
	}


}
