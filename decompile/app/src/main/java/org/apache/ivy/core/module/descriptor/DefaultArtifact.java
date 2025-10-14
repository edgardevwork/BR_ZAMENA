package org.apache.ivy.core.module.descriptor;

import java.net.URL;
import java.util.Date;
import java.util.Map;
import org.apache.ivy.core.module.p062id.ArtifactRevisionId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes5.dex */
public class DefaultArtifact extends AbstractArtifact {
    public ArtifactRevisionId arid;
    public boolean isMetadata;
    public Date publicationDate;
    public URL url;

    public static Artifact newIvyArtifact(ModuleRevisionId moduleRevisionId, Date date) {
        return new DefaultArtifact(moduleRevisionId, date, ClientConfigurationFields.IVY, ClientConfigurationFields.IVY, "xml", true);
    }

    public static Artifact newPomArtifact(ModuleRevisionId moduleRevisionId, Date date) {
        return new DefaultArtifact(moduleRevisionId, date, moduleRevisionId.getName(), "pom", "pom", true);
    }

    public static Artifact cloneWithAnotherExt(Artifact artifact, String str) {
        return cloneWithAnotherTypeAndExt(artifact, artifact.getType(), str);
    }

    public static Artifact cloneWithAnotherType(Artifact artifact, String str) {
        return cloneWithAnotherTypeAndExt(artifact, str, artifact.getExt());
    }

    public static Artifact cloneWithAnotherTypeAndExt(Artifact artifact, String str, String str2) {
        return new DefaultArtifact(ArtifactRevisionId.newInstance(artifact.getModuleRevisionId(), artifact.getName(), str, str2, artifact.getQualifiedExtraAttributes()), artifact.getPublicationDate(), artifact.getUrl(), artifact.isMetadata());
    }

    public static Artifact cloneWithAnotherName(Artifact artifact, String str) {
        return new DefaultArtifact(ArtifactRevisionId.newInstance(artifact.getModuleRevisionId(), str, artifact.getType(), artifact.getExt(), artifact.getQualifiedExtraAttributes()), artifact.getPublicationDate(), artifact.getUrl(), artifact.isMetadata());
    }

    public static Artifact cloneWithAnotherMrid(Artifact artifact, ModuleRevisionId moduleRevisionId) {
        return new DefaultArtifact(ArtifactRevisionId.newInstance(moduleRevisionId, artifact.getName(), artifact.getType(), artifact.getExt(), artifact.getQualifiedExtraAttributes()), artifact.getPublicationDate(), artifact.getUrl(), artifact.isMetadata());
    }

    public DefaultArtifact(ModuleRevisionId moduleRevisionId, Date date, String str, String str2, String str3) {
        this(moduleRevisionId, date, str, str2, str3, null, null);
    }

    public DefaultArtifact(ModuleRevisionId moduleRevisionId, Date date, String str, String str2, String str3, boolean z) {
        this(moduleRevisionId, date, str, str2, str3, null, null);
        this.isMetadata = z;
    }

    public DefaultArtifact(ModuleRevisionId moduleRevisionId, Date date, String str, String str2, String str3, Map<String, String> map) {
        this(moduleRevisionId, date, str, str2, str3, null, map);
    }

    public DefaultArtifact(ModuleRevisionId moduleRevisionId, Date date, String str, String str2, String str3, URL url, Map<String, String> map) {
        this(ArtifactRevisionId.newInstance(moduleRevisionId, str, str2, str3, map), date, url, false);
    }

    public DefaultArtifact(ArtifactRevisionId artifactRevisionId, Date date, URL url, boolean z) {
        this.isMetadata = false;
        if (artifactRevisionId == null) {
            throw new NullPointerException("null arid not allowed");
        }
        this.publicationDate = date == null ? new Date() : date;
        this.arid = artifactRevisionId;
        this.url = url;
        this.isMetadata = z;
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public ModuleRevisionId getModuleRevisionId() {
        return this.arid.getModuleRevisionId();
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public String getName() {
        return this.arid.getName();
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public Date getPublicationDate() {
        return this.publicationDate;
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public String getType() {
        return this.arid.getType();
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public String getExt() {
        return this.arid.getExt();
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public ArtifactRevisionId getId() {
        return this.arid;
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public String[] getConfigurations() {
        return new String[0];
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public URL getUrl() {
        return this.url;
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public boolean isMetadata() {
        return this.isMetadata;
    }
}
