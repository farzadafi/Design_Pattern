public class EncryptedCloudStream implements Stream {

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String encrypt = encrypt(data);
        stream.write(encrypt);
    }

    private String encrypt(String data) {
        return "^@#%@%#$%";
    }
}
