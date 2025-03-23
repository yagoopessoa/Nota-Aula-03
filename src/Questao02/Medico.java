package Questao02;

public class Medico {
    private boolean trabalhaHospital;

    public Medico (boolean trabalhaHospita){
        this.trabalhaHospital = trabalhaHospital;
    }
    public void tratarPaciente(){
        System.out.println("O médico está tratando um paciente agora.");

    }
    public boolean isTrabalhaHospital(){
        return trabalhaHospital;
    }
    public void setTrabalhaHospital(boolean trabalhaHospital){
        this.trabalhaHospital = trabalhaHospital;
    }

































}
