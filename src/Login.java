import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Login {

    public static String input(String path){

        boolean isAuthenticated = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = sc.nextLine();
        System.out.println("Enter passcode:");
        String pass= sc.nextLine();


        File buyer = new File(path);

        try {
            Scanner inputBuffer = new Scanner(buyer);

            while (inputBuffer.hasNext()){
                String line = inputBuffer.nextLine();
                String[] values = line.split(":");
                if (values[0].equals(username)){
                    if (values[1].equals(pass)){
                        isAuthenticated = true;
                        return username;
                    }
                }
            }

        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        }

        return null;
    }
}