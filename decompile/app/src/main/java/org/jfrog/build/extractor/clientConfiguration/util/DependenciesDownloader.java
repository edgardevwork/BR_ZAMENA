package org.jfrog.build.extractor.clientConfiguration.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jfrog.build.api.dependency.DownloadableArtifact;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.build.extractor.p065ci.Dependency;

/* loaded from: classes7.dex */
public interface DependenciesDownloader {
    List<Dependency> download(Set<DownloadableArtifact> set) throws IOException;

    ArtifactoryManager getArtifactoryManager();

    String getTargetDir(String str, String str2) throws IOException;

    boolean isFileExistsLocally(String str, String str2, String str3) throws IOException;

    void removeUnusedArtifactsFromLocal(Set<String> set, Set<String> set2) throws IOException;

    Map<String, String> saveDownloadedFile(InputStream inputStream, String str) throws IOException;

    void setFlatDownload(boolean z);
}
