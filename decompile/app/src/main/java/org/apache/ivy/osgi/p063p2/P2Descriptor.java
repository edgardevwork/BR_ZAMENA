package org.apache.ivy.osgi.p063p2;

import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.osgi.core.BundleArtifact;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.core.ExecutionEnvironmentProfileProvider;
import org.apache.ivy.osgi.repo.EditableRepoDescriptor;
import org.apache.ivy.osgi.repo.ModuleDescriptorWrapper;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public class P2Descriptor extends EditableRepoDescriptor {
    public Map<String, Map<Version, BundleInfo>> sourceBundles;
    public Map<String, Map<Version, BundleInfo>> sourceTargetBundles;

    public P2Descriptor(URI uri, ExecutionEnvironmentProfileProvider executionEnvironmentProfileProvider) {
        super(uri, executionEnvironmentProfileProvider);
        this.sourceTargetBundles = new HashMap();
        this.sourceBundles = new HashMap();
    }

    @Override // org.apache.ivy.osgi.repo.EditableRepoDescriptor
    public void addBundle(BundleInfo bundleInfo) {
        if (bundleInfo.isSource()) {
            if (bundleInfo.getSymbolicNameTarget() == null || bundleInfo.getVersionTarget() == null) {
                if (getLogLevel() <= 3) {
                    Message.verbose("The source bundle " + bundleInfo.getSymbolicName() + " did not declare its target. Ignoring it");
                    return;
                }
                return;
            }
            Map<Version, BundleInfo> map = this.sourceBundles.get(bundleInfo.getSymbolicName());
            if (map == null) {
                map = new HashMap<>();
                this.sourceBundles.put(bundleInfo.getSymbolicName(), map);
            }
            map.put(bundleInfo.getVersion(), bundleInfo);
            Map<Version, BundleInfo> map2 = this.sourceTargetBundles.get(bundleInfo.getSymbolicNameTarget());
            if (map2 == null) {
                map2 = new HashMap<>();
                this.sourceTargetBundles.put(bundleInfo.getSymbolicNameTarget(), map2);
            }
            BundleInfo bundleInfoPut = map2.put(bundleInfo.getVersionTarget(), bundleInfo);
            if (bundleInfoPut == null || bundleInfoPut.equals(bundleInfo) || getLogLevel() > 3) {
                return;
            }
            Message.verbose("Duplicate source for the bundle " + bundleInfo.getSymbolicNameTarget() + "@" + bundleInfo.getVersionTarget() + " : " + bundleInfo + " is replacing " + bundleInfoPut);
            return;
        }
        super.addBundle(bundleInfo);
    }

    public void finish() {
        BundleInfo bundleInfo;
        this.sourceBundles = null;
        Set<String> capabilityValues = getCapabilityValues(BundleInfo.BUNDLE_TYPE);
        if (capabilityValues == null) {
            return;
        }
        Iterator<String> it = capabilityValues.iterator();
        while (it.hasNext()) {
            for (ModuleDescriptorWrapper moduleDescriptorWrapper : findModules(BundleInfo.BUNDLE_TYPE, it.next())) {
                Map<Version, BundleInfo> map = this.sourceTargetBundles.get(moduleDescriptorWrapper.getBundleInfo().getSymbolicName());
                if (map != null && (bundleInfo = map.get(moduleDescriptorWrapper.getBundleInfo().getVersion())) != null) {
                    Iterator<BundleArtifact> it2 = bundleInfo.getArtifacts().iterator();
                    while (it2.hasNext()) {
                        moduleDescriptorWrapper.getBundleInfo().addArtifact(it2.next());
                    }
                }
            }
        }
        this.sourceTargetBundles = null;
    }

    public void addArtifactUrl(String str, String str2, Version version, URI uri, String str3) {
        BundleInfo bundleInfo;
        if (str.equals("osgi.bundle")) {
            ModuleDescriptorWrapper moduleDescriptorWrapperFindModule = findModule(str2, version);
            if (moduleDescriptorWrapperFindModule != null) {
                addArtifact(moduleDescriptorWrapperFindModule.getBundleInfo(), new BundleArtifact(false, uri, str3));
                return;
            }
            Map<Version, BundleInfo> map = this.sourceBundles.get(str2);
            if (map == null || (bundleInfo = map.get(version)) == null) {
                return;
            }
            addArtifact(bundleInfo, new BundleArtifact(true, uri, str3));
        }
    }

    public final void addArtifact(BundleInfo bundleInfo, BundleArtifact bundleArtifact) {
        BundleArtifact next;
        Iterator<BundleArtifact> it = bundleInfo.getArtifacts().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next.isSource() == bundleArtifact.isSource()) {
                    break;
                }
            }
        }
        if (next != null) {
            if (bundleArtifact.getFormat() == null || next.getFormat() != null) {
                return;
            } else {
                bundleInfo.removeArtifact(next);
            }
        }
        bundleInfo.addArtifact(bundleArtifact);
    }
}
