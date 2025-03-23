package Questao02;

public class ClinicoGeral extends Medico{
    private boolean atendeEmCasa;

    public ClinicoGeral(boolean trabalhaNoHospital, boolean atendeEmCasa){
        super(trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar(){
        System.out.println("O Clínico Geral está receitando um medicamento.");
        System.out.println();

    }
    public boolean isAtendeEmCasa(){
        return atendeEmCasa;
    }
    public void setAtendeEmCasa(boolean atendeEmCasa){
        this.atendeEmCasa = atendeEmCasa;
    }







}
