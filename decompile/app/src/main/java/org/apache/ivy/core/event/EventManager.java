package org.apache.ivy.core.event;

import java.util.Arrays;
import javax.swing.event.EventListenerList;
import org.apache.ivy.plugins.repository.TransferEvent;
import org.apache.ivy.plugins.repository.TransferListener;
import org.apache.ivy.util.filter.Filter;

/* loaded from: classes7.dex */
public class EventManager implements TransferListener {
    public EventListenerList listeners = new EventListenerList();

    public void addIvyListener(IvyListener ivyListener) {
        this.listeners.add(IvyListener.class, ivyListener);
    }

    public void addIvyListener(IvyListener ivyListener, String str) {
        addIvyListener(ivyListener, new IvyEventFilter(str, null, null));
    }

    public void addIvyListener(IvyListener ivyListener, Filter<IvyEvent> filter) {
        this.listeners.add(IvyListener.class, new FilteredIvyListener(ivyListener, filter));
    }

    public void removeIvyListener(IvyListener ivyListener) {
        this.listeners.remove(IvyListener.class, ivyListener);
        for (IvyListener ivyListener2 : (IvyListener[]) this.listeners.getListeners(IvyListener.class)) {
            if ((ivyListener2 instanceof FilteredIvyListener) && ivyListener.equals(((FilteredIvyListener) ivyListener2).getIvyListener())) {
                this.listeners.remove(IvyListener.class, ivyListener2);
            }
        }
    }

    public boolean hasIvyListener(IvyListener ivyListener) {
        for (IvyListener ivyListener2 : (IvyListener[]) this.listeners.getListeners(IvyListener.class)) {
            if ((ivyListener2 instanceof FilteredIvyListener) && ivyListener.equals(((FilteredIvyListener) ivyListener2).getIvyListener())) {
                return true;
            }
        }
        return false;
    }

    public void fireIvyEvent(IvyEvent ivyEvent) {
        Object[] listenerList = this.listeners.getListenerList();
        for (int length = listenerList.length - 2; length >= 0; length -= 2) {
            if (listenerList[length] == IvyListener.class) {
                ((IvyListener) listenerList[length + 1]).progress(ivyEvent);
            }
        }
    }

    public void addTransferListener(TransferListener transferListener) {
        this.listeners.add(TransferListener.class, transferListener);
    }

    public void removeTransferListener(TransferListener transferListener) {
        this.listeners.remove(TransferListener.class, transferListener);
    }

    public boolean hasTransferListener(TransferListener transferListener) {
        return Arrays.asList((TransferListener[]) this.listeners.getListeners(TransferListener.class)).contains(transferListener);
    }

    public void fireTransferEvent(TransferEvent transferEvent) {
        Object[] listenerList = this.listeners.getListenerList();
        for (int length = listenerList.length - 2; length >= 0; length -= 2) {
            if (listenerList[length] == TransferListener.class) {
                ((TransferListener) listenerList[length + 1]).transferProgress(transferEvent);
            }
        }
    }

    @Override // org.apache.ivy.plugins.repository.TransferListener
    public void transferProgress(TransferEvent transferEvent) {
        fireTransferEvent(transferEvent);
        fireIvyEvent(transferEvent);
    }
}
