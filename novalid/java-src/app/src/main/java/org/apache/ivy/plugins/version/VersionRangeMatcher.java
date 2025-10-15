package org.apache.ivy.plugins.version;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.latest.ArtifactInfo;
import org.apache.ivy.plugins.latest.LatestStrategy;

/* loaded from: classes5.dex */
public class VersionRangeMatcher extends AbstractVersionMatcher {
    public static final String ANY_NON_SPECIAL_PATTERN = "[^\\s,\\[\\]\\(\\]\\[\\)\\(\\)]";
    public static final String CLOSE_EXC = "[";
    public static final String CLOSE_EXC_MAVEN = ")";
    public static final String CLOSE_EXC_PATTERN = "\\[\\)";
    public static final String CLOSE_INC = "]";
    public static final String CLOSE_INC_PATTERN = "\\]";
    public static final String CLOSE_PATTERN = "[\\]\\[\\)]";
    public static final String LI_PATTERN = "\\(";
    public static final String LOWER_INFINITE = "(";
    public static final String OPEN_EXC = "]";
    public static final String OPEN_EXC_MAVEN = "(";
    public static final String OPEN_EXC_PATTERN = "\\]\\(";
    public static final String OPEN_INC = "[";
    public static final String OPEN_INC_PATTERN = "\\[";
    public static final String OPEN_PATTERN = "[\\[\\]\\(]";
    public static final String SEPARATOR = ",";
    public static final String SEP_PATTERN = "\\s*\\,\\s*";
    public static final String UI_PATTERN = "\\)";
    public static final String UPPER_INFINITE = ")";
    public final Comparator<ModuleRevisionId> comparator;
    public LatestStrategy latestStrategy;
    public String latestStrategyName;
    public static final String FINITE_PATTERN = "[\\[\\]\\(]\\s*([^\\s,\\[\\]\\(\\]\\[\\)\\(\\)]+)\\s*\\,\\s*([^\\s,\\[\\]\\(\\]\\[\\)\\(\\)]+)\\s*[\\]\\[\\)]";
    public static final Pattern FINITE_RANGE = Pattern.compile(FINITE_PATTERN);
    public static final String LOWER_INFINITE_PATTERN = "\\(\\s*\\,\\s*([^\\s,\\[\\]\\(\\]\\[\\)\\(\\)]+)\\s*[\\]\\[\\)]";
    public static final Pattern LOWER_INFINITE_RANGE = Pattern.compile(LOWER_INFINITE_PATTERN);
    public static final String UPPER_INFINITE_PATTERN = "[\\[\\]\\(]\\s*([^\\s,\\[\\]\\(\\]\\[\\)\\(\\)]+)\\s*\\,\\s*\\)";
    public static final Pattern UPPER_INFINITE_RANGE = Pattern.compile(UPPER_INFINITE_PATTERN);
    public static final Pattern ALL_RANGE = Pattern.compile("[\\[\\]\\(]\\s*([^\\s,\\[\\]\\(\\]\\[\\)\\(\\)]+)\\s*\\,\\s*([^\\s,\\[\\]\\(\\]\\[\\)\\(\\)]+)\\s*[\\]\\[\\)]|\\(\\s*\\,\\s*([^\\s,\\[\\]\\(\\]\\[\\)\\(\\)]+)\\s*[\\]\\[\\)]|[\\[\\]\\(]\\s*([^\\s,\\[\\]\\(\\]\\[\\)\\(\\)]+)\\s*\\,\\s*\\)");

    public final class MRIDArtifactInfo implements ArtifactInfo {
        public ModuleRevisionId mrid;

        @Override // org.apache.ivy.plugins.latest.ArtifactInfo
        public long getLastModified() {
            return 0L;
        }

        public MRIDArtifactInfo(ModuleRevisionId moduleRevisionId) {
            this.mrid = moduleRevisionId;
        }

        @Override // org.apache.ivy.plugins.latest.ArtifactInfo
        public String getRevision() {
            return this.mrid.getRevision();
        }
    }

    public VersionRangeMatcher() {
        super("version-range");
        this.comparator = new Comparator<ModuleRevisionId>() { // from class: org.apache.ivy.plugins.version.VersionRangeMatcher.1
            @Override // java.util.Comparator
            public int compare(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
                if (moduleRevisionId.equals(moduleRevisionId2)) {
                    return 0;
                }
                MRIDArtifactInfo mRIDArtifactInfo = VersionRangeMatcher.this.new MRIDArtifactInfo(moduleRevisionId);
                return VersionRangeMatcher.this.getLatestStrategy().findLatest(new ArtifactInfo[]{mRIDArtifactInfo, VersionRangeMatcher.this.new MRIDArtifactInfo(moduleRevisionId2)}, null) == mRIDArtifactInfo ? -1 : 1;
            }
        };
        this.latestStrategyName = "default";
    }

    public VersionRangeMatcher(String str) {
        super(str);
        this.comparator = new Comparator<ModuleRevisionId>() { // from class: org.apache.ivy.plugins.version.VersionRangeMatcher.1
            @Override // java.util.Comparator
            public int compare(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
                if (moduleRevisionId.equals(moduleRevisionId2)) {
                    return 0;
                }
                MRIDArtifactInfo mRIDArtifactInfo = VersionRangeMatcher.this.new MRIDArtifactInfo(moduleRevisionId);
                return VersionRangeMatcher.this.getLatestStrategy().findLatest(new ArtifactInfo[]{mRIDArtifactInfo, VersionRangeMatcher.this.new MRIDArtifactInfo(moduleRevisionId2)}, null) == mRIDArtifactInfo ? -1 : 1;
            }
        };
        this.latestStrategyName = "default";
    }

    public VersionRangeMatcher(String str, LatestStrategy latestStrategy) {
        super(str);
        this.comparator = new Comparator<ModuleRevisionId>() { // from class: org.apache.ivy.plugins.version.VersionRangeMatcher.1
            @Override // java.util.Comparator
            public int compare(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
                if (moduleRevisionId.equals(moduleRevisionId2)) {
                    return 0;
                }
                MRIDArtifactInfo mRIDArtifactInfo = VersionRangeMatcher.this.new MRIDArtifactInfo(moduleRevisionId);
                return VersionRangeMatcher.this.getLatestStrategy().findLatest(new ArtifactInfo[]{mRIDArtifactInfo, VersionRangeMatcher.this.new MRIDArtifactInfo(moduleRevisionId2)}, null) == mRIDArtifactInfo ? -1 : 1;
            }
        };
        this.latestStrategyName = "default";
        this.latestStrategy = latestStrategy;
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean isDynamic(ModuleRevisionId moduleRevisionId) {
        return ALL_RANGE.matcher(moduleRevisionId.getRevision()).matches();
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean accept(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
        String revision = moduleRevisionId.getRevision();
        Matcher matcher = FINITE_RANGE.matcher(revision);
        if (matcher.matches()) {
            return isUpper(moduleRevisionId, matcher.group(1), moduleRevisionId2, revision.startsWith("[")) && isLower(moduleRevisionId, matcher.group(2), moduleRevisionId2, revision.endsWith("]"));
        }
        Matcher matcher2 = LOWER_INFINITE_RANGE.matcher(revision);
        if (matcher2.matches()) {
            return isLower(moduleRevisionId, matcher2.group(1), moduleRevisionId2, revision.endsWith("]"));
        }
        Matcher matcher3 = UPPER_INFINITE_RANGE.matcher(revision);
        if (matcher3.matches()) {
            return isUpper(moduleRevisionId, matcher3.group(1), moduleRevisionId2, revision.startsWith("["));
        }
        return false;
    }

    public final boolean isLower(ModuleRevisionId moduleRevisionId, String str, ModuleRevisionId moduleRevisionId2, boolean z) {
        return this.comparator.compare(ModuleRevisionId.newInstance(moduleRevisionId, str), moduleRevisionId2) <= (z ? 0 : -1);
    }

    public final boolean isUpper(ModuleRevisionId moduleRevisionId, String str, ModuleRevisionId moduleRevisionId2, boolean z) {
        return this.comparator.compare(ModuleRevisionId.newInstance(moduleRevisionId, str), moduleRevisionId2) >= (!z ? 1 : 0);
    }

    @Override // org.apache.ivy.plugins.version.AbstractVersionMatcher, org.apache.ivy.plugins.version.VersionMatcher
    public int compare(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2, Comparator<ModuleRevisionId> comparator) {
        String strGroup;
        String revision = moduleRevisionId.getRevision();
        if (UPPER_INFINITE_RANGE.matcher(revision).matches()) {
            return 1;
        }
        Matcher matcher = FINITE_RANGE.matcher(revision);
        if (matcher.matches()) {
            strGroup = matcher.group(2);
        } else {
            Matcher matcher2 = LOWER_INFINITE_RANGE.matcher(revision);
            if (matcher2.matches()) {
                strGroup = matcher2.group(1);
            } else {
                throw new IllegalArgumentException("impossible to compare: askedMrid is not a dynamic revision: " + moduleRevisionId);
            }
        }
        int iCompare = comparator.compare(ModuleRevisionId.newInstance(moduleRevisionId, strGroup), moduleRevisionId2);
        if (iCompare == 0) {
            return -1;
        }
        return iCompare;
    }

    public LatestStrategy getLatestStrategy() {
        if (this.latestStrategy == null) {
            if (getSettings() == null) {
                throw new IllegalStateException("no ivy instance nor latest strategy configured in version range matcher " + this);
            }
            if (this.latestStrategyName == null) {
                throw new IllegalStateException("null latest strategy defined in version range matcher " + this);
            }
            LatestStrategy latestStrategy = getSettings().getLatestStrategy(this.latestStrategyName);
            this.latestStrategy = latestStrategy;
            if (latestStrategy == null) {
                throw new IllegalStateException("unknown latest strategy '" + this.latestStrategyName + "' configured in version range matcher " + this);
            }
        }
        return this.latestStrategy;
    }

    public void setLatestStrategy(LatestStrategy latestStrategy) {
        this.latestStrategy = latestStrategy;
    }

    public void setLatest(String str) {
        this.latestStrategyName = str;
    }
}
