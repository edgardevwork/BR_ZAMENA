package org.apache.ivy.core.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.matcher.Matcher;
import org.apache.ivy.plugins.matcher.MatcherHelper;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.namespace.NameSpaceHelper;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.resolver.AbstractResolver;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class SearchEngine {
    public IvySettings settings;

    public SearchEngine(IvySettings ivySettings) {
        this.settings = ivySettings;
    }

    public String[] listTokenValues(String str, Map<String, Object> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<DependencyResolver> it = this.settings.getResolvers().iterator();
        while (it.hasNext()) {
            for (Map<String, String> map2 : it.next().listTokenValues(new String[]{str}, map)) {
                linkedHashSet.add(map2.get(str));
            }
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    public OrganisationEntry[] listOrganisationEntries() {
        HashSet hashSet = new HashSet();
        for (DependencyResolver dependencyResolver : this.settings.getResolvers()) {
            for (Map<String, String> map : dependencyResolver.listTokenValues(new String[]{IvyPatternHelper.ORGANISATION_KEY}, new HashMap())) {
                hashSet.add(new OrganisationEntry(dependencyResolver, map.get(IvyPatternHelper.ORGANISATION_KEY)));
            }
        }
        return (OrganisationEntry[]) hashSet.toArray(new OrganisationEntry[hashSet.size()]);
    }

    public String[] listOrganisations() {
        HashSet hashSet = new HashSet();
        Iterator<DependencyResolver> it = this.settings.getResolvers().iterator();
        while (it.hasNext()) {
            for (Map<String, String> map : it.next().listTokenValues(new String[]{IvyPatternHelper.ORGANISATION_KEY}, new HashMap())) {
                hashSet.add(map.get(IvyPatternHelper.ORGANISATION_KEY));
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public ModuleEntry[] listModuleEntries(OrganisationEntry organisationEntry) {
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        map.put(IvyPatternHelper.ORGANISATION_KEY, organisationEntry.getOrganisation());
        Iterator<DependencyResolver> it = this.settings.getResolvers().iterator();
        while (it.hasNext()) {
            for (Map<String, String> map2 : it.next().listTokenValues(new String[]{"module"}, map)) {
                hashSet.add(new ModuleEntry(organisationEntry, map2.get("module")));
            }
        }
        return (ModuleEntry[]) hashSet.toArray(new ModuleEntry[hashSet.size()]);
    }

    public String[] listModules(String str) {
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        map.put(IvyPatternHelper.ORGANISATION_KEY, str);
        Iterator<DependencyResolver> it = this.settings.getResolvers().iterator();
        while (it.hasNext()) {
            for (Map<String, String> map2 : it.next().listTokenValues(new String[]{"module"}, map)) {
                hashSet.add(map2.get("module"));
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public RevisionEntry[] listRevisionEntries(ModuleEntry moduleEntry) {
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        map.put(IvyPatternHelper.ORGANISATION_KEY, moduleEntry.getOrganisation());
        map.put("module", moduleEntry.getModule());
        Iterator<DependencyResolver> it = this.settings.getResolvers().iterator();
        while (it.hasNext()) {
            for (Map<String, String> map2 : it.next().listTokenValues(new String[]{IvyPatternHelper.REVISION_KEY}, map)) {
                hashSet.add(new RevisionEntry(moduleEntry, map2.get(IvyPatternHelper.REVISION_KEY)));
            }
        }
        return (RevisionEntry[]) hashSet.toArray(new RevisionEntry[hashSet.size()]);
    }

    public String[] listRevisions(String str, String str2) {
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        map.put(IvyPatternHelper.ORGANISATION_KEY, str);
        map.put("module", str2);
        Iterator<DependencyResolver> it = this.settings.getResolvers().iterator();
        while (it.hasNext()) {
            for (Map<String, String> map2 : it.next().listTokenValues(new String[]{IvyPatternHelper.REVISION_KEY}, map)) {
                hashSet.add(map2.get(IvyPatternHelper.REVISION_KEY));
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public ModuleId[] listModules(ModuleId moduleId, PatternMatcher patternMatcher) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        addMatcher(patternMatcher, moduleId.getOrganisation(), map, IvyPatternHelper.ORGANISATION_KEY);
        addMatcher(patternMatcher, moduleId.getName(), map, "module");
        String[] strArr = {IvyPatternHelper.ORGANISATION_KEY, "module"};
        for (DependencyResolver dependencyResolver : this.settings.getResolvers()) {
            for (Map<String, String> map2 : dependencyResolver.listTokenValues(strArr, map)) {
                arrayList.add(NameSpaceHelper.transform(ModuleId.newInstance(map2.get(IvyPatternHelper.ORGANISATION_KEY), map2.get("module")), dependencyResolver.getNamespace().getToSystemTransformer()));
            }
        }
        return (ModuleId[]) arrayList.toArray(new ModuleId[arrayList.size()]);
    }

    public ModuleRevisionId[] listModules(ModuleRevisionId moduleRevisionId, PatternMatcher patternMatcher) {
        String str;
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<String, String> entry : moduleRevisionId.getAttributes().entrySet()) {
            addMatcher(patternMatcher, entry.getValue(), map, entry.getKey());
        }
        String[] strArr = (String[]) moduleRevisionId.getAttributes().keySet().toArray(new String[moduleRevisionId.getAttributes().size()]);
        for (DependencyResolver dependencyResolver : this.settings.getResolvers()) {
            Map<String, String>[] mapArrListTokenValues = dependencyResolver.listTokenValues(strArr, map);
            int length = mapArrListTokenValues.length;
            int i = 0;
            while (i < length) {
                Map<String, String> map2 = mapArrListTokenValues[i];
                String str2 = map2.get(IvyPatternHelper.ORGANISATION_KEY);
                String str3 = map2.get("module");
                String str4 = map2.get(IvyPatternHelper.BRANCH_KEY);
                String str5 = map2.get(IvyPatternHelper.REVISION_KEY);
                HashMap map3 = new HashMap();
                for (String str6 : moduleRevisionId.getQualifiedExtraAttributes().keySet()) {
                    HashMap map4 = map;
                    int iIndexOf = str6.indexOf(58);
                    String[] strArr2 = strArr;
                    if (iIndexOf == -1) {
                        str = map2.get(str6);
                    } else {
                        str = map2.get(str6.substring(iIndexOf + 1));
                    }
                    if (str != null) {
                        map3.put(str6, str);
                    }
                    strArr = strArr2;
                    map = map4;
                }
                arrayList.add(dependencyResolver.getNamespace().getToSystemTransformer().transform(ModuleRevisionId.newInstance(str2, str3, str4, str5, map3)));
                i++;
                map = map;
            }
        }
        return (ModuleRevisionId[]) arrayList.toArray(new ModuleRevisionId[arrayList.size()]);
    }

    public ModuleRevisionId[] listModules(DependencyResolver dependencyResolver, ModuleRevisionId moduleRevisionId, PatternMatcher patternMatcher) {
        String str;
        HashMap map = new HashMap();
        for (Map.Entry<String, String> entry : moduleRevisionId.getAttributes().entrySet()) {
            addMatcher(patternMatcher, entry.getValue(), map, entry.getKey());
        }
        Map<String, String>[] mapArrListTokenValues = dependencyResolver.listTokenValues((String[]) moduleRevisionId.getAttributes().keySet().toArray(new String[moduleRevisionId.getAttributes().size()]), map);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map<String, String> map2 : mapArrListTokenValues) {
            String str2 = map2.get(IvyPatternHelper.ORGANISATION_KEY);
            String str3 = map2.get("module");
            String str4 = map2.get(IvyPatternHelper.BRANCH_KEY);
            String str5 = map2.get(IvyPatternHelper.REVISION_KEY);
            HashMap map3 = new HashMap();
            for (String str6 : moduleRevisionId.getQualifiedExtraAttributes().keySet()) {
                int iIndexOf = str6.indexOf(58);
                if (iIndexOf == -1) {
                    str = map2.get(str6);
                } else {
                    str = map2.get(str6.substring(iIndexOf + 1));
                }
                if (str != null) {
                    map3.put(str6, str);
                }
            }
            linkedHashSet.add(dependencyResolver.getNamespace().getToSystemTransformer().transform(ModuleRevisionId.newInstance(str2, str3, str4, str5, map3)));
        }
        return (ModuleRevisionId[]) linkedHashSet.toArray(new ModuleRevisionId[linkedHashSet.size()]);
    }

    public final void addMatcher(PatternMatcher patternMatcher, String str, Map<String, Object> map, String str2) {
        if (str == null) {
            return;
        }
        Matcher matcher = patternMatcher.getMatcher(str);
        if (matcher.isExact()) {
            map.put(str2, str);
        } else {
            map.put(str2, matcher);
        }
    }

    public Collection<ModuleRevisionId> findModuleRevisionIds(DependencyResolver dependencyResolver, ModuleRevisionId moduleRevisionId, PatternMatcher patternMatcher) {
        DependencyResolver dependencyResolver2 = dependencyResolver;
        ArrayList arrayList = new ArrayList();
        String name = dependencyResolver.getName();
        Message.verbose("looking for modules matching " + moduleRevisionId + " using " + patternMatcher.getName());
        Namespace namespace = dependencyResolver2 instanceof AbstractResolver ? dependencyResolver.getNamespace() : null;
        ArrayList<ModuleEntry> arrayList2 = new ArrayList();
        OrganisationEntry[] organisationEntryArrListOrganisations = dependencyResolver.listOrganisations();
        if (organisationEntryArrListOrganisations == null || organisationEntryArrListOrganisations.length == 0) {
            String organisation = moduleRevisionId.getOrganisation();
            if (namespace != null) {
                organisation = NameSpaceHelper.transform(moduleRevisionId.getModuleId(), namespace.getFromSystemTransformer()).getOrganisation();
            }
            arrayList2.addAll(Arrays.asList(dependencyResolver2.listModules(new OrganisationEntry(dependencyResolver2, organisation))));
        } else {
            Matcher matcher = patternMatcher.getMatcher(moduleRevisionId.getOrganisation());
            for (OrganisationEntry organisationEntry : organisationEntryArrListOrganisations) {
                String organisation2 = organisationEntry.getOrganisation();
                if (matcher.matches(namespace == null ? organisation2 : NameSpaceHelper.transformOrganisation(organisation2, namespace.getToSystemTransformer()))) {
                    arrayList2.addAll(Arrays.asList(dependencyResolver2.listModules(new OrganisationEntry(dependencyResolver2, organisation2))));
                }
            }
        }
        Message.debug("found " + arrayList2.size() + " modules for " + moduleRevisionId.getOrganisation() + " on " + name);
        boolean z = false;
        for (ModuleEntry moduleEntry : arrayList2) {
            ModuleId moduleId = new ModuleId(moduleEntry.getOrganisation(), moduleEntry.getModule());
            if (namespace != null) {
                moduleId = NameSpaceHelper.transform(moduleId, namespace.getToSystemTransformer());
            }
            if (MatcherHelper.matches(patternMatcher, moduleRevisionId.getModuleId(), moduleId)) {
                RevisionEntry[] revisionEntryArrListRevisions = dependencyResolver2.listRevisions(moduleEntry);
                Message.debug("found " + revisionEntryArrListRevisions.length + " revisions for [" + moduleEntry.getOrganisation() + ", " + moduleEntry.getModule() + "] on " + name);
                boolean z2 = false;
                for (RevisionEntry revisionEntry : revisionEntryArrListRevisions) {
                    ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(moduleEntry.getOrganisation(), moduleEntry.getModule(), revisionEntry.getRevision());
                    if (namespace != null) {
                        moduleRevisionIdNewInstance = namespace.getToSystemTransformer().transform(moduleRevisionIdNewInstance);
                    }
                    if (MatcherHelper.matches(patternMatcher, moduleRevisionId, moduleRevisionIdNewInstance)) {
                        arrayList.add(moduleRevisionIdNewInstance);
                        z2 = true;
                    }
                }
                if (!z2) {
                    Message.debug("no revision found matching " + moduleRevisionId + " in [" + moduleEntry.getOrganisation() + "," + moduleEntry.getModule() + "] using " + name);
                }
                z = true;
            }
            dependencyResolver2 = dependencyResolver;
        }
        if (!z) {
            Message.debug("no module found matching " + moduleRevisionId + " using " + name);
        }
        return arrayList;
    }
}
