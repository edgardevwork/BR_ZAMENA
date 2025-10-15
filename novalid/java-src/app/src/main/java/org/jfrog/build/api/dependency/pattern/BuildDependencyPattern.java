package org.jfrog.build.api.dependency.pattern;

/* loaded from: classes5.dex */
public class BuildDependencyPattern extends DependencyPattern {
    public String buildName;
    public String buildNumber;

    public BuildDependencyPattern(String str, String str2, String str3, PatternType patternType, String str4, String str5) {
        super(str, str2, str3, patternType);
        this.buildName = str4;
        this.buildNumber = str5;
    }

    public String getBuildName() {
        return this.buildName;
    }

    public String getBuildNumber() {
        return this.buildNumber;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuildDependencyPattern)) {
            return false;
        }
        BuildDependencyPattern buildDependencyPattern = (BuildDependencyPattern) obj;
        return this.buildName.equals(buildDependencyPattern.buildName) && this.buildNumber.equals(buildDependencyPattern.buildNumber);
    }

    public int hashCode() {
        return (this.buildName.hashCode() * 31) + this.buildNumber.hashCode();
    }
}
