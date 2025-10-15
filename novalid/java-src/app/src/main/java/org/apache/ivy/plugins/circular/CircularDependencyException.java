package org.apache.ivy.plugins.circular;

import java.util.Collection;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes6.dex */
public class CircularDependencyException extends RuntimeException {
    public static final long serialVersionUID = 670272039106237360L;
    public ModuleRevisionId[] mrids;

    public CircularDependencyException(ModuleRevisionId[] moduleRevisionIdArr) {
        super(CircularDependencyHelper.formatMessage(moduleRevisionIdArr));
        this.mrids = moduleRevisionIdArr;
    }

    public CircularDependencyException(Collection<ModuleRevisionId> collection) {
        this((ModuleRevisionId[]) collection.toArray(new ModuleRevisionId[collection.size()]));
    }

    public ModuleRevisionId[] getPath() {
        return this.mrids;
    }
}
