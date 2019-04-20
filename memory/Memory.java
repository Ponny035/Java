public class Memory {

  private int frameSize;
  private int frameID;
  //private FIFO ;

  public Memory (int frameSize) {
    this.frameSize = frameSize;
  }

  // public Memory (int frameID, int frameSize) {
  //   this.frameID = frameID;
  //   this.frameSize = frameSize ;
  // }

  public int getFrameID () {
    return frameID;
  }

  public void setFrameSize (int frameSize) {
    this.frameSize = frameSize ;
  }

  public  int getFrameSize () {
    return frameSize;
  }
}
