package OOPS3.MethodOverloadingandoverriding.MediaFilePlayer;

public class MediaFilePlayer {

    public static void main(String[] args) {
        MediaFile audiofile = new  AudioFile("Song Title", "audio.mp3","Sonu Nigam");
        MediaFile videofile = new VideoFile("Video Title", "video.mp4","30");
        playMedia(audiofile);
        playMedia(videofile);
    }

    private static void playMedia(MediaFile mediaFile) {
        System.out.println(mediaFile.getDetails());
        mediaFile.play();
    }
}
