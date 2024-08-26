/**
 * Калькулятор с обобщенными методами.
 *
 * Поскольку обертки над примитивными числовыми типами имеют предка Number,
 * то используем ограничение параметра типа сверху для класса Number.
 * Но, у Number нет метода получения хранимых в нем данных в raw-виде,
 * поэтому пришлось переводить вычисления в Double, как
 * самый "вместительный" формат, к которому легко приводятся
 * все остальные числовые типы.
 */

public class Calculator {

    public static <T extends Number> Double sum(T n, T m)
    {
        return check(n.doubleValue() + m.doubleValue());
    }

    public static <T extends Number> Double multiply(T n, T m)
    {
        return check(n.doubleValue() * m.doubleValue());
    }

    public static <T extends Number> Double divide(T n, T m)
    {
        return check(n.doubleValue() / m.doubleValue());
    }

    public static <T extends Number> Double subtract(T n, T m)
    {
        return check(n.doubleValue() - m.doubleValue());
    }

    /**
     * Функция проверки результата операции вещественных чисел
     * Сделана из-за того, что операции могут вернуть аж два значения:
     * 1) не число (NaN), например при недостаточной точности представления чисел
     * 2) бесконечность, например при делении на ноль
     */
    private static double check(Double n)
    {
        if (n.isInfinite() || n.isNaN())
        {
            // тут по хорошему нужно пробросить исключение, но тема не про это
            // и просто проигнорируем, вернув бесконечность или не число
            System.out.println("Error float point operation!");
        }
        return n;
    }

}
