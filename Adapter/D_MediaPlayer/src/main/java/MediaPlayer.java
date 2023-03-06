public interface MediaPlayer {
    void play(String fileName);
}

class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("AudioPlayer play " + fileName);
    }
}
