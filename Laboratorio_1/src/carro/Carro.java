package carro;

public abstract class Carro {
    //se debe sobreescribir
    public abstract String tipo();
    //inmutable nadie puede sobreescribirlo --final
    public final void imprimir(){
        System.out.println("yo soy un tipo de carro="+tipo());
    }

}
