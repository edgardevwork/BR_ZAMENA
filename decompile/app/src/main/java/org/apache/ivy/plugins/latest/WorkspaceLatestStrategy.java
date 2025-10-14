package org.apache.ivy.plugins.latest;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.java.util.jar.Pack200;

/* loaded from: classes8.dex */
public class WorkspaceLatestStrategy extends AbstractLatestStrategy {
    public LatestStrategy delegate;

    public WorkspaceLatestStrategy(LatestStrategy latestStrategy) {
        this.delegate = latestStrategy;
        setName("workspace-" + latestStrategy.getName());
    }

    @Override // org.apache.ivy.plugins.latest.LatestStrategy
    public List<ArtifactInfo> sort(ArtifactInfo[] artifactInfoArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ArtifactInfo artifactInfo : this.delegate.sort(artifactInfoArr)) {
            String revision = artifactInfo.getRevision();
            if (revision.startsWith(Pack200.Packer.LATEST) || revision.startsWith("working")) {
                arrayList.add(artifactInfo);
            } else {
                arrayList2.add(artifactInfo);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
