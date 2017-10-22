import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.time.LocalDate;

public class ServidorRMI {
	public static void main(String[] args) {
		
		try {
			MuralRecadosImpl muralRecados = new MuralRecadosImpl();
			LocateRegistry.createRegistry(2020);
			Naming.rebind("//localhost:2020/MuralRecadosServer", muralRecados);
			
			System.out.println("Servidor ativo.");
		} catch(Exception e) {
			System.out.println("Servidor erro: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
