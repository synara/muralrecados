import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IMuralRecados extends Remote {
	List<Recado> consultarRecados() throws RemoteException;
	int cadastrarRecado(Recado recado) throws RemoteException;
	void removerRecado(int id) throws RemoteException;
	
}
