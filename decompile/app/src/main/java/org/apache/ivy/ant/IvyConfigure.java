package org.apache.ivy.ant;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

/* loaded from: classes7.dex */
public class IvyConfigure extends Task {
    public static final String OVERRIDE_FALSE = "false";
    public static final String OVERRIDE_TRUE = "true";
    public String override = OVERRIDE_NOT_ALLOWED;
    public IvyAntSettings settings = new IvyAntSettings();
    public static final String OVERRIDE_NOT_ALLOWED = "notallowed";
    public static final Collection<String> OVERRIDE_VALUES = Arrays.asList("true", "false", OVERRIDE_NOT_ALLOWED);

    public void setSettingsId(String str) {
        this.settings.setId(str);
    }

    public String getSettingsId() {
        return this.settings.getId();
    }

    public void setOverride(String str) {
        Collection<String> collection = OVERRIDE_VALUES;
        if (!collection.contains(str)) {
            throw new IllegalArgumentException("invalid override value '" + str + "'. Valid values are " + collection);
        }
        this.override = str;
    }

    public String getOverride() {
        return this.override;
    }

    public File getFile() {
        return this.settings.getFile();
    }

    public void setFile(File file) {
        this.settings.setFile(file);
    }

    public URL getUrl() {
        return this.settings.getUrl();
    }

    public void setUrl(String str) throws MalformedURLException {
        this.settings.setUrl(str);
    }

    public void setUrl(URL url) {
        if (url == null) {
            throw new NullPointerException("Cannot set a null URL");
        }
        this.settings.setUrl(url);
    }

    public String getRealm() {
        return this.settings.getRealm();
    }

    public void setRealm(String str) {
        this.settings.setRealm(str);
    }

    public String getHost() {
        return this.settings.getHost();
    }

    public void setHost(String str) {
        this.settings.setHost(str);
    }

    public String getUserName() {
        return this.settings.getUsername();
    }

    public void setUserName(String str) {
        this.settings.setUsername(str);
    }

    public String getPasswd() {
        return this.settings.getPasswd();
    }

    public void setPasswd(String str) {
        this.settings.setPasswd(str);
    }

    public void addConfiguredWorkspaceResolver(AntWorkspaceResolver antWorkspaceResolver) {
        this.settings.addConfiguredWorkspaceResolver(antWorkspaceResolver);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public void execute() throws BuildException {
        String id = this.settings.getId();
        Object reference = getProject().getReference(id);
        if (reference != null && OVERRIDE_NOT_ALLOWED.equals(this.override)) {
            throw new BuildException("Overriding a previous definition of ivy:settings with the id '" + id + "' is not allowed when using override='" + OVERRIDE_NOT_ALLOWED + "'.");
        }
        if (reference != null && "false".equals(this.override)) {
            verbose("A settings definition is already available for " + id + ": skipping");
            return;
        }
        this.settings.setProject(getProject());
        getProject().addReference(id, this.settings);
        this.settings.createIvyEngine(this);
    }

    public final void verbose(String str) {
        log(str, 3);
    }
}
