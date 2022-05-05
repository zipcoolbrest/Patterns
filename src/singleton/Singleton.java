package singleton;

public class Singleton {
    //thread-safe implementation

    private int variable;//for test
    private Singleton()  {
        variable = 0;//for test
        try {
           //db connection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    //for test
    public  int getVariable() {
        return variable;
    }
    //for test
    public  void setVariable(int variable) {
        this.variable = variable;
    }
}
