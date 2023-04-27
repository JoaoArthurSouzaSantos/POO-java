package heranca;

public class StreamMp3 extends Stream {
    public StreamMp3(String dataInput, String dataOutput) {
        super(dataInput, dataOutput);
    }
    
    @Override
    public void encoder() {
        System.out.println("Encoding MP3 stream");
    }
    
    @Override
    public void decoder() {
        System.out.println("Decoding MP3 stream");
    }
}
