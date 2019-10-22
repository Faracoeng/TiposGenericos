package poo;

public enum Cor {
    //Cada parametro numerico representa uma cor
    Preto(0),
    Vermelho(1),
    Verde(2),
    Amarelo(3),
    Azul(4),
    Roxo(5),
    Ciano(6),
    Branco(7);
    //Construtor instancia a cor no atributo "Codigo"
    public final int codigo;

    Cor(int c){ //parametro "c" é o codigo da cor
        this.codigo = c;
    };

    public static Cor getByCodigo(int c){   //Método para obter o codigo da cor
        for(Cor e: Cor.values()){       // Percorre as cores existentes
            if(c == e.codigo){          //se for igual ao codigo passado como parametro
                return e;               //retorna ele
            }
        }
        //return null;
        throw new IllegalArgumentException("CÓDIGO INVÁLIDO");
    }
}