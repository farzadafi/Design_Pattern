public class Captain {

    private Captain () {

    }

    private static final class CaptainSingleton {

        private static final Captain captain = new Captain();

        private static Captain getCaptain () {
            return captain;
        }
    }

    public static Captain getInstance() {
        return CaptainSingleton.getCaptain();
    }
}
