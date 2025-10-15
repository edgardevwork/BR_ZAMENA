package org.jfrog.build.extractor.clientConfiguration.util.spec;

import com.google.common.collect.Multimap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;
import org.jfrog.build.extractor.clientConfiguration.util.PathsUtils;
import org.jfrog.build.extractor.producerConsumer.ProducerConsumerExecutor;
import org.jfrog.filespecs.entities.FilesGroup;

/* loaded from: classes7.dex */
public class SingleSpecDeploymentProducer {
    public String baseDir;
    public File baseDirFile;
    public Multimap<String, String> buildProperties;
    public boolean isAbsolutePath;
    public boolean isFlat;
    public boolean isRecursive;
    public boolean isRegexp;
    public boolean isTargetDirectory;
    public Pattern pathPattern;
    public Pattern regexpExcludePattern;
    public Pattern regexpPattern;
    public int separatorsCount;
    public FilesGroup spec;
    public Set<String> symlinkSet = new HashSet();
    public String targetPath;
    public File workspace;

    public SingleSpecDeploymentProducer(FilesGroup filesGroup, File file, Multimap<String, String> multimap) {
        this.spec = filesGroup;
        this.workspace = file;
        this.buildProperties = multimap;
    }

    public void executeSpec(Set<DeployDetails> set, ProducerConsumerExecutor producerConsumerExecutor) throws InterruptedException, NoSuchAlgorithmException, IOException {
        init();
        File[] fileArrListFiles = new File(this.baseDir).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (Thread.interrupted()) {
                Thread.currentThread().interrupt();
                return;
            }
            if (file.isFile()) {
                processDeployCandidate(file, set, producerConsumerExecutor);
            } else if (this.isRecursive) {
                collectFiles(file.getAbsolutePath(), -1, set, producerConsumerExecutor);
            } else if (!this.isRegexp) {
                collectFiles(file.getAbsolutePath(), this.separatorsCount, set, producerConsumerExecutor);
            }
        }
    }

    public final void init() throws FileNotFoundException {
        String strPrepareWildcardPattern;
        this.isFlat = !"false".equalsIgnoreCase(this.spec.getFlat());
        this.isRecursive = !"false".equalsIgnoreCase(this.spec.getRecursive());
        this.isRegexp = BooleanUtils.toBoolean(this.spec.getRegexp());
        String localPath = UploadSpecHelper.getLocalPath(this.spec.getTarget());
        this.targetPath = localPath;
        this.isTargetDirectory = StringUtils.endsWith(localPath, "/");
        String pattern = this.spec.getPattern();
        this.isAbsolutePath = new File(pattern).isAbsolute();
        if (this.isRegexp) {
            String regexBaseDir = UploadSpecHelper.getRegexBaseDir(this.workspace, pattern);
            this.baseDir = regexBaseDir;
            strPrepareWildcardPattern = UploadSpecHelper.prepareRegexPattern(this.workspace, pattern, regexBaseDir);
            this.regexpPattern = Pattern.compile(strPrepareWildcardPattern);
        } else {
            String wildcardBaseDir = UploadSpecHelper.getWildcardBaseDir(this.workspace, pattern);
            this.baseDir = wildcardBaseDir;
            strPrepareWildcardPattern = UploadSpecHelper.prepareWildcardPattern(this.workspace, pattern, wildcardBaseDir);
            this.regexpPattern = Pattern.compile(PathsUtils.pathToRegExp(strPrepareWildcardPattern));
            pattern = PathsUtils.pathToRegExp(pattern);
        }
        this.separatorsCount = StringUtils.countMatches(strPrepareWildcardPattern, "/") + StringUtils.countMatches(this.baseDir, "/");
        this.pathPattern = Pattern.compile(pattern);
        String[] exclusions = this.spec.getExclusions();
        if (ArrayUtils.isEmpty(exclusions)) {
            exclusions = this.spec.getExcludePatterns();
        }
        String strPrepareExcludePattern = UploadSpecHelper.prepareExcludePattern(exclusions, !this.isRegexp, this.isRecursive);
        this.regexpExcludePattern = StringUtils.isBlank(strPrepareExcludePattern) ? null : Pattern.compile(strPrepareExcludePattern);
        this.baseDirFile = new File(this.baseDir);
    }

    public final void collectFiles(String str, int i, Set<DeployDetails> set, ProducerConsumerExecutor producerConsumerExecutor) throws InterruptedException, NoSuchAlgorithmException, IOException {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            if (Thread.interrupted()) {
                Thread.currentThread().interrupt();
                return;
            }
            String str2 = (String) linkedList.get(i2);
            if (i == -1 || StringUtils.countMatches(str2, File.separator) <= i) {
                File file = new File(str2);
                ArrayList arrayList = new ArrayList();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    arrayList.addAll(Arrays.asList(fileArrListFiles));
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            File file2 = (File) it.next();
                            if (Thread.interrupted()) {
                                Thread.currentThread().interrupt();
                                break;
                            } else if (file2.isDirectory()) {
                                if (!Files.isSymbolicLink(file2.toPath()) || this.symlinkSet.add(file2.getCanonicalPath())) {
                                    linkedList.add(file2.getAbsolutePath());
                                }
                            } else if (i == -1 || StringUtils.countMatches(file2.getPath(), File.separator) == i) {
                                processDeployCandidate(file2, set, producerConsumerExecutor);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void processDeployCandidate(File file, Set<DeployDetails> set, ProducerConsumerExecutor producerConsumerExecutor) throws InterruptedException, NoSuchAlgorithmException, IOException {
        if (isFileMatchPattern(file.getAbsolutePath().replace("\\", "/"), this.regexpPattern, this.regexpExcludePattern, this.workspace, this.baseDirFile)) {
            DeployDetails deployDetailsBuildDeployDetails = UploadSpecHelper.buildDeployDetails(UploadSpecHelper.getUploadPath(file, this.pathPattern, this.targetPath, this.isFlat, this.isAbsolutePath, this.workspace, this.isTargetDirectory), file, this.spec.getTarget(), this.spec.getExplode(), this.spec.getProps(), this.buildProperties);
            if (set.add(deployDetailsBuildDeployDetails)) {
                validateUploadLimit(set.size());
                producerConsumerExecutor.put(deployDetailsBuildDeployDetails);
            }
        }
    }

    public static boolean isFileMatchPattern(String str, Pattern pattern, Pattern pattern2, File file, File file2) {
        String absolutePath;
        File file3 = new File(str);
        if (!pattern.matcher(UploadSpecHelper.getRelativePath(file2, file3).replace("\\", "/")).matches()) {
            return false;
        }
        if (pattern2 == null) {
            return true;
        }
        if (file3.getAbsolutePath().startsWith(file.getAbsolutePath())) {
            absolutePath = UploadSpecHelper.getRelativeToWsPath(file3.getAbsolutePath(), file.getAbsolutePath());
        } else {
            absolutePath = file3.getAbsolutePath();
        }
        return true ^ pattern2.matcher(absolutePath).matches();
    }

    public static void validateUploadLimit(int i) {
        if (i >= 1000000) {
            throw new IllegalStateException("Too many artifacts to deploy were found.");
        }
    }
}
