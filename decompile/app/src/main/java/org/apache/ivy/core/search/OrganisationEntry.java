package org.apache.ivy.core.search;

import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes5.dex */
public class OrganisationEntry {
    public String organisation;
    public DependencyResolver resolver;

    public OrganisationEntry(DependencyResolver dependencyResolver, String str) {
        this.resolver = dependencyResolver;
        this.organisation = str;
    }

    public String getOrganisation() {
        return this.organisation;
    }

    public DependencyResolver getResolver() {
        return this.resolver;
    }

    public String toString() {
        return this.organisation;
    }
}
