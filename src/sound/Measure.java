package sound;

import java.util.LinkedList;
import java.util.List;

public class Measure {
	private List<Voice> voices = new LinkedList<Voice>();
	private List<Lyric> lyrics = new LinkedList<Lyric>();
	private int measureNumber;
	private Key key;
	private int ticksPerMeasure;
	
	// Keep track of repeats and alternate endings
	private int repeatStartMeasure;
	private boolean repeated = false;
	private boolean hasAlternateEnding = false;
	private int alternateEnding;
	
	
	/**
	 * Object representing a measure of a piece.  Contains Voices (which contain notes)
	 * and Lyrics.  Also contains a key and stores the amount of ticksPerMeasure.
	 * The sum of all of the ticks in every voice and in all lyrics should be <= ticksPerMeasure
	 * @param key: key of measure, used to keep track of accidentals
	 * @param ticksPerMeasure: amount of ticks in each measure
	 */
	public Measure(Key key, int ticksPerMeasure, int measureNumber) {
		this.key = key;
		this.ticksPerMeasure = ticksPerMeasure;
		this.measureNumber = measureNumber;
	}

	/**
	 * Object representing a measure of a piece.  Contains Voices (which contain notes)
	 * and Lyrics.  Also contains a key and stores the amount of ticksPerMeasure.
	 * The sum of all of the ticks in every voice and in all lyrics should be <= ticksPerMeasure
	 * @param key: key of measure, used to keep track of accidentals
	 * @param ticksPerMeasure: amount of ticks in each measure
	 * @param startRepeat: measure to repeat from
	 */
	public Measure(Key key, int ticksPerMeasure, int measureNumber, int repeatStartMeasure) {
		this.key = key;
		this.ticksPerMeasure = ticksPerMeasure;
		this.measureNumber = measureNumber;
		this.repeatStartMeasure = repeatStartMeasure;
	}
	
	/**
	 * Object representing a measure of a piece.  Contains Voices (which contain notes)
	 * and Lyrics.  Also contains a key and stores the amount of ticksPerMeasure.
	 * The sum of all of the ticks in every voice and in all lyrics should be <= ticksPerMeasure
	 * @param key: key of measure, used to keep track of accidentals
	 * @param ticksPerMeasure: amount of ticks in each measure
	 * @param startRepeat: measure to repeat from
	 * @param alternateEnding: measure to go to on alternate ending
	 */
	public Measure(Key key, int ticksPerMeasure, int measureNumber, int repeatStartMeasure, int alternateEnding) {
		this.key = key;
		this.ticksPerMeasure = ticksPerMeasure;
		this.measureNumber = measureNumber;
		this.repeatStartMeasure = repeatStartMeasure;
		this.alternateEnding = alternateEnding;
		this.hasAlternateEnding = true;
	}
	
	/**
	 * Add a voice to this measure
	 * @param voice: Voice to add to measure - sum of durations of notes in voice should
	 * be <= ticksPerMeasure
	 */
	public void addVoice(Voice voice) {
		try {
			if (voice.getTicksPerVoice() == this.ticksPerMeasure) {
				this.voices.add(voice.clone());
			} else {
				throw new Exception("Voices must have same duration as measures");
			}
		} catch (Exception e) {}
	}
	
	/**
	 * Add a lyric to this measure
	 * @param lyric: lyric to add to measure - sum of durations of lyrics should
	 * be <= ticksPerMeasure
	 */
	public void addLyric(Lyric lyric) {
		this.lyrics.add(lyric);
	}
	
	/**
	 * Get repeat start measure and set repeated flag to true
	 * @return Starting measure of repeat
	 */
	public int doRepeat() {
		this.repeated = true;
		return this.repeatStartMeasure;
	}
	
	/**
	 * Used to determine if measure has alternate ending
	 * @return
	 */
	public boolean hasAlternateEnding() {
		return this.hasAlternateEnding;
	}
	
	/**
	 * Returns alternate ending
	 * @return
	 */
	public int getAlternateEnding() {
		return this.alternateEnding;
	}
	
	/**
	 * Modify key as we go along in case we hit an accidental
	 * @param note
	 * @param accidental
	 */
	public void modifyKey(String note, String accidental) {
		this.key.alterKey(note, accidental);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Integer.toString(this.measureNumber);
	}
	
	
}
