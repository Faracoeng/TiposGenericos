package poo;

public enum Planeta {
    mercurio(1),
    venus(2),
    terra(3),
    marte(4),
    jupter(5),
    saturno(6),
    urano(7),
    netuno(8);

    public final int posicao;

    Planeta(int pos){
        this.posicao = pos;
    }
    public static Planeta getByCodigo(int c){   //Método para obter o codigo da cor
        for(Planeta e: Planeta.values()){       // Percorre as cores existentes
            if(c == e.posicao){          //se for igual ao codigo passado como parametro
                return e;               //retorna ele
            }
        }
        //return null;
        throw new IllegalArgumentException("CÓDIGO INVÁLIDO");
    }
}
