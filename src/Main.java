import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        while (true){
            System.out.println("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExist = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExist || isDirectory){
                System.out.println("Был указан неверный путь к файлу или путь к папке");
                continue;
            }
            else{
                System.out.println("Путь указан верно");
                count+=1;
                System.out.println("Это файл номер "+count);
                }
             }
    }
}
