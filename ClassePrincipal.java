//Raissa Silva
package atividade;

public class ClassePrincipal {
    public static void main(String[] args) {
        Lampada L1 = new Lampada ();
        L1.Tamanho = "pequena";
        L1.marca = "panasonic";
        L1.tipo = "led";
        L1.valor = 30;
        L1.ligar();
        L1.desligar();
        L1.paroudefuncionar();
        L1.impDados();
        
        System.out.println("----------------------");
        
        Televisao T1 = new Televisao();
        T1.marca = "samsung";
        T1.valor = 5000;
        T1.cor = "preto";
        T1.polegadas = 70;
        T1.impDados();
        
        System.out.println("--------------------");
        
        Elevador E1 = new Elevador();
        E1.localizacao = "3º andar";
        E1.capacidade = 6;
        E1.valor = "11.434,95";
        E1.tamanho = "grande";
        E1.impDados();
        
        System.out.println("--------------------");
        
        Cadeira C1 = new Cadeira();
        C1.tamanho = "media";
        C1.cor = "preta";
        C1.modelo = "giratoria";
        C1.marca = "eiffel";
        C1.imDados();
        C1.girar();
        
        System.out.println("--------------------");
        
        datashow d1 = new datashow();
        d1.resolucao = "4K";
        d1.cor = "branco";
        d1.valor = 5000;
        d1.marca = "nec";
        d1.impDados();
        
         System.out.println("--------------------");
        
        microondas m1 = new  microondas ();
        m1.marca = "consul";
        m1.valor = "249,90";
        m1.cor = "vermelho";
        m1.calor = 60;
        m1.impDados();
        
       System.out.println("--------------------");
        
        Aluno A1 = new  Aluno ();
        A1.nome = "Raissa silva";
        A1.serie = 2;
        A1.curso = "informatica";
        A1.idade = 16;
        A1.impDados();
        
    }
}
