package org.jfrog.build.extractor.clientConfiguration.client.distribution.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.IOException;
import java.io.Serializable;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.types.ReleaseBundleSpec;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.types.ReleaseNotes;
import org.jfrog.filespecs.FileSpec;

/* loaded from: classes7.dex */
public abstract class CreateUpdateReleaseBundleRequest implements Serializable {
    public static final long serialVersionUID = 1;
    public String description;

    @JsonProperty("dry_run")
    public boolean dryRun;

    @JsonProperty("release_notes")
    public ReleaseNotes releaseNotes;

    @JsonProperty("sign_immediately")
    public boolean signImmediately;
    public ReleaseBundleSpec spec;

    @JsonProperty("storing_repository")
    public String storingRepository;

    public ReleaseNotes getReleaseNotes() {
        return this.releaseNotes;
    }

    public void setReleaseNotes(ReleaseNotes releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    public boolean isSignImmediately() {
        return this.signImmediately;
    }

    public void setSignImmediately(boolean z) {
        this.signImmediately = z;
    }

    public ReleaseBundleSpec getSpec() {
        return this.spec;
    }

    public void setSpec(ReleaseBundleSpec releaseBundleSpec) {
        this.spec = releaseBundleSpec;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getStoringRepository() {
        return this.storingRepository;
    }

    public void setStoringRepository(String str) {
        this.storingRepository = str;
    }

    public boolean isDryRun() {
        return this.dryRun;
    }

    public void setDryRun(boolean z) {
        this.dryRun = z;
    }

    public static abstract class Builder<T extends CreateUpdateReleaseBundleRequest, B extends Builder<T, B>> {
        public String description;
        public boolean dryRun;
        public ReleaseNotes releaseNotes;
        public boolean signImmediately;
        public ReleaseBundleSpec spec;
        public String storingRepository;

        public abstract T build();

        public final B self() {
            return this;
        }

        public B releaseNotes(ReleaseNotes releaseNotes) {
            this.releaseNotes = releaseNotes;
            return (B) self();
        }

        public B storingRepository(String str) {
            this.storingRepository = str;
            return (B) self();
        }

        public B signImmediately(boolean z) {
            this.signImmediately = z;
            return (B) self();
        }

        public B spec(String str) throws IOException {
            this.spec = Utils.createReleaseBundleSpec(str);
            return (B) self();
        }

        public B spec(FileSpec fileSpec) throws IOException {
            this.spec = Utils.createReleaseBundleSpec(fileSpec);
            return (B) self();
        }

        public B description(String str) {
            this.description = str;
            return (B) self();
        }

        public B dryRun(boolean z) {
            this.dryRun = z;
            return (B) self();
        }

        public T build(T t) {
            t.setReleaseNotes(this.releaseNotes);
            t.setStoringRepository(this.storingRepository);
            t.setSignImmediately(this.signImmediately);
            t.setDescription(this.description);
            t.setDryRun(this.dryRun);
            t.setSpec(this.spec);
            return t;
        }
    }
}
