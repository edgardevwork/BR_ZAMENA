package org.apache.ivy.plugins.circular;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.ResolveData;

/* loaded from: classes8.dex */
public abstract class AbstractLogCircularDependencyStrategy extends AbstractCircularDependencyStrategy {
    public final Collection<String> circularDependencies;

    public abstract void logCircularDependency(ModuleRevisionId[] moduleRevisionIdArr);

    public AbstractLogCircularDependencyStrategy(String str) {
        super(str);
        this.circularDependencies = new HashSet();
    }

    @Override // org.apache.ivy.plugins.circular.CircularDependencyStrategy
    public void handleCircularDependency(ModuleRevisionId[] moduleRevisionIdArr) {
        String circularDependencyId = getCircularDependencyId(moduleRevisionIdArr);
        if (this.circularDependencies.contains(circularDependencyId)) {
            return;
        }
        this.circularDependencies.add(circularDependencyId);
        logCircularDependency(moduleRevisionIdArr);
    }

    public String getCircularDependencyId(ModuleRevisionId[] moduleRevisionIdArr) {
        String str;
        ResolveData resolveData = IvyContext.getContext().getResolveData();
        if (resolveData == null) {
            str = "";
        } else {
            str = resolveData.getOptions().getResolveId() + " ";
        }
        return str + Arrays.asList(moduleRevisionIdArr);
    }
}
