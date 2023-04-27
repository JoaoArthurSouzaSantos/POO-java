package heranca;

public abstract class Stream {
    protected String dataInput;
    protected String dataOutput;
    
    public Stream(String dataInput, String dataOutput) {
        this.dataInput = dataInput;
        this.dataOutput = dataOutput;
    }
    
    public abstract void encoder();
    
    public abstract void decoder();
}
