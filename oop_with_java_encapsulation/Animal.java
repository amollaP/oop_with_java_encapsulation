package oop_with_java_encapsulation;

//Encapsulamento - 2º Pilar da Programação Orientada a Objetos

/*PUBLIC - O modificador public indica que o elemento ao qual 
está associado é acessível a partir de qualquer lugar, ou seja, não há restrições de acesso.
Quando você usa public, está indicando que o elemento pode ser acessado por qualquer classe,
independentemente de onde ela esteja localizada no código-fonte. 

PROTECTED - A palavra reservada protected é outro modificador de acesso em Java,
usado para especificar que um elemento (como uma classe, método ou variável) 
é acessível apenas dentro da mesma classe,em classes derivadas (subclasses) 
e em outras classes pertencentes ao mesmo pacote.

PRIVATE - A palavra reservada protected é outro modificador de acesso em Java, usado para 
especificar que um elemento (como uma classe, método ou variável) é acessível apenas 
dentro da propria classe, em classes derivadas (subclasses) 
e em outras classes pertencentes ao mesmo pacote.
O uso do private ajuda a encapsular o funcionamento interno de uma classe,
limitando o acesso direto aos seus membros. Isso é uma prática fundamental em 
programação orientada a objetos para promover a segurança e a manutenibilidade do código.**/

public class Animal {
    //Atributos da Classe
    
    
    private String  nome;
    private double  tamanhoMedio;
    private int     numeroAsas;
    
    
    //Getters and Setters
    //Retorna os valores
    String getNome(){ 
    	return nome;
    }
    double getTamanhoMedio(){
    	return tamanhoMedio; 
    }
    int getNumeroAsas(){ 
    	return numeroAsas;
    }
    
    //Setter methods
    //metodo Setter define e altera
    
    //default: É EQUIVALENTE Á "PROTECTED"
    
    void setNome(String nome){ 
    	this.nome = nome; 
    }
    void setTamanhoMedio(double tamanhoMedio){ 
    	this.tamanhoMedio = tamanhoMedio; 
    }
    void setNumeroAsas(int numeroAsas) { 
    	this.numeroAsas = numeroAsas; 
    }
    
    //Porque, metodos declarados como private, só podem ser acessados dentro da própria 
    private void testar()
    {
        //Dentro da classe, não é necessário instanciar a classe, para usar seus respectivos "Metodos e Funcões" "Procedures and Functions"
        System.out.println("Nome: " + getNome());
        
    }
    // Os métodos de acesso, comumente conhecidos como métodos "getters" e "setters", 
    /*Getter: Permite que outras classes obtenham o valor de uma variável privada 
     de forma controlada, sem acesso direto à variável.
     Setter: Permite modificar o valor de uma variável privada de forma controlada, 
     aplicando validações ou lógica específica antes de alterar o estado da classe.
     
     Controle de Acesso:

     Getter: Pode ser usado para fornecer acesso somente leitura a uma variável, 
     se o setter não estiver presente.
     Setter: Pode ser usado para fornecer acesso somente gravação a uma variável,
      se o getter não estiver presente.
     
     
          */
}
