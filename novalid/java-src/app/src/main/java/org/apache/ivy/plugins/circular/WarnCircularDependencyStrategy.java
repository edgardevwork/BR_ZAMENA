package org.apache.ivy.plugins.circular;

import org.apache.ivy.ant.IvyBuildList;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public final class WarnCircularDependencyStrategy extends AbstractLogCircularDependencyStrategy {
    public static final CircularDependencyStrategy INSTANCE = new WarnCircularDependencyStrategy();

    public static CircularDependencyStrategy getInstance() {
        return INSTANCE;
    }

    public WarnCircularDependencyStrategy() {
        super(IvyBuildList.OnMissingDescriptor.WARN);
    }

    @Override // org.apache.ivy.plugins.circular.AbstractLogCircularDependencyStrategy
    public void logCircularDependency(ModuleRevisionId[] moduleRevisionIdArr) {
        Message.warn("circular dependency found: " + CircularDependencyHelper.formatMessage(moduleRevisionIdArr));
    }
}
