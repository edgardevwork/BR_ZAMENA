package org.apache.ivy.core.retrieve;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.event.retrieve.EndRetrieveArtifactEvent;
import org.apache.ivy.core.event.retrieve.EndRetrieveEvent;
import org.apache.ivy.core.event.retrieve.StartRetrieveArtifactEvent;
import org.apache.ivy.core.event.retrieve.StartRetrieveEvent;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.pack.PackagingManager;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.plugins.report.XmlReportParser;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.Message;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes5.dex */
public class RetrieveEngine {
    public static final int KILO = 1024;
    public EventManager eventManager;
    public RetrieveEngineSettings settings;

    public RetrieveEngine(RetrieveEngineSettings retrieveEngineSettings, EventManager eventManager) {
        this.settings = retrieveEngineSettings;
        this.eventManager = eventManager;
    }

    @Deprecated
    public int retrieve(ModuleRevisionId moduleRevisionId, String str, RetrieveOptions retrieveOptions) throws IOException {
        RetrieveOptions retrieveOptions2 = new RetrieveOptions(retrieveOptions);
        retrieveOptions2.setDestArtifactPattern(str);
        return retrieve(moduleRevisionId, retrieveOptions2).getNbrArtifactsCopied();
    }

    public RetrieveReport retrieve(ModuleRevisionId moduleRevisionId, RetrieveOptions retrieveOptions) throws IOException {
        ModuleId moduleId;
        String str;
        boolean zSymlink;
        RetrieveOptions retrieveOptions2 = retrieveOptions;
        RetrieveReport retrieveReport = new RetrieveReport();
        ModuleId moduleId2 = moduleRevisionId.getModuleId();
        String str2 = "";
        if ("default".equals(retrieveOptions.getLog())) {
            StringBuilder sb = new StringBuilder();
            sb.append(":: retrieving :: ");
            sb.append(moduleId2);
            sb.append(retrieveOptions.isSync() ? " [sync]" : "");
            Message.info(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":: retrieving :: ");
            sb2.append(moduleId2);
            sb2.append(retrieveOptions.isSync() ? " [sync]" : "");
            Message.verbose(sb2.toString());
        }
        Message.verbose("\tcheckUpToDate=" + this.settings.isCheckUpToDate());
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strSubstituteVariables = IvyPatternHelper.substituteVariables(retrieveOptions.getDestArtifactPattern(), this.settings.getVariables());
        String strSubstituteVariables2 = IvyPatternHelper.substituteVariables(retrieveOptions.getDestIvyPattern(), this.settings.getVariables());
        String[] confs = getConfs(moduleRevisionId, retrieveOptions);
        if ("default".equals(retrieveOptions.getLog())) {
            Message.info("\tconfs: " + Arrays.asList(confs));
        } else {
            Message.verbose("\tconfs: " + Arrays.asList(confs));
        }
        EventManager eventManager = this.eventManager;
        if (eventManager != null) {
            eventManager.fireIvyEvent(new StartRetrieveEvent(moduleRevisionId, confs, retrieveOptions2));
        }
        try {
            Map<ArtifactDownloadReport, Set<String>> mapDetermineArtifactsToCopy = determineArtifactsToCopy(moduleRevisionId, strSubstituteVariables, retrieveOptions2);
            File fileResolveFile = this.settings.resolveFile(IvyPatternHelper.getTokenRoot(strSubstituteVariables));
            retrieveReport.setRetrieveRoot(fileResolveFile);
            File fileResolveFile2 = strSubstituteVariables2 == null ? null : this.settings.resolveFile(IvyPatternHelper.getTokenRoot(strSubstituteVariables2));
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Iterator<Map.Entry<ArtifactDownloadReport, Set<String>>> it = mapDetermineArtifactsToCopy.entrySet().iterator();
            long fileLength = 0;
            while (it.hasNext()) {
                Map.Entry<ArtifactDownloadReport, Set<String>> next = it.next();
                String str3 = str2;
                ArtifactDownloadReport key = next.getKey();
                File localFile = key.getLocalFile();
                if (key.getUnpackedLocalFile() != null) {
                    localFile = key.getUnpackedLocalFile();
                }
                Iterator<Map.Entry<ArtifactDownloadReport, Set<String>>> it2 = it;
                File file = localFile;
                if (file == null) {
                    Message.verbose("\tno local file available for " + key + ": skipping");
                    str2 = str3;
                    it = it2;
                } else {
                    moduleId = moduleId2;
                    try {
                        StringBuilder sb3 = new StringBuilder();
                        String[] strArr = confs;
                        sb3.append("\tretrieving ");
                        sb3.append(file);
                        Message.verbose(sb3.toString());
                        Iterator<String> it3 = next.getValue().iterator();
                        while (it3.hasNext()) {
                            String next2 = it3.next();
                            IvyContext.getContext().checkInterrupted();
                            File fileResolveFile3 = this.settings.resolveFile(next2);
                            Iterator<String> it4 = it3;
                            if (!this.settings.isCheckUpToDate() || !upToDate(file, fileResolveFile3, retrieveOptions2)) {
                                Message.verbose("\t\tto " + fileResolveFile3);
                                EventManager eventManager2 = this.eventManager;
                                if (eventManager2 != null) {
                                    eventManager2.fireIvyEvent(new StartRetrieveArtifactEvent(key, fileResolveFile3));
                                }
                                if (retrieveOptions.isMakeSymlinks()) {
                                    try {
                                        zSymlink = FileUtil.symlink(file, fileResolveFile3, true);
                                    } catch (IOException e) {
                                        Message.warn("symlink creation failed at path " + fileResolveFile3, e);
                                        zSymlink = false;
                                    }
                                    if (!zSymlink) {
                                        Message.info("Attempting a copy operation (since symlink creation failed) at path " + fileResolveFile3);
                                        FileUtil.copy(file, fileResolveFile3, (CopyProgressListener) null, true);
                                    }
                                } else {
                                    FileUtil.copy(file, fileResolveFile3, (CopyProgressListener) null, true);
                                }
                                EventManager eventManager3 = this.eventManager;
                                if (eventManager3 != null) {
                                    eventManager3.fireIvyEvent(new EndRetrieveArtifactEvent(key, fileResolveFile3));
                                }
                                fileLength += FileUtil.getFileLength(fileResolveFile3);
                                retrieveReport.addCopiedFile(fileResolveFile3, key);
                            } else {
                                Message.verbose("\t\tto " + fileResolveFile3 + " [NOT REQUIRED]");
                                retrieveReport.addUpToDateFile(fileResolveFile3, key);
                            }
                            if (ClientConfigurationFields.IVY.equals(key.getType())) {
                                hashSet2.addAll(FileUtil.getPathFiles(fileResolveFile2, fileResolveFile3));
                            } else {
                                Iterator<File> it5 = FileUtil.listAll(fileResolveFile3, Collections.emptyList()).iterator();
                                while (it5.hasNext()) {
                                    hashSet.addAll(FileUtil.getPathFiles(fileResolveFile, it5.next()));
                                }
                            }
                            retrieveOptions2 = retrieveOptions;
                            it3 = it4;
                        }
                        retrieveOptions2 = retrieveOptions;
                        moduleId2 = moduleId;
                        str2 = str3;
                        it = it2;
                        confs = strArr;
                    } catch (Exception e2) {
                        e = e2;
                        throw new RuntimeException("problem during retrieve of " + moduleId + ": " + e, e);
                    }
                }
            }
            String str4 = str2;
            String[] strArr2 = confs;
            moduleId = moduleId2;
            if (retrieveOptions.isSync()) {
                Message.verbose("\tsyncing...");
                List listAsList = Arrays.asList(this.settings.getIgnorableFilenames());
                Collection<File> collectionListAll = FileUtil.listAll(fileResolveFile, listAsList);
                Collection<File> collectionListAll2 = fileResolveFile2 == null ? null : FileUtil.listAll(fileResolveFile2, listAsList);
                if (fileResolveFile.equals(fileResolveFile2)) {
                    hashSet.addAll(hashSet2);
                    collectionListAll.addAll(collectionListAll2);
                    sync(hashSet, collectionListAll);
                } else {
                    sync(hashSet, collectionListAll);
                    if (collectionListAll2 != null) {
                        sync(hashSet2, collectionListAll2);
                    }
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("\t");
            sb4.append(retrieveReport.getNbrArtifactsCopied());
            sb4.append(" artifacts copied");
            if (this.settings.isCheckUpToDate()) {
                str = ", " + retrieveReport.getNbrArtifactsUpToDate() + " already retrieved";
            } else {
                str = str4;
            }
            sb4.append(str);
            sb4.append(" (");
            sb4.append(fileLength / 1024);
            sb4.append("kB/");
            sb4.append(jCurrentTimeMillis2);
            sb4.append("ms)");
            String string = sb4.toString();
            if ("default".equals(retrieveOptions.getLog())) {
                Message.info(string);
            } else {
                Message.verbose(string);
            }
            Message.verbose("\tretrieve done (" + jCurrentTimeMillis2 + "ms)");
            EventManager eventManager4 = this.eventManager;
            if (eventManager4 != null) {
                eventManager4.fireIvyEvent(new EndRetrieveEvent(moduleRevisionId, strArr2, jCurrentTimeMillis2, retrieveReport.getNbrArtifactsCopied(), retrieveReport.getNbrArtifactsUpToDate(), fileLength, retrieveOptions));
            }
            return retrieveReport;
        } catch (Exception e3) {
            e = e3;
            moduleId = moduleId2;
        }
    }

    public final String[] getConfs(ModuleRevisionId moduleRevisionId, RetrieveOptions retrieveOptions) throws IOException {
        String[] confs = retrieveOptions.getConfs();
        if (confs != null && (confs.length != 1 || !"*".equals(confs[0]))) {
            return confs;
        }
        try {
            ModuleDescriptor resolvedModuleDescriptor = getCache().getResolvedModuleDescriptor(moduleRevisionId);
            Message.verbose("no explicit confs given for retrieve, using ivy file: " + resolvedModuleDescriptor.getResource().getName());
            String[] configurationsNames = resolvedModuleDescriptor.getConfigurationsNames();
            retrieveOptions.setConfs(configurationsNames);
            return configurationsNames;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.getMessage(), e2);
        }
    }

    public final ResolutionCacheManager getCache() {
        return this.settings.getResolutionCacheManager();
    }

    public final void sync(Collection<File> collection, Collection<File> collection2) {
        HashSet<File> hashSet = new HashSet();
        Iterator<File> it = collection2.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getAbsoluteFile());
        }
        Iterator<File> it2 = collection.iterator();
        while (it2.hasNext()) {
            hashSet.remove(it2.next().getAbsoluteFile());
        }
        for (File file : hashSet) {
            if (file.exists()) {
                Message.verbose("\t\tdeleting " + file);
                FileUtil.forceDelete(file);
            }
        }
    }

    public Map<ArtifactDownloadReport, Set<String>> determineArtifactsToCopy(ModuleRevisionId moduleRevisionId, String str, RetrieveOptions retrieveOptions) throws IOException, ParseException {
        String[] strArr;
        String str2;
        Artifact unpackedArtifact;
        String ext;
        File file;
        File file2;
        Set hashSet;
        Set hashSet2;
        Set hashSet3;
        RetrieveEngine retrieveEngine = this;
        ModuleId moduleId = moduleRevisionId.getModuleId();
        if (retrieveOptions.getResolveId() == null) {
            retrieveOptions.setResolveId(ResolveOptions.getDefaultResolveId(moduleId));
        }
        ResolutionCacheManager cache = getCache();
        String[] confs = retrieveEngine.getConfs(moduleRevisionId, retrieveOptions);
        String strSubstituteVariables = IvyPatternHelper.substituteVariables(retrieveOptions.getDestIvyPattern(), retrieveEngine.settings.getVariables());
        File fileResolveFile = retrieveEngine.settings.resolveFile(IvyPatternHelper.getTokenRoot(str));
        File fileResolveFile2 = strSubstituteVariables == null ? null : retrieveEngine.settings.resolveFile(IvyPatternHelper.getTokenRoot(strSubstituteVariables));
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        XmlReportParser xmlReportParser = new XmlReportParser();
        int length = confs.length;
        int i = 0;
        while (i < length) {
            String str3 = confs[i];
            xmlReportParser.parse(cache.getConfigurationResolveReportInCache(retrieveOptions.getResolveId(), str3));
            ResolutionCacheManager resolutionCacheManager = cache;
            ArrayList arrayList = new ArrayList(Arrays.asList(xmlReportParser.getArtifactReports()));
            if (strSubstituteVariables != null) {
                ModuleRevisionId[] realDependencyRevisionIds = xmlReportParser.getRealDependencyRevisionIds();
                strArr = confs;
                str2 = strSubstituteVariables;
                int i2 = 0;
                for (int length2 = realDependencyRevisionIds.length; i2 < length2; length2 = length2) {
                    arrayList.add(xmlReportParser.getMetadataArtifactReport(realDependencyRevisionIds[i2]));
                    i2++;
                }
            } else {
                strArr = confs;
                str2 = strSubstituteVariables;
            }
            PackagingManager packagingManager = new PackagingManager();
            packagingManager.setSettings(IvyContext.getContext().getSettings());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArtifactDownloadReport artifactDownloadReport = (ArtifactDownloadReport) it.next();
                Artifact artifact = artifactDownloadReport.getArtifact();
                if (artifactDownloadReport.getUnpackedLocalFile() == null) {
                    ext = artifact.getExt();
                } else {
                    if (artifactDownloadReport.getUnpackedArtifact() != null) {
                        unpackedArtifact = artifactDownloadReport.getUnpackedArtifact();
                    } else {
                        unpackedArtifact = packagingManager.getUnpackedArtifact(artifact);
                    }
                    if (unpackedArtifact == null) {
                        throw new RuntimeException("Could not determine unpacked artifact for " + artifact + " while determining artifacts to copy for module " + moduleRevisionId);
                    }
                    ext = unpackedArtifact.getExt();
                }
                Iterator it2 = it;
                String str4 = ext;
                PackagingManager packagingManager2 = packagingManager;
                String str5 = ClientConfigurationFields.IVY.equals(artifactDownloadReport.getType()) ? str2 : str;
                if (ClientConfigurationFields.IVY.equals(artifactDownloadReport.getType())) {
                    file2 = fileResolveFile;
                    file = fileResolveFile2;
                } else {
                    file = fileResolveFile;
                    file2 = file;
                }
                if (ClientConfigurationFields.IVY.equals(artifactDownloadReport.getType()) || retrieveOptions.getArtifactFilter().accept(artifactDownloadReport.getArtifact())) {
                    ModuleRevisionId moduleRevisionId2 = artifact.getModuleRevisionId();
                    String strSubstitute = IvyPatternHelper.substitute(str5, moduleRevisionId2.getOrganisation(), moduleRevisionId2.getName(), moduleRevisionId2.getBranch(), moduleRevisionId2.getRevision(), artifact.getName(), artifact.getType(), str4, str3, artifactDownloadReport.getArtifactOrigin(), moduleRevisionId2.getQualifiedExtraAttributes(), artifact.getQualifiedExtraAttributes());
                    Set hashSet4 = (Set) map.get(artifactDownloadReport);
                    if (hashSet4 == null) {
                        hashSet4 = new HashSet();
                        map.put(artifactDownloadReport, hashSet4);
                    }
                    File file3 = fileResolveFile2;
                    File absoluteFile = retrieveEngine.settings.resolveFile(strSubstitute).getAbsoluteFile();
                    if (file == null || FileUtil.isLeadingPath(file, absoluteFile)) {
                        String path = absoluteFile.getPath();
                        int i3 = 0;
                        String[] strArrMapFileName = {path};
                        if (retrieveOptions.getMapper() != null) {
                            strArrMapFileName = retrieveOptions.getMapper().mapFileName(path);
                        }
                        int length3 = strArrMapFileName.length;
                        while (i3 < length3) {
                            String str6 = strArrMapFileName[i3];
                            hashSet4.add(str6);
                            Set set = (Set) map2.get(str6);
                            Set set2 = (Set) map3.get(str6);
                            Set set3 = (Set) map4.get(str6);
                            int i4 = length3;
                            if (set == null) {
                                hashSet = new HashSet();
                                map2.put(str6, hashSet);
                            } else {
                                hashSet = set;
                            }
                            Set set4 = hashSet4;
                            if (set2 == null) {
                                hashSet2 = new HashSet();
                                map3.put(str6, hashSet2);
                            } else {
                                hashSet2 = set2;
                            }
                            String[] strArr2 = strArrMapFileName;
                            if (set3 == null) {
                                hashSet3 = new HashSet();
                                map4.put(str6, hashSet3);
                            } else {
                                hashSet3 = set3;
                            }
                            if (hashSet.add(artifact.getId())) {
                                hashSet2.add(artifactDownloadReport);
                                hashSet3.add(str3);
                            }
                            i3++;
                            hashSet4 = set4;
                            strArrMapFileName = strArr2;
                            length3 = i4;
                        }
                        retrieveEngine = this;
                    } else {
                        Message.warn("not retrieving artifact " + artifact + " as its destination " + absoluteFile + " is not inside " + file);
                    }
                    fileResolveFile2 = file3;
                }
                it = it2;
                packagingManager = packagingManager2;
                fileResolveFile = file2;
            }
            i++;
            retrieveEngine = this;
            cache = resolutionCacheManager;
            confs = strArr;
            strSubstituteVariables = str2;
        }
        for (Map.Entry entry : map2.entrySet()) {
            String str7 = (String) entry.getKey();
            Set set5 = (Set) entry.getValue();
            Set set6 = (Set) map4.get(str7);
            if (set5.size() > 1) {
                ArrayList arrayList2 = new ArrayList((Collection) map3.get(str7));
                Collections.sort(arrayList2, getConflictResolvingPolicy());
                ModuleRevisionId moduleRevisionId3 = ((ArtifactDownloadReport) arrayList2.get(arrayList2.size() - 1)).getArtifact().getModuleRevisionId();
                for (int size = arrayList2.size() - 2; size >= 0; size--) {
                    if (moduleRevisionId3.equals(((ArtifactDownloadReport) arrayList2.get(size)).getArtifact().getModuleRevisionId())) {
                        throw new RuntimeException("Multiple artifacts of the module " + moduleRevisionId3 + " are retrieved to the same file! Update the retrieve pattern to fix this error.");
                    }
                }
                Message.info("\tconflict on " + str7 + " in " + set6 + ": " + moduleRevisionId3.getRevision() + " won");
                for (int size2 = arrayList2.size() + (-2); size2 >= 0; size2--) {
                    ArtifactDownloadReport artifactDownloadReport2 = (ArtifactDownloadReport) arrayList2.get(size2);
                    Message.verbose("\t\tremoving conflict looser artifact: " + artifactDownloadReport2.getArtifact());
                    Set set7 = (Set) map.get(artifactDownloadReport2);
                    set7.remove(str7);
                    if (set7.isEmpty()) {
                        map.remove(artifactDownloadReport2);
                    }
                }
            }
        }
        return map;
    }

    public final boolean upToDate(File file, File file2, RetrieveOptions retrieveOptions) {
        if (!file2.exists()) {
            return false;
        }
        String overwriteMode = retrieveOptions.getOverwriteMode();
        if (RetrieveOptions.OVERWRITEMODE_ALWAYS.equals(overwriteMode)) {
            return false;
        }
        if (RetrieveOptions.OVERWRITEMODE_NEVER.equals(overwriteMode)) {
            return true;
        }
        return RetrieveOptions.OVERWRITEMODE_NEWER.equals(overwriteMode) ? file.lastModified() <= file2.lastModified() : RetrieveOptions.OVERWRITEMODE_DIFFERENT.equals(overwriteMode) && file.lastModified() == file2.lastModified();
    }

    public final Comparator<ArtifactDownloadReport> getConflictResolvingPolicy() {
        return new Comparator<ArtifactDownloadReport>() { // from class: org.apache.ivy.core.retrieve.RetrieveEngine.1
            @Override // java.util.Comparator
            public int compare(ArtifactDownloadReport artifactDownloadReport, ArtifactDownloadReport artifactDownloadReport2) {
                Artifact artifact = artifactDownloadReport.getArtifact();
                Artifact artifact2 = artifactDownloadReport2.getArtifact();
                if (artifact.getPublicationDate().after(artifact2.getPublicationDate())) {
                    return 1;
                }
                return artifact.getPublicationDate().before(artifact2.getPublicationDate()) ? -1 : 0;
            }
        };
    }
}
