package player;

import grammar.MusicPlayerBody;
import grammar.MusicPlayerHeader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import sound.*;


/**
 * Main entry point of the application.
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
     * @throws FileNotFoundException file does not exist at specified location
     * @throws InvalidMidiDataException error with Midi player and/or sequencer
     * @throws MidiUnavailableException error with Midi player and/or sequencer
     */
    public static void play(String file) throws FileNotFoundException, MidiUnavailableException, InvalidMidiDataException {
    	File songFile = new File(file);
    	String content = new Scanner(songFile).useDelimiter("\\Z").next(); //reads file and extract String representation 
    	String[] lines = content.split("\\r?\\n"); //separates content of file by individual lines
    	
    	//initializing header and body line lists
    	ArrayList<String> header = new ArrayList<String>();
    	ArrayList<String> body = new ArrayList<String>();
    	
    	boolean inHead = true; //we always begin in the header   	
    	for(String line : lines){
    		if (inHead){
    			header.add(line); //add header lines to header list
    		}
    		else{
    			body.add(line); //add body lines to body list
    		}
    		//key ("K") is always the last field line in header
    		if (line.charAt(0) == 'K'){
    			inHead = false;
    		}
    	}
    	
    	MusicPlayerHeader headPlayer = new MusicPlayerHeader();
    	Song song = headPlayer.parse(join(header,"\n")); //join header lines using newline token
    	System.out.println(song); //display header fields
    	
    	MusicPlayerBody bodyPlayer = new MusicPlayerBody(song);
    	song = bodyPlayer.parse(join(body, "\n")); //join body lines using newline token

    	List<Measure> measures = song.getMeasures();
    	for (Measure measure : measures){
    		System.out.println(measure.toString());
    	}
    	song.play();

    }

    public static void main(String[] args) throws FileNotFoundException, MidiUnavailableException, InvalidMidiDataException {
    	String file = "sample_abc/afro.abc";
    	play(file);
    }
    
    /**
     * Joins list of Strings into one String, separating each with a specified separator
     * @param strings list of Strings to be joined
     * @param separator String placed in between each string in String list "strings"
     * @return String representing joined list of Strings
     */
    public static String join(ArrayList<String> strings, String separator){
    	StringBuilder newStrings = new StringBuilder();
    	for(String line : strings){
    		newStrings.append(line+separator);
    	}
    	return newStrings.toString();
    }
    
}