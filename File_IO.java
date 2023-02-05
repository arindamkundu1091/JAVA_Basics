import java.util.Scanner;
import java.io.*;

class Database
{
    static String fileName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String fileName = "F:\\java\\" + scan.nextLine() + ".txt";
        return fileName;
    }

    static void fileCreater()
    {
        File file = new File(fileName());
        boolean result;

        try
        {
            result = file.createNewFile();
            
            if(result)
            {
                System.out.println("File created: "+file.getCanonicalPath());
            }
            else
            {
                System.out.println("File already exists: "+file.getCanonicalPath());
            }
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }

    static void scannerFileReader()
    {
        File file = new File(fileName());

        try (Scanner scan = new Scanner(file)) 
        {
            while(scan.hasNextLine())
            {
                System.out.println(scan.nextLine());
            }
        } 
        catch (IOException exception) 
        {
            exception.printStackTrace();
        }
    }

    static void fileReader()
    {
        try(FileReader reader = new FileReader(fileName()))
        {
            int i;
            while((i =reader.read()) != -1)
            System.out.print((char)i);
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }

    static void fileWriter()
    {
        try(FileWriter writer = new FileWriter(fileName()))
        {
            writer.write("Thank you for welcoming me.");
            writer.close();
            System.out.println("Successfulle wrote to the file");
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }

    static void fileWriterWithoutOverwritting()
    {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your comment: ");
            String content  = "\n"+sc.nextLine();

            File file = new File(fileName());
            FileWriter fwriter = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bwriter = new BufferedWriter(fwriter);

            bwriter.write(content);
            bwriter.close();
            System.out.println("successfully wrote in the file.");
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }

    static void fileDeleter()
    {
        try
        {
            File file = new File(fileName());
            if(file.delete())
            {
                System.out.println(file.getName()+" deleted");
            }
            else
            {
                System.out.println("Failed to delete");
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) 
    {
        // fileCreater();
        // scannerFileReader();
        // fileWriter();
        // fileWriterWithoutOverwritting();
        // fileReader();
        // fileDeleter();
    }
}
