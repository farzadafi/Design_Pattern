public interface AbstractFactory<T> {
    T  getFactory(FactoryType factoryType);
}

enum FactoryType {
    MUSIC_CONVERTER,
    VIDEO_CONVERTER
}

enum MusicFactoryType {
    MP3_TO_AAC,
    AAC_TO_MP3
}

class MusicConverterFactory implements AbstractFactory<MusicConverter> {

    @Override
    public MusicConverter getFactory(FactoryType factoryType) {
        return null;
    }
}