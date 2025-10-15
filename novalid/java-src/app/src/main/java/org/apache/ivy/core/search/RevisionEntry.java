package org.apache.ivy.core.search;

import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes5.dex */
public class RevisionEntry {
    public ModuleEntry moduleEntry;
    public String revision;

    public RevisionEntry(ModuleEntry moduleEntry, String str) {
        this.moduleEntry = moduleEntry;
        this.revision = str;
    }

    public ModuleEntry getModuleEntry() {
        return this.moduleEntry;
    }

    public String getRevision() {
        return this.revision;
    }

    public String getModule() {
        return this.moduleEntry.getModule();
    }

    public String getOrganisation() {
        return this.moduleEntry.getOrganisation();
    }

    public OrganisationEntry getOrganisationEntry() {
        return this.moduleEntry.getOrganisationEntry();
    }

    public DependencyResolver getResolver() {
        return this.moduleEntry.getResolver();
    }

    public String toString() {
        return this.moduleEntry + PropertiesParser.PROPS_SEPARATOR + this.revision;
    }
}
