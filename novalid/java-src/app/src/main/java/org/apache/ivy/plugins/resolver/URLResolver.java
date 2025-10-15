package org.apache.ivy.plugins.resolver;

import org.apache.ivy.plugins.repository.url.URLRepository;

/* loaded from: classes7.dex */
public class URLResolver extends RepositoryResolver {
    public URLResolver() {
        setRepository(new URLRepository(new LazyTimeoutConstraint(this)));
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return "url";
    }
}
