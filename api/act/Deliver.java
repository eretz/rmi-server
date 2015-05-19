package act;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Deliver extends Remote {
	ArrayList<UsagerBean> getUsagers() throws RemoteException;
}
