public interface VideoConverter {
    void convert();
}

class Mp4ToWebm implements VideoConverter {

    @Override
    public void convert() {
        System.out.println("Mp4 To webm convert!");
    }
}
