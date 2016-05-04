import java.util.Scanner;

public class MakeData
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type if you want to save or load.");

       // int a = sc.nextInt();


        String x = sc.nextLine();

        if(x.equals("s"))
        {
            Data saveData = new Data();
            System.out.println("Type in the int you want to save.");
            int a = sc.nextInt();
            saveData.setAmal(a);
            SaveLoad.save(saveData, "file2");
        }
        else if(x.equals("l"))
        {
            try
            {
                Data saveData = (Data)SaveLoad.load("file2");
                System.out.println("Loaded: " + saveData.returnAmal());
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
