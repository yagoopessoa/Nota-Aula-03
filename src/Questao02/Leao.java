package Questao02;

public class Leao extends Animal{

    private boolean juba;

    public Leao(float tamanho, String cor, boolean juba){
        super(tamanho, cor);
        this.juba = juba;
    }

    public void cacar(){
        System.out.println("O leão caçou sua presa!");
        System.out.println();
    }

    public boolean isJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.print("Juba: " + (juba? "Sim" : "Não"));
        System.out.println();
    }








}
