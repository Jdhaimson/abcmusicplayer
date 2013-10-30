package sound;

/**
 * A LyricListener responds to lyric events.
 */
public class LyricListener {
	
	private int lineCount = 0;
	// Amount of syllables per line
	private int LINETHRESHOLD = 6;
	
    /**
     * This method is called when a lyric event is triggered.
     * @param text The text associated with the lyric event.
     */
    public void processLyricEvent(String text) {
    	if (this.lineCount >= this.LINETHRESHOLD) {
    		System.out.print("\n");
    		this.lineCount = 0;
    	}
    	if (!(text.equals(""))) {
    		System.out.print(text + " ");
    		this.lineCount ++;
    	}
    }
}
