package OOPS3.MethodOverloadingandoverriding.MediaFilePlayer;

public class VideoFile extends MediaFile{
   private final String duration;

   public VideoFile(String title,String filename,String duration){
       super(title, filename);
       this.duration = duration;
   }

    @Override
    public void play() {
        System.out.println("Playing Video File: "+filename);
    }

    @Override
    public String getDetails() {
        return super.getDetails()+", Duration: "+duration;
    }
}
