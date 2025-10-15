package org.apache.ivy.plugins.trigger;

import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.core.event.IvyEventFilter;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.util.filter.Filter;

/* loaded from: classes5.dex */
public abstract class AbstractTrigger implements Trigger {
    public String event;
    public String expression;
    public Filter<IvyEvent> filter;
    public String matcher = PatternMatcher.EXACT;

    @Override // org.apache.ivy.plugins.trigger.Trigger
    public Filter<IvyEvent> getEventFilter() {
        if (this.filter == null) {
            this.filter = createFilter();
        }
        return this.filter;
    }

    public final Filter<IvyEvent> createFilter() {
        return new IvyEventFilter(getEvent(), getFilter(), getPatternMatcher());
    }

    public final PatternMatcher getPatternMatcher() {
        return IvyContext.getContext().getSettings().getMatcher(this.matcher);
    }

    public String getEvent() {
        return this.event;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public String getFilter() {
        return this.expression;
    }

    public void setFilter(String str) {
        this.expression = str;
    }

    public String getMatcher() {
        return this.matcher;
    }

    public void setMatcher(String str) {
        this.matcher = str;
    }
}
