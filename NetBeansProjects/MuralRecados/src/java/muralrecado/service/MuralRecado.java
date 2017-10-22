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
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
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
    
    @WebMethod(operationName="consultarPorId")
    public Recado consultarPorId(@WebParam(name="id") int id){
        return MuralRecado.recados.get(id);
    }
    
    @WebMethod(operationName="remover")
    public void remover(@WebParam(name="id") int id) {
        MuralRecado.recados.remove(id);
    }  
}
