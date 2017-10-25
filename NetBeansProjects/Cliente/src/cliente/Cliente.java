/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.util.ArrayList;
import java.util.List;
import muralrecado.service.Recado;


/**
 *
 * @author 1514505
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inserir("Teste", "Synara");
        inserir("Teste 2", "Juliana");
        System.out.print(recadosOrganizados(consultar()));
        remover(2);
        
        System.out.print("\n\nDepois de excluir recado de código 2\n");
        System.out.print(recadosOrganizados(consultar()));

    }
    
    private static List<String> recadosOrganizados(List<Recado> recados) {
        List<String> recadosOrganizados = new ArrayList<>();
        
        for(Recado r: recados){
            recadosOrganizados.add("[Apelido: " + r.getApelido() + ", Recado: " + r.getRecado() + "]");
        }
        
        return recadosOrganizados;
    }

    private static int inserir(java.lang.String recado, java.lang.String apelido) {
        muralrecado.service.MuralRecado_Service service = new muralrecado.service.MuralRecado_Service();
        muralrecado.service.MuralRecado port = service.getMuralRecadoPort();
        return port.inserir(recado, apelido);
    }

    private static java.util.List<muralrecado.service.Recado> consultar() {
        muralrecado.service.MuralRecado_Service service = new muralrecado.service.MuralRecado_Service();
        muralrecado.service.MuralRecado port = service.getMuralRecadoPort();
        return port.consultar();
    }

    private static boolean remover(int id) {
        muralrecado.service.MuralRecado_Service service = new muralrecado.service.MuralRecado_Service();
        muralrecado.service.MuralRecado port = service.getMuralRecadoPort();
        return port.remover(id);
    }
    
    
    
    
    
}
