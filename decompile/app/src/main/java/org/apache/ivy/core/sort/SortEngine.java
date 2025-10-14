package org.apache.ivy.core.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.plugins.circular.CircularDependencyException;
import org.apache.ivy.plugins.circular.CircularDependencyStrategy;
import org.apache.ivy.plugins.circular.IgnoreCircularDependencyStrategy;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.util.Checks;

/* loaded from: classes5.dex */
public class SortEngine {
    public SortEngineSettings settings;

    public SortEngine(SortEngineSettings sortEngineSettings) {
        if (sortEngineSettings == null) {
            throw new NullPointerException("SortEngine.settings can not be null");
        }
        this.settings = sortEngineSettings;
    }

    public List<IvyNode> sortNodes(Collection<IvyNode> collection, SortOptions sortOptions) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (IvyNode ivyNode : collection) {
            if (ivyNode.getDescriptor() == null) {
                arrayList.add(ivyNode);
            } else {
                List arrayList2 = (List) linkedHashMap.get(ivyNode.getDescriptor());
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(ivyNode.getDescriptor(), arrayList2);
                }
                arrayList2.add(ivyNode);
            }
        }
        List<ModuleDescriptor> listSortModuleDescriptors = sortModuleDescriptors(linkedHashMap.keySet(), sortOptions);
        ArrayList arrayList3 = new ArrayList((int) ((listSortModuleDescriptors.size() * 1.3d) + arrayList.size()));
        Iterator<ModuleDescriptor> it = listSortModuleDescriptors.iterator();
        while (it.hasNext()) {
            arrayList3.addAll((List) linkedHashMap.get(it.next()));
        }
        arrayList3.addAll(0, arrayList);
        return arrayList3;
    }

    public List<ModuleDescriptor> sortModuleDescriptors(Collection<ModuleDescriptor> collection, SortOptions sortOptions) throws CircularDependencyException {
        Checks.checkNotNull(sortOptions, "options");
        return new ModuleDescriptorSorter(collection, getVersionMatcher(), sortOptions.getNonMatchingVersionReporter(), sortOptions.isUseCircularDependencyStrategy() ? getCircularStrategy() : IgnoreCircularDependencyStrategy.getInstance()).sortModuleDescriptors();
    }

    public CircularDependencyStrategy getCircularStrategy() {
        return this.settings.getCircularDependencyStrategy();
    }

    public VersionMatcher getVersionMatcher() {
        return this.settings.getVersionMatcher();
    }
}
