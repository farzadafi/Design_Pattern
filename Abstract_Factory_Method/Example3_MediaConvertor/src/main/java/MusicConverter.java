public interface MusicConverter {
    void convert();
}

class Mp3ToAAC implements MusicConverter {

    @Override
    public void convert() {
        System.out.println("Mp3 to AAC convert!");
    }
}

class AACToMp3 implements MusicConverter {

    @Override
    public void convert() {
        System.out.println("AAC to Mp3 convert!");
    }
}
