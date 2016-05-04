

public class Data implements java.io.Serializable
{
    private static final long serialVersionUID = 0;
    private static String jaddy;
    private int amal;

    public static String returnJaddy()
    {
        return jaddy;
    }

    public int returnAmal()
    {
        return amal;
    }

    public void setAmal(int c)
    {
        amal = c;
    }
}
