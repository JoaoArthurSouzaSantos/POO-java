package heranca;

public class StreamM4u extends Stream {
    public StreamM4u(String dataInput, String dataOutput) {
        super(dataInput, dataOutput);
    }
    
    @Override
    public void encoder() {
        System.out.println("Encoding M4U stream");
    }
    
    @Override
    public void decoder() {
        System.out.println("Decoding M4U stream");
    }
}