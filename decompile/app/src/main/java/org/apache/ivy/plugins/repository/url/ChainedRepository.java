package org.apache.ivy.plugins.repository.url;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.ivy.plugins.repository.AbstractRepository;
import org.apache.ivy.plugins.repository.BasicResource;
import org.apache.ivy.plugins.repository.Repository;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class ChainedRepository extends AbstractRepository {
    public List<Repository> repositories;

    public void setRepositories(List<Repository> list) {
        this.repositories = list;
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public Resource getResource(String str) throws IOException {
        Resource resource;
        for (Repository repository : this.repositories) {
            logTry(repository);
            try {
                resource = repository.getResource(str);
            } catch (Exception e) {
                logFailed(repository, e);
            }
            if (resource != null && resource.exists()) {
                logSuccess(repository);
                return resource;
            }
        }
        return new BasicResource(str, false, 0L, 0L, true);
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public void get(String str, File file) throws IOException {
        for (Repository repository : this.repositories) {
            logTry(repository);
            try {
                repository.get(str, file);
                logSuccess(repository);
                return;
            } catch (Exception e) {
                logFailed(repository, e);
            }
        }
        throw newIOEFail("copy " + str + " into " + file);
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public List<String> list(String str) throws IOException {
        List<String> list;
        for (Repository repository : this.repositories) {
            logTry(repository);
            try {
                list = repository.list(str);
            } catch (Exception e) {
                logFailed(repository, e);
            }
            if (list != null) {
                logSuccess(repository);
                return list;
            }
            continue;
        }
        throw newIOEFail("list contents in " + str);
    }

    public final void logTry(Repository repository) {
        Message.debug("Mirrored repository " + getName() + ": trying " + repository.getName());
    }

    public final void logFailed(Repository repository, Exception exc) {
        Message.warn("Mirrored repository " + getName() + ": " + repository.getName() + " is not available", exc);
        Message.warn("Trying the next one in the mirror list...");
    }

    public final void logSuccess(Repository repository) {
        Message.debug("Mirrored repository " + getName() + ": success with " + repository.getName());
    }

    public final IOException newIOEFail(String str) {
        return new IOException("Mirrored repository " + getName() + ": fail to " + str + " with every listed mirror");
    }
}
