package OOPS3.MethodOverloadingandoverriding.MediaFilePlayer;
//Media File Player (Assignment)
//Problem Statement
//You are tasked with implementing a media player application that supports playing different types of media files, including audio and video. Each media file type requires specific implementations to play them properly. Your goal is to create a method named playMedia within the MediaFilePlayer class that can accept various types of media files (either audio or video) and play them using runtime polymorphism.
//
//Instructions
//Implement a method named playMedia within the MediaFilePlayer class.
//The playMedia method should accept a parameter representing a media file. The parameter type should be generic to allow for flexibility in accepting different types of media files.
//The playMedia method should print the details of the media file, such as title, artist (for audio), and duration (for video), before playing the media file.
//Ensure the playMedia method demonstrates runtime polymorphism by appropriately calling the play method specific to each type of media file.

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
