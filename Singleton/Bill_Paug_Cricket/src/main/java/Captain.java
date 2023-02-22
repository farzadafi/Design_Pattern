public class Captain {

    private Captain () {

    }

    private static final class CaptainSingleton {

        private static final Captain captain = new Captain();

    }

    public static Captain getInstance() {
        return CaptainSingleton.captain;
    }
}
