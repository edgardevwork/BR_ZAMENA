package org.apache.ivy.osgi.repo;

import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.osgi.core.BundleCapability;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.core.ExecutionEnvironmentProfileProvider;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class EditableRepoDescriptor extends RepoDescriptor {
    public final URI baseUri;
    public final ExecutionEnvironmentProfileProvider profileProvider;
    public final Map<String, Map<String, Set<ModuleDescriptorWrapper>>> moduleByCapabilities = new HashMap();
    public final Set<ModuleDescriptorWrapper> modules = new HashSet();
    public int logLevel = 2;

    public EditableRepoDescriptor(URI uri, ExecutionEnvironmentProfileProvider executionEnvironmentProfileProvider) {
        this.baseUri = uri;
        this.profileProvider = executionEnvironmentProfileProvider;
    }

    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    public URI getBaseUri() {
        return this.baseUri;
    }

    @Override // org.apache.ivy.osgi.repo.RepoDescriptor
    public Iterator<ModuleDescriptorWrapper> getModules() {
        return this.modules.iterator();
    }

    @Override // org.apache.ivy.osgi.repo.RepoDescriptor
    public Set<String> getCapabilities() {
        return this.moduleByCapabilities.keySet();
    }

    @Override // org.apache.ivy.osgi.repo.RepoDescriptor
    public Set<ModuleDescriptorWrapper> findModules(String str, String str2) {
        Map<String, Set<ModuleDescriptorWrapper>> map = this.moduleByCapabilities.get(str);
        if (map == null) {
            return null;
        }
        return map.get(str2);
    }

    public ModuleDescriptorWrapper findModule(String str, Version version) {
        Set<ModuleDescriptorWrapper> setFindModules = findModules(BundleInfo.BUNDLE_TYPE, str);
        if (setFindModules == null) {
            return null;
        }
        for (ModuleDescriptorWrapper moduleDescriptorWrapper : setFindModules) {
            if (moduleDescriptorWrapper.getBundleInfo().getVersion().equals(version)) {
                return moduleDescriptorWrapper;
            }
        }
        return null;
    }

    @Override // org.apache.ivy.osgi.repo.RepoDescriptor
    public Set<String> getCapabilityValues(String str) {
        Map<String, Set<ModuleDescriptorWrapper>> map = this.moduleByCapabilities.get(str);
        if (map == null) {
            return Collections.emptySet();
        }
        return map.keySet();
    }

    public final void add(String str, String str2, ModuleDescriptorWrapper moduleDescriptorWrapper) {
        this.modules.add(moduleDescriptorWrapper);
        Map<String, Set<ModuleDescriptorWrapper>> map = this.moduleByCapabilities.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.moduleByCapabilities.put(str, map);
        }
        Set<ModuleDescriptorWrapper> hashSet = map.get(str2);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(str2, hashSet);
        }
        if (hashSet.add(moduleDescriptorWrapper) || this.logLevel > 4) {
            return;
        }
        Message.debug("Duplicate module in the repo " + this.baseUri + " for " + str + " " + str2 + ": " + moduleDescriptorWrapper.getBundleInfo().getSymbolicName() + "#" + moduleDescriptorWrapper.getBundleInfo().getVersion());
    }

    public void addBundle(BundleInfo bundleInfo) {
        if (findModule(bundleInfo.getSymbolicName(), bundleInfo.getVersion()) != null) {
            Message.debug("Duplicate module " + bundleInfo.getSymbolicName() + "@" + bundleInfo.getVersion());
            return;
        }
        ModuleDescriptorWrapper moduleDescriptorWrapper = new ModuleDescriptorWrapper(bundleInfo, this.baseUri, this.profileProvider);
        add(BundleInfo.BUNDLE_TYPE, bundleInfo.getSymbolicName(), moduleDescriptorWrapper);
        for (BundleCapability bundleCapability : bundleInfo.getCapabilities()) {
            add(bundleCapability.getType(), bundleCapability.getName(), moduleDescriptorWrapper);
        }
    }

    public String toString() {
        return this.modules.toString();
    }

    public int hashCode() {
        Set<ModuleDescriptorWrapper> set = this.modules;
        return 31 + (set == null ? 0 : set.hashCode());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EditableRepoDescriptor)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Set<ModuleDescriptorWrapper> set = this.modules;
        Set<ModuleDescriptorWrapper> set2 = ((EditableRepoDescriptor) obj).modules;
        return set == null ? set2 == null : set.equals(set2);
    }
}
