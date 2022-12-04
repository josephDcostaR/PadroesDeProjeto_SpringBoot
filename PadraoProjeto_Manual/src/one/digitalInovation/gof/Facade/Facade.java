package one.digitalInovation.gof.Facade;

import one.digitalInovation.gof.subSistema1crm.CrmService;
import one.digitalInovation.gof.subSistema2cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){

       String cidade = CepApi.getInstancia().recuperarCidade(cep);
       String estado = CepApi.getInstancia().recuperarEstado(cep);

       CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
