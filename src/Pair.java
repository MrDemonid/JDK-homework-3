public class Pair<T, U> {

    private T first;
    private U second;

    public Pair(T first, U last)
    {
        this.first = first;
        this.second = last;
    }

    public T getFirst()
    {
        return first;
    }

    public U getSecond()
    {
        return second;
    }

    @Override
    public String toString() {
        return String.format("Pair {%s, %s};", first, second);
    }
}
