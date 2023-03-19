package Lab_I;

import jm.JMC;
import jm.music.data.*;
import jm.util.Play;

public class Main implements JMC{
    static final int[] song = {BF4, C5, DF5, BF4, F5, F5, EF5, BF4, C5, DF4, C5, EF5, EF5, DF5, C5, BF4, BF4, C5, DF5, BF4, DF5, DF5, EF5, C5, BF4, AF4, F4, EF5, DF5};
    public static void main(String[] args) {

        for(int i=0; i<song.length; i++) {
            int note = song[i];
            Play.midi(new Note(note, 0.001));
        }
    }
}
