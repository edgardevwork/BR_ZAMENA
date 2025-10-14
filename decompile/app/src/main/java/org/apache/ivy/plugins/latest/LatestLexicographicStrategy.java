package org.apache.ivy.plugins.latest;

import java.util.Comparator;
import org.apache.commons.compress.java.util.jar.Pack200;

/* loaded from: classes7.dex */
public class LatestLexicographicStrategy extends ComparatorLatestStrategy {
    public static final Comparator<ArtifactInfo> COMPARATOR = new Comparator<ArtifactInfo>() { // from class: org.apache.ivy.plugins.latest.LatestLexicographicStrategy.1
        @Override // java.util.Comparator
        public int compare(ArtifactInfo artifactInfo, ArtifactInfo artifactInfo2) {
            String revision = artifactInfo.getRevision();
            String revision2 = artifactInfo2.getRevision();
            if (revision.startsWith(Pack200.Packer.LATEST)) {
                return 1;
            }
            if (revision.endsWith("+") && revision2.startsWith(revision.substring(0, revision.length() - 1))) {
                return 1;
            }
            if (revision2.startsWith(Pack200.Packer.LATEST)) {
                return -1;
            }
            if (revision2.endsWith("+") && revision.startsWith(revision2.substring(0, revision2.length() - 1))) {
                return -1;
            }
            return revision.compareTo(revision2);
        }
    };

    public LatestLexicographicStrategy() {
        super(COMPARATOR);
        setName("latest-lexico");
    }
}
