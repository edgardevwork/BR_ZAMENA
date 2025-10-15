package org.apache.ivy.ant;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.Properties;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.tools.ant.BuildException;

/* loaded from: classes7.dex */
public class IvyVar extends IvyTask {
    public File file;
    public String name;
    public String prefix;
    public String url;
    public String value;

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws IOException, BuildException {
        InputStream inputStreamOpenStream;
        IvySettings settings = getIvyInstance().getSettings();
        if (getName() != null) {
            settings.setVariable(getVarName(getName()), getValue());
            return;
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            try {
                if (getFile() != null) {
                    inputStreamOpenStream = new FileInputStream(getFile());
                } else if (getUrl() != null) {
                    inputStreamOpenStream = FirebasePerfUrlConnection.openStream(new URL(getUrl()));
                } else {
                    throw new BuildException("specify either name or file or url to ivy var task");
                }
                properties.load(inputStreamOpenStream);
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Exception unused) {
                    }
                }
                for (Map.Entry entry : properties.entrySet()) {
                    settings.setVariable(getVarName((String) entry.getKey()), (String) entry.getValue());
                }
            } catch (Exception e) {
                throw new BuildException("impossible to load variables from file: " + e, e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    public final String getVarName(String str) {
        String prefix = getPrefix();
        if (prefix == null) {
            return str;
        }
        if (prefix.endsWith(".")) {
            return prefix + str;
        }
        return prefix + "." + str;
    }
}
