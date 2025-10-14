package org.apache.ivy.osgi.repo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes5.dex */
public class AggregatedRepoDescriptor extends RepoDescriptor {
    public List<RepoDescriptor> repos;

    public AggregatedRepoDescriptor(List<RepoDescriptor> list) {
        this.repos = list;
    }

    @Override // org.apache.ivy.osgi.repo.RepoDescriptor
    public Iterator<ModuleDescriptorWrapper> getModules() {
        final Iterator<RepoDescriptor> it = this.repos.iterator();
        return new Iterator<ModuleDescriptorWrapper>() { // from class: org.apache.ivy.osgi.repo.AggregatedRepoDescriptor.1
            public Iterator<ModuleDescriptorWrapper> current = null;
            public ModuleDescriptorWrapper next = null;

            @Override // java.util.Iterator
            public boolean hasNext() {
                while (this.next == null) {
                    if (this.current == null) {
                        if (!it.hasNext()) {
                            return false;
                        }
                        this.current = ((RepoDescriptor) it.next()).getModules();
                    }
                    if (this.current.hasNext()) {
                        this.next = this.current.next();
                    } else {
                        this.current = null;
                    }
                }
                return true;
            }

            @Override // java.util.Iterator
            public ModuleDescriptorWrapper next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                ModuleDescriptorWrapper moduleDescriptorWrapper = this.next;
                this.next = null;
                return moduleDescriptorWrapper;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // org.apache.ivy.osgi.repo.RepoDescriptor
    public Set<String> getCapabilities() {
        HashSet hashSet = new HashSet();
        Iterator<RepoDescriptor> it = this.repos.iterator();
        while (it.hasNext()) {
            Set<String> capabilities = it.next().getCapabilities();
            if (capabilities != null) {
                hashSet.addAll(capabilities);
            }
        }
        return hashSet;
    }

    @Override // org.apache.ivy.osgi.repo.RepoDescriptor
    public Set<ModuleDescriptorWrapper> findModules(String str, String str2) {
        HashSet hashSet = new HashSet();
        Iterator<RepoDescriptor> it = this.repos.iterator();
        while (it.hasNext()) {
            Set<ModuleDescriptorWrapper> setFindModules = it.next().findModules(str, str2);
            if (setFindModules != null) {
                hashSet.addAll(setFindModules);
            }
        }
        return hashSet;
    }

    @Override // org.apache.ivy.osgi.repo.RepoDescriptor
    public Set<String> getCapabilityValues(String str) {
        HashSet hashSet = new HashSet();
        Iterator<RepoDescriptor> it = this.repos.iterator();
        while (it.hasNext()) {
            Set<String> capabilityValues = it.next().getCapabilityValues(str);
            if (capabilityValues != null) {
                hashSet.addAll(capabilityValues);
            }
        }
        return hashSet;
    }
}
