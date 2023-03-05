public interface IntegerValue {
    int getInteger();
}

class IntegerValueImpel implements IntegerValue {

    @Override
    public int getInteger() {
        return 5;
    }
}

class ClassAdapter extends IntegerValueImpel {

    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}

class ObjectAdapter {

    private final IntegerValue integerValue;

    public ObjectAdapter(IntegerValue integerValue) {
        this.integerValue = integerValue;
    }

    public int getInteger() {
        return 2 + this.integerValue.getInteger();
    }
}
