public interface MediaPlayer {
    void play();
}

class AudioPlayer implements MediaPlayer {

    private String fileName;

    @Override
    public void play() {
        System.out.println("AudioPlayer play " + fileName);
    }
}
