package org.jfrog.build.api.dependency.pattern;

/* loaded from: classes7.dex */
public class DependencyPattern {
    public String matrixParams;
    public String pattern;
    public PatternType patternType;
    public String targetDirectory;

    public DependencyPattern(String str, String str2, String str3, PatternType patternType) {
        PatternType patternType2 = PatternType.NORMAL;
        this.pattern = str;
        this.matrixParams = str2;
        this.targetDirectory = str3;
        this.patternType = patternType;
    }

    public String getPattern() {
        return this.pattern;
    }

    public String getMatrixParams() {
        return this.matrixParams;
    }

    public String getTargetDirectory() {
        return this.targetDirectory;
    }

    public PatternType getPatternType() {
        return this.patternType;
    }
}
