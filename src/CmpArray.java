public class CmpArray {

    public static <T> boolean compareArrays(T[] n, T[] m)
    {
        if (m.length == n.length)
        {
            for (int i = 0; i < n.length; i++)
            {
                if (!n[i].getClass().equals(m[i].getClass()) || !n[i].equals(m[i]))
                    return false;
            }
            return true;
        }
        return false;
    }

}
