package controller.communication.events;


/**
 * Created by cyprien on 09/11/15.
 */
public class EventWrapper {
    private RemoteEvent event;
    private Class<? extends RemoteEvent> type;

    public EventWrapper(RemoteEvent event) {
        this.event = event;
        this.type = event.getClass();
    }

    public RemoteEvent getRemoteEvent() {
        return event;
    }

    public Class<? extends RemoteEvent> getTypeOfEvent() {
        return type;
    }

}
