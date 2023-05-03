public class Event {
    private String name;
    private State state;

    public Event() {
        this.state = OpenState.getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getStateName() {
        return state.getState();
    }

    public boolean open() {
        return state.open(this);
    }

    public boolean cancel() {
        return state.cancel(this);
    }

    public boolean start() {
        return state.start(this);
    }

    public boolean finish() {
        return state.finish(this);
    }
}
