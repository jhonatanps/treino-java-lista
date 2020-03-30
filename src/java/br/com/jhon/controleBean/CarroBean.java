
package br.com.jhon.controleBean;

import br.com.objetos.entidade.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CarroBean {
    
   private Carro carro;
   
   private List<Carro> carros = new ArrayList<>();
    
   public void adicionar(){
       carros.add(carro);
       carro = new Carro();
   }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
   
}
