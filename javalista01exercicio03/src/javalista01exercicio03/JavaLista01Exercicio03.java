package javalista01exercicio03;

import javax.swing.JOptionPane;

public class JavaLista01Exercicio03 {

    public static void main(String[] args) {
        
        Agenda minhaAgenda = new Agenda();
        
        //Imprimir todas as pessoas da agenda
        minhaAgenda.imprimeAgenda();
        
        //Armazenando pessoas na agenda
        minhaAgenda.armazenaPessoa("Joaquim", 20, 1.5);
        minhaAgenda.armazenaPessoa("Ana", 25, 1.6);
        minhaAgenda.armazenaPessoa("Caio", 30, 1.7);
        minhaAgenda.armazenaPessoa("Bia", 35, 1.8);
        
        //Imprimir todas as pessoas da agenda
        minhaAgenda.imprimeAgenda();
        
        //Imprimir o CAIO
        minhaAgenda.imprimePessoa(2);
        
        //Imprime pessoa inexistente
        minhaAgenda.imprimePessoa(7);
        
        //Busca a ANA
        JOptionPane.showMessageDialog(null, 
                minhaAgenda.buscaPessoa("Ana"));
        
        //Busca a JOÃO
        JOptionPane.showMessageDialog(null, 
                minhaAgenda.buscaPessoa("João"));
        
        //Remover o JOAQUIM
        minhaAgenda.removePessoa("Joaquim");
        
        //Imprimir todas as pessoas da agenda
        minhaAgenda.imprimeAgenda();
        
        //Remover o BRUNO
        minhaAgenda.removePessoa("Bruno");
        
    }
    
}
