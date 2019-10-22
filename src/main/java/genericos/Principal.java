package genericos;

public class Principal {
    public static void main(String[] args) {
        Caixa<String> c = new Caixa<>();
        Caixa<String> d = new Caixa<>();
        String s = "OLA MUNDO";
        Pessoa p = new Pessoa("Joao");
        c.setDado(s);
        //d.setDado(p);
        //String nova = (String) c.getDado();
        //String outra = (String) d.getDado();        //errooo
    }
}
