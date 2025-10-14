package org.apache.ivy.osgi.repo;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.core.BundleInfoAdapter;
import org.apache.ivy.osgi.core.ExecutionEnvironmentProfileProvider;
import org.apache.ivy.osgi.core.OSGiManifestParser;

/* loaded from: classes5.dex */
public class ModuleDescriptorWrapper {
    public URI baseUri;
    public BundleInfo bundleInfo;

    /* renamed from: md */
    public volatile DefaultModuleDescriptor f9981md;
    public ExecutionEnvironmentProfileProvider profileProvider;

    public ModuleDescriptorWrapper(BundleInfo bundleInfo, URI uri, ExecutionEnvironmentProfileProvider executionEnvironmentProfileProvider) {
        this.bundleInfo = bundleInfo;
        this.baseUri = uri;
        this.profileProvider = executionEnvironmentProfileProvider;
    }

    public BundleInfo getBundleInfo() {
        return this.bundleInfo;
    }

    public DefaultModuleDescriptor getModuleDescriptor() {
        if (this.f9981md == null) {
            synchronized (this) {
                try {
                    if (this.f9981md != null) {
                        return this.f9981md;
                    }
                    this.f9981md = BundleInfoAdapter.toModuleDescriptor(OSGiManifestParser.getInstance(), this.baseUri, this.bundleInfo, this.profileProvider);
                } finally {
                }
            }
        }
        return this.f9981md;
    }

    public static Collection<ModuleDescriptor> unwrap(Collection<ModuleDescriptorWrapper> collection) {
        if (collection == null) {
            return null;
        }
        if (collection.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleDescriptorWrapper> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getModuleDescriptor());
        }
        return arrayList;
    }

    public int hashCode() {
        return this.bundleInfo.hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ModuleDescriptorWrapper) && this.bundleInfo.equals(((ModuleDescriptorWrapper) obj).bundleInfo);
    }

    public String toString() {
        return getModuleDescriptor().toString();
    }
}
