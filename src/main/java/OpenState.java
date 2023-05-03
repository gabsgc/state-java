public class OpenState implements State {
    public OpenState() {}
    private static OpenState instance = new OpenState();
    public static OpenState getInstance() { return instance; }

    @Override
    public String getState() {
        return "Event open for registration.";
    }

    @Override
    public boolean open(Event event) {
        return false;
    }

    @Override
    public boolean start(Event event) {
        event.setState(StartedState.getInstance());
        return true;
    }

    @Override
    public boolean finish(Event event) {
       return false;
    }

    @Override
    public boolean cancel(Event event) {
        event.setState(CanceledState.getInstance());
        return true;
    }
}
