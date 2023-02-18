public interface AbstractFactory<T> {
    T  getFactory(FactoryType factoryType);
}

enum FactoryType {
    MUSIC_CONVERTER,
    VIDEO_CONVERTER
}

class MusicConverterFactory implements AbstractFactory<MusicConverter> {

    @Override
    public MusicConverter getFactory(FactoryType factoryType) {
        return null;
    }
}