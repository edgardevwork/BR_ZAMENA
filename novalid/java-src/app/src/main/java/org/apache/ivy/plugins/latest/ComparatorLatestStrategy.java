package org.apache.ivy.plugins.latest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes8.dex */
public class ComparatorLatestStrategy extends AbstractLatestStrategy {
    public Comparator<ArtifactInfo> comparator;

    public ComparatorLatestStrategy() {
    }

    public ComparatorLatestStrategy(Comparator<ArtifactInfo> comparator) {
        this.comparator = comparator;
    }

    @Override // org.apache.ivy.plugins.latest.LatestStrategy
    public List<ArtifactInfo> sort(ArtifactInfo[] artifactInfoArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(artifactInfoArr));
        Collections.sort(arrayList, this.comparator);
        return arrayList;
    }

    public Comparator<ArtifactInfo> getComparator() {
        return this.comparator;
    }

    public void setComparator(Comparator<ArtifactInfo> comparator) {
        this.comparator = comparator;
    }
}
