package org.apache.ivy.plugins.latest;

import java.util.Date;
import java.util.List;

/* loaded from: classes6.dex */
public interface LatestStrategy {
    ArtifactInfo findLatest(ArtifactInfo[] artifactInfoArr, Date date);

    String getName();

    List<ArtifactInfo> sort(ArtifactInfo[] artifactInfoArr);
}
