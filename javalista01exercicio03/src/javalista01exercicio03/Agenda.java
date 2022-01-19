package javalista01exercicio03;

import javax.swing.JOptionPane;

public class Agenda {
    //Atributos
    Pessoa [] agenda = new Pessoa[10];
    private int cont=0;
    
    //Método Construtor
    public Agenda() {
    }
    
    //Métodos Gets e Sets
    public int getCont() {
        return cont;
    }
    
    //Métodos Avulsos
    public void armazenaPessoa(String nome, int idade,
            double altura){
        
        //criar uma pessoa
        //Pessoa p = new Pessoa();
        Pessoa p = new Pessoa(nome,idade,altura);
        
        //inserir os dados da pessoa
        //p.setNome(nome);
        //p.setIdade(idade);
        //p.setAltura(altura);
        
        //inserir pessoa no vetor
        if(cont<10){
            agenda[cont] = p;
            cont++;
        } else {
            JOptionPane.showMessageDialog(null,"Agenda lotada");
        }
    }
    
    public int buscaPessoa(String nome){
        //pesquisar a pessoa na agenda
        int i=0;
        
        while(i<cont){        
            if(nome.equals(agenda[i].getNome())){
                return i;
            }
            i++;
        }           
        
        
        return -1;
        
    }
    
    public void removePessoa(String nome){
        //Buscar pessoa (verificar se existe)
        int pos = buscaPessoa(nome);
        
        if(pos != -1){
            //Remove pessoa
            if(cont>1){
                agenda[pos] = agenda[cont-1];
            }
            //Atualiza cont
            cont--;
            
            JOptionPane.showMessageDialog(null, "Pessoa removida");
        } else {
            JOptionPane.showMessageDialog(null, "Pessoa inexistente");
        }
        
    }
    
    public void imprimePessoa(int i){
        if(i<cont){
            JOptionPane.showMessageDialog(null, 
                    "Nome: " + agenda[i].getNome() +
                    "\nIdade: " + agenda[i].getIdade() +
                    "\nAltura: " + agenda[i].getAltura());
        } else {
            JOptionPane.showMessageDialog(null, "Posição vazia");
        }
    }
    
    public void imprimeAgenda(){
        if(cont!=0){
            for(int i=0; i<cont; i++){
                imprimePessoa(i);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Agenda vazia");
        }
    }
}
