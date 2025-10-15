package org.apache.ivy.osgi.updatesite.xml;

import com.blackhub.bronline.launcher.LauncherConstants;
import java.util.ArrayList;
import java.util.List;
import org.apache.ivy.osgi.util.Version;

/* loaded from: classes5.dex */
public class EclipseFeature {
    public String description;

    /* renamed from: id */
    public String f9982id;
    public String license;
    public List<EclipsePlugin> plugins = new ArrayList();
    public List<Require> requires = new ArrayList();
    public String url;
    public Version version;

    public void addCategory(String str) {
    }

    public void setApplication(String str) {
    }

    public void setArch(String str) {
    }

    public void setColocationAffinity(String str) {
    }

    public void setCopyright(String str) {
    }

    public void setExclusive(boolean z) {
    }

    public void setImage(String str) {
    }

    public void setLabel(String str) {
    }

    public void setNL(String str) {
    }

    public void setOS(String str) {
    }

    public void setPatch(String str) {
    }

    public void setPlugin(String str) {
    }

    public void setPrimary(boolean z) {
    }

    public void setProviderName(String str) {
    }

    public void setType(String str) {
    }

    public void setWS(String str) {
    }

    public EclipseFeature(String str, Version version) {
        this.f9982id = str;
        this.version = version;
        this.url = "features/" + str + LauncherConstants.UNDERSCORE_CHAR + version + ".jar";
    }

    public void setURL(String str) {
        this.url = str;
    }

    public String getUrl() {
        return this.url;
    }

    public String getId() {
        return this.f9982id;
    }

    public Version getVersion() {
        return this.version;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public void setLicense(String str) {
        this.license = str;
    }

    public String getLicense() {
        return this.license;
    }

    public void addPlugin(EclipsePlugin eclipsePlugin) {
        this.plugins.add(eclipsePlugin);
    }

    public List<EclipsePlugin> getPlugins() {
        return this.plugins;
    }

    public void addRequire(Require require) {
        this.requires.add(require);
    }

    public List<Require> getRequires() {
        return this.requires;
    }

    public String toString() {
        return this.f9982id + "#" + this.version;
    }
}
