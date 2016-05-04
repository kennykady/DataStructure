import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SaveLoad
{
    public static void save(Serializable data, String fileName)
    {
           try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName))))
           {
               objectOutputStream.writeObject(data);
           } catch (IOException e)
           {
               e.printStackTrace();
           }
    }

    public static Object load(String fileName) throws Exception
    {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get(fileName))))
        {
            return objectInputStream.readObject();
        }
    }
}
