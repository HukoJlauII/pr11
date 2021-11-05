package ex3;

public class Multiply extends Binary implements Complete {
    Complete first, second;

    Multiply(Complete first, Complete second){
        this.first = first;
        this.second = second;
    }

    public int evaluate(int number)
    {
        return first.evaluate(number) * second.evaluate(number);
    }
}