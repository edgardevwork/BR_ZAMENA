package org.apache.ivy.plugins.resolver;

import org.apache.ivy.plugins.repository.vsftp.VsftpRepository;

/* loaded from: classes7.dex */
public class VsftpResolver extends RepositoryResolver {
    public VsftpResolver() {
        setRepository(new VsftpRepository(new LazyTimeoutConstraint(this)));
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return "vsftp";
    }

    public VsftpRepository getVsftpRepository() {
        return (VsftpRepository) getRepository();
    }

    public void disconnect() {
        getVsftpRepository().disconnect();
    }

    public String getAuthentication() {
        return getVsftpRepository().getAuthentication();
    }

    public String getHost() {
        return getVsftpRepository().getHost();
    }

    public String getUsername() {
        return getVsftpRepository().getUsername();
    }

    public void setAuthentication(String str) {
        getVsftpRepository().setAuthentication(str);
    }

    public void setHost(String str) {
        getVsftpRepository().setHost(str);
    }

    public void setUsername(String str) {
        getVsftpRepository().setUsername(str);
    }

    public void setReuseConnection(long j) {
        getVsftpRepository().setReuseConnection(j);
    }

    public void setReadTimeout(long j) {
        getVsftpRepository().setReadTimeout(j);
    }
}
