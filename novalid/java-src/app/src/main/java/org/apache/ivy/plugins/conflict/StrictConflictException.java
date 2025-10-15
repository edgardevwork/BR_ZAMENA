package org.apache.ivy.plugins.conflict;

import java.util.Arrays;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.ResolveProcessException;

/* loaded from: classes5.dex */
public class StrictConflictException extends ResolveProcessException {
    public StrictConflictException() {
    }

    public StrictConflictException(IvyNode ivyNode, IvyNode ivyNode2) {
        super(ivyNode + " (needed by " + Arrays.asList(ivyNode.getAllRealCallers()) + ") conflicts with " + ivyNode2 + " (needed by " + Arrays.asList(ivyNode2.getAllRealCallers()) + ")");
    }

    public StrictConflictException(String str) {
        super(str);
    }

    public StrictConflictException(Throwable th) {
        super(th);
    }

    public StrictConflictException(String str, Throwable th) {
        super(str, th);
    }
}
