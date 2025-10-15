package org.apache.ivy.plugins.version;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes5.dex */
public class MavenTimedSnapshotVersionMatcher extends AbstractVersionMatcher {
    public static final Pattern M2_TIMESTAMPED_SNAPSHOT_REV_PATTERN = Pattern.compile("^(.*)-([0-9]{8}.[0-9]{6})-([0-9]+)$");
    public static final String SNAPSHOT_SUFFIX = "-SNAPSHOT";

    public MavenTimedSnapshotVersionMatcher() {
        super("maven-timed-snapshot");
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean isDynamic(ModuleRevisionId moduleRevisionId) {
        if (moduleRevisionId == null) {
            return false;
        }
        return M2_TIMESTAMPED_SNAPSHOT_REV_PATTERN.matcher(moduleRevisionId.getRevision()).matches();
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean accept(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
        MavenSnapshotRevision mavenSnapshotRevisionComputeIfSnapshot;
        MavenSnapshotRevision mavenSnapshotRevisionComputeIfSnapshot2;
        if (moduleRevisionId == null || moduleRevisionId2 == null || (mavenSnapshotRevisionComputeIfSnapshot = computeIfSnapshot(moduleRevisionId.getRevision())) == null || !mavenSnapshotRevisionComputeIfSnapshot.isTimestampedSnapshot() || (mavenSnapshotRevisionComputeIfSnapshot2 = computeIfSnapshot(moduleRevisionId2.getRevision())) == null) {
            return false;
        }
        return mavenSnapshotRevisionComputeIfSnapshot.baseRevision.equals(mavenSnapshotRevisionComputeIfSnapshot2.baseRevision);
    }

    public static MavenSnapshotRevision computeIfSnapshot(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            return null;
        }
        boolean zEndsWith = str.endsWith(SNAPSHOT_SUFFIX);
        Matcher matcher = M2_TIMESTAMPED_SNAPSHOT_REV_PATTERN.matcher(str);
        boolean zMatches = matcher.matches();
        if (!zEndsWith && !zMatches) {
            return null;
        }
        if (zMatches) {
            return new MavenSnapshotRevision(true, str, matcher.group(1));
        }
        return new MavenSnapshotRevision(false, str, str.substring(0, str.indexOf(SNAPSHOT_SUFFIX)));
    }

    /* loaded from: classes6.dex */
    public static final class MavenSnapshotRevision {
        public final String baseRevision;
        public final boolean timedsnapshot;
        public final String wholeRevision;

        public MavenSnapshotRevision(boolean z, String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("Revision, of a Maven snapshot, cannot be null");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Base revision, of a Maven snapshot revision, cannot be null");
            }
            this.timedsnapshot = z;
            this.wholeRevision = str;
            this.baseRevision = str2;
        }

        public boolean isTimestampedSnapshot() {
            return this.timedsnapshot;
        }

        public String getBaseRevision() {
            return this.baseRevision;
        }

        public String getRevision() {
            return this.wholeRevision;
        }
    }
}
