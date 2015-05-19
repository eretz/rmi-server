package engine;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import act.Deliver;
import act.UsagerBean;
import java.util.ArrayList;

public class DeliverEngine implements Deliver {

	public DeliverEngine() {
		super();
	}

	public ArrayList<UsagerBean> getUsagers() {
		ArrayList<UsagerBean> alUsagers = new ArrayList<UsagerBean>();
		alUsagers.add(new UsagerBean(1, "Joe", "PARKER", true, new int[] {2010, 12, 3}, new int[] {2010, 12, 3}, null));
		alUsagers.add(new UsagerBean(2, "Andrew", "JACKSON", true, new int[] {2012, 4, 11}, new int[] {2012, 4, 11}, null));
		alUsagers.add(new UsagerBean(3, "Kim", "RANDALL", true, new int[] {2013, 7, 22}, new int[] {2013, 7, 22}, null));
		alUsagers.add(new UsagerBean(4, "Jonathan", "MASON", true, new int[] {2011, 7, 1}, new int[] {2011, 8, 13}, null));
		return alUsagers;
	}

	public static void main(String[] args) {
        	if (System.getSecurityManager() == null) {
	            System.setSecurityManager(new SecurityManager());
        	}
	        try {
			String name = "Deliver";
			Deliver engine = new DeliverEngine();
			Deliver stub = (Deliver) UnicastRemoteObject.exportObject(engine, 1100);
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind(name, stub);
			System.out.println("DeliverEngine bound");
		} catch (Exception e) {
			System.err.println("DeliverEngine exception:");
			e.printStackTrace();
		}
	}
}
