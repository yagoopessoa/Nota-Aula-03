package Questao01;

public class Animal {

    private float tamanho;
    private String cor;



    public Animal(float tamanho, String cor){
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void comer(){
        System.out.println("O animal comeu hoje cedo!");
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public float getTamanho(){
        return tamanho;
    }
    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }

    public void exibirInfo(){
        System.out.print("O tamanho: " + tamanho + " metros.");
        System.out.println("\nCor: " + cor);
    }

}
