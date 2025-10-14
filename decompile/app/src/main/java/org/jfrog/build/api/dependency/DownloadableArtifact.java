package org.jfrog.build.api.dependency;

import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.dependency.pattern.PatternType;

/* loaded from: classes7.dex */
public class DownloadableArtifact implements Serializable {
    public boolean explode;
    public String filePath;
    public String matrixParameters;
    public PatternType patternType;
    public String relativeDirPath;
    public String repoUrl;
    public String sourcePattern;
    public String targetDirPath;

    public DownloadableArtifact() {
    }

    public DownloadableArtifact(String str, String str2, String str3, String str4, String str5, PatternType patternType) {
        this.repoUrl = str;
        this.targetDirPath = str2 == null ? "" : str2;
        this.filePath = str3;
        this.matrixParameters = str4;
        this.patternType = patternType;
        this.sourcePattern = extractRepoFromPattern(str5);
        this.relativeDirPath = calculateRelativeDirFromPattern();
    }

    public final String extractRepoFromPattern(String str) {
        int iIndexOf = StringUtils.indexOf(str, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
        return iIndexOf == -1 ? str : StringUtils.substring(str, iIndexOf + 1, StringUtils.length(str));
    }

    public final String calculateRelativeDirFromPattern() {
        String strSubstring;
        int iLastIndexOf;
        int iIndexOf = this.sourcePattern.indexOf(42);
        if (iIndexOf > 1 && (iLastIndexOf = (strSubstring = this.sourcePattern.substring(0, iIndexOf)).lastIndexOf(47)) > 1) {
            String strSubstring2 = strSubstring.substring(0, iLastIndexOf + 1);
            if (this.filePath.startsWith(strSubstring2)) {
                return this.filePath.substring(strSubstring2.length());
            }
        }
        return this.filePath;
    }

    public String getRepoUrl() {
        return this.repoUrl;
    }

    public String getTargetDirPath() {
        return this.targetDirPath;
    }

    public void setTargetDirPath(String str) {
        this.targetDirPath = str;
    }

    public String getRelativeDirPath() {
        return this.relativeDirPath;
    }

    public void setRelativeDirPath(String str) {
        this.relativeDirPath = str;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getMatrixParameters() {
        return this.matrixParameters;
    }

    public PatternType getPatternType() {
        return this.patternType;
    }

    public String getSourcePattern() {
        return this.sourcePattern;
    }

    public boolean isExplode() {
        return this.explode;
    }

    public void setExplode(boolean z) {
        this.explode = z;
    }
}
