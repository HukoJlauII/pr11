package ex3;

public class Add {
    Complete first, second;

    Add(Complete first, Complete second){
        this.first = first;
        this.second = second;
    }

    public int evaluate(int number)
    {
        return first.evaluate(number) + second.evaluate(number);
    }
}

