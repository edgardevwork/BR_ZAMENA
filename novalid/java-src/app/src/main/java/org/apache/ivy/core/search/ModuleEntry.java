package org.apache.ivy.core.search;

import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes5.dex */
public class ModuleEntry {
    public String module;
    public OrganisationEntry organisationEntry;

    public ModuleEntry(OrganisationEntry organisationEntry, String str) {
        this.organisationEntry = organisationEntry;
        this.module = str;
    }

    public String getOrganisation() {
        return this.organisationEntry.getOrganisation();
    }

    public DependencyResolver getResolver() {
        return this.organisationEntry.getResolver();
    }

    public String getModule() {
        return this.module;
    }

    public OrganisationEntry getOrganisationEntry() {
        return this.organisationEntry;
    }

    public String toString() {
        return this.organisationEntry + "#" + this.module;
    }
}
