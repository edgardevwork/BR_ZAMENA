package org.apache.ivy.ant;

import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.search.SearchEngine;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.tools.ant.BuildException;

/* loaded from: classes7.dex */
public class IvyListModules extends IvyTask {
    public String branch = "*";
    public String matcher = PatternMatcher.EXACT_OR_REGEXP;
    public String module;
    public String organisation;
    public String property;
    public String resolver;
    public String revision;
    public String value;

    public String getMatcher() {
        return this.matcher;
    }

    public void setMatcher(String str) {
        this.matcher = str;
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public String getProperty() {
        return this.property;
    }

    public void setProperty(String str) {
        this.property = str;
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

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public void setResolver(String str) {
        this.resolver = str;
    }

    public String getResolver() {
        return this.resolver;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        ModuleRevisionId[] moduleRevisionIdArrListModules;
        if (this.organisation == null) {
            throw new BuildException("no organisation provided for ivy listmodules task");
        }
        if (this.module == null) {
            throw new BuildException("no module name provided for ivy listmodules task");
        }
        if (this.revision == null) {
            throw new BuildException("no revision provided for ivy listmodules task");
        }
        if (this.property == null) {
            throw new BuildException("no property provided for ivy listmodules task");
        }
        if (this.value == null) {
            throw new BuildException("no value provided for ivy listmodules task");
        }
        IvySettings settings = getIvyInstance().getSettings();
        SearchEngine searchEngine = new SearchEngine(settings);
        PatternMatcher matcher = settings.getMatcher(this.matcher);
        String str = this.resolver;
        if (str == null) {
            moduleRevisionIdArrListModules = searchEngine.listModules(ModuleRevisionId.newInstance(this.organisation, this.module, this.branch, this.revision), matcher);
        } else {
            DependencyResolver resolver = settings.getResolver(str);
            if (resolver == null) {
                throw new BuildException("Unknown resolver: " + this.resolver);
            }
            moduleRevisionIdArrListModules = searchEngine.listModules(resolver, ModuleRevisionId.newInstance(this.organisation, this.module, this.branch, this.revision), matcher);
        }
        for (ModuleRevisionId moduleRevisionId : moduleRevisionIdArrListModules) {
            getProject().setProperty(IvyPatternHelper.substitute(settings.substitute(this.property), moduleRevisionId), IvyPatternHelper.substitute(settings.substitute(this.value), moduleRevisionId));
        }
    }
}
