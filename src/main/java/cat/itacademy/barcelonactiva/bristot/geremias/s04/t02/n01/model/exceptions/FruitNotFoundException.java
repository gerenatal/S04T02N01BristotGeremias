package cat.itacademy.barcelonactiva.bristot.geremias.s04.t02.n01.model.exceptions;

public class FruitNotFoundException extends RuntimeException{
    public FruitNotFoundException(String message){
        super(message);
    }
}
