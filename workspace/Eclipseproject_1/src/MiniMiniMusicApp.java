import javax.sound.midi.*;

public class MiniMiniMusicApp {

	public static void main(String[] args) {
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();

	}

	public void play() {
		try {
			
			//Get a Sequencer...
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			
			// Create a new Sequence...
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			
			// Create a track in that sequence as sequence contains track...
			Track track = seq.createTrack();
			
			// Set a new message to create an event...
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 24, 100);
			
			// Create a new Midi Event from the message and add it into track, 
			// as track contains the midi events...
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 24, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);
			
			// Set the sequence of the sequencer created earlier...
			// Now sequence of the sequencer is being created from the sequence 'seq'...
			//'seq' is the sequence which contains track...
			// track contains all the midi events to be played...
			player.setSequence(seq);
			
			// play the sequencer...
			player.start();
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
