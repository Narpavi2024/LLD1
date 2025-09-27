package OOPS3.MethodOverloadingandoverriding.MediaFilePlayer;

public class AudioFile extends MediaFile{

   private final String artist;

    public AudioFile(String title,String filename,String artist){
        super(title, filename);
        this.artist = artist;
    }
    @Override
    public void play() {
        System.out.println("Playing Audio File: "+filename);
    }

    @Override
    public String getDetails() {
        return super.getDetails()+",Artist: "+artist;
    }
}
