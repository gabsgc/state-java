public class CanceledState implements State {
    public CanceledState() {}
    private static CanceledState instance = new CanceledState();
    public static CanceledState getInstance() { return instance;}

    @Override
    public String getState() {
        return "Canceled";
    }

    @Override
    public boolean open(Event event) {
        return false;
    }

    @Override
    public boolean start(Event event) {
        return false;
    }

    @Override
    public boolean finish(Event event) {
        return false;
    }

    @Override
    public boolean cancel(Event event) {
        return false;
    }
}
