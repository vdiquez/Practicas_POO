package src.poo.estaticos;

public class SingletonTest {

    private static SingletonTest instance = null;

    protected SingletonTest() {
    }

    public static SingletonTest getInstance() {
        if (instance == null) {
            instance = new SingletonTest();
        }

        return instance;
    }
}
