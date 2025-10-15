package org.apache.ivy.plugins.trigger;

import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.core.event.IvyListener;
import org.apache.ivy.util.filter.Filter;

/* loaded from: classes5.dex */
public interface Trigger extends IvyListener {
    Filter<IvyEvent> getEventFilter();
}
