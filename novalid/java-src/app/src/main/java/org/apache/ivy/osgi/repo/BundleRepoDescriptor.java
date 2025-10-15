package org.apache.ivy.osgi.repo;

import java.net.URI;
import java.text.ParseException;
import java.util.Iterator;
import org.apache.ivy.osgi.core.BundleArtifact;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.core.ExecutionEnvironmentProfileProvider;
import org.apache.ivy.osgi.core.ManifestParser;
import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public class BundleRepoDescriptor extends EditableRepoDescriptor {
    public String lastModified;
    public String name;

    public BundleRepoDescriptor(URI uri, ExecutionEnvironmentProfileProvider executionEnvironmentProfileProvider) {
        super(uri, executionEnvironmentProfileProvider);
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public void setLastModified(String str) {
        this.lastModified = str;
    }

    public String getLastModified() {
        return this.lastModified;
    }

    public void populate(Iterator<ManifestAndLocation> it) {
        while (it.hasNext()) {
            ManifestAndLocation next = it.next();
            try {
                BundleInfo manifest = ManifestParser.parseManifest(next.getManifest());
                manifest.addArtifact(new BundleArtifact(false, next.getUri(), null));
                addBundle(manifest);
            } catch (ParseException e) {
                Message.error("Rejected " + next.getUri() + ": " + e.getMessage());
            }
        }
    }
}
