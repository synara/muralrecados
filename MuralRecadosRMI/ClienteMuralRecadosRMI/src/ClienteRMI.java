import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class ClienteRMI {


	public static void main(String[] args) {

		try {
			
			IMuralRecados mural = (IMuralRecados) Naming.lookup("//localhost:2020/MuralRecadosServer");

			Recado r1 = new Recado();
			r1.setApelido("Synara");
			r1.setTexto("Testando");

			mural.cadastrarRecado(r1);

			Recado r2 = new Recado();
			r2.setApelido("Juliana");
			r2.setTexto("Hello it's me");

			mural.cadastrarRecado(r2);

			System.out.print(listarRecados(mural.consultarRecados()));
		
			mural.removerRecado(2);
			System.out.println("\n\n\nDepois de remover recado de c�digo 2");
			System.out.println(listarRecados(mural.consultarRecados()));
			
		} catch (Exception e) {
			System.out.println("HelloClient exception: " + e.getMessage());
			e.printStackTrace();
		}

	}
	
	public static List<String> listarRecados(List<Recado> recados){
		List<String> recadosOrganizados = new ArrayList<>();
		
		for (Recado r : recados) {
			recadosOrganizados.add("[C�digo: " + r.getCodigo() +", " + "Apelido: " + r.getApelido() + ", " + "Texto: " + r.getTexto() + "]");
		}
		
		return recadosOrganizados;	
	}
}
