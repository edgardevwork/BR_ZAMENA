package org.jfrog.build.extractor.clientConfiguration.util;

import com.google.common.p024io.Files;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.io.StringWriter;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.p059io.FileUtils;
import org.apache.commons.p059io.IOUtils;
import org.apache.http.Header;
import org.jfrog.build.api.dependency.DownloadableArtifact;
import org.jfrog.build.api.dependency.pattern.PatternType;
import org.jfrog.build.api.search.AqlSearchResult;
import org.jfrog.build.api.util.FileChecksumCalculator;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.api.util.ZipUtils;
import org.jfrog.build.extractor.builder.DependencyBuilder;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.Upload;
import org.jfrog.build.extractor.p065ci.Dependency;
import org.jfrog.filespecs.FileSpec;
import org.jfrog.filespecs.entities.FilesGroup;

/* loaded from: classes7.dex */
public class DependenciesDownloaderHelper {
    public static final int CONCURRENT_DOWNLOAD_THREADS = 3;
    public static final int MIN_SIZE_FOR_CONCURRENT_DOWNLOAD = 5120000;
    public final DependenciesDownloader downloader;
    public final Log log;

    public DependenciesDownloaderHelper(DependenciesDownloader dependenciesDownloader, Log log) {
        this.downloader = dependenciesDownloader;
        this.log = log;
    }

    public DependenciesDownloaderHelper(ArtifactoryManager artifactoryManager, String str, Log log) {
        this.downloader = new DependenciesDownloaderImpl(artifactoryManager, str, log);
        this.log = log;
    }

    public List<Dependency> downloadDependencies(FileSpec fileSpec) throws IOException {
        ArtifactorySearcher artifactorySearcher = new ArtifactorySearcher(this.downloader.getArtifactoryManager(), this.log);
        HashSet hashSet = new HashSet();
        for (FilesGroup filesGroup : fileSpec.getFiles()) {
            this.log.debug("Downloading dependencies using spec: \n" + filesGroup.toString());
            this.downloader.setFlatDownload(BooleanUtils.toBoolean(filesGroup.getFlat()));
            Set<DownloadableArtifact> setFetchDownloadableArtifactsFromResult = fetchDownloadableArtifactsFromResult(artifactorySearcher.SearchByFileSpec(filesGroup), Boolean.valueOf(filesGroup.getExplode()).booleanValue(), filesGroup.getTarget());
            if (filesGroup.getSpecType() == FilesGroup.SpecType.PATTERN) {
                replaceTargetPlaceholders(filesGroup.getPattern(), setFetchDownloadableArtifactsFromResult, filesGroup.getTarget());
            }
            hashSet.addAll(downloadDependencies(setFetchDownloadableArtifactsFromResult));
        }
        return new ArrayList(hashSet);
    }

    public final void replaceTargetPlaceholders(String str, Set<DownloadableArtifact> set, String str2) {
        Pattern patternCompile = Pattern.compile(PathsUtils.pathToRegExp(StringUtils.substringAfter(str, "/")));
        String str3 = (String) StringUtils.defaultIfEmpty(str2, "");
        for (DownloadableArtifact downloadableArtifact : set) {
            if (StringUtils.isEmpty(str3) || str3.endsWith("/")) {
                downloadableArtifact.setTargetDirPath(PathsUtils.reformatRegexp(downloadableArtifact.getFilePath(), str3, patternCompile));
            } else {
                Map<String, String> mapReplaceFilesName = PathsUtils.replaceFilesName(PathsUtils.reformatRegexp(downloadableArtifact.getFilePath(), str3, patternCompile), downloadableArtifact.getRelativeDirPath());
                downloadableArtifact.setRelativeDirPath(mapReplaceFilesName.get("srcPath"));
                downloadableArtifact.setTargetDirPath(mapReplaceFilesName.get("targetPath"));
            }
        }
    }

    public final Set<DownloadableArtifact> fetchDownloadableArtifactsFromResult(List<AqlSearchResult.SearchEntry> list, boolean z, String str) {
        HashSet hashSet = new HashSet();
        for (AqlSearchResult.SearchEntry searchEntry : list) {
            DownloadableArtifact downloadableArtifact = new DownloadableArtifact(searchEntry.getRepo(), str, (searchEntry.getPath().equals(".") ? "" : searchEntry.getPath() + "/") + searchEntry.getName(), "", "", PatternType.NORMAL);
            downloadableArtifact.setExplode(z);
            hashSet.add(downloadableArtifact);
        }
        return hashSet;
    }

    public List<Dependency> downloadDependencies(Set<DownloadableArtifact> set) throws IOException {
        this.log.info("Beginning to resolve Build Info published dependencies.");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (DownloadableArtifact downloadableArtifact : set) {
            Dependency dependencyDownloadArtifact = downloadArtifact(downloadableArtifact);
            if (dependencyDownloadArtifact != null) {
                arrayList.add(dependencyDownloadArtifact);
                hashSet.add(downloadableArtifact);
                explodeDependenciesIfNeeded(downloadableArtifact);
            }
        }
        removeUnusedArtifactsFromLocal(hashSet);
        this.log.info("Finished resolving Build Info published dependencies.");
        return arrayList;
    }

    public final void explodeDependenciesIfNeeded(DownloadableArtifact downloadableArtifact) throws IOException {
        if (downloadableArtifact.isExplode()) {
            String targetDir = this.downloader.getTargetDir(downloadableArtifact.getTargetDirPath(), downloadableArtifact.getRelativeDirPath());
            this.log.info("Extracting Archive: " + targetDir);
            File file = new File(targetDir);
            File parentFile = FileUtils.getFile(targetDir).getParentFile();
            ZipUtils.extract(file, parentFile);
            this.log.info("Finished extracting archive to " + parentFile);
            this.log.debug("Deleting archive...");
            FileUtils.deleteQuietly(file);
        }
    }

    public final void removeUnusedArtifactsFromLocal(Set<DownloadableArtifact> set) throws IOException {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (DownloadableArtifact downloadableArtifact : set) {
            String targetDir = this.downloader.getTargetDir(downloadableArtifact.getTargetDirPath(), downloadableArtifact.getRelativeDirPath());
            hashSet2.add(targetDir);
            if (PatternType.DELETE.equals(downloadableArtifact.getPatternType())) {
                hashSet.add(targetDir);
            }
        }
        this.downloader.removeUnusedArtifactsFromLocal(hashSet2, hashSet);
    }

    public final Dependency downloadArtifact(DownloadableArtifact downloadableArtifact) throws IOException {
        String filePath = downloadableArtifact.getFilePath();
        String matrixParameters = downloadableArtifact.getMatrixParameters();
        String str = downloadableArtifact.getRepoUrl() + '/' + filePath;
        if (!StringUtils.isBlank(matrixParameters)) {
            str = str + ';' + matrixParameters;
        }
        ArtifactMetaData artifactMetaDataDownloadArtifactMetaData = downloadArtifactMetaData(str);
        if (StringUtils.isBlank(artifactMetaDataDownloadArtifactMetaData.getMd5()) && StringUtils.isBlank(artifactMetaDataDownloadArtifactMetaData.getSha1())) {
            return null;
        }
        return downloadArtifact(downloadableArtifact, artifactMetaDataDownloadArtifactMetaData, str, filePath);
    }

    public Dependency downloadArtifact(DownloadableArtifact downloadableArtifact, ArtifactMetaData artifactMetaData, String str, String str2) throws IOException {
        Map<String, String> mapDownloadFile;
        String targetDir = this.downloader.getTargetDir(downloadableArtifact.getTargetDirPath(), downloadableArtifact.getRelativeDirPath());
        String str3 = downloadableArtifact.getRepoUrl() + "/" + str2;
        Dependency dependencyLocally = getDependencyLocally(artifactMetaData, targetDir, str3);
        if (dependencyLocally != null) {
            return dependencyLocally;
        }
        try {
            this.log.info(String.format("Downloading '%s'...", str));
            if (artifactMetaData.getSize() >= 5120000 && artifactMetaData.isAcceptRange()) {
                mapDownloadFile = downloadFileConcurrently(str, artifactMetaData.getSize(), targetDir, str2);
            } else {
                mapDownloadFile = downloadFile(str, targetDir);
            }
            Map<String, String> map = mapDownloadFile;
            if (map == null) {
                throw new IOException("Received null checksums map for downloaded file.");
            }
            Dependency dependencyValidateChecksumsAndBuildDependency = validateChecksumsAndBuildDependency(map, artifactMetaData, str2, targetDir, str3);
            this.log.info(String.format("Successfully downloaded '%s' to '%s'", str, targetDir));
            return dependencyValidateChecksumsAndBuildDependency;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public Map<String, String> downloadFile(String str, String str2) throws IOException {
        try {
            return FileChecksumCalculator.calculateChecksums(this.downloader.getArtifactoryManager().downloadToFile(str, str2), "MD5", FileChecksumCalculator.SHA1_ALGORITHM, "SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(String.format("Could not find checksum algorithm: %s", e.getLocalizedMessage()), e);
        }
    }

    public Map<String, String> downloadFileConcurrently(String str, long j, String str2, String str3) throws Exception {
        File fileCreateTempDir = Files.createTempDir();
        try {
            InputStream inputStreamConcatenateFilesToSingleStream = concatenateFilesToSingleStream(doConcurrentDownload(j, str, fileCreateTempDir.getPath() + File.separatorChar + str3));
            try {
                Map<String, String> mapSaveDownloadedFile = this.downloader.saveDownloadedFile(inputStreamConcatenateFilesToSingleStream, str2);
                if (inputStreamConcatenateFilesToSingleStream != null) {
                    inputStreamConcatenateFilesToSingleStream.close();
                }
                return mapSaveDownloadedFile;
            } finally {
            }
        } finally {
            FileUtils.deleteDirectory(fileCreateTempDir);
        }
    }

    public final String[] doConcurrentDownload(long j, final String str, String str2) throws Exception {
        final MutableBoolean mutableBoolean = new MutableBoolean(false);
        int i = 3;
        String[] strArr = new String[3];
        long j2 = j / 3;
        Thread[] threadArr = new Thread[3];
        long j3 = 0;
        long j4 = ((j % 3) + j2) - 1;
        int i2 = 0;
        while (i2 < i) {
            final HashMap map = new HashMap();
            map.put("Range", "bytes=" + j3 + "-" + j4);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i2);
            final String string = sb.toString();
            strArr[i2] = string;
            long j5 = j4;
            Thread thread = new Thread(new Runnable() { // from class: org.jfrog.build.extractor.clientConfiguration.util.DependenciesDownloaderHelper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$doConcurrentDownload$0(str, string, map, mutableBoolean);
                }
            });
            threadArr[i2] = thread;
            thread.setName("downloader_" + i2);
            threadArr[i2].start();
            j3 = j5 + 1;
            j4 = j5 + j2;
            i2++;
            i = 3;
        }
        int i3 = i;
        for (int i4 = 0; i4 < i3; i4++) {
            threadArr[i4].join();
        }
        if (mutableBoolean.booleanValue()) {
            throw new Exception(String.format("Error occurred while downloading %s, please refer to logs for more information", str));
        }
        return strArr;
    }

    public final /* synthetic */ void lambda$doConcurrentDownload$0(String str, String str2, Map map, MutableBoolean mutableBoolean) {
        try {
            this.downloader.getArtifactoryManager().downloadToFile(str, str2, map);
        } catch (Exception e) {
            mutableBoolean.setValue(true);
            printErrorToLog(e, str2, str);
        }
    }

    public final InputStream concatenateFilesToSingleStream(String[] strArr) throws FileNotFoundException {
        InputStream fileInputStream = new FileInputStream(strArr[0]);
        if (strArr.length < 2) {
            return fileInputStream;
        }
        int i = 1;
        while (i < strArr.length) {
            InputStream sequenceInputStream = new SequenceInputStream(fileInputStream, new FileInputStream(strArr[i]));
            i++;
            fileInputStream = sequenceInputStream;
        }
        return fileInputStream;
    }

    public final Dependency getDependencyLocally(ArtifactMetaData artifactMetaData, String str, String str2) throws IOException {
        if (!this.downloader.isFileExistsLocally(str, artifactMetaData.getMd5(), artifactMetaData.getSha1())) {
            return null;
        }
        this.log.info(String.format("The file '%s' exists locally.", str));
        return new DependencyBuilder().md5(artifactMetaData.getMd5()).sha1(artifactMetaData.getSha1()).m7388id(str.substring(str.lastIndexOf(String.valueOf(IOUtils.DIR_SEPARATOR)) + 1)).localPath(str).remotePath(str2).build();
    }

    public ArtifactMetaData downloadArtifactMetaData(String str) throws IOException {
        try {
            ArtifactMetaData artifactMetaData = new ArtifactMetaData();
            for (Header header : this.downloader.getArtifactoryManager().downloadHeaders(str)) {
                String strUpperCase = StringUtils.upperCase(header.getName());
                if (Upload.MD5_HEADER_NAME.toUpperCase().equals(strUpperCase)) {
                    artifactMetaData.setMd5(header.getValue());
                } else if (Upload.SHA1_HEADER_NAME.toUpperCase().equals(strUpperCase)) {
                    artifactMetaData.setSha1(header.getValue());
                } else if ("Content-Length".toUpperCase().equals(strUpperCase)) {
                    artifactMetaData.setSize(NumberUtils.toLong(header.getValue()));
                } else if ("Accept-Ranges".toUpperCase().equals(strUpperCase)) {
                    artifactMetaData.setAcceptRange("bytes".equalsIgnoreCase(header.getValue()));
                }
            }
            return artifactMetaData;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    public final String validateMd5Checksum(String str, String str2) throws IOException {
        if (StringUtils.equals(str, str2)) {
            return str == null ? "" : str;
        }
        throw new IOException(String.format("Calculated MD5 checksum is different from original, Original: '%s' Calculated: '%s'", str, str2));
    }

    public final String validateSha1Checksum(String str, String str2) throws IOException {
        if (StringUtils.equals(str, str2)) {
            return str == null ? "" : str;
        }
        throw new IOException(String.format("Calculated SHA-1 checksum is different from original, Original: '%s' Calculated: '%s'", str, str2));
    }

    public final Dependency validateChecksumsAndBuildDependency(Map<String, String> map, ArtifactMetaData artifactMetaData, String str, String str2, String str3) throws IOException {
        String strValidateMd5Checksum = validateMd5Checksum(artifactMetaData.getMd5(), map.get("MD5"));
        return new DependencyBuilder().md5(strValidateMd5Checksum).sha1(validateSha1Checksum(artifactMetaData.getSha1(), map.get(FileChecksumCalculator.SHA1_ALGORITHM))).sha256(map.get("SHA-256")).m7388id(str.substring(str.lastIndexOf(File.separatorChar) + 1)).localPath(str2).remotePath(str3).build();
    }

    public static File saveInputStreamToFile(InputStream inputStream, String str) throws IOException {
        FileOutputStream fileOutputStream;
        Throwable th;
        IOException e;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        } else {
            file.getParentFile().mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException e2) {
            fileOutputStream = null;
            e = e2;
        } catch (Throwable th2) {
            fileOutputStream = null;
            th = th2;
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly((OutputStream) fileOutputStream);
            throw th;
        }
        try {
            try {
                IOUtils.copyLarge(inputStream, fileOutputStream);
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((OutputStream) fileOutputStream);
                return file;
            } catch (Throwable th3) {
                th = th3;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((OutputStream) fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            throw new IOException(String.format("Could not create or write to file: %s", file.getCanonicalPath()), e);
        }
    }

    public final void printErrorToLog(Exception exc, String str, String str2) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        this.log.error(String.format("[Thread %s] downloading %s as part of file %s threw an exception: %s", Thread.currentThread().getName(), str, str2, stringWriter.toString()));
    }

    public static class ArtifactMetaData {
        public boolean acceptRange;
        public String md5;
        public String sha1;
        public String sha256;
        public long size;

        public long getSize() {
            return this.size;
        }

        public void setSize(long j) {
            this.size = j;
        }

        public String getSha256() {
            return this.sha256;
        }

        public void setSha256(String str) {
            this.sha256 = str;
        }

        public String getSha1() {
            return this.sha1;
        }

        public void setSha1(String str) {
            this.sha1 = str;
        }

        public String getMd5() {
            return this.md5;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public boolean isAcceptRange() {
            return this.acceptRange;
        }

        public void setAcceptRange(boolean z) {
            this.acceptRange = z;
        }
    }
}
