public class Client {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "farzad.mp3");

        AdvanceMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer advanceMediaPlayerAdaptor1 = new AdvanceMediaPlayerAdapter(mp4Player);
        advanceMediaPlayerAdaptor1.play("mp4", "farzad.mp4");

        AdvanceMediaPlayer vlcPlayer = new VlcPlayer();
        MediaPlayer advanceMediaPlayerAdaptor2 = new AdvanceMediaPlayerAdapter(vlcPlayer);
        advanceMediaPlayerAdaptor2.play("vlc", "farzad.vlc");
    }
}
