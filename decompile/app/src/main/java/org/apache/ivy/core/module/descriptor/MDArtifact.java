package org.apache.ivy.core.module.descriptor;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.ivy.core.module.p062id.ArtifactRevisionId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes7.dex */
public class MDArtifact extends AbstractArtifact {
    public final List<String> confs;
    public String ext;
    public Map<String, String> extraAttributes;
    public boolean isMetadata;

    /* renamed from: md */
    public ModuleDescriptor f9962md;
    public String name;
    public String type;
    public URL url;

    public static Artifact newIvyArtifact(ModuleDescriptor moduleDescriptor) {
        return new MDArtifact(moduleDescriptor, ClientConfigurationFields.IVY, ClientConfigurationFields.IVY, "xml", true);
    }

    public MDArtifact(ModuleDescriptor moduleDescriptor, String str, String str2, String str3) {
        this(moduleDescriptor, str, str2, str3, null, null);
    }

    public MDArtifact(ModuleDescriptor moduleDescriptor, String str, String str2, String str3, boolean z) {
        this(moduleDescriptor, str, str2, str3, null, null);
        this.isMetadata = z;
    }

    public MDArtifact(ModuleDescriptor moduleDescriptor, String str, String str2, String str3, URL url, Map<String, String> map) {
        this.confs = new ArrayList();
        this.extraAttributes = null;
        this.isMetadata = false;
        if (moduleDescriptor == null) {
            throw new NullPointerException("null module descriptor not allowed");
        }
        if (str == null) {
            throw new NullPointerException("null name not allowed");
        }
        if (str2 == null) {
            throw new NullPointerException("null type not allowed");
        }
        if (str3 == null) {
            throw new NullPointerException("null ext not allowed");
        }
        this.f9962md = moduleDescriptor;
        this.name = str;
        this.type = str2;
        this.ext = str3;
        this.url = url;
        this.extraAttributes = map;
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public ModuleRevisionId getModuleRevisionId() {
        return this.f9962md.getResolvedModuleRevisionId();
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public Date getPublicationDate() {
        return this.f9962md.getResolvedPublicationDate();
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public ArtifactRevisionId getId() {
        return ArtifactRevisionId.newInstance(this.f9962md.getResolvedModuleRevisionId(), this.name, this.type, this.ext, this.extraAttributes);
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public String getName() {
        return this.name;
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public String getType() {
        return this.type;
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public String getExt() {
        return this.ext;
    }

    @Override // org.apache.ivy.core.module.descriptor.Artifact
    public String[] getConfigurations() {
        List<String> list = this.confs;
        return (String[]) list.toArray(new String[list.size()]);
    }

    public void addConfiguration(String str) {
        this.confs.add(str);
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
