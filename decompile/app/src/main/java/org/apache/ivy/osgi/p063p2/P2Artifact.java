package org.apache.ivy.osgi.p063p2;

import org.apache.ivy.osgi.util.Version;

/* loaded from: classes5.dex */
public class P2Artifact {
    public String classifier;

    /* renamed from: id */
    public String f9976id;
    public Version version;

    public P2Artifact(String str, Version version, String str2) {
        this.f9976id = str;
        this.version = version;
        this.classifier = str2;
    }

    public String getClassifier() {
        return this.classifier;
    }

    public String getId() {
        return this.f9976id;
    }

    public Version getVersion() {
        return this.version;
    }

    public String toString() {
        return this.f9976id + "@" + this.version + " (" + this.classifier + ")";
    }
}
