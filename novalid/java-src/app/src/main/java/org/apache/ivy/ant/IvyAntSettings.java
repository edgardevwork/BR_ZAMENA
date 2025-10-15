package org.apache.ivy.ant;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Properties;
import org.apache.http.HttpHost;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.core.settings.IvyVariableContainer;
import org.apache.ivy.plugins.resolver.AbstractWorkspaceResolver;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.url.CredentialsStore;
import org.apache.ivy.util.url.TimeoutConstrainedURLHandler;
import org.apache.ivy.util.url.URLHandlerDispatcher;
import org.apache.ivy.util.url.URLHandlerRegistry;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectComponent;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.taskdefs.Property;
import org.apache.tools.ant.types.DataType;

/* loaded from: classes7.dex */
public class IvyAntSettings extends DataType {
    public AntWorkspaceResolver antWorkspaceResolver;
    public Ivy ivyEngine = null;
    public File file = null;
    public URL url = null;
    public String realm = null;
    public String host = null;
    public String userName = null;
    public String passwd = null;

    /* renamed from: id */
    public String f9950id = "ivy.instance";
    public boolean autoRegistered = false;

    public static class Credentials {
        public String host;
        public String passwd;
        public String realm;
        public String username;

        public String getPasswd() {
            return this.passwd;
        }

        public void setPasswd(String str) {
            this.passwd = str;
        }

        public String getRealm() {
            return this.realm;
        }

        public void setRealm(String str) {
            this.realm = IvyAntSettings.format(str);
        }

        public String getHost() {
            return this.host;
        }

        public void setHost(String str) {
            this.host = IvyAntSettings.format(str);
        }

        public String getUsername() {
            return this.username;
        }

        public void setUsername(String str) {
            this.username = IvyAntSettings.format(str);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public static IvyAntSettings getDefaultInstance(ProjectComponent projectComponent) throws BuildException {
        Project project = projectComponent.getProject();
        Object reference = project.getReference("ivy.instance");
        if (reference != null && reference.getClass().getClassLoader() != IvyAntSettings.class.getClassLoader()) {
            projectComponent.log("ivy.instance reference an ivy:settings defined in an other classloader.  An new default one will be used in this project.", 1);
            reference = null;
        }
        if (reference != null && !(reference instanceof IvyAntSettings)) {
            throw new BuildException("ivy.instance reference a " + reference.getClass().getName() + " an not an IvyAntSettings.  Please don't use this reference id ()");
        }
        if (reference == null) {
            projectComponent.log("No ivy:settings found for the default reference 'ivy.instance'.  A default instance will be used", 3);
            IvyAntSettings ivyAntSettings = new IvyAntSettings();
            ivyAntSettings.setProject(project);
            project.addReference("ivy.instance", ivyAntSettings);
            ivyAntSettings.createIvyEngine(projectComponent);
            return ivyAntSettings;
        }
        return (IvyAntSettings) reference;
    }

    public static IvyAntSettings getDefaultInstance(Task task) {
        return getDefaultInstance((ProjectComponent) task);
    }

    public File getFile() {
        return this.file;
    }

    public URL getUrl() {
        return this.url;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public void setPasswd(String str) {
        this.passwd = str;
    }

    public String getRealm() {
        return this.realm;
    }

    public void setRealm(String str) {
        this.realm = format(str);
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String str) {
        this.host = format(str);
    }

    public String getUsername() {
        return this.userName;
    }

    public void setUsername(String str) {
        this.userName = format(str);
    }

    public void setProject(Project project) {
        super.setProject(project);
        if (!"ivy.instance".equals(this.f9950id) || getProject().getReferences().containsKey(this.f9950id)) {
            return;
        }
        getProject().addReference("ivy.instance", this);
        this.autoRegistered = true;
    }

    public static String format(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            return null;
        }
        return str.trim();
    }

    public void addConfiguredCredentials(Credentials credentials) {
        CredentialsStore.INSTANCE.addCredentials(credentials.getRealm(), credentials.getHost(), credentials.getUsername(), credentials.getPasswd());
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setUrl(String str) throws MalformedURLException {
        this.url = new URL(str);
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public void setId(String str) {
        if (this.autoRegistered && getProject().getReference(this.f9950id) == this) {
            getProject().getReferences().remove(this.f9950id);
            this.autoRegistered = false;
        }
        this.f9950id = str;
        if (getProject() != null) {
            getProject().addReference(this.f9950id, this);
        }
    }

    public String getId() {
        return this.f9950id;
    }

    public Ivy getConfiguredIvyInstance(ProjectComponent projectComponent) throws BuildException {
        if (this.ivyEngine == null) {
            createIvyEngine(projectComponent);
        }
        return this.ivyEngine;
    }

    public Ivy getConfiguredIvyInstance(Task task) {
        return getConfiguredIvyInstance((ProjectComponent) task);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:11:0x003d, B:13:0x004d, B:15:0x0053, B:27:0x0080, B:22:0x0060, B:23:0x0078, B:24:0x0079, B:26:0x007d, B:30:0x008b, B:31:0x0092, B:32:0x0093, B:34:0x00a3, B:35:0x00b2, B:37:0x00c7, B:38:0x00d9, B:36:0x00b7), top: B:41:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:11:0x003d, B:13:0x004d, B:15:0x0053, B:27:0x0080, B:22:0x0060, B:23:0x0078, B:24:0x0079, B:26:0x007d, B:30:0x008b, B:31:0x0092, B:32:0x0093, B:34:0x00a3, B:35:0x00b2, B:37:0x00c7, B:38:0x00d9, B:36:0x00b7), top: B:41:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void createIvyEngine(final ProjectComponent projectComponent) throws BuildException {
        StringBuilder sb;
        Project project = projectComponent.getProject();
        Property property = new Property() { // from class: org.apache.ivy.ant.IvyAntSettings.1
            public void execute() throws BuildException {
                addProperties(IvyAntSettings.this.getDefaultProperties(projectComponent));
            }
        };
        property.setProject(project);
        property.init();
        property.execute();
        IvyAntVariableContainer ivyAntVariableContainer = new IvyAntVariableContainer(project);
        IvySettings ivySettings = new IvySettings(ivyAntVariableContainer);
        ivySettings.setBaseDir(project.getBaseDir());
        if (this.file == null && this.url == null) {
            defineDefaultSettingFile(ivyAntVariableContainer, projectComponent);
        }
        AntWorkspaceResolver antWorkspaceResolver = this.antWorkspaceResolver;
        if (antWorkspaceResolver != null) {
            ivySettings.addConfigured((AbstractWorkspaceResolver) antWorkspaceResolver.getResolver());
        }
        Ivy ivyNewInstance = Ivy.newInstance(ivySettings);
        try {
            try {
                ivyNewInstance.pushContext();
                AntMessageLogger.register(projectComponent, ivyNewInstance);
                Message.showInfo();
                configureURLHandler();
                File file = this.file;
                if (file != null) {
                    if (!file.exists()) {
                        throw new BuildException("settings file does not exist: " + this.file);
                    }
                    ivyNewInstance.configure(this.file);
                } else {
                    URL url = this.url;
                    if (url == null) {
                        throw new AssertionError("ivy setting should have either a file, either an url, and if not defineDefaultSettingFile must set it.");
                    }
                    ivyNewInstance.configure(url);
                }
                ivyAntVariableContainer.updateProject(this.f9950id);
                this.ivyEngine = ivyNewInstance;
                ivyNewInstance.popContext();
            } catch (IOException e) {
                e = e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("impossible to configure ivy:settings with given ");
                if (this.file == null) {
                    sb = new StringBuilder();
                    sb.append("file: ");
                    sb.append(this.file);
                } else {
                    sb = new StringBuilder();
                    sb.append("url: ");
                    sb.append(this.url);
                }
                sb2.append(sb.toString());
                sb2.append(" : ");
                sb2.append(e);
                throw new BuildException(sb2.toString(), e);
            } catch (ParseException e2) {
                e = e2;
                StringBuilder sb22 = new StringBuilder();
                sb22.append("impossible to configure ivy:settings with given ");
                if (this.file == null) {
                }
                sb22.append(sb.toString());
                sb22.append(" : ");
                sb22.append(e);
                throw new BuildException(sb22.toString(), e);
            }
        } catch (Throwable th) {
            ivyNewInstance.popContext();
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public Properties getDefaultProperties(ProjectComponent projectComponent) throws IOException, BuildException {
        URL defaultPropertiesURL = IvySettings.getDefaultPropertiesURL();
        Properties properties = new Properties();
        projectComponent.log("Loading " + defaultPropertiesURL, 3);
        try {
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(defaultPropertiesURL);
            try {
                properties.load(inputStreamOpenStream);
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
                return properties;
            } finally {
            }
        } catch (IOException e) {
            throw new BuildException(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public final void defineDefaultSettingFile(IvyVariableContainer ivyVariableContainer, ProjectComponent projectComponent) throws BuildException {
        String variable = ivyVariableContainer.getVariable("ivy.conf.file");
        if (variable != null && !variable.equals(ivyVariableContainer.getVariable("ivy.settings.file"))) {
            projectComponent.log("DEPRECATED: 'ivy.conf.file' is deprecated, use 'ivy.settings.file' instead", 2);
        } else {
            variable = ivyVariableContainer.getVariable("ivy.settings.file");
        }
        File[] fileArr = {new File(getProject().getBaseDir(), variable), new File(getProject().getBaseDir(), "ivyconf.xml"), new File(variable), new File("ivyconf.xml")};
        int i = 0;
        while (true) {
            if (i >= 4) {
                break;
            }
            File file = fileArr[i];
            projectComponent.log("searching settings file: trying " + file, 3);
            if (file.exists()) {
                this.file = file;
                break;
            }
            i++;
        }
        if (this.file == null) {
            if (Boolean.valueOf(getProject().getProperty("ivy.14.compatible")).booleanValue()) {
                projectComponent.log("no settings file found, using Ivy 1.4 default...", 3);
                this.url = IvySettings.getDefault14SettingsURL();
                return;
            }
            String variable2 = ivyVariableContainer.getVariable("ivy.settings.url");
            if (variable2 != null) {
                try {
                    this.url = new URL(variable2);
                    return;
                } catch (MalformedURLException e) {
                    throw new BuildException("Impossible to configure ivy:settings with given url: " + variable2 + ": " + e.getMessage(), e);
                }
            }
            projectComponent.log("no settings file found, using default...", 3);
            this.url = IvySettings.getDefaultSettingsURL();
        }
    }

    public final void configureURLHandler() {
        CredentialsStore.INSTANCE.addCredentials(getRealm(), getHost(), getUsername(), getPasswd());
        URLHandlerDispatcher uRLHandlerDispatcher = new URLHandlerDispatcher();
        TimeoutConstrainedURLHandler http = URLHandlerRegistry.getHttp();
        uRLHandlerDispatcher.setDownloader(HttpHost.DEFAULT_SCHEME_NAME, http);
        uRLHandlerDispatcher.setDownloader("https", http);
        URLHandlerRegistry.setDefault(uRLHandlerDispatcher);
    }

    public void addConfiguredWorkspaceResolver(AntWorkspaceResolver antWorkspaceResolver) {
        this.antWorkspaceResolver = antWorkspaceResolver;
    }
}
