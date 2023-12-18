package oop_with_java_encapsulation;

public class Principal {
    
    public static void main(String[] args) {
    	
        //Instancio a classe Animal diretamente
        Animal myAnimal = new Animal();
        
        //definir valores
        myAnimal.setNome("Aguia");
        myAnimal.setTamanhoMedio(1.20);
        myAnimal.setNumeroAsas(2);
        
        System.out.println("Nome: " + myAnimal.getNome());
        System.out.println("Tam. Médio: " + myAnimal.getTamanhoMedio());
        System.out.println("N° Asas: " + myAnimal.getNumeroAsas());
        
    }
}
