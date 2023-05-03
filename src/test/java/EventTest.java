import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {
    Event event;

    @BeforeEach
    public void setUp() {
        event = new Event();
    }

    @Test
    public void openEvent_whenEventAlreadyOpen_mustReturnFalse() {
        event.setState(OpenState.getInstance());
        assertFalse(event.open());
    }

    @Test
    public void startEvent_whenEventOpen_mustReturnTrue() {
        event.setState(OpenState.getInstance());
        assertTrue(event.start());
        assertEquals(StartedState.getInstance(), event.getState());
    }

    @Test
    public void cancelEvent_whenEventOpen_mustReturnTrue() {
        event.setState(OpenState.getInstance());
        assertTrue(event.cancel());
        assertEquals(CanceledState.getInstance(), event.getState());
    }

    @Test
    public void finishEvent_whenEventOpen_mustReturnFalse() {
        event.setState(OpenState.getInstance());
        assertFalse(event.finish());
    }

    @Test
    public void openEvent_whenEventStarted_mustReturnFalse() {
        event.setState(StartedState.getInstance());
        assertFalse(event.open());
    }

    @Test
    public void startEvent_whenEventAlreadyStarted_mustReturnFalse() {
        event.setState(StartedState.getInstance());
        assertFalse(event.start());
    }

    @Test
    public void finishEvent_whenEventStarted_mustReturnTrue() {
        event.setState(StartedState.getInstance());
        assertTrue(event.finish());
        assertEquals(FinishedState.getInstance(), event.getState());
    }

    @Test
    public void cancelEvent_whenEventStarted_mustReturnFalse() {
        event.setState(StartedState.getInstance());
        assertFalse(event.cancel());
    }

    @Test
    public void openEvent_whenEventFinished_mustReturnFalse() {
        event.setState(FinishedState.getInstance());
        assertFalse(event.open());
    }

    @Test
    public void startEvent_whenEventFinished_mustReturnFalse() {
        event.setState(FinishedState.getInstance());
        assertFalse(event.start());
    }

    @Test
    public void finishEvent_whenEventAlreadyFinished_mustReturnFalse() {
        event.setState(FinishedState.getInstance());
        assertFalse(event.finish());
    }

    @Test
    public void cancelEvent_whenEventFinished_mustReturnFalse() {
        event.setState(FinishedState.getInstance());
        assertFalse(event.cancel());
    }

    @Test
    public void openEvent_whenEventCanceled_mustReturnFalse() {
        event.setState(CanceledState.getInstance());
        assertFalse(event.open());
    }

    @Test
    public void startEvent_whenEventCanceled_mustReturnFalse() {
        event.setState(CanceledState.getInstance());
        assertFalse(event.start());
    }

    @Test
    public void finishEvent_whenEventCanceled_mustReturnFalse() {
        event.setState(CanceledState.getInstance());
        assertFalse(event.finish());
    }

    @Test
    public void cancelEvent_whenEventCanceled_mustReturnFalse() {
        event.setState(CanceledState.getInstance());
        assertFalse(event.cancel());
    }
}