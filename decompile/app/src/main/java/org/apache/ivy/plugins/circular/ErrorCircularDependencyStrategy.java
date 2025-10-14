package org.apache.ivy.plugins.circular;

import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes8.dex */
public final class ErrorCircularDependencyStrategy extends AbstractCircularDependencyStrategy {
    public static final CircularDependencyStrategy INSTANCE = new ErrorCircularDependencyStrategy();

    public static CircularDependencyStrategy getInstance() {
        return INSTANCE;
    }

    public ErrorCircularDependencyStrategy() {
        super("error");
    }

    @Override // org.apache.ivy.plugins.circular.CircularDependencyStrategy
    public void handleCircularDependency(ModuleRevisionId[] moduleRevisionIdArr) throws CircularDependencyException {
        throw new CircularDependencyException(moduleRevisionIdArr);
    }
}
