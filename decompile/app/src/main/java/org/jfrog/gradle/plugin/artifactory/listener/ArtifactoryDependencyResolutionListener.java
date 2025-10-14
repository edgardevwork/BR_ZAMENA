package org.jfrog.gradle.plugin.artifactory.listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import org.gradle.api.artifacts.ResolvableDependencies;
import org.gradle.api.artifacts.result.DependencyResult;
import org.gradle.api.artifacts.result.ResolvedComponentResult;
import org.gradle.api.artifacts.result.ResolvedDependencyResult;
import org.jfrog.gradle.plugin.artifactory.utils.ProjectUtils;

/* loaded from: classes5.dex */
public class ArtifactoryDependencyResolutionListener {
    public final Map<String, Map<String, String[][]>> modulesHierarchyMap = new HashMap();

    public void afterResolve(ResolvableDependencies resolvableDependencies) {
        if (resolvableDependencies.getResolutionResult().getAllDependencies().isEmpty()) {
            return;
        }
        updateModulesMap(resolvableDependencies);
    }

    public final void updateModulesMap(ResolvableDependencies resolvableDependencies) {
        String id = ProjectUtils.getId(resolvableDependencies.getResolutionResult().getRoot().getModuleVersion());
        if (id == null) {
            return;
        }
        updateDependencyMap(this.modulesHierarchyMap.computeIfAbsent(id, new Function() { // from class: org.jfrog.gradle.plugin.artifactory.listener.ArtifactoryDependencyResolutionListener$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ArtifactoryDependencyResolutionListener.lambda$updateModulesMap$0((String) obj);
            }
        }), resolvableDependencies.getResolutionResult().getAllDependencies());
    }

    public static /* synthetic */ Map lambda$updateModulesMap$0(String str) {
        return new HashMap();
    }

    public final void updateDependencyMap(Map<String, String[][]> map, Set<? extends DependencyResult> set) {
        for (DependencyResult dependencyResult : set) {
            if (dependencyResult instanceof ResolvedDependencyResult) {
                ResolvedDependencyResult resolvedDependencyResult = (ResolvedDependencyResult) dependencyResult;
                String id = ProjectUtils.getId(resolvedDependencyResult.getSelected().getModuleVersion());
                if (!map.containsKey(id)) {
                    map.put(id, getDependencyDependents(resolvedDependencyResult));
                }
            }
        }
    }

    public final String[][] getDependencyDependents(ResolvedDependencyResult resolvedDependencyResult) {
        ArrayList arrayList = new ArrayList();
        populateDependents(resolvedDependencyResult, arrayList);
        return new String[][]{(String[]) arrayList.toArray(new String[0])};
    }

    public final void populateDependents(ResolvedDependencyResult resolvedDependencyResult, List<String> list) {
        ResolvedComponentResult from = resolvedDependencyResult.getFrom();
        if (from.getDependents().isEmpty()) {
            if (from.getSelectionReason().isExpected()) {
                list.add(ProjectUtils.getId(from.getModuleVersion()));
                return;
            }
            throw new RuntimeException("Failed populating dependency parents map: dependency has no dependents and is not root.");
        }
        ResolvedDependencyResult resolvedDependencyResult2 = (ResolvedDependencyResult) from.getDependents().iterator().next();
        String id = ProjectUtils.getId(resolvedDependencyResult2.getSelected().getModuleVersion());
        if (list.contains(id)) {
            return;
        }
        list.add(id);
        populateDependents(resolvedDependencyResult2, list);
    }

    public Map<String, Map<String, String[][]>> getModulesHierarchyMap() {
        return this.modulesHierarchyMap;
    }
}
