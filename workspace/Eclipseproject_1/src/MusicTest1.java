import javax.sound.midi.*;

public class MusicTest1 {
	
	public void play() {
		try{
			Sequencer squencer = MidiSystem.getSequencer();
			System.out.println("We got the seqencer");
		} catch (MidiUnavailableException ex){
			System.out.println("Bummer");
		}
		
	}

	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();

	}

}
