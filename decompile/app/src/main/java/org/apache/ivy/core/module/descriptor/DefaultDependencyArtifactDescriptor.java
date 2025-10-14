package org.apache.ivy.core.module.descriptor;

import com.blackhub.bronline.game.gui.menupausesettingandmap.NativeKeys;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.extendable.UnmodifiableExtendableItem;

/* loaded from: classes8.dex */
public class DefaultDependencyArtifactDescriptor extends UnmodifiableExtendableItem implements DependencyArtifactDescriptor, ConfigurationAware {
    public final Collection<String> confs;

    /* renamed from: dd */
    public DependencyDescriptor f9960dd;
    public String ext;
    public String name;
    public String type;
    public URL url;

    public DefaultDependencyArtifactDescriptor(DependencyDescriptor dependencyDescriptor, String str, String str2, String str3, URL url, Map<String, String> map) {
        super(null, map);
        this.confs = new ArrayList();
        Checks.checkNotNull(dependencyDescriptor, NativeKeys.DRAW_DISTANCE_NK);
        Checks.checkNotNull(str, "name");
        Checks.checkNotNull(str2, "type");
        Checks.checkNotNull(str3, IvyPatternHelper.EXT_KEY);
        this.f9960dd = dependencyDescriptor;
        this.name = str;
        this.type = str2;
        this.ext = str3;
        this.url = url;
        initStandardAttributes();
    }

    public final void initStandardAttributes() {
        setStandardAttribute("artifact", getName());
        setStandardAttribute("type", getType());
        setStandardAttribute(IvyPatternHelper.EXT_KEY, getExt());
        URL url = this.url;
        setStandardAttribute("url", url != null ? String.valueOf(url) : "");
    }

    public boolean equals(Object obj) {
        if (obj instanceof DependencyArtifactDescriptor) {
            return getAttributes().equals(((DependencyArtifactDescriptor) obj).getAttributes());
        }
        return false;
    }

    public int hashCode() {
        return getAttributes().hashCode();
    }

    @Override // org.apache.ivy.core.module.descriptor.ConfigurationAware
    public void addConfiguration(String str) {
        this.confs.add(str);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyArtifactDescriptor
    public DependencyDescriptor getDependencyDescriptor() {
        return this.f9960dd;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyArtifactDescriptor
    public String getName() {
        return this.name;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyArtifactDescriptor
    public String getType() {
        return this.type;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyArtifactDescriptor
    public String getExt() {
        return this.ext;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyArtifactDescriptor, org.apache.ivy.core.module.descriptor.ConfigurationAware
    public String[] getConfigurations() {
        Collection<String> collection = this.confs;
        return (String[]) collection.toArray(new String[collection.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyArtifactDescriptor
    public URL getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DA:");
        sb.append(this.name);
        sb.append(".");
        sb.append(this.ext);
        sb.append("(");
        sb.append(this.type);
        sb.append(") (");
        sb.append(this.confs);
        sb.append(")");
        URL url = this.url;
        sb.append(url == null ? "" : url.toString());
        return sb.toString();
    }
}
