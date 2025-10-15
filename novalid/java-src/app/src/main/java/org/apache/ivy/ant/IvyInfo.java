package org.apache.ivy.ant;

import java.io.File;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.parser.ModuleDescriptorParserRegistry;
import org.apache.tools.ant.BuildException;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes7.dex */
public class IvyInfo extends IvyTask {
    public String branch;
    public String module;
    public String organisation;
    public String revision;
    public File file = null;
    public String property = ClientConfigurationFields.IVY;

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public String getOrganisation() {
        return this.organisation;
    }

    public void setOrganisation(String str) {
        this.organisation = str;
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String str) {
        this.revision = str;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public String getProperty() {
        return this.property;
    }

    public void setProperty(String str) {
        this.property = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        Ivy ivyInstance = getIvyInstance();
        IvySettings settings = ivyInstance.getSettings();
        try {
            String str = this.organisation;
            if (str == null && this.module == null && this.revision == null && this.branch == null) {
                if (this.file == null) {
                    this.file = getProject().resolveFile(getProperty(settings, "ivy.dep.file"));
                }
                ModuleDescriptor descriptor = ModuleDescriptorParserRegistry.getInstance().parseDescriptor(settings, this.file.toURI().toURL(), doValidate(settings));
                setProperties(descriptor, descriptor.getModuleRevisionId());
                return;
            }
            if (str == null) {
                throw new BuildException("no organisation provided for ivy info task");
            }
            if (this.module == null) {
                throw new BuildException("no module name provided for ivy info task");
            }
            if (this.revision == null) {
                throw new BuildException("no revision provided for ivy info task");
            }
            if (this.branch == null) {
                settings.getDefaultBranch(new ModuleId(this.organisation, this.module));
            }
            ResolvedModuleRevision resolvedModuleRevisionFindModule = ivyInstance.findModule(ModuleRevisionId.newInstance(this.organisation, this.module, this.branch, this.revision));
            if (resolvedModuleRevisionFindModule != null) {
                setProperties(resolvedModuleRevisionFindModule.getDescriptor(), resolvedModuleRevisionFindModule.getId());
            }
        } catch (MalformedURLException e) {
            throw new BuildException("unable to convert given ivy file to url: " + this.file + ": " + e, e);
        } catch (ParseException e2) {
            log(e2.getMessage(), 0);
            throw new BuildException("syntax errors in ivy file: " + e2, e2);
        } catch (Exception e3) {
            throw new BuildException("impossible to resolve dependencies: " + e3, e3);
        }
    }

    public final void setProperties(ModuleDescriptor moduleDescriptor, ModuleRevisionId moduleRevisionId) {
        getProject().setProperty(this.property + ".organisation", moduleRevisionId.getOrganisation());
        getProject().setProperty(this.property + ".module", moduleRevisionId.getName());
        if (moduleRevisionId.getBranch() != null) {
            getProject().setProperty(this.property + ".branch", moduleRevisionId.getBranch());
        }
        getProject().setProperty(this.property + ".revision", moduleRevisionId.getRevision());
        getProject().setProperty(this.property + ".status", moduleDescriptor.getStatus());
        if (moduleDescriptor.getPublicationDate() != null) {
            getProject().setProperty(this.property + ".publication", Long.toString(moduleDescriptor.getPublicationDate().getTime()));
        }
        for (Map.Entry<String, String> entry : moduleRevisionId.getExtraAttributes().entrySet()) {
            getProject().setProperty(this.property + ".extra." + entry.getKey(), entry.getValue());
        }
        getProject().setProperty(this.property + ".configurations", mergeConfs(moduleDescriptor.getConfigurationsNames()));
        ArrayList arrayList = new ArrayList();
        for (Configuration configuration : moduleDescriptor.getConfigurations()) {
            String name = configuration.getName();
            if (Configuration.Visibility.PUBLIC.equals(configuration.getVisibility())) {
                arrayList.add(name);
            }
            if (configuration.getDescription() != null) {
                getProject().setProperty(this.property + ".configuration." + name + ".desc", configuration.getDescription());
            }
        }
        getProject().setProperty(this.property + ".public.configurations", mergeConfs((String[]) arrayList.toArray(new String[arrayList.size()])));
        List<Artifact> listAsList = Arrays.asList(moduleDescriptor.getAllArtifacts());
        for (Artifact artifact : listAsList) {
            int iIndexOf = listAsList.indexOf(artifact) + 1;
            getProject().setProperty(this.property + ".artifact." + iIndexOf + ".name", artifact.getName());
            getProject().setProperty(this.property + ".artifact." + iIndexOf + ".type", artifact.getType());
            getProject().setProperty(this.property + ".artifact." + iIndexOf + ".ext", artifact.getExt());
            getProject().setProperty(this.property + ".artifact." + iIndexOf + ".conf", mergeConfs(artifact.getConfigurations()));
            for (Map.Entry<String, String> entry2 : artifact.getExtraAttributes().entrySet()) {
                getProject().setProperty(this.property + ".artifact." + iIndexOf + ".extra." + entry2.getKey(), entry2.getValue());
            }
        }
    }
}
