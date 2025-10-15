package org.apache.ivy.core.event;

import org.apache.ivy.util.filter.Filter;

/* loaded from: classes7.dex */
public class FilteredIvyListener implements IvyListener {
    public Filter<IvyEvent> filter;
    public IvyListener listener;

    public FilteredIvyListener(IvyListener ivyListener, Filter<IvyEvent> filter) {
        this.listener = ivyListener;
        this.filter = filter;
    }

    public IvyListener getIvyListener() {
        return this.listener;
    }

    public Filter<IvyEvent> getFilter() {
        return this.filter;
    }

    @Override // org.apache.ivy.core.event.IvyListener
    public void progress(IvyEvent ivyEvent) {
        if (this.filter.accept(ivyEvent)) {
            this.listener.progress(ivyEvent);
        }
    }
}
