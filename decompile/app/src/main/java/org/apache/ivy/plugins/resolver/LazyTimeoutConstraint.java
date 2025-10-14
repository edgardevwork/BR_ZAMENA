package org.apache.ivy.plugins.resolver;

import org.apache.ivy.core.settings.TimeoutConstraint;

/* loaded from: classes5.dex */
public final class LazyTimeoutConstraint implements TimeoutConstraint {
    public final AbstractResolver resolver;

    public LazyTimeoutConstraint(AbstractResolver abstractResolver) {
        this.resolver = abstractResolver;
    }

    @Override // org.apache.ivy.core.settings.TimeoutConstraint
    public int getConnectionTimeout() {
        TimeoutConstraint timeoutConstraint = this.resolver.getTimeoutConstraint();
        if (timeoutConstraint == null) {
            return -1;
        }
        return timeoutConstraint.getConnectionTimeout();
    }

    @Override // org.apache.ivy.core.settings.TimeoutConstraint
    public int getReadTimeout() {
        TimeoutConstraint timeoutConstraint = this.resolver.getTimeoutConstraint();
        if (timeoutConstraint == null) {
            return -1;
        }
        return timeoutConstraint.getReadTimeout();
    }
}
