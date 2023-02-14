public interface MusicPlayer {
    void play();
}

class Mp3Player implements MusicPlayer {

    @Override
    public void play() {
        System.out.println("play mp3 music");
    }
}

class OggPlayer implements MusicPlayer {

    @Override
    public void play() {
        System.out.println("play OGG music");
    }
}
