/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muralrecado.service;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import muralrecado.model.Recado;

/**
 *
 * @author 1514505
 */
@WebService(serviceName = "MuralRecado")
public class MuralRecado {

    public static List<Recado> recados = new ArrayList<>();

    @WebMethod(operationName = "inserir")
    public int inserir(@WebParam(name="recado") String recado, @WebParam(name="apelido") String apelido){
        Recado r = new Recado();
        r.setApelido(apelido);
        if(recados.size() != 0){
            r.setCodigo((recados.get(recados.size() - 1).getCodigo() + 1));
        } else {
            r.setCodigo(1);
        }
        r.setRecado(recado);
        MuralRecado.recados.add(r); 
        
        return r.getCodigo();
    }
    
    @WebMethod(operationName="consultar")
    public List<Recado> consultarRecados() {
        return MuralRecado.recados;
    }
    
    @WebMethod(operationName="remover")
    public boolean remover(@WebParam(name="id") int id) {
        Recado recado = null;
        boolean encontrou = false;
        for(Recado r: recados){
            if(r.getCodigo() == id){
                recado = r;
                encontrou = true;
            }
        }
        
        if(encontrou)
            recados.remove(recado);
        
        return encontrou;
        
    }  
}
