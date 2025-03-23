package Questao01;

public class Main {
    public static void main(String[] args) {

    ClinicoGeral cg = new ClinicoGeral(true, true);
        System.out.println("——————Informações do CLÍNICO GERAL——————");
        cg.tratarPaciente();
        cg.receitar();


    Cirurgiao cr = new Cirurgiao(true);
        System.out.println("——————Informações do CIRURGIÃO——————");
        cr.tratarPaciente();
        cr.fazerCirurgia();














































    }





}
