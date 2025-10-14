package org.apache.ivy.ant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.tools.ant.BuildException;

/* loaded from: classes7.dex */
public class IvyDependency {
    public String branch;
    public boolean changing;
    public String conf;
    public boolean force;
    public String name;

    /* renamed from: org, reason: collision with root package name */
    public String f11304org;
    public String rev;
    public List<IvyDependencyConf> confs = new ArrayList();
    public List<IvyDependencyArtifact> artifacts = new ArrayList();
    public List<IvyDependencyExclude> excludes = new ArrayList();
    public List<IvyDependencyInclude> includes = new ArrayList();
    public boolean transitive = true;

    public IvyDependencyConf createConf() {
        IvyDependencyConf ivyDependencyConf = new IvyDependencyConf();
        this.confs.add(ivyDependencyConf);
        return ivyDependencyConf;
    }

    public IvyDependencyArtifact createArtifact() {
        IvyDependencyArtifact ivyDependencyArtifact = new IvyDependencyArtifact();
        this.artifacts.add(ivyDependencyArtifact);
        return ivyDependencyArtifact;
    }

    public IvyDependencyExclude createExclude() {
        IvyDependencyExclude ivyDependencyExclude = new IvyDependencyExclude();
        this.excludes.add(ivyDependencyExclude);
        return ivyDependencyExclude;
    }

    public IvyDependencyInclude createInclude() {
        IvyDependencyInclude ivyDependencyInclude = new IvyDependencyInclude();
        this.includes.add(ivyDependencyInclude);
        return ivyDependencyInclude;
    }

    public String getOrg() {
        return this.f11304org;
    }

    public void setOrg(String str) {
        this.f11304org = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getRev() {
        return this.rev;
    }

    public void setRev(String str) {
        this.rev = str;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public String getConf() {
        return this.conf;
    }

    public void setConf(String str) {
        this.conf = str;
    }

    public boolean isChanging() {
        return this.changing;
    }

    public void setChanging(boolean z) {
        this.changing = z;
    }

    public boolean isForce() {
        return this.force;
    }

    public void setForce(boolean z) {
        this.force = z;
    }

    public boolean isTransitive() {
        return this.transitive;
    }

    public void setTransitive(boolean z) {
        this.transitive = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public DependencyDescriptor asDependencyDescriptor(ModuleDescriptor moduleDescriptor, String str, IvySettings ivySettings) throws BuildException {
        String str2 = this.f11304org;
        if (str2 == null) {
            throw new BuildException("'org' is required on ");
        }
        String str3 = this.name;
        if (str3 == null) {
            throw new BuildException("'name' is required when using inline mode");
        }
        DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(moduleDescriptor, ModuleRevisionId.newInstance(str2, str3, this.branch, this.rev), this.force, this.changing, this.transitive);
        String str4 = this.conf;
        if (str4 != null) {
            defaultDependencyDescriptor.addDependencyConfiguration(str, str4);
        } else {
            defaultDependencyDescriptor.addDependencyConfiguration(str, "*");
        }
        Iterator<IvyDependencyConf> it = this.confs.iterator();
        while (it.hasNext()) {
            it.next().addConf(defaultDependencyDescriptor, str);
        }
        Iterator<IvyDependencyArtifact> it2 = this.artifacts.iterator();
        while (it2.hasNext()) {
            it2.next().addArtifact(defaultDependencyDescriptor, str);
        }
        Iterator<IvyDependencyExclude> it3 = this.excludes.iterator();
        while (it3.hasNext()) {
            defaultDependencyDescriptor.addExcludeRule(str, it3.next().asRule(ivySettings));
        }
        Iterator<IvyDependencyInclude> it4 = this.includes.iterator();
        while (it4.hasNext()) {
            defaultDependencyDescriptor.addIncludeRule(str, it4.next().asRule(ivySettings));
        }
        return defaultDependencyDescriptor;
    }
}
