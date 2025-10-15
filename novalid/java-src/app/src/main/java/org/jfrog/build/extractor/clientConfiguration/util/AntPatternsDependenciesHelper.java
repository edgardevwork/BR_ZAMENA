package org.jfrog.build.extractor.clientConfiguration.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.dependency.DownloadableArtifact;
import org.jfrog.build.api.dependency.PatternResultFileSet;
import org.jfrog.build.api.dependency.PropertySearchResult;
import org.jfrog.build.api.dependency.pattern.BuildDependencyPattern;
import org.jfrog.build.api.dependency.pattern.DependencyPattern;
import org.jfrog.build.api.util.CommonUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.PatternMatcher;
import org.jfrog.build.extractor.p065ci.Dependency;

/* loaded from: classes7.dex */
public class AntPatternsDependenciesHelper {
    public DependenciesDownloader downloader;
    public Log log;

    public AntPatternsDependenciesHelper(DependenciesDownloader dependenciesDownloader, Log log) {
        this.downloader = dependenciesDownloader;
        this.log = log;
    }

    public List<Dependency> retrievePublishedDependencies(String str) throws InterruptedException, IOException {
        if (StringUtils.isBlank(str)) {
            return Collections.emptyList();
        }
        List<String> patternsFromProperty = PublishedItemsHelper.parsePatternsFromProperty(str);
        List<Dependency> listEmptyList = Collections.emptyList();
        if (patternsFromProperty.isEmpty()) {
            return listEmptyList;
        }
        this.log.info("Beginning to resolve Build Info dependencies.");
        List<Dependency> listDownload = this.downloader.download(collectArtifactsToDownload(patternsFromProperty));
        this.log.info("Finished resolving Build Info dependencies.");
        return listDownload;
    }

    public final Set<DownloadableArtifact> collectArtifactsToDownload(List<String> list) throws IOException {
        HashSet hashSet = new HashSet();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            DependencyPattern dependencyPatternCreate = PatternFactory.create(it.next());
            if (!(dependencyPatternCreate instanceof BuildDependencyPattern)) {
                hashSet.addAll(handleDependencyPattern(dependencyPatternCreate));
            }
        }
        return hashSet;
    }

    public final Set<DownloadableArtifact> handleDependencyPattern(DependencyPattern dependencyPattern) throws IOException {
        String pattern = dependencyPattern.getPattern();
        this.log.info("Resolving published dependencies with pattern " + pattern);
        if (StringUtils.contains(pattern, "**")) {
            if (StringUtils.isNotBlank(dependencyPattern.getMatrixParams())) {
                return performPropertySearch(dependencyPattern);
            }
            throw new IllegalArgumentException("Wildcard '**' is not allowed without matrix params for pattern '" + pattern + "'");
        }
        return performPatternSearch(dependencyPattern);
    }

    public final Set<DownloadableArtifact> performPropertySearch(DependencyPattern dependencyPattern) throws IOException {
        HashSet hashSet = new HashSet();
        String pattern = dependencyPattern.getPattern();
        String matrixParams = dependencyPattern.getMatrixParams();
        List<PropertySearchResult.SearchEntry> listFilterResultEntries = filterResultEntries(this.downloader.getArtifactoryManager().searchArtifactsByProperties(matrixParams).getResults(), pattern);
        this.log.info("Found " + listFilterResultEntries.size() + " dependencies by doing a property search.");
        for (PropertySearchResult.SearchEntry searchEntry : listFilterResultEntries) {
            hashSet.add(new DownloadableArtifact(searchEntry.getRepoUri(), dependencyPattern.getTargetDirectory(), searchEntry.getFilePath(), matrixParams, pattern, dependencyPattern.getPatternType()));
        }
        return hashSet;
    }

    public final List<PropertySearchResult.SearchEntry> filterResultEntries(List<PropertySearchResult.SearchEntry> list, String str) {
        final String strReplaceFirst = str.replaceFirst(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER, "/");
        return new ArrayList(CommonUtils.filterCollection(list, new Predicate() { // from class: org.jfrog.build.extractor.clientConfiguration.util.AntPatternsDependenciesHelper$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AntPatternsDependenciesHelper.lambda$filterResultEntries$0(strReplaceFirst, (PropertySearchResult.SearchEntry) obj);
            }
        }));
    }

    public static /* synthetic */ boolean lambda$filterResultEntries$0(String str, PropertySearchResult.SearchEntry searchEntry) {
        return PatternMatcher.match(str, searchEntry.getRepoPath(), false);
    }

    public final Set<DownloadableArtifact> performPatternSearch(DependencyPattern dependencyPattern) throws IOException {
        HashSet hashSet = new HashSet();
        String pattern = dependencyPattern.getPattern();
        PatternResultFileSet patternResultFileSetSearchArtifactsByPattern = this.downloader.getArtifactoryManager().searchArtifactsByPattern(pattern);
        Set<String> files = patternResultFileSetSearchArtifactsByPattern.getFiles();
        this.log.info("Found " + files.size() + " dependencies by doing a pattern search.");
        Iterator<String> it = files.iterator();
        while (it.hasNext()) {
            hashSet.add(new DownloadableArtifact(patternResultFileSetSearchArtifactsByPattern.getRepoUri(), dependencyPattern.getTargetDirectory(), it.next(), dependencyPattern.getMatrixParams(), pattern, dependencyPattern.getPatternType()));
        }
        return hashSet;
    }
}
