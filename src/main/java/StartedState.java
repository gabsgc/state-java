public class StartedState implements State {
    public StartedState() {}
    private static StartedState instance = new StartedState();
    public static StartedState getInstance() { return instance; }

    @Override
    public String getState() {
        return "Started";
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
        event.setState(FinishedState.getInstance());
        return true;
    }

    @Override
    public boolean cancel(Event event) {
        return false;
    }
}
