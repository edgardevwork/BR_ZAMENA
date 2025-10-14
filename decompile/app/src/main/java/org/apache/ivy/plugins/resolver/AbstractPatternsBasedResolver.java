package org.apache.ivy.plugins.resolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.settings.IvyPattern;
import org.apache.ivy.plugins.matcher.Matcher;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.plugins.resolver.util.ResourceMDParser;
import org.apache.ivy.util.Message;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes7.dex */
public abstract class AbstractPatternsBasedResolver extends BasicResolver {
    public List<String> ivyPatterns = new ArrayList();
    public List<String> artifactPatterns = new ArrayList();
    public boolean m2compatible = false;

    public abstract boolean exist(String str);

    public abstract ResolvedResource findResourceUsingPattern(ModuleRevisionId moduleRevisionId, String str, Artifact artifact, ResourceMDParser resourceMDParser, Date date);

    public void findTokenValues(Collection<String> collection, List<String> list, Map<String, String> map, String str) {
    }

    public abstract String[] listTokenValues(String str, String str2);

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public ResolvedResource findIvyFileRef(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) {
        ModuleRevisionId dependencyRevisionId = dependencyDescriptor.getDependencyRevisionId();
        if (isM2compatible()) {
            dependencyRevisionId = convertM2IdForResourceSearch(dependencyRevisionId);
        }
        ModuleRevisionId moduleRevisionId = dependencyRevisionId;
        return findResourceUsingPatterns(moduleRevisionId, this.ivyPatterns, DefaultArtifact.newIvyArtifact(moduleRevisionId, resolveData.getDate()), getRMDParser(dependencyDescriptor, resolveData), resolveData.getDate());
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public ResolvedResource findArtifactRef(Artifact artifact, Date date) {
        ModuleRevisionId moduleRevisionId = artifact.getModuleRevisionId();
        if (isM2compatible()) {
            moduleRevisionId = convertM2IdForResourceSearch(moduleRevisionId);
        }
        return findResourceUsingPatterns(moduleRevisionId, this.artifactPatterns, artifact, getDefaultRMDParser(artifact.getModuleRevisionId().getModuleId()), date);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public ResolvedResource findResource(ResolvedResource[] resolvedResourceArr, ResourceMDParser resourceMDParser, ModuleRevisionId moduleRevisionId, Date date) {
        if (isM2compatible()) {
            moduleRevisionId = convertM2ResourceSearchIdToNormal(moduleRevisionId);
        }
        return super.findResource(resolvedResourceArr, resourceMDParser, moduleRevisionId, date);
    }

    public ResolvedResource findResourceUsingPatterns(ModuleRevisionId moduleRevisionId, List<String> list, Artifact artifact, ResourceMDParser resourceMDParser, Date date) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        boolean zIsDynamic = getSettings().getVersionMatcher().isDynamic(moduleRevisionId);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            ResolvedResource resolvedResourceFindResourceUsingPattern = findResourceUsingPattern(moduleRevisionId, it.next(), artifact, resourceMDParser, date);
            if (resolvedResourceFindResourceUsingPattern != null && !hashSet.contains(resolvedResourceFindResourceUsingPattern.getRevision())) {
                hashSet.add(resolvedResourceFindResourceUsingPattern.getRevision());
                arrayList.add(resolvedResourceFindResourceUsingPattern);
                if (!zIsDynamic) {
                    break;
                }
            }
        }
        if (arrayList.size() > 1) {
            return findResource((ResolvedResource[]) arrayList.toArray(new ResolvedResource[arrayList.size()]), resourceMDParser, moduleRevisionId, date);
        }
        if (arrayList.size() == 1) {
            return (ResolvedResource) arrayList.get(0);
        }
        return null;
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public Collection<String> findNames(Map<String, String> map, String str) {
        HashSet hashSet = new HashSet(findIvyNames(map, str));
        if (isAllownomd()) {
            hashSet.addAll(findArtifactNames(map, str));
        }
        return hashSet;
    }

    public Collection<String> findIvyNames(Map<String, String> map, String str) {
        HashSet hashSet = new HashSet();
        HashMap map2 = new HashMap(map);
        map2.put("artifact", ClientConfigurationFields.IVY);
        map2.put("type", ClientConfigurationFields.IVY);
        map2.put(IvyPatternHelper.EXT_KEY, "xml");
        if (isM2compatible()) {
            convertM2TokenValuesForResourceSearch(map2);
        }
        findTokenValues(hashSet, getIvyPatterns(), map2, str);
        filterNames(hashSet);
        return hashSet;
    }

    public Collection<String> findArtifactNames(Map<String, String> map, String str) {
        HashSet hashSet = new HashSet();
        HashMap map2 = new HashMap(map);
        map2.put("artifact", map2.get("module"));
        map2.put("type", "jar");
        map2.put(IvyPatternHelper.EXT_KEY, "jar");
        if (isM2compatible()) {
            convertM2TokenValuesForResourceSearch(map2);
        }
        findTokenValues(hashSet, getArtifactPatterns(), map2, str);
        filterNames(hashSet);
        return hashSet;
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public Map<String, String>[] listTokenValues(String[] strArr, Map<String, Object> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap map2 = new HashMap(map);
        map2.put("type", ClientConfigurationFields.IVY);
        map2.put(IvyPatternHelper.EXT_KEY, getModuleDescriptorExtension());
        if (isM2compatible()) {
            convertM2CriteriaForResourceSearch(map2);
        }
        Iterator<String> it = getIvyPatterns().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(resolveTokenValues(strArr, it.next(), map2, false));
        }
        if (isAllownomd()) {
            HashMap map3 = new HashMap(map);
            map3.put("type", "jar");
            map3.put(IvyPatternHelper.EXT_KEY, "jar");
            if (isM2compatible()) {
                convertM2CriteriaForResourceSearch(map3);
            }
            Iterator<String> it2 = getArtifactPatterns().iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(resolveTokenValues(strArr, it2.next(), map3, true));
            }
        }
        return (Map[]) linkedHashSet.toArray(new Map[linkedHashSet.size()]);
    }

    public String getModuleDescriptorExtension() {
        return "xml";
    }

    public final Set<Map<String, String>> resolveTokenValues(String[] strArr, String str, Map<String, Object> map, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                map2.put(entry.getKey(), (String) value);
            }
        }
        if (hashSet.isEmpty()) {
            linkedHashSet.add(map2);
            return linkedHashSet;
        }
        String strSubstituteTokens = IvyPatternHelper.substituteTokens(str, map2);
        String firstToken = IvyPatternHelper.getFirstToken(strSubstituteTokens);
        if (firstToken == null && exist(strSubstituteTokens)) {
            linkedHashSet.add(map2);
            return linkedHashSet;
        }
        hashSet.remove(firstToken);
        Object obj = map.get(firstToken);
        Matcher matcher = obj instanceof Matcher ? (Matcher) obj : null;
        String[] strArrListTokenValues = listTokenValues(strSubstituteTokens, firstToken);
        if (strArrListTokenValues == null) {
            return linkedHashSet;
        }
        ArrayList<String> arrayList = new ArrayList(Arrays.asList(strArrListTokenValues));
        filterNames(arrayList);
        for (String str2 : arrayList) {
            if (matcher == null || matcher.matches(str2)) {
                map2.put(firstToken, str2);
                String strSubstituteTokens2 = IvyPatternHelper.substituteTokens(strSubstituteTokens, map2);
                Map<String, Object> map3 = new HashMap<>(map);
                map3.put(firstToken, str2);
                if (z && "artifact".equals(firstToken)) {
                    map3.put("module", str2);
                } else if (z && "module".equals(firstToken)) {
                    map3.put("artifact", str2);
                }
                linkedHashSet.addAll(resolveTokenValues((String[]) hashSet.toArray(new String[hashSet.size()]), strSubstituteTokens2, map3, z));
            }
        }
        return linkedHashSet;
    }

    public void addIvyPattern(String str) {
        this.ivyPatterns.add(str);
    }

    public void addArtifactPattern(String str) {
        this.artifactPatterns.add(str);
    }

    public List<String> getIvyPatterns() {
        return Collections.unmodifiableList(this.ivyPatterns);
    }

    public List<String> getArtifactPatterns() {
        return Collections.unmodifiableList(this.artifactPatterns);
    }

    public void setIvyPatterns(List<String> list) {
        this.ivyPatterns = list;
    }

    public void setArtifactPatterns(List<String> list) {
        this.artifactPatterns = list;
    }

    public void addConfiguredIvy(IvyPattern ivyPattern) {
        this.ivyPatterns.add(ivyPattern.getPattern());
    }

    public void addConfiguredArtifact(IvyPattern ivyPattern) {
        this.artifactPatterns.add(ivyPattern.getPattern());
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void dumpSettings() {
        super.dumpSettings();
        Message.debug("\t\tm2compatible: " + isM2compatible());
        Message.debug("\t\tivy patterns:");
        Iterator<String> it = getIvyPatterns().iterator();
        while (it.hasNext()) {
            Message.debug("\t\t\t" + it.next());
        }
        Message.debug("\t\tartifact patterns:");
        Iterator<String> it2 = getArtifactPatterns().iterator();
        while (it2.hasNext()) {
            Message.debug("\t\t\t" + it2.next());
        }
    }

    public boolean isM2compatible() {
        return this.m2compatible;
    }

    public void setM2compatible(boolean z) {
        this.m2compatible = z;
    }

    public ModuleRevisionId convertM2ResourceSearchIdToNormal(ModuleRevisionId moduleRevisionId) {
        return (moduleRevisionId.getOrganisation() == null || moduleRevisionId.getOrganisation().indexOf(47) == -1) ? moduleRevisionId : ModuleRevisionId.newInstance(moduleRevisionId.getOrganisation().replace('/', '.'), moduleRevisionId.getName(), moduleRevisionId.getBranch(), moduleRevisionId.getRevision(), moduleRevisionId.getQualifiedExtraAttributes());
    }

    public ModuleRevisionId convertM2IdForResourceSearch(ModuleRevisionId moduleRevisionId) {
        return (moduleRevisionId.getOrganisation() == null || moduleRevisionId.getOrganisation().indexOf(46) == -1) ? moduleRevisionId : ModuleRevisionId.newInstance(moduleRevisionId.getOrganisation().replace('.', '/'), moduleRevisionId.getName(), moduleRevisionId.getBranch(), moduleRevisionId.getRevision(), moduleRevisionId.getQualifiedExtraAttributes());
    }

    public String convertM2OrganizationForResourceSearch(String str) {
        return str.replace('.', '/');
    }

    public void convertM2TokenValuesForResourceSearch(Map<String, String> map) {
        map.put(IvyPatternHelper.ORGANISATION_KEY, convertM2OrganizationForResourceSearch(map.get(IvyPatternHelper.ORGANISATION_KEY)));
    }

    public void convertM2CriteriaForResourceSearch(Map<String, Object> map) {
        Object obj = map.get(IvyPatternHelper.ORGANISATION_KEY);
        if (obj instanceof String) {
            map.put(IvyPatternHelper.ORGANISATION_KEY, convertM2OrganizationForResourceSearch((String) obj));
        }
    }
}
