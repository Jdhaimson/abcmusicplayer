package player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     * @throws FileNotFoundException 
     */
    public static void play(String file) throws FileNotFoundException {
    	File song = new File(file);
    	String content = new Scanner(song).useDelimiter("\\Z").next();
    	String[] lines = content.split("\\r?\\n");
    	ArrayList<String> header = new ArrayList<String>();
    	ArrayList<String> body = new ArrayList<String>();
    	boolean inHead = true;    	
    	for(String line : lines){
    		if (inHead){
    			header.add(line);
    		}
    		else{
    			body.add(line);
    		}
    		if (line.charAt(0) == 'K'){
    			inHead = false;
    		}
    	}
    	System.out.println(header.toString());
    	System.out.println(body.toString());
    }

    public static void main(String[] args) throws FileNotFoundException {
        // CALL play() HERE
    	String file = "sample_abc/abc_song.abc";
    	play(file);
    }
    
}