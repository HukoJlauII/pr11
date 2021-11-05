package ex3;

public class Subtract extends Binary implements Complete{
    Complete first, second;

    Subtract(Complete first, Complete second){
        this.first = first;
        this.second = second;
    }

    public int evaluate(int number)
    {
        return first.evaluate(number) - second.evaluate(number);
    }
}
