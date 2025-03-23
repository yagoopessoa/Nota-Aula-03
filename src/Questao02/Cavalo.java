package Questao02;

public class Cavalo extends Animal {
    private String raca;

    public Cavalo(float tamanho, String cor, String raca){
        super(tamanho, cor);
        this.raca = raca;
    }

    public void fugir(){
        System.out.printf("O cavalo está fugindo!");
        System.out.println();
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.print("Raça: " + raca);
        System.out.println();
    }



































}
