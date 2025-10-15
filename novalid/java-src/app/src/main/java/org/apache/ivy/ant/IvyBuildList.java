package org.apache.ivy.ant;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.core.sort.SortOptions;
import org.apache.ivy.osgi.obr.xml.OBRXMLParser;
import org.apache.ivy.plugins.matcher.MapMatcher;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.parser.ModuleDescriptorParserRegistry;
import org.apache.ivy.util.Message;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.Path;

/* loaded from: classes7.dex */
public class IvyBuildList extends IvyTask {
    public static final String DESCRIPTOR_REQUIRED = "required";
    public String ivyFilePath;
    public String reference;
    public List<FileSet> buildFileSets = new ArrayList();
    public boolean haltOnError = true;
    public String onMissingDescriptor = "head";
    public boolean reverse = false;
    public String root = "*";
    public List<BuildListModule> roots = new ArrayList();
    public boolean excludeRoot = false;
    public String leaf = "*";
    public List<BuildListModule> leafs = new ArrayList();
    public String delimiter = ",";
    public boolean excludeLeaf = false;
    public boolean onlydirectdep = false;
    public String restartFrom = "*";

    public static final class OnMissingDescriptor {
        public static final String FAIL = "fail";
        public static final String HEAD = "head";
        public static final String SKIP = "skip";
        public static final String TAIL = "tail";
        public static final String WARN = "warn";
    }

    public static final class BuildListModule {
        public String branch;
        public File file;
        public String module;
        public String organisation;
        public String revision;

        public String getOrganisation() {
            return this.organisation;
        }

        public void setOrganisation(String str) {
            this.organisation = str;
        }

        public String getModule() {
            return this.module;
        }

        public void setModule(String str) {
            this.module = str;
        }

        public String getRevision() {
            return this.revision;
        }

        public void setRevision(String str) {
            this.revision = str;
        }

        public String getBranch() {
            return this.branch;
        }

        public void setBranch(String str) {
            this.branch = str;
        }

        public File getFile() {
            return this.file;
        }

        public void setFile(File file) {
            this.file = file;
        }
    }

    public void addFileset(FileSet fileSet) {
        this.buildFileSets.add(fileSet);
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String str) {
        this.reference = str;
    }

    public String getRoot() {
        return this.root;
    }

    public void setRoot(String str) {
        this.root = str;
    }

    public BuildListModule createRoot() {
        BuildListModule buildListModule = new BuildListModule();
        this.roots.add(buildListModule);
        return buildListModule;
    }

    public boolean isExcludeRoot() {
        return this.excludeRoot;
    }

    public void setExcludeRoot(boolean z) {
        this.excludeRoot = z;
    }

    public String getLeaf() {
        return this.leaf;
    }

    public void setLeaf(String str) {
        this.leaf = str;
    }

    public BuildListModule createLeaf() {
        BuildListModule buildListModule = new BuildListModule();
        this.leafs.add(buildListModule);
        return buildListModule;
    }

    public boolean isExcludeLeaf() {
        return this.excludeLeaf;
    }

    public void setExcludeLeaf(boolean z) {
        this.excludeLeaf = z;
    }

    public String getDelimiter() {
        return this.delimiter;
    }

    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    public boolean getOnlydirectdep() {
        return this.onlydirectdep;
    }

    public void setOnlydirectdep(boolean z) {
        this.onlydirectdep = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws MalformedURLException, BuildException {
        Path path;
        DirectoryScanner directoryScanner;
        IvySettings ivySettings;
        HashMap map;
        if (this.reference == null) {
            throw new BuildException("reference should be provided in ivy build list");
        }
        if (this.buildFileSets.isEmpty()) {
            throw new BuildException("at least one nested fileset should be provided in ivy build list");
        }
        Ivy ivyInstance = getIvyInstance();
        IvySettings settings = ivyInstance.getSettings();
        this.ivyFilePath = getProperty(this.ivyFilePath, settings, "ivy.buildlist.ivyfilepath");
        Path path2 = new Path(getProject());
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Collection<ModuleDescriptor> arrayList3 = new ArrayList<>();
        Set<MapMatcher> setConvert = convert(this.roots, this.root, settings);
        Set<MapMatcher> setConvert2 = convert(this.leafs, this.leaf, settings);
        Set<MapMatcher> setConvert3 = convert(Collections.emptyList(), this.restartFrom, settings);
        Iterator<FileSet> it = this.buildFileSets.iterator();
        while (it.hasNext()) {
            DirectoryScanner directoryScanner2 = it.next().getDirectoryScanner(getProject());
            String[] includedFiles = directoryScanner2.getIncludedFiles();
            int length = includedFiles.length;
            Iterator<FileSet> it2 = it;
            int i = 0;
            while (i < length) {
                int i2 = length;
                String[] strArr = includedFiles;
                File file = new File(directoryScanner2.getBasedir(), includedFiles[i]);
                File ivyFileFor = getIvyFileFor(file);
                if (!ivyFileFor.exists()) {
                    onMissingDescriptor(file, ivyFileFor, arrayList2);
                    ivySettings = settings;
                    path = path2;
                    map = map2;
                    directoryScanner = directoryScanner2;
                } else {
                    try {
                        directoryScanner = directoryScanner2;
                        try {
                            path = path2;
                        } catch (Exception e) {
                            e = e;
                            path = path2;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        path = path2;
                        directoryScanner = directoryScanner2;
                    }
                    try {
                        ModuleDescriptor descriptor = ModuleDescriptorParserRegistry.getInstance().parseDescriptor(settings, ivyFileFor.toURI().toURL(), doValidate(settings));
                        map2.put(descriptor, file);
                        arrayList3.add(descriptor);
                        Message.debug("Add " + descriptor.getModuleRevisionId().getModuleId());
                        ivySettings = settings;
                        map = map2;
                    } catch (Exception e3) {
                        e = e3;
                        ivySettings = settings;
                        map = map2;
                        if (this.haltOnError) {
                            throw new BuildException("impossible to parse ivy file for " + file + ": ivyfile=" + ivyFileFor + " exception=" + e, e);
                        }
                        Message.warn("impossible to parse ivy file for " + file + ": ivyfile=" + ivyFileFor + " exception=" + e.getMessage());
                        Message.info("\t=> adding it at the beginning of the path");
                        arrayList.add(file);
                        i++;
                        length = i2;
                        includedFiles = strArr;
                        path2 = path;
                        directoryScanner2 = directoryScanner;
                        settings = ivySettings;
                        map2 = map;
                    }
                }
                i++;
                length = i2;
                includedFiles = strArr;
                path2 = path;
                directoryScanner2 = directoryScanner;
                settings = ivySettings;
                map2 = map;
            }
            it = it2;
        }
        Path path3 = path2;
        Map map3 = map2;
        List<ModuleDescriptor> listFindModuleDescriptors = findModuleDescriptors(arrayList3, setConvert2, "leaf");
        List<ModuleDescriptor> listFindModuleDescriptors2 = findModuleDescriptors(arrayList3, setConvert, "root");
        List<ModuleDescriptor> listFindModuleDescriptors3 = findModuleDescriptors(arrayList3, setConvert3, "restartFrom");
        if (!listFindModuleDescriptors2.isEmpty()) {
            Message.info("Filtering modules based on roots [" + extractModuleNames(setConvert) + "]");
            arrayList3 = filterModulesFromRoot(arrayList3, listFindModuleDescriptors2);
        }
        if (!listFindModuleDescriptors.isEmpty()) {
            Message.info("Filtering modules based on leafs [" + extractModuleNames(setConvert2) + "]");
            arrayList3 = filterModulesFromLeaf(arrayList3, listFindModuleDescriptors);
        }
        List<ModuleDescriptor> listSortModuleDescriptors = ivyInstance.sortModuleDescriptors(arrayList3, SortOptions.DEFAULT);
        if (!OnMissingDescriptor.TAIL.equals(this.onMissingDescriptor)) {
            Iterator<File> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                addBuildFile(path3, it3.next());
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            addBuildFile(path3, (File) it4.next());
        }
        if (isReverse()) {
            Collections.reverse(listSortModuleDescriptors);
        }
        if (!listFindModuleDescriptors3.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            ModuleDescriptor moduleDescriptor = listFindModuleDescriptors3.get(0);
            boolean z = false;
            for (ModuleDescriptor moduleDescriptor2 : listSortModuleDescriptors) {
                if (moduleDescriptor2.equals(moduleDescriptor)) {
                    z = true;
                }
                if (z) {
                    arrayList4.add(moduleDescriptor2);
                }
            }
            listSortModuleDescriptors = arrayList4;
        }
        StringBuilder sb = new StringBuilder();
        for (ModuleDescriptor moduleDescriptor3 : listSortModuleDescriptors) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(moduleDescriptor3.getModuleRevisionId().getModuleId());
            addBuildFile(path3, (File) map3.get(moduleDescriptor3));
        }
        if (OnMissingDescriptor.TAIL.equals(this.onMissingDescriptor)) {
            Iterator<File> it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                addBuildFile(path3, it5.next());
            }
        }
        getProject().addReference(getReference(), path3);
        getProject().setProperty("ivy.sorted.modules", sb.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public final Set<MapMatcher> convert(List<BuildListModule> list, String str, IvySettings ivySettings) throws BuildException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<BuildListModule> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BuildListModule next = it.next();
            File file = next.getFile();
            if (file == null) {
                String organisation = next.getOrganisation();
                String module = next.getModule();
                String revision = next.getRevision();
                String branch = next.getBranch();
                HashMap map = new HashMap();
                if (organisation == null) {
                    organisation = "*";
                }
                map.put(IvyPatternHelper.ORGANISATION_KEY, organisation);
                if (module == null) {
                    module = "*";
                }
                map.put("module", module);
                if (revision == null) {
                    revision = "*";
                }
                map.put("module", revision);
                map.put("module", branch != null ? branch : "*");
                linkedHashSet.add(new MapMatcher(map, ivySettings.getMatcher(PatternMatcher.EXACT)));
            } else {
                try {
                    ModuleDescriptor descriptor = ModuleDescriptorParserRegistry.getInstance().parseDescriptor(ivySettings, file.toURI().toURL(), doValidate(ivySettings));
                    HashMap map2 = new HashMap();
                    map2.putAll(descriptor.getModuleRevisionId().getAttributes());
                    map2.put(OBRXMLParser.ResourceHandler.RESOURCE, descriptor.getResource().getName());
                    linkedHashSet.add(new MapMatcher(map2, ivySettings.getMatcher(PatternMatcher.EXACT)));
                } catch (Exception e) {
                    throw new BuildException(e);
                }
            }
        }
        if (!"*".equals(str)) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, getDelimiter());
            while (stringTokenizer.hasMoreTokens()) {
                HashMap map3 = new HashMap();
                map3.put("module", stringTokenizer.nextToken());
                linkedHashSet.add(new MapMatcher(map3, ivySettings.getMatcher(PatternMatcher.EXACT)));
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public final void onMissingDescriptor(File file, File file2, List<File> list) throws BuildException {
        String str = this.onMissingDescriptor;
        str.hashCode();
        switch (str) {
            case "fail":
                throw new BuildException("a module has no module descriptor and onMissingDescriptor=fail. Build file: " + file + ". Expected descriptor: " + file2);
            case "skip":
                Message.debug("skipping " + file + ": descriptor " + file2 + " doesn't exist");
                return;
            case "warn":
                Message.warn("a module has no module descriptor. Build file: " + file + ". Expected descriptor: " + file2);
                break;
        }
        String str2 = this.onMissingDescriptor;
        String str3 = OnMissingDescriptor.TAIL;
        if (!OnMissingDescriptor.TAIL.equals(str2)) {
            str3 = "head";
        }
        Message.verbose(String.format("no descriptor for %s: descriptor=%s: adding it at the %s of the path", file, file2, str3));
        Message.verbose("\t(change onMissingDescriptor if you want to take another action");
        list.add(file);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public final List<ModuleDescriptor> findModuleDescriptors(Collection<ModuleDescriptor> collection, Set<MapMatcher> set, String str) throws BuildException {
        ArrayList arrayList = new ArrayList();
        Set<MapMatcher> hashSet = new HashSet<>(set);
        for (ModuleDescriptor moduleDescriptor : collection) {
            HashMap map = new HashMap();
            map.putAll(moduleDescriptor.getAttributes());
            map.put(OBRXMLParser.ResourceHandler.RESOURCE, moduleDescriptor.getResource().getName());
            for (MapMatcher mapMatcher : set) {
                if (mapMatcher.matches(map)) {
                    hashSet.remove(mapMatcher);
                    arrayList.add(moduleDescriptor);
                }
            }
        }
        if (hashSet.isEmpty()) {
            return arrayList;
        }
        throw new BuildException("unable to find " + str + " module(s) " + extractModuleNames(hashSet) + " in build fileset");
    }

    public final String extractModuleNames(Set<MapMatcher> set) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (MapMatcher mapMatcher : set) {
            sb.append(str);
            Map<String, String> attributes = mapMatcher.getAttributes();
            String str2 = attributes.get(IvyPatternHelper.ORGANISATION_KEY);
            if (str2 != null && !"*".equals(str2)) {
                sb.append(str2);
                sb.append('#');
            }
            sb.append(attributes.get("module"));
            str = ", ";
        }
        return sb.toString();
    }

    public final Collection<ModuleDescriptor> filterModulesFromRoot(Collection<ModuleDescriptor> collection, List<ModuleDescriptor> list) {
        HashMap map = new HashMap();
        for (ModuleDescriptor moduleDescriptor : collection) {
            map.put(moduleDescriptor.getModuleRevisionId().getModuleId(), moduleDescriptor);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ModuleDescriptor moduleDescriptor2 : list) {
            processFilterNodeFromRoot(moduleDescriptor2, linkedHashSet, map);
            if (this.excludeRoot) {
                Message.verbose("Excluded module " + moduleDescriptor2.getModuleRevisionId().getModuleId().getName());
            } else {
                linkedHashSet.add(moduleDescriptor2);
            }
        }
        Iterator<ModuleDescriptor> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Message.verbose("Kept module " + it.next().getModuleRevisionId().getModuleId().getName());
        }
        return linkedHashSet;
    }

    public final void processFilterNodeFromRoot(ModuleDescriptor moduleDescriptor, Set<ModuleDescriptor> set, Map<ModuleId, ModuleDescriptor> map) {
        for (DependencyDescriptor dependencyDescriptor : moduleDescriptor.getDependencies()) {
            ModuleDescriptor moduleDescriptor2 = map.get(dependencyDescriptor.getDependencyId());
            if (moduleDescriptor2 != null && !set.contains(moduleDescriptor2)) {
                set.add(moduleDescriptor2);
                if (!getOnlydirectdep()) {
                    processFilterNodeFromRoot(moduleDescriptor2, set, map);
                }
            }
        }
    }

    public final Collection<ModuleDescriptor> filterModulesFromLeaf(Collection<ModuleDescriptor> collection, List<ModuleDescriptor> list) {
        HashMap map = new HashMap();
        for (ModuleDescriptor moduleDescriptor : collection) {
            map.put(moduleDescriptor.getModuleRevisionId().getModuleId(), moduleDescriptor);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ModuleDescriptor moduleDescriptor2 : list) {
            if (this.excludeLeaf) {
                Message.verbose("Excluded module " + moduleDescriptor2.getModuleRevisionId().getModuleId().getName());
            } else {
                linkedHashSet.add(moduleDescriptor2);
            }
            processFilterNodeFromLeaf(moduleDescriptor2, linkedHashSet, map);
        }
        Iterator<ModuleDescriptor> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Message.verbose("Kept module " + it.next().getModuleRevisionId().getModuleId().getName());
        }
        return linkedHashSet;
    }

    public final void processFilterNodeFromLeaf(ModuleDescriptor moduleDescriptor, Set<ModuleDescriptor> set, Map<ModuleId, ModuleDescriptor> map) {
        for (ModuleDescriptor moduleDescriptor2 : map.values()) {
            for (DependencyDescriptor dependencyDescriptor : moduleDescriptor2.getDependencies()) {
                if (moduleDescriptor.getModuleRevisionId().getModuleId().equals(dependencyDescriptor.getDependencyId()) && !set.contains(moduleDescriptor2)) {
                    set.add(moduleDescriptor2);
                    if (!getOnlydirectdep()) {
                        processFilterNodeFromLeaf(moduleDescriptor2, set, map);
                    }
                }
            }
        }
    }

    public final void addBuildFile(Path path, File file) {
        FileSet fileSet = new FileSet();
        fileSet.setFile(file);
        path.addFileset(fileSet);
    }

    public final File getIvyFileFor(File file) {
        return new File(file.getParentFile(), this.ivyFilePath);
    }

    public boolean isHaltonerror() {
        return this.haltOnError;
    }

    public void setHaltonerror(boolean z) {
        this.haltOnError = z;
    }

    public String getIvyfilepath() {
        return this.ivyFilePath;
    }

    public void setIvyfilepath(String str) {
        this.ivyFilePath = str;
    }

    public String getOnMissingDescriptor() {
        return this.onMissingDescriptor;
    }

    public void setOnMissingDescriptor(String str) {
        this.onMissingDescriptor = str;
    }

    @Deprecated
    public boolean isSkipbuildwithoutivy() {
        return "skip".equals(this.onMissingDescriptor);
    }

    @Deprecated
    public void setSkipbuildwithoutivy(boolean z) {
        String str;
        Message.deprecated("skipbuildwithoutivy is deprecated, use onMissingDescriptor instead.");
        if (z) {
            str = "skip";
        } else {
            str = OnMissingDescriptor.FAIL;
        }
        this.onMissingDescriptor = str;
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean z) {
        this.reverse = z;
    }

    public String getRestartFrom() {
        return this.restartFrom;
    }

    public void setRestartFrom(String str) {
        this.restartFrom = str;
    }
}
