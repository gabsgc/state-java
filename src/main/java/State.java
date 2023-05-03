public interface State {
    String getState();
    boolean open(Event event);
    boolean start(Event event);
    boolean finish(Event event);
    boolean cancel(Event event);
}
