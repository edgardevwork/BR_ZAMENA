package org.jfrog.build.extractor.clientConfiguration.client.distribution.request;

import java.io.IOException;
import java.util.ArrayList;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.types.ReleaseBundleQuery;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.types.ReleaseBundleSpec;
import org.jfrog.filespecs.DistributionHelper;
import org.jfrog.filespecs.FileSpec;
import org.jfrog.filespecs.distribution.DistributionSpecComponent;

/* loaded from: classes7.dex */
public class Utils {
    public static ReleaseBundleSpec createReleaseBundleSpec(String str) throws IOException {
        return createReleaseBundleSpec(FileSpec.fromString(str));
    }

    public static ReleaseBundleSpec createReleaseBundleSpec(FileSpec fileSpec) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (DistributionSpecComponent distributionSpecComponent : DistributionHelper.toSpecComponents(fileSpec)) {
            ReleaseBundleQuery releaseBundleQuery = new ReleaseBundleQuery();
            releaseBundleQuery.setAql(distributionSpecComponent.getAql());
            releaseBundleQuery.setAddedProps(distributionSpecComponent.getAddedProps());
            releaseBundleQuery.setMappings(distributionSpecComponent.getMappings());
            arrayList.add(releaseBundleQuery);
        }
        ReleaseBundleSpec releaseBundleSpec = new ReleaseBundleSpec();
        releaseBundleSpec.setQueries(arrayList);
        return releaseBundleSpec;
    }
}
