package org.apache.ivy.plugins.resolver;

import org.apache.ivy.core.settings.IvySettings;

/* loaded from: classes7.dex */
public class WorkspaceChainResolver extends ChainResolver {
    public WorkspaceChainResolver(IvySettings ivySettings, DependencyResolver dependencyResolver, AbstractWorkspaceResolver abstractWorkspaceResolver) {
        setName("workspace-chain-" + dependencyResolver.getName());
        setSettings(ivySettings);
        setReturnFirst(true);
        add(abstractWorkspaceResolver);
        add(dependencyResolver);
    }
}
