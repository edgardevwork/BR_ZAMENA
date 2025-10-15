package org.apache.ivy.plugins.conflict;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.plugins.latest.ArtifactInfo;
import org.apache.ivy.plugins.latest.LatestStrategy;
import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public class LatestConflictManager extends AbstractConflictManager {
    public LatestStrategy strategy;
    public String strategyName;

    /* loaded from: classes6.dex */
    public static class NoConflictResolvedYetException extends RuntimeException {
    }

    /* loaded from: classes5.dex */
    public static final class IvyNodeArtifactInfo implements ArtifactInfo {
        public final IvyNode node;

        public IvyNodeArtifactInfo(IvyNode ivyNode) {
            this.node = ivyNode;
        }

        @Override // org.apache.ivy.plugins.latest.ArtifactInfo
        public long getLastModified() {
            long lastModified = this.node.getLastModified();
            if (lastModified != 0) {
                return lastModified;
            }
            throw new NoConflictResolvedYetException();
        }

        @Override // org.apache.ivy.plugins.latest.ArtifactInfo
        public String getRevision() {
            return this.node.getResolvedId().getRevision();
        }

        public IvyNode getNode() {
            return this.node;
        }
    }

    public LatestConflictManager() {
    }

    public LatestConflictManager(LatestStrategy latestStrategy) {
        this.strategy = latestStrategy;
    }

    public LatestConflictManager(String str, LatestStrategy latestStrategy) {
        setName(str);
        this.strategy = latestStrategy;
    }

    @Override // org.apache.ivy.plugins.conflict.ConflictManager
    public Collection<IvyNode> resolveConflicts(IvyNode ivyNode, Collection<IvyNode> collection) {
        if (collection.size() < 2) {
            return collection;
        }
        for (IvyNode ivyNode2 : collection) {
            DependencyDescriptor dependencyDescriptor = ivyNode2.getDependencyDescriptor(ivyNode);
            if (dependencyDescriptor != null && dependencyDescriptor.isForce() && ivyNode.getResolvedId().equals(dependencyDescriptor.getParentRevisionId())) {
                return Collections.singleton(ivyNode2);
            }
        }
        Iterator<IvyNode> it = collection.iterator();
        while (it.hasNext()) {
            if (getSettings().getVersionMatcher().isDynamic(it.next().getResolvedId())) {
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (IvyNode ivyNode3 : collection) {
            if (!ivyNode3.isCompletelyEvicted()) {
                arrayList.add(ivyNode3);
            }
        }
        if (arrayList.size() > 0) {
            collection = arrayList;
        }
        try {
            IvyNodeArtifactInfo ivyNodeArtifactInfo = (IvyNodeArtifactInfo) getStrategy().findLatest(toArtifactInfo(collection), null);
            return ivyNodeArtifactInfo != null ? Collections.singleton(ivyNodeArtifactInfo.getNode()) : collection;
        } catch (NoConflictResolvedYetException unused) {
            return null;
        }
    }

    public ArtifactInfo[] toArtifactInfo(Collection<IvyNode> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<IvyNode> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new IvyNodeArtifactInfo(it.next()));
        }
        return (ArtifactInfo[]) arrayList.toArray(new ArtifactInfo[arrayList.size()]);
    }

    public LatestStrategy getStrategy() {
        if (this.strategy == null) {
            if (this.strategyName != null) {
                LatestStrategy latestStrategy = getSettings().getLatestStrategy(this.strategyName);
                this.strategy = latestStrategy;
                if (latestStrategy == null) {
                    Message.error("unknown latest strategy: " + this.strategyName);
                    this.strategy = getSettings().getDefaultLatestStrategy();
                }
            } else {
                this.strategy = getSettings().getDefaultLatestStrategy();
            }
        }
        return this.strategy;
    }

    public void setLatest(String str) {
        this.strategyName = str;
    }

    public void setStrategy(LatestStrategy latestStrategy) {
        this.strategy = latestStrategy;
    }

    @Override // org.apache.ivy.plugins.conflict.AbstractConflictManager
    public String toString() {
        LatestStrategy latestStrategy = this.strategy;
        return latestStrategy != null ? String.valueOf(latestStrategy) : this.strategyName;
    }
}
