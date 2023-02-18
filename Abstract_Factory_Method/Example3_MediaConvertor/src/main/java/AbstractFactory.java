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

class MusicConverterFactory implements AbstractFactory<MusicConverter, MusicFactoryType> {

    @Override
    public MusicConverter getFactory(MusicFactoryType factoryType) {
        MusicConverter musicConverter = null;
        switch (factoryType) {
            case AAC_TO_MP3 -> musicConverter = new AACToMp3();
            case MP3_TO_AAC -> musicConverter = new Mp3ToAAC();
        }
        return musicConverter;
    }
}

class VideoConverterFactory implements AbstractFactory<VideoConverter, VideoFactoryType> {

    @Override
    public VideoConverter getFactory(VideoFactoryType factoryType) {
        return null;
    }
}