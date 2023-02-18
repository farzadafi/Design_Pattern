public interface AbstractFactory<T> {
    T  getFactory(FactoryType factoryType);
}

enum FactoryType {
    MUSIC_CONVERTER,
    VIDEO_CONVERTER
}

