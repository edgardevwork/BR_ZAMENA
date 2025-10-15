package org.apache.ivy.ant;

import java.net.MalformedURLException;
import java.net.URL;
import org.apache.ivy.core.module.descriptor.DefaultDependencyArtifactDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.tools.ant.BuildException;

/* loaded from: classes7.dex */
public class IvyDependencyArtifact {
    public String ext;
    public String name;
    public String type;
    public String url;

    public void setName(String str) {
        this.name = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public void addArtifact(DefaultDependencyDescriptor defaultDependencyDescriptor, String str) throws BuildException {
        String str2 = this.type;
        if (str2 == null) {
            str2 = "*";
        }
        String str3 = str2;
        String str4 = this.ext;
        try {
            defaultDependencyDescriptor.addDependencyArtifact(str, new DefaultDependencyArtifactDescriptor(defaultDependencyDescriptor, this.name, str3, str4 == null ? str3 : str4, this.url == null ? null : new URL(this.url), null));
        } catch (MalformedURLException e) {
            throw new BuildException("Malformed url in the artifact: " + e.getMessage(), e);
        }
    }
}
