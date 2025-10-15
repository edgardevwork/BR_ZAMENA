package org.apache.ivy.plugins.resolver;

import org.apache.ivy.plugins.repository.ssh.SshRepository;

/* loaded from: classes8.dex */
public class SshResolver extends AbstractSshBasedResolver {
    public SshResolver() {
        setRepository(new SshRepository(new LazyTimeoutConstraint(this)));
    }

    public void setPublishPermissions(String str) {
        ((SshRepository) getRepository()).setPublishPermissions(str);
    }

    public void setFileSeparator(String str) {
        if (str == null || str.length() != 1) {
            throw new IllegalArgumentException("File Separator has to be a single character and not " + str);
        }
        ((SshRepository) getRepository()).setFileSeparator(str.trim().charAt(0));
    }

    public void setListCommand(String str) {
        ((SshRepository) getRepository()).setListCommand(str);
    }

    public void setExistCommand(String str) {
        ((SshRepository) getRepository()).setExistCommand(str);
    }

    public void setCreateDirCommand(String str) {
        ((SshRepository) getRepository()).setExistCommand(str);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractSshBasedResolver, org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return "ssh";
    }
}
