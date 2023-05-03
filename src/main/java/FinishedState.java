public class FinishedState implements State {
    public FinishedState() {}
    private static FinishedState instance = new FinishedState();
    public static FinishedState getInstance() { return instance; }

    @Override
    public String getState() {
        return "Finished.";
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
