package heranca;

public class main {

	public static void main(String[] args) {
	    StreamMp3 mp3Stream = new StreamMp3("input.mp3", "output.mp3");
	    mp3Stream.encoder();
	    mp3Stream.decoder();
	    
	    StreamOgg oggStream = new StreamOgg("input.ogg", "output.ogg");
	    oggStream.encoder();
	    oggStream.decoder();
	    
	    StreamM4u m4uStream = new StreamM4u("input.m4u", "output.m4u");
	    m4uStream.encoder();
	    m4uStream.decoder();
	}


}
