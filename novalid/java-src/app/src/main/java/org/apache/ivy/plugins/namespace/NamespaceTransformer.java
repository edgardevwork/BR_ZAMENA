package org.apache.ivy.plugins.namespace;

import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes6.dex */
public interface NamespaceTransformer {
    boolean isIdentity();

    ModuleRevisionId transform(ModuleRevisionId moduleRevisionId);
}
