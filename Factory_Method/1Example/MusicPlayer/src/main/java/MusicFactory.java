public class MusicFactory {

    public MusicPlayer getMusicPlayer(MusicType musicType) {
        MusicPlayer musicPlayer;
        switch (musicType) {
            case MP3 -> musicPlayer = new Mp3Player();
            case OGG -> musicPlayer = new OggPlayer();
            default -> throw new IllegalArgumentException("this type is not implemented");
        }
        return musicPlayer;
    }
}
