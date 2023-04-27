package heranca;

public class StreamOgg extends Stream {
    public StreamOgg(String dataInput, String dataOutput) {
        super(dataInput, dataOutput);
    }
    
    @Override
    public void encoder() {
        System.out.println("Encoding Ogg stream");
    }
    
    @Override
    public void decoder() {
        System.out.println("Decoding Ogg stream");
    }
}