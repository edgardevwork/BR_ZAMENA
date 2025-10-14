package org.apache.ivy.plugins.latest;

import java.util.Comparator;

/* loaded from: classes7.dex */
public class LatestTimeStrategy extends ComparatorLatestStrategy {
    public static final Comparator<ArtifactInfo> COMPARATOR = new Comparator<ArtifactInfo>() { // from class: org.apache.ivy.plugins.latest.LatestTimeStrategy.1
        @Override // java.util.Comparator
        public int compare(ArtifactInfo artifactInfo, ArtifactInfo artifactInfo2) {
            return Long.compare(artifactInfo.getLastModified(), artifactInfo2.getLastModified());
        }
    };

    public LatestTimeStrategy() {
        super(COMPARATOR);
        setName("latest-time");
    }
}
