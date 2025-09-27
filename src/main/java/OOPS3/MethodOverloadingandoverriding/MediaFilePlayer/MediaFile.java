package OOPS3.MethodOverloadingandoverriding.MediaFilePlayer;

public abstract class MediaFile {
    protected String title;
    protected String filename;

    public MediaFile(String title,String filename){
        this.title = title;
        this.filename = filename;
    }

    public abstract void play();

    public String getDetails(){
        return "Title: "+title+ "Filename: "+filename;
    }

}
