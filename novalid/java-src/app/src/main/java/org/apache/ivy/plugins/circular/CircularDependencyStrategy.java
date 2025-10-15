package org.apache.ivy.plugins.circular;

import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes6.dex */
public interface CircularDependencyStrategy {
    String getName();

    void handleCircularDependency(ModuleRevisionId[] moduleRevisionIdArr) throws CircularDependencyException;
}
