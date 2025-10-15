package org.apache.ivy.plugins.circular;

import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public final class IgnoreCircularDependencyStrategy extends AbstractLogCircularDependencyStrategy {
    public static final CircularDependencyStrategy INSTANCE = new IgnoreCircularDependencyStrategy();

    public static CircularDependencyStrategy getInstance() {
        return INSTANCE;
    }

    public IgnoreCircularDependencyStrategy() {
        super("ignore");
    }

    @Override // org.apache.ivy.plugins.circular.AbstractLogCircularDependencyStrategy
    public void logCircularDependency(ModuleRevisionId[] moduleRevisionIdArr) {
        Message.verbose("circular dependency found: " + CircularDependencyHelper.formatMessage(moduleRevisionIdArr));
    }
}
