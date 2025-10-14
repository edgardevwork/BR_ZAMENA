package org.apache.ivy.plugins.resolver;

import java.io.File;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.repository.ssh.AbstractSshBasedRepository;

/* loaded from: classes7.dex */
public abstract class AbstractSshBasedResolver extends RepositoryResolver {
    public boolean passfileSet = false;

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public abstract String getTypeName();

    public final AbstractSshBasedRepository getSshBasedRepository() {
        return (AbstractSshBasedRepository) getRepository();
    }

    public void setKeyFile(File file) {
        getSshBasedRepository().setKeyFile(file);
    }

    public void setAllowedAgentUse(boolean z) {
        getSshBasedRepository().setAllowedAgentUse(z);
    }

    public void setPassfile(File file) {
        getSshBasedRepository().setPassFile(file);
        this.passfileSet = true;
    }

    public void setSettings(IvySettings ivySettings) {
        super.setSettings((ResolverSettings) ivySettings);
        if (this.passfileSet) {
            return;
        }
        getSshBasedRepository().setPassFile(new File(ivySettings.getDefaultIvyUserDir(), getSshBasedRepository().getHost() + ".ssh.passwd"));
    }

    public void setUserPassword(String str) {
        getSshBasedRepository().setUserPassword(str);
    }

    public void setKeyFilePassword(String str) {
        getSshBasedRepository().setKeyFilePassword(str);
    }

    public void setUser(String str) {
        getSshBasedRepository().setUser(str);
    }

    public void setHost(String str) {
        getSshBasedRepository().setHost(str);
    }

    public void setPort(int i) {
        getSshBasedRepository().setPort(i);
    }

    public void setSshConfig(String str) {
        getSshBasedRepository().setSshConfig(str);
    }
}
