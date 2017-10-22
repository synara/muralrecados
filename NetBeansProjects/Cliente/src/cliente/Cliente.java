/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

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
        // TODO code application logic here
    }

    private static java.util.List<muralrecado.service.Recado> consultar() {
        muralrecado.service.MuralRecado_Service service = new muralrecado.service.MuralRecado_Service();
        muralrecado.service.MuralRecado port = service.getMuralRecadoPort();
        return port.consultar();
    }

    private static Recado consultarPorId(int id) {
        muralrecado.service.MuralRecado_Service service = new muralrecado.service.MuralRecado_Service();
        muralrecado.service.MuralRecado port = service.getMuralRecadoPort();
        return port.consultarPorId(id);
    }

    private static int inserir(java.lang.String recado, java.lang.String apelido) {
        muralrecado.service.MuralRecado_Service service = new muralrecado.service.MuralRecado_Service();
        muralrecado.service.MuralRecado port = service.getMuralRecadoPort();
        return port.inserir(recado, apelido);
    }

    private static void remover(int id) {
        muralrecado.service.MuralRecado_Service service = new muralrecado.service.MuralRecado_Service();
        muralrecado.service.MuralRecado port = service.getMuralRecadoPort();
        port.remover(id);
    }
    
    
    
    

}
