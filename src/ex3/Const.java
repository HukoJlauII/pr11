package ex3;

public class Const implements Complete{
    int number;
    Const(int number){
        this.number = number;
    }

    public int evaluate(int number)
    {
        return this.number;
    }
}
