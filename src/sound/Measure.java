package sound;

import java.util.LinkedList;
import java.util.List;

public class Measure {
	private List<Voice> voices = new LinkedList<Voice>();
	private List<Lyric> lyrics = new LinkedList<Lyric>();
	private Key key;
	private int ticksPerMeasure;
	private Measure startRepeat;
	private boolean repeated = false;
	
	/**
	 * Object representing a measure of a piece.  Contains Voices (which contain notes)
	 * and Lyrics.  Also contains a key and stores the amount of ticksPerMeasure.
	 * The sum of all of the ticks in every voice and in all lyrics should be <= ticksPerMeasure
	 * @param key: key of measure, used to keep track of accidentals
	 * @param ticksPerMeasure: amount of ticks in each measure
	 */
	public Measure(Key key, int ticksPerMeasure) {
		this.key = key;
		this.ticksPerMeasure = ticksPerMeasure;
		this.startRepeat = null;
	}

	/**
	 * Object representing a measure of a piece.  Contains Voices (which contain notes)
	 * and Lyrics.  Also contains a key and stores the amount of ticksPerMeasure.
	 * The sum of all of the ticks in every voice and in all lyrics should be <= ticksPerMeasure
	 * @param key: key of measure, used to keep track of accidentals
	 * @param ticksPerMeasure: amount of ticks in each measure
	 * @param startRepeat: measure to repeat at
	 */
	public Measure(Key key, int ticksPerMeasure, Measure startRepeat) {
		this.key = key;
		this.ticksPerMeasure = ticksPerMeasure;
		this.startRepeat = startRepeat;
	}
	
	/**
	 * Add a voice to this measure
	 * @param voice: Voice to add to measure - sum of durations of notes in voice should
	 * be <= ticksPerMeasure
	 */
	public void addVoice(Voice voice) {
		
	}
	
	/**
	 * Add a lyric to this measure
	 * @param lyric: lyric to add to measure - sum of durations of lyrics should
	 * be <= ticksPerMeasure
	 */
	public void addLyric(Lyric lyric) {
		
	}
	
	/**
	 * Get repeat start measure and set repeated flag to true
	 * @return Starting measure of repeat
	 */
	public Measure doRepeat() {
		this.repeated = true;
		return this.startRepeat;
	}
	
}
