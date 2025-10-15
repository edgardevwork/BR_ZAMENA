package org.jfrog.build.extractor.clientConfiguration.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.builder.dependency.BuildDependencyBuilder;
import org.jfrog.build.api.builder.dependency.BuildPatternArtifactsRequestBuilder;
import org.jfrog.build.api.dependency.BuildDependency;
import org.jfrog.build.api.dependency.BuildPatternArtifacts;
import org.jfrog.build.api.dependency.BuildPatternArtifactsRequest;
import org.jfrog.build.api.dependency.DownloadableArtifact;
import org.jfrog.build.api.dependency.PatternArtifact;
import org.jfrog.build.api.dependency.pattern.BuildDependencyPattern;
import org.jfrog.build.api.dependency.pattern.DependencyPattern;
import org.jfrog.build.api.util.Log;

/* loaded from: classes7.dex */
public class BuildDependenciesHelper {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public DependenciesDownloader downloader;
    public Log log;

    public BuildDependenciesHelper(DependenciesDownloader dependenciesDownloader, Log log) {
        this.downloader = dependenciesDownloader;
        this.log = log;
    }

    public List<BuildDependency> retrieveBuildDependencies(String str) throws InterruptedException, IOException {
        if (StringUtils.isBlank(str)) {
            return Collections.emptyList();
        }
        List<String> patternsFromProperty = PublishedItemsHelper.parsePatternsFromProperty(str);
        if (patternsFromProperty.isEmpty()) {
            return Collections.emptyList();
        }
        this.log.info("Beginning to resolve Build Info build dependencies.");
        Map<String, Map<String, List<BuildDependencyPattern>>> buildDependencies = getBuildDependencies(patternsFromProperty);
        List<BuildPatternArtifactsRequest> artifactsRequests = toArtifactsRequests(buildDependencies);
        List<BuildPatternArtifacts> listRetrievePatternArtifacts = this.downloader.getArtifactoryManager().retrievePatternArtifacts(artifactsRequests);
        HashSet hashSet = new HashSet();
        this.downloader.download(collectArtifactsToDownload(buildDependencies, artifactsRequests, listRetrievePatternArtifacts, hashSet));
        this.log.info("Finished resolving Build Info build dependencies.");
        return new ArrayList(hashSet);
    }

    public final Map<String, Map<String, List<BuildDependencyPattern>>> getBuildDependencies(List<String> list) {
        HashMap map = new HashMap();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            DependencyPattern dependencyPatternCreate = PatternFactory.create(it.next());
            if (dependencyPatternCreate instanceof BuildDependencyPattern) {
                BuildDependencyPattern buildDependencyPattern = (BuildDependencyPattern) dependencyPatternCreate;
                String buildName = buildDependencyPattern.getBuildName();
                Map map2 = (Map) map.get(buildName);
                if (map2 == null) {
                    map.put(buildName, new HashMap());
                    map2 = (Map) map.get(buildName);
                }
                String buildNumber = buildDependencyPattern.getBuildNumber();
                List list2 = (List) map2.get(buildNumber);
                if (list2 == null) {
                    map2.put(buildNumber, new LinkedList());
                    list2 = (List) map2.get(buildNumber);
                }
                list2.add(buildDependencyPattern);
            }
        }
        return map;
    }

    public final List<BuildPatternArtifactsRequest> toArtifactsRequests(Map<String, Map<String, List<BuildDependencyPattern>>> map) {
        LinkedList linkedList = new LinkedList();
        for (String str : map.keySet()) {
            Map<String, List<BuildDependencyPattern>> map2 = map.get(str);
            for (String str2 : map2.keySet()) {
                List<BuildDependencyPattern> list = map2.get(str2);
                BuildPatternArtifactsRequestBuilder buildPatternArtifactsRequestBuilderBuildNumber = new BuildPatternArtifactsRequestBuilder().buildName(str).buildNumber(str2);
                Iterator<BuildDependencyPattern> it = list.iterator();
                while (it.hasNext()) {
                    buildPatternArtifactsRequestBuilderBuildNumber.pattern(it.next().getPattern());
                }
                linkedList.add(buildPatternArtifactsRequestBuilderBuildNumber.build());
            }
        }
        return linkedList;
    }

    public final Set<DownloadableArtifact> collectArtifactsToDownload(Map<String, Map<String, List<BuildDependencyPattern>>> map, List<BuildPatternArtifactsRequest> list, List<BuildPatternArtifacts> list2, Set<BuildDependency> set) {
        BuildDependenciesHelper buildDependenciesHelper = this;
        HashSet hashSet = new HashSet();
        buildDependenciesHelper.verifySameSize(list, list2);
        int i = 0;
        while (i < list.size()) {
            BuildPatternArtifacts buildPatternArtifacts = list2.get(i);
            if (buildPatternArtifacts != null) {
                List<BuildDependencyPattern> list3 = map.get(buildPatternArtifacts.getBuildName()).get(list.get(i).getBuildNumber());
                int i2 = 0;
                while (i2 < list3.size()) {
                    BuildDependencyPattern buildDependencyPattern = list3.get(i2);
                    if (!buildDependencyPattern.getBuildName().equals(buildPatternArtifacts.getBuildName())) {
                        throw new IllegalArgumentException(String.format("Build names don't match: [%s] != [%s]", buildDependencyPattern.getBuildName(), buildPatternArtifacts.getBuildName()));
                    }
                    String str = String.format("Dependency on build [%s], number [%s]", buildDependencyPattern.getBuildName(), buildDependencyPattern.getBuildNumber());
                    if (buildPatternArtifacts.getBuildNumber() == null) {
                        buildDependenciesHelper.log.info(str + " - no results found, check correctness of dependency build name and build number.");
                    } else {
                        List<PatternArtifact> patternArtifacts = buildPatternArtifacts.getPatternResults().get(i2).getPatternArtifacts();
                        Log log = buildDependenciesHelper.log;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(String.format(", pattern [%s] - [%s] result%s found.", buildDependencyPattern.getPattern(), Integer.valueOf(patternArtifacts.size()), patternArtifacts.size() == 1 ? "" : "s"));
                        log.info(sb.toString());
                        for (PatternArtifact patternArtifact : patternArtifacts) {
                            String uri = patternArtifact.getUri();
                            int iIndexOf = uri.indexOf(47);
                            hashSet.add(new DownloadableArtifact(patternArtifact.getArtifactoryUrl() + '/' + uri.substring(0, iIndexOf), buildDependencyPattern.getTargetDirectory(), uri.substring(iIndexOf + 1), buildDependencyPattern.getMatrixParams(), buildDependencyPattern.getPattern(), buildDependencyPattern.getPatternType()));
                        }
                        if (!patternArtifacts.isEmpty()) {
                            set.add(new BuildDependencyBuilder().name(buildPatternArtifacts.getBuildName()).number(buildPatternArtifacts.getBuildNumber()).url(buildPatternArtifacts.getUrl()).started(buildPatternArtifacts.getStarted()).build());
                        }
                    }
                    i2++;
                    buildDependenciesHelper = this;
                }
            }
            i++;
            buildDependenciesHelper = this;
        }
        return hashSet;
    }

    public final void verifySameSize(List list, List list2) {
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException(String.format("List sizes don't match: [%s] != [%s]", Integer.valueOf(list.size()), Integer.valueOf(list2.size())));
        }
    }
}
