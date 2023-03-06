public class AdvanceMediaPlayerAdapter implements MediaPlayer{

    private AdvanceMediaPlayer advanceMediaPlayer;

    public AdvanceMediaPlayerAdapter(AdvanceMediaPlayer advanceMediaPlayer) {
        this.advanceMediaPlayer = advanceMediaPlayer;
    }

    @Override
    public void play(String fileName) {
        advanceMediaPlayer.loadFileName(fileName);
        advanceMediaPlayer.listen();
    }
}
