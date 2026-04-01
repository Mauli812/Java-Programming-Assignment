import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Program_7_client {
    public static void main(String[] args) {

        try {

            Socket socket =
                    new Socket("localhost", 5000);

            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));

            PrintWriter out =
                    new PrintWriter(
                            socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter message: ");

            String message = sc.nextLine();

            out.println(message);

            String response = in.readLine();

            System.out.println(response);

            socket.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}