package org.apache.ivy.plugins.latest;

import java.util.Date;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes5.dex */
public abstract class AbstractLatestStrategy implements LatestStrategy {
    public String name;

    @Override // org.apache.ivy.plugins.latest.LatestStrategy
    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name;
    }

    @Override // org.apache.ivy.plugins.latest.LatestStrategy
    public ArtifactInfo findLatest(ArtifactInfo[] artifactInfoArr, Date date) {
        List<ArtifactInfo> listSort = sort(artifactInfoArr);
        ListIterator<ArtifactInfo> listIterator = listSort.listIterator(listSort.size());
        while (listIterator.hasPrevious()) {
            ArtifactInfo artifactInfoPrevious = listIterator.previous();
            if (date == null || artifactInfoPrevious.getLastModified() < date.getTime()) {
                return artifactInfoPrevious;
            }
        }
        return null;
    }
}
