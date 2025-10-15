package org.jfrog.build.extractor.clientConfiguration.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.p059io.FileUtils;
import org.apache.commons.p059io.FilenameUtils;
import org.jfrog.build.api.dependency.DownloadableArtifact;
import org.jfrog.build.api.util.CommonUtils;
import org.jfrog.build.api.util.FileChecksumCalculator;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.build.extractor.p065ci.Dependency;

/* loaded from: classes8.dex */
public class DependenciesDownloaderImpl implements DependenciesDownloader {
    public final ArtifactoryManager artifactoryManager;
    public boolean flatDownload;
    public Log log;
    public File workingDirectory;

    public DependenciesDownloaderImpl(ArtifactoryManager artifactoryManager, String str, Log log) {
        this.flatDownload = false;
        this.workingDirectory = new File(str);
        this.log = log;
        this.flatDownload = false;
        this.artifactoryManager = artifactoryManager;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.util.DependenciesDownloader
    public ArtifactoryManager getArtifactoryManager() {
        return this.artifactoryManager;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.util.DependenciesDownloader
    public List<Dependency> download(Set<DownloadableArtifact> set) throws IOException {
        return new DependenciesDownloaderHelper(this, this.log).downloadDependencies(set);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.util.DependenciesDownloader
    public String getTargetDir(String str, String str2) throws IOException {
        if (this.flatDownload && str2.contains("/")) {
            str2 = StringUtils.substringAfterLast(str2, "/");
        }
        return FilenameUtils.concat(this.workingDirectory.getPath(), FilenameUtils.concat(str, str2));
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.util.DependenciesDownloader
    public Map<String, String> saveDownloadedFile(InputStream inputStream, String str) throws IOException {
        try {
            return FileChecksumCalculator.calculateChecksums(DependenciesDownloaderHelper.saveInputStreamToFile(inputStream, str), "MD5", FileChecksumCalculator.SHA1_ALGORITHM, "SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(String.format("Could not find checksum algorithm: %s", e.getLocalizedMessage()), e);
        }
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.util.DependenciesDownloader
    public boolean isFileExistsLocally(String str, String str2, String str3) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            throw new IOException(String.format("File can't override an existing directory: %s", file.toString()));
        }
        try {
            Map<String, String> mapCalculateChecksums = FileChecksumCalculator.calculateChecksums(file, "MD5", FileChecksumCalculator.SHA1_ALGORITHM);
            if (mapCalculateChecksums != null && StringUtils.isNotBlank(str2) && StringUtils.equals(str2, mapCalculateChecksums.get("MD5")) && StringUtils.isNotBlank(str3) && StringUtils.equals(str3, mapCalculateChecksums.get(FileChecksumCalculator.SHA1_ALGORITHM))) {
                return true;
            }
            this.log.info(String.format("Overriding existing file: %s", file.toString()));
            return false;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(String.format("Could not find checksum algorithm: %s", e.getLocalizedMessage()), e);
        }
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.util.DependenciesDownloader
    public void removeUnusedArtifactsFromLocal(Set<String> set, Set<String> set2) throws IOException {
        Iterator<String> it = set2.iterator();
        while (it.hasNext()) {
            File[] fileArrListFiles = FileUtils.getFile(it.next()).getParentFile().listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file : fileArrListFiles) {
                    if (!isResolvedOrParentOfResolvedFile(set, file.getPath())) {
                        this.log.info("Deleted unresolved file '" + file.getPath() + "'");
                        file.delete();
                    }
                }
            }
        }
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.util.DependenciesDownloader
    public void setFlatDownload(boolean z) {
        this.flatDownload = z;
    }

    public final boolean isResolvedOrParentOfResolvedFile(Set<String> set, final String str) {
        return CommonUtils.isAnySatisfying(set, new Predicate() { // from class: org.jfrog.build.extractor.clientConfiguration.util.DependenciesDownloaderImpl$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return DependenciesDownloaderImpl.lambda$isResolvedOrParentOfResolvedFile$0(str, (String) obj);
            }
        });
    }

    public static /* synthetic */ boolean lambda$isResolvedOrParentOfResolvedFile$0(String str, String str2) {
        return StringUtils.equals(str2, str) || StringUtils.startsWith(str2, str);
    }
}
