public interface AbstractFactory<T, K> {
    T  getFactory(K factoryType);
}

enum FactoryType {
    MUSIC_CONVERTER,
    VIDEO_CONVERTER
}

enum MusicFactoryType {
    MP3_TO_AAC,
    AAC_TO_MP3
}

enum VideoFactoryType {
    MP4_TO_WEBM,
    WEBM_TO_MP4
}

class MusicConverterFactory implements AbstractFactory<MusicConverter> {

    @Override
    public MusicConverter getFactory(FactoryType factoryType) {
        return null;
    }
}