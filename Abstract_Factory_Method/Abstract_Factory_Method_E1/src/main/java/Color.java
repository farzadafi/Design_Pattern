public interface Color {
    void fill();
}

class Green implements Color {

    @Override
    public void fill() {
        System.out.println("call fill method for Green class");
    }
}

class Red implements Color {

    @Override
    public void fill() {
        System.out.println("call fill method for Red class");
    }
}

class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("call fill method for Blue class");
    }
}
