public class Main {
    public static void main(String[] args) {

        Cavalo c = new Cavalo(3.1f,"Preto","Árabe");
        System.out.println("——————Informações do Cavalo——————");
        c.exibirInfo();
        c.comer(); // metodo da superclasse: Animal;
        c.fugir(); // metodo da classe: Cavalo;



        Leao l = new Leao(2.2f, "Caramelo", true);
        System.out.println();
        System.out.println("——————Informações do Leão——————");
        l.exibirInfo();
        l.comer(); // metodo da superclasse: Animal;
        l.cacar(); //metodo da classe: Leão;












































    }
}