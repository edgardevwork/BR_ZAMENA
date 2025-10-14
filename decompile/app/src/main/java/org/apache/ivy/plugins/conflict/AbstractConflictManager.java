package org.apache.ivy.plugins.conflict;

import java.util.Collection;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.IvySettingsAware;

/* loaded from: classes5.dex */
public abstract class AbstractConflictManager implements ConflictManager, IvySettingsAware {
    public String name;
    public IvySettings settings;

    @Override // org.apache.ivy.plugins.conflict.ConflictManager
    public void handleAllBlacklistedRevisions(DependencyDescriptor dependencyDescriptor, Collection<ModuleRevisionId> collection) {
    }

    public IvySettings getSettings() {
        return this.settings;
    }

    @Override // org.apache.ivy.plugins.IvySettingsAware
    public void setSettings(IvySettings ivySettings) {
        this.settings = ivySettings;
    }

    @Override // org.apache.ivy.plugins.conflict.ConflictManager
    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name;
    }
}
