package org.jfrog.build.extractor.clientConfiguration.util;

import java.io.IOException;
import java.util.List;
import org.jfrog.build.api.search.AqlSearchResult;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.filespecs.entities.FilesGroup;

/* loaded from: classes7.dex */
public class ArtifactorySearcher {
    public final ArtifactoryManager artifactoryManager;
    public final Log log;

    public ArtifactorySearcher(ArtifactoryManager artifactoryManager, Log log) {
        this.artifactoryManager = artifactoryManager;
        this.log = log;
    }

    public List<AqlSearchResult.SearchEntry> SearchByFileSpec(FilesGroup filesGroup) throws IOException {
        AqlHelper aqlHelper = new AqlHelper(this.artifactoryManager, this.log, filesGroup);
        this.log.info("Searching for artifacts...");
        List<AqlSearchResult.SearchEntry> listRun = aqlHelper.run();
        this.log.info(String.format("Found %s artifacts.", Integer.valueOf(listRun.size())));
        return listRun;
    }
}
