package sound;

/**
 * Lyric is an immutable object representing a specific syllable of a song and its duration
 * @author Josh
 *
 */
public class Lyric {
        private String syllable;
        private int duration;     
        
        /**
         * Object representing lyrics of piece
         * @param syllable Syllable to be displayed with each note
         * @param duration Number of ticks to display syllable for 
         */
        public Lyric(String syllable, int duration) {
                this.syllable = syllable;
                this.duration = duration;
        }
        
        /**
         * Returns duration of lyric
         * @return duration of lyric
         */
        public int getDuration() {
                return this.duration;
        }
        
        /*
         * (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString() {
                return this.syllable;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + duration;
                result = prime * result
                                + ((syllable == null) ? 0 : syllable.hashCode());
                return result;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object obj) {
                if (this == obj) {
                        return true;
                }
                if (obj == null) {
                        return false;
                }
                if (!(obj instanceof Lyric)) {
                        return false;
                }
                Lyric other = (Lyric) obj;
                if (duration != other.duration) {
                        return false;
                }
                if (syllable == null) {
                        if (other.syllable != null) {
                                return false;
                        }
                } else if (!syllable.equals(other.syllable)) {
                        return false;
                }
                return true;
        }

        
        
}