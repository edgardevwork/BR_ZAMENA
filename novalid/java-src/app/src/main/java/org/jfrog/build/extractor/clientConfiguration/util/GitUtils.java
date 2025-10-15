package org.jfrog.build.extractor.clientConfiguration.util;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.executor.CommandExecutor;
import org.jfrog.build.extractor.executor.CommandResults;
import org.jfrog.build.extractor.p065ci.Vcs;

/* loaded from: classes7.dex */
public class GitUtils {
    public static final String GIT_LOG_LIMIT = "100";

    public static File getDotGit(File file) {
        if (file == null) {
            return null;
        }
        File file2 = new File(file, ".git");
        return file2.exists() ? file2 : getDotGit(file.getParentFile());
    }

    public static Vcs extractVcs(File file, Log log) throws IOException {
        log.debug("Extracting Vcs details from the .git directory.");
        File dotGit = getDotGit(file);
        if (dotGit == null) {
            log.debug("Could not find the .git directory.");
            return new Vcs();
        }
        if (dotGit.isFile()) {
            dotGit = getSubmoduleDotGit(dotGit);
        }
        Vcs vcs = new Vcs();
        vcs.setRevision(extractVcsRevision(dotGit, log));
        vcs.setUrl(extractVcsUrl(dotGit, log));
        vcs.setMessage(extractVcsMessage(dotGit, log));
        vcs.setBranch(extractVcsBranch(dotGit, log));
        return vcs;
    }

    public static File getSubmoduleDotGit(File file) throws IOException {
        File file2 = new File(file.getParent() + File.separator + extractSubmoduleDotGitPath(file));
        if (file2.exists()) {
            return file2;
        }
        throw new IOException("Could not find the .git directory of a submodule.");
    }

    public static String extractSubmoduleDotGitPath(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null && line.startsWith("gitdir: ")) {
                String strTrim = line.substring(line.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER) + 1).trim();
                bufferedReader.close();
                return strTrim;
            }
            bufferedReader.close();
            throw new IOException("Failed to parse .git path for submodule.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r0.endsWith(".git") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r0 = r0 + ".git";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r4 = org.jfrog.build.extractor.UrlUtils.removeCredentialsFromUrl(r0);
        r5.debug("Fetched url from git config: " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String extractVcsUrl(File file, Log log) throws IOException {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file, "config")));
        boolean z = false;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    strTrim = "";
                    break;
                }
                if (z) {
                    line = line.trim();
                    if (line.startsWith("url")) {
                        String[] strArrSplit = line.split(URLEncodedUtils.NAME_VALUE_SEPARATOR);
                        if (strArrSplit.length < 2) {
                            throw new IOException("Failed to parse .git config");
                        }
                        strTrim = strArrSplit[1].trim();
                    }
                }
                if (line.equals("[remote \"origin\"]")) {
                    z = true;
                }
            } finally {
            }
        }
    }

    public static String extractVcsRevision(File file, Log log) throws IOException {
        BufferedReader bufferedReader;
        String line;
        RevisionOrRef revisionOrBranchPath = getRevisionOrBranchPath(file);
        if (org.apache.commons.lang3.StringUtils.isNotEmpty(revisionOrBranchPath.revision)) {
            log.debug("Fetched revision from git config: " + revisionOrBranchPath.revision);
            return revisionOrBranchPath.revision;
        }
        File file2 = new File(file, revisionOrBranchPath.ref);
        if (file2.exists()) {
            bufferedReader = new BufferedReader(new FileReader(file2));
            try {
                String line2 = bufferedReader.readLine();
                if (line2 != null) {
                    log.debug("Fetched revision from git config: " + line2.trim());
                    String strTrim = line2.trim();
                    bufferedReader.close();
                    return strTrim;
                }
                bufferedReader.close();
            } finally {
            }
        } else {
            File file3 = new File(file, "packed-refs");
            if (file3.exists()) {
                bufferedReader = new BufferedReader(new FileReader(file3));
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                        }
                    } finally {
                        try {
                            throw th;
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    }
                } while (!line.endsWith(revisionOrBranchPath.ref));
                String str = line.split("\\s+")[0];
                bufferedReader.close();
                return str;
            }
        }
        log.warn("Failed fetching revision from git config, from ref: " + revisionOrBranchPath.ref);
        return "";
    }

    public static RevisionOrRef getRevisionOrBranchPath(File file) throws IOException {
        File file2 = new File(file, "HEAD");
        RevisionOrRef revisionOrRef = new RevisionOrRef();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    if (line.startsWith("ref")) {
                        String[] strArrSplit = line.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        if (strArrSplit.length < 2) {
                            throw new IOException("Failed to parse .git config");
                        }
                        revisionOrRef.ref = strArrSplit[1].trim();
                        bufferedReader.close();
                        return revisionOrRef;
                    }
                    revisionOrRef.revision = line;
                } else {
                    bufferedReader.close();
                    return revisionOrRef;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    public static String extractVcsBranch(File file, Log log) throws IOException {
        RevisionOrRef revisionOrBranchPath = getRevisionOrBranchPath(file);
        if (!org.apache.commons.lang3.StringUtils.isNotBlank(revisionOrBranchPath.ref)) {
            log.debug("Failed fetching git branch from git directory: " + file + ". Might be in detached head.");
            return "";
        }
        return revisionOrBranchPath.ref.split("/")[r2.length - 1];
    }

    public static String extractVcsMessage(File file, Log log) {
        String str = "Failed fetching commit message from git directory: " + file + "\nWith the following error: ";
        try {
            CommandResults gitLog = getGitLog(file, log, 1);
            if (gitLog.isOk()) {
                return gitLog.getRes().trim();
            }
            log.warn(str + gitLog.getErr());
            return "";
        } catch (IOException e) {
            e = e;
            log.warn(str + e.getMessage());
            return "";
        } catch (InterruptedException e2) {
            e = e2;
            log.warn(str + e.getMessage());
            return "";
        }
    }

    public static class RevisionOrRef {
        public String ref;
        public String revision;

        public RevisionOrRef() {
        }
    }

    public static CommandResults getGitLog(File file, Log log, String str) throws InterruptedException, IOException {
        return getGitLog(file, log, str, 0);
    }

    public static CommandResults getGitLog(File file, Log log, int i) throws InterruptedException, IOException {
        return getGitLog(file, log, "", i);
    }

    public static CommandResults getGitLog(File file, Log log, String str, int i) throws InterruptedException, IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add("log");
        arrayList.add("--pretty=format:%s");
        StringBuilder sb = new StringBuilder();
        sb.append("-");
        sb.append(i == 0 ? "100" : Integer.valueOf(i));
        arrayList.add(sb.toString());
        if (!str.isEmpty()) {
            arrayList.add(str + "..");
        }
        return new CommandExecutor("git", null).exeCommand(file, arrayList, null, log);
    }
}
