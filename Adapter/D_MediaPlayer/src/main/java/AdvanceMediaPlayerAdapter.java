public class AdvanceMediaPlayerAdapter implements MediaPlayer{

    private final AdvanceMediaPlayer advanceMediaPlayer;

    public AdvanceMediaPlayerAdapter(AdvanceMediaPlayer advanceMediaPlayer) {
        this.advanceMediaPlayer = advanceMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        advanceMediaPlayer.loadFileName(fileName);
        advanceMediaPlayer.listen();
    }
}
