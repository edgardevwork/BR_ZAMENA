package org.jfrog.build.extractor.clientConfiguration.util;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jfrog.build.api.search.AqlSearchResult;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.filespecs.FileSpec;
import org.jfrog.filespecs.entities.FilesGroup;

/* loaded from: classes7.dex */
public class EditPropertiesHelper {
    public final ArtifactoryManager artifactoryManager;
    public final Log log;

    public enum EditPropertiesActionType {
        SET,
        DELETE
    }

    public EditPropertiesHelper(ArtifactoryManager artifactoryManager, Log log) {
        this.artifactoryManager = artifactoryManager;
        this.log = log;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean editProperties(FileSpec fileSpec, EditPropertiesActionType editPropertiesActionType, String str) throws IOException {
        ArtifactorySearcher artifactorySearcher = new ArtifactorySearcher(this.artifactoryManager, this.log);
        boolean z = false;
        for (FilesGroup filesGroup : fileSpec.getFiles()) {
            this.log.debug("Editing properties using spec: \n" + filesGroup.toString());
            boolean z2 = true;
            if (editPropertiesActionType == EditPropertiesActionType.SET) {
                if (!setPropertiesOnResults(artifactorySearcher.SearchByFileSpec(filesGroup), str) && !z) {
                    z2 = false;
                }
            } else if (deletePropertiesOnResults(artifactorySearcher.SearchByFileSpec(filesGroup), str) || z) {
            }
            z = z2;
        }
        return z;
    }

    public final boolean setPropertiesOnResults(List<AqlSearchResult.SearchEntry> list, String str) throws IOException {
        this.log.info("Setting properties...");
        Iterator<AqlSearchResult.SearchEntry> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String strBuildEntryUrl = buildEntryUrl(it.next());
            this.log.info(String.format("Setting the properties: '%s', on artifact: %s", str, strBuildEntryUrl));
            this.artifactoryManager.setProperties(strBuildEntryUrl, str, true);
            z = true;
        }
        this.log.info("Done setting properties.");
        return z;
    }

    public final boolean deletePropertiesOnResults(List<AqlSearchResult.SearchEntry> list, String str) throws IOException {
        this.log.info("Deleting properties...");
        Iterator<AqlSearchResult.SearchEntry> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String strBuildEntryUrl = buildEntryUrl(it.next());
            this.log.info(String.format("Deleting the properties: '%s', on artifact: %s", str, strBuildEntryUrl));
            this.artifactoryManager.deleteProperties(strBuildEntryUrl, str);
            z = true;
        }
        this.log.info("Done deleting properties.");
        return z;
    }

    public final String buildEntryUrl(AqlSearchResult.SearchEntry searchEntry) {
        String str;
        if (searchEntry.getPath().equals(".")) {
            str = "";
        } else {
            str = searchEntry.getPath() + "/";
        }
        return searchEntry.getRepo() + "/" + str + searchEntry.getName();
    }
}
