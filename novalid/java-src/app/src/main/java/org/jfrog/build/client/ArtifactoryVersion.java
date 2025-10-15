package org.jfrog.build.client;

/* loaded from: classes5.dex */
public class ArtifactoryVersion extends Version {
    public static final ArtifactoryVersion NOT_FOUND = new ArtifactoryVersion("0.0.0");
    public final boolean addons;

    public ArtifactoryVersion(String str) {
        this(str, false);
    }

    public ArtifactoryVersion(String str, boolean z) {
        super(str);
        this.addons = z;
    }

    public boolean hasAddons() {
        return this.addons;
    }

    public boolean isOSS() {
        return !hasAddons();
    }
}
