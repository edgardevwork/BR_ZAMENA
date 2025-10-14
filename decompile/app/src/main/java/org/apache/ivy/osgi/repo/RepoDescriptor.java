package org.apache.ivy.osgi.repo;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class RepoDescriptor {
    public abstract Set<ModuleDescriptorWrapper> findModules(String str, String str2);

    public abstract Set<String> getCapabilities();

    public abstract Set<String> getCapabilityValues(String str);

    public abstract Iterator<ModuleDescriptorWrapper> getModules();
}
