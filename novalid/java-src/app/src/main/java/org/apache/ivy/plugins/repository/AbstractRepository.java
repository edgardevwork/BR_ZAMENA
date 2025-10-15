package org.apache.ivy.plugins.repository;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.event.EventListenerList;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.settings.TimeoutConstraint;

/* loaded from: classes5.dex */
public abstract class AbstractRepository implements Repository {
    public TransferEvent evt;
    public EventListenerList listeners;
    public String name;
    public final TimeoutConstraint timeoutConstraint;

    public AbstractRepository() {
        this(null);
    }

    public AbstractRepository(TimeoutConstraint timeoutConstraint) {
        this.listeners = new EventListenerList();
        this.timeoutConstraint = timeoutConstraint;
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public void addTransferListener(TransferListener transferListener) {
        this.listeners.add(TransferListener.class, transferListener);
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public void removeTransferListener(TransferListener transferListener) {
        this.listeners.remove(TransferListener.class, transferListener);
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public boolean hasTransferListener(TransferListener transferListener) {
        return Arrays.asList((TransferListener[]) this.listeners.getListeners(TransferListener.class)).contains(transferListener);
    }

    public void fireTransferInitiated(Resource resource, int i) {
        TransferEvent transferEvent = new TransferEvent((Repository) this, resource, 0, i);
        this.evt = transferEvent;
        fireTransferEvent(transferEvent);
    }

    public void fireTransferStarted() {
        this.evt.setEventType(1);
        fireTransferEvent(this.evt);
    }

    public void fireTransferStarted(long j) {
        this.evt.setEventType(1);
        this.evt.setTotalLength(j);
        this.evt.setTotalLengthSet(true);
        fireTransferEvent(this.evt);
    }

    public void fireTransferProgress(long j) {
        this.evt.setEventType(3);
        this.evt.setLength(j);
        if (!this.evt.isTotalLengthSet()) {
            TransferEvent transferEvent = this.evt;
            transferEvent.setTotalLength(transferEvent.getTotalLength() + j);
        }
        fireTransferEvent(this.evt);
    }

    public void fireTransferCompleted() {
        this.evt.setEventType(2);
        if (this.evt.getTotalLength() > 0 && !this.evt.isTotalLengthSet()) {
            this.evt.setTotalLengthSet(true);
        }
        fireTransferEvent(this.evt);
    }

    public void fireTransferCompleted(long j) {
        this.evt.setEventType(2);
        this.evt.setTotalLength(j);
        this.evt.setTotalLengthSet(true);
        fireTransferEvent(this.evt);
    }

    public void fireTransferError() {
        this.evt.setEventType(4);
        fireTransferEvent(this.evt);
    }

    public void fireTransferError(Exception exc) {
        this.evt.setEventType(4);
        this.evt.setException(exc);
        fireTransferEvent(this.evt);
    }

    public void fireTransferEvent(TransferEvent transferEvent) {
        Object[] listenerList = this.listeners.getListenerList();
        for (int length = listenerList.length - 2; length >= 0; length -= 2) {
            if (listenerList[length] == TransferListener.class) {
                ((TransferListener) listenerList[length + 1]).transferProgress(transferEvent);
            }
        }
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public String getFileSeparator() {
        return "/";
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public String standardize(String str) {
        return str.replace('\\', '/');
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public TimeoutConstraint getTimeoutConstraint() {
        return this.timeoutConstraint;
    }

    public String toString() {
        return getName();
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public void put(Artifact artifact, File file, String str, boolean z) throws IOException {
        put(file, str, z);
    }

    public void put(File file, String str, boolean z) throws IOException {
        throw new UnsupportedOperationException("put in not supported by " + getName());
    }
}
