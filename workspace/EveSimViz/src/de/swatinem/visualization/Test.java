package de.swatinem.visualization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {
		VisualizationFactory f = VisualizationFactory.eINSTANCE;
		Root r = f.createRoot();
		Service.instance.bindRoot(r);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
        in.readLine();

        Node n1 = f.createNode();
        n1.setTitle("Reichenhall");
        n1.setLongitude(12.876944);
        n1.setLatitude(47.724722);
        r.getChildren().add(n1);
        
        Node n2 = f.createNode();
        n2.setTitle("Salzburg");
        n2.setLongitude(13.033333);
        n2.setLatitude(47.8);
        r.getChildren().add(n2);
        
        Connection c = f.createConnection();
        c.setPoint1(n1);
        c.setPoint2(n2);
        r.getChildren().add(c);

        System.out.println("Nodes created");
        in.readLine();
        
        n2.setTitle("Puch bei Hallein");
        n2.setLongitude(13.094444);
        n2.setLatitude(47.716667);

        System.out.println("Node updated");
        in.readLine();

        Node n3 = f.createNode();
        n3.setTitle("Salzburg");
        n3.setLongitude(13.033333);
        n3.setLatitude(47.8);
        r.getChildren().add(n3);
        
        Connection c2 = f.createConnection();
        c2.setPoint1(n2);
        c2.setPoint2(n3);
        r.getChildren().add(c2);

        System.out.println("Node2 created");
        in.readLine();

        r.getChildren().remove(n1);

        System.out.println("Node removed");
        in.readLine();
        
        r.getChildren().clear();

        System.out.println("Nodes removed");
        in.readLine();

        Service.instance.shutdown();
	}

}
