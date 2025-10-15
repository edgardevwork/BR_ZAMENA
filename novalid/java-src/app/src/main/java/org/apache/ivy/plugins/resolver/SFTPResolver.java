package org.apache.ivy.plugins.resolver;

import org.apache.ivy.plugins.repository.sftp.SFTPRepository;

/* loaded from: classes8.dex */
public class SFTPResolver extends AbstractSshBasedResolver {
    public SFTPResolver() {
        setRepository(new SFTPRepository(new LazyTimeoutConstraint(this)));
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractSshBasedResolver, org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return "sftp";
    }

    public SFTPRepository getSFTPRepository() {
        return (SFTPRepository) getRepository();
    }
}
