import javax.sound.sampled.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Users/miamao/Desktop/The Dance Before - Nathan Moore.wav";
        File file = new File(filePath);


        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            System.out.println("No problem detected");
            clip.start();
            String response = "";
            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Restart");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();
                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.loop(Clip.LOOP_CONTINUOUSLY);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }

        catch(FileNotFoundException e){
                System.out.println("File not found");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Unsupported audio file");
        }
        catch(LineUnavailableException e){
            System.out.println("unable to access the audio file");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Done");

        }

      }}














