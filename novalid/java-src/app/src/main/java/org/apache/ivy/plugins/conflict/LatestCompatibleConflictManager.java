package org.apache.ivy.plugins.conflict;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Stack;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.IvyNodeBlacklist;
import org.apache.ivy.core.resolve.IvyNodeCallers;
import org.apache.ivy.core.resolve.IvyNodeEviction;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.RestartResolveProcess;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.conflict.LatestConflictManager;
import org.apache.ivy.plugins.latest.LatestStrategy;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public class LatestCompatibleConflictManager extends LatestConflictManager {
    public LatestCompatibleConflictManager() {
    }

    public LatestCompatibleConflictManager(String str, LatestStrategy latestStrategy) {
        super(str, latestStrategy);
    }

    @Override // org.apache.ivy.plugins.conflict.LatestConflictManager, org.apache.ivy.plugins.conflict.ConflictManager
    public Collection<IvyNode> resolveConflicts(IvyNode ivyNode, Collection<IvyNode> collection) {
        if (collection.size() < 2) {
            return collection;
        }
        VersionMatcher versionMatcher = getSettings().getVersionMatcher();
        Iterator<IvyNode> it = collection.iterator();
        IvyNode next = it.next();
        ModuleRevisionId resolvedId = next.getResolvedId();
        if (versionMatcher.isDynamic(resolvedId)) {
            while (it.hasNext()) {
                IvyNode next2 = it.next();
                if (versionMatcher.isDynamic(next2.getResolvedId()) || (!versionMatcher.accept(resolvedId, next2.getResolvedId()) && !handleIncompatibleConflict(ivyNode, collection, next, next2))) {
                    return null;
                }
            }
            if (collection.size() == 2) {
                Iterator<IvyNode> it2 = collection.iterator();
                it2.next();
                return Collections.singleton(it2.next());
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
            linkedHashSet.remove(next);
            return super.resolveConflicts(ivyNode, linkedHashSet);
        }
        while (it.hasNext()) {
            IvyNode next3 = it.next();
            if (!versionMatcher.accept(next3.getResolvedId(), resolvedId) && !handleIncompatibleConflict(ivyNode, collection, next, next3)) {
                return null;
            }
        }
        return Collections.singleton(next);
    }

    public final boolean handleIncompatibleConflict(IvyNode ivyNode, Collection<IvyNode> collection, IvyNode ivyNode2, IvyNode ivyNode3) {
        try {
            LatestConflictManager.IvyNodeArtifactInfo ivyNodeArtifactInfo = (LatestConflictManager.IvyNodeArtifactInfo) getStrategy().findLatest(toArtifactInfo(Arrays.asList(ivyNode2, ivyNode3)), null);
            if (ivyNodeArtifactInfo != null) {
                IvyNode node = ivyNodeArtifactInfo.getNode();
                IvyNode ivyNode4 = node == ivyNode2 ? ivyNode3 : ivyNode2;
                blackListIncompatibleCallerAndRestartResolveIfPossible(getSettings(), ivyNode, ivyNode4, node);
                blackListIncompatibleCallerAndRestartResolveIfPossible(getSettings(), ivyNode, node, ivyNode4);
                handleUnsolvableConflict(ivyNode, collection, ivyNode2, ivyNode3);
                return true;
            }
        } catch (LatestConflictManager.NoConflictResolvedYetException unused) {
        }
        return false;
    }

    public final void blackListIncompatibleCallerAndRestartResolveIfPossible(IvySettings ivySettings, IvyNode ivyNode, IvyNode ivyNode2, IvyNode ivyNode3) {
        Stack<IvyNode> stack = new Stack<>();
        stack.push(ivyNode3);
        Collection<IvyNodeBlacklist> collectionBlackListIncompatibleCaller = blackListIncompatibleCaller(ivySettings.getVersionMatcher(), ivyNode, ivyNode2, ivyNode3, stack);
        if (collectionBlackListIncompatibleCaller != null) {
            StringBuilder sb = new StringBuilder();
            for (IvyNodeBlacklist ivyNodeBlacklist : collectionBlackListIncompatibleCaller) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                IvyNode blacklistedNode = ivyNodeBlacklist.getBlacklistedNode();
                blacklistedNode.blacklist(ivyNodeBlacklist);
                sb.append(blacklistedNode);
            }
            String configuration = ivyNode.getData().getReport().getConfiguration();
            ivyNode3.markEvicted(new IvyNodeEviction.EvictionData(configuration, ivyNode, this, Collections.singleton(ivyNode2), "with blacklisting of " + ((Object) sb)));
            if (ivySettings.debugConflictResolution()) {
                Message.debug("evicting " + ivyNode3 + " by " + ivyNode3.getEvictedData(configuration));
            }
            throw new RestartResolveProcess("trying to handle incompatibilities between " + ivyNode2 + " and " + ivyNode3);
        }
    }

    public final boolean handleIncompatibleCaller(Stack<IvyNode> stack, IvyNode ivyNode, IvyNode ivyNode2, IvyNode ivyNode3, IvyNode ivyNode4, IvyNode ivyNode5, Collection<IvyNodeBlacklist> collection, VersionMatcher versionMatcher) {
        if (stack.subList(0, stack.size() - 1).contains(ivyNode)) {
            return true;
        }
        stack.push(ivyNode2);
        Collection<IvyNodeBlacklist> collectionBlackListIncompatibleCaller = blackListIncompatibleCaller(versionMatcher, ivyNode3, ivyNode4, ivyNode5, stack);
        stack.pop();
        if (collectionBlackListIncompatibleCaller == null) {
            return false;
        }
        collection.addAll(collectionBlackListIncompatibleCaller);
        return true;
    }

    public final Collection<IvyNodeBlacklist> blackListIncompatibleCaller(VersionMatcher versionMatcher, IvyNode ivyNode, IvyNode ivyNode2, IvyNode ivyNode3, Stack<IvyNode> stack) {
        ArrayList arrayList = new ArrayList();
        IvyNode ivyNodePeek = stack.peek();
        String configuration = ivyNode.getData().getReport().getConfiguration();
        for (IvyNodeCallers.Caller caller : ivyNodePeek.getCallers(configuration)) {
            IvyNode ivyNodeFindNode = ivyNodePeek.findNode(caller.getModuleRevisionId());
            if (!ivyNodeFindNode.isBlacklisted(configuration)) {
                if (versionMatcher.isDynamic(caller.getAskedDependencyId())) {
                    arrayList.add(new IvyNodeBlacklist(ivyNode, ivyNode2, ivyNode3, ivyNodePeek, configuration));
                    if (ivyNodePeek.isEvicted(configuration) && !handleIncompatibleCaller(stack, ivyNodePeek, ivyNodeFindNode, ivyNode, ivyNode2, ivyNode3, arrayList, versionMatcher)) {
                        return null;
                    }
                } else if (!handleIncompatibleCaller(stack, ivyNodePeek, ivyNodeFindNode, ivyNode, ivyNode2, ivyNode3, arrayList, versionMatcher)) {
                    return null;
                }
            }
        }
        if (!arrayList.isEmpty() || stack.subList(0, stack.size() - 1).contains(ivyNodePeek)) {
            return arrayList;
        }
        return null;
    }

    public void handleUnsolvableConflict(IvyNode ivyNode, Collection<IvyNode> collection, IvyNode ivyNode2, IvyNode ivyNode3) {
        throw new StrictConflictException(ivyNode2, ivyNode3);
    }

    @Override // org.apache.ivy.plugins.conflict.AbstractConflictManager, org.apache.ivy.plugins.conflict.ConflictManager
    public void handleAllBlacklistedRevisions(DependencyDescriptor dependencyDescriptor, Collection<ModuleRevisionId> collection) {
        ResolveData resolveData = IvyContext.getContext().getResolveData();
        HashSet hashSet = new HashSet();
        Iterator<ModuleRevisionId> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(resolveData.getNode(it.next()));
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            IvyNodeBlacklist blacklistData = ((IvyNode) it2.next()).getBlacklistData(resolveData.getReport().getConfiguration());
            handleUnsolvableConflict(blacklistData.getConflictParent(), Arrays.asList(blacklistData.getEvictedNode(), blacklistData.getSelectedNode()), blacklistData.getEvictedNode(), blacklistData.getSelectedNode());
        }
    }

    @Override // org.apache.ivy.plugins.conflict.LatestConflictManager, org.apache.ivy.plugins.conflict.AbstractConflictManager
    public String toString() {
        return getName();
    }
}
