public interface IntegerValue {
    int getInteger();
}

class IntegerValueImpel implements IntegerValue {

    @Override
    public int getInteger() {
        return 5;
    }
}
