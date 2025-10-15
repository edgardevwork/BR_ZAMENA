package org.jfrog.build.extractor.clientConfiguration.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.search.AqlSearchResult;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.filespecs.aql.AqlConverter;
import org.jfrog.filespecs.entities.Aql;
import org.jfrog.filespecs.entities.FilesGroup;

/* loaded from: classes7.dex */
public class AqlHelper {
    public static final String DELIMITER = "/";
    public static final String ESCAPE_CHAR = "\\";
    public static final String LAST_RELEASE = "LAST_RELEASE";
    public static final String LATEST = "LATEST";
    public ArtifactoryManager artifactoryManager;
    public String buildName;
    public String buildNumber;
    public final FilesGroup filesGroup;
    public Log log;

    public AqlHelper(ArtifactoryManager artifactoryManager, Log log, FilesGroup filesGroup) throws IOException {
        this.artifactoryManager = artifactoryManager;
        this.log = log;
        this.filesGroup = filesGroup;
        buildQueryAdditionalParts();
    }

    public final void buildQueryAdditionalParts() throws IOException {
        String buildName = getBuildName(this.filesGroup.getBuild());
        this.buildName = buildName;
        this.buildNumber = getBuildNumber(this.artifactoryManager, buildName, this.filesGroup.getBuild(), null);
    }

    public List<AqlSearchResult.SearchEntry> run() throws IOException {
        String strConvertFilesGroupToAql;
        List<AqlSearchResult.SearchEntry> arrayList;
        FilesGroup.SpecType specType = this.filesGroup.getSpecType();
        FilesGroup.SpecType specType2 = FilesGroup.SpecType.BUILD;
        if (specType == specType2) {
            String strCreateAqlBodyForBuild = createAqlBodyForBuild(this.buildName, this.buildNumber);
            Aql aql = new Aql();
            aql.setFind(strCreateAqlBodyForBuild);
            this.filesGroup.setAql(aql);
            strConvertFilesGroupToAql = AqlConverter.convertFilesGroupToAql(this.filesGroup);
            this.filesGroup.setAql(null);
        } else {
            strConvertFilesGroupToAql = AqlConverter.convertFilesGroupToAql(this.filesGroup);
        }
        this.log.debug("Searching Artifactory using AQL query:\n" + strConvertFilesGroupToAql);
        List<AqlSearchResult.SearchEntry> results = this.artifactoryManager.searchArtifactsByAql(strConvertFilesGroupToAql).getResults();
        if (this.filesGroup.getSpecType() == specType2) {
            arrayList = results;
        } else if (!StringUtils.isBlank(this.buildName) && !StringUtils.isBlank(this.buildNumber)) {
            arrayList = fetchBuildArtifactsSha1();
        } else {
            arrayList = new ArrayList<>();
        }
        List<AqlSearchResult.SearchEntry> listFilterResult = filterResult(results, arrayList);
        return listFilterResult == null ? new ArrayList() : listFilterResult;
    }

    public final List<AqlSearchResult.SearchEntry> filterResult(List<AqlSearchResult.SearchEntry> list, List<AqlSearchResult.SearchEntry> list2) throws IOException {
        return (!StringUtils.isNotBlank(this.buildName) || list.size() <= 0) ? list : filterAqlSearchResultsByBuild(list, extractSha1FromAqlResponse(list2), this.buildName, this.buildNumber);
    }

    public final List<AqlSearchResult.SearchEntry> fetchBuildArtifactsSha1() throws IOException {
        String str = String.format("items.find(%s)%s", createAqlBodyForBuild(this.buildName, this.buildNumber), ".include(\"name\",\"repo\",\"path\",\"actual_sha1\")");
        this.log.debug("Searching Artifactory for build's checksums using AQL query:\n" + str);
        return this.artifactoryManager.searchArtifactsByAql(str).getResults();
    }

    public static String createAqlBodyForBuild(String str, String str2) {
        return String.format("{\"artifact.module.build.name\": \"%s\",\"artifact.module.build.number\": \"%s\"}", str, str2);
    }

    public static String getBuildName(String str) {
        if (StringUtils.isBlank(str)) {
            return str;
        }
        String strSubstringBeforeLast = StringUtils.substringBeforeLast(str, "/");
        while (StringUtils.isNotBlank(strSubstringBeforeLast) && strSubstringBeforeLast.contains("/") && strSubstringBeforeLast.endsWith("\\")) {
            strSubstringBeforeLast = StringUtils.substringBeforeLast(strSubstringBeforeLast, "/");
        }
        return strSubstringBeforeLast.endsWith("\\") ? str : strSubstringBeforeLast;
    }

    public final String getBuildNumber(ArtifactoryManager artifactoryManager, String str, String str2, String str3) throws IOException {
        String strReplace;
        if (!StringUtils.isNotBlank(str)) {
            return "";
        }
        if (!str2.startsWith(str)) {
            throw new IllegalStateException(String.format("build '%s' does not start with build name '%s'.", str2, str));
        }
        if (str2.equals(str)) {
            strReplace = "LATEST";
        } else {
            strReplace = str2.substring(str.length() + 1).replace("\\/", "/");
        }
        String latestBuildNumber = artifactoryManager.getLatestBuildNumber(str, strReplace, str3);
        if (latestBuildNumber != null) {
            return latestBuildNumber;
        }
        logBuildNotFound(str, strReplace);
        return latestBuildNumber;
    }

    public final void logBuildNotFound(String str, String str2) {
        StringBuilder sb = new StringBuilder("The build name ");
        sb.append(str);
        if ("LAST_RELEASE".equals(str2.trim())) {
            sb.append(" with the status RELEASED");
        }
        sb.append(" could not be found.");
        this.log.warn(sb.toString());
    }

    public static List<AqlSearchResult.SearchEntry> filterAqlSearchResultsByBuild(List<AqlSearchResult.SearchEntry> list, Map<String, Boolean> map, String str, String str2) {
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (AqlSearchResult.SearchEntry searchEntry : list) {
            if (map.containsKey(searchEntry.getActualSha1())) {
                boolean zEquals = str.equals(searchEntry.getBuildName());
                boolean zEquals2 = str2.equals(searchEntry.getBuildNumber());
                if (!zEquals) {
                    addToListInMap(map4, searchEntry);
                } else if (zEquals2) {
                    addToListInMap(map2, searchEntry);
                } else {
                    addToListInMap(map3, searchEntry);
                }
            }
        }
        Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (map2.containsKey(key)) {
                arrayList.addAll((Collection) map2.get(key));
            } else if (map3.containsKey(key)) {
                arrayList.addAll((Collection) map3.get(key));
            } else if (map4.containsKey(key)) {
                arrayList.addAll((Collection) map4.get(key));
            }
        }
        return arrayList;
    }

    public static void addToListInMap(Map<String, List<AqlSearchResult.SearchEntry>> map, AqlSearchResult.SearchEntry searchEntry) {
        List<AqlSearchResult.SearchEntry> arrayList = map.get(searchEntry.getActualSha1());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(searchEntry);
        map.put(searchEntry.getActualSha1(), arrayList);
    }

    public static Map<String, Boolean> extractSha1FromAqlResponse(List<AqlSearchResult.SearchEntry> list) {
        final HashMap map = new HashMap();
        list.forEach(new Consumer() { // from class: org.jfrog.build.extractor.clientConfiguration.util.AqlHelper$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AqlHelper.lambda$extractSha1FromAqlResponse$0(map, (AqlSearchResult.SearchEntry) obj);
            }
        });
        return map;
    }

    public static /* synthetic */ void lambda$extractSha1FromAqlResponse$0(Map map, AqlSearchResult.SearchEntry searchEntry) {
    }
}
