
 
package atividade;

public class Elevador {
    public String localizacao;
    public int capacidade;
    public String valor;
    public String tamanho;
    
    public void subir(){
        System.out.println("cabine em movimento ao andar 9");
    }
    public void descer(){
        System.out.println("chegando ao andar 1");
    }
    public void impDados(){
        System.out.println("sua localização é " + this.localizacao);
        System.out.println("sua capacidade é " + this.capacidade);
        System.out.println("seu valor é " +this.valor);
        System.out.println("seu tamanho é " +this.tamanho);
    }
      //Raissa Silva      
    
    
}
