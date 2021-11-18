//QB34
//Ans: D. Compilation fails. in init() it is a private method, can NOT be called outside the Caller class!!!!!
class Caller {
    private void init() {
        System.out.println("Initialized");
    }
    public void start() {
        init();
        System.out.println("Started");
    }
}

public class TestCaller {
    public static void main(String[] args) {
        Caller caller = new Caller();
        caller.start();
        //caller.init();
    }
}
