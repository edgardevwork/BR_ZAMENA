package org.apache.ivy.ant;

import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.tools.ant.BuildException;

/* loaded from: classes7.dex */
public class IvyCleanCache extends IvyTask {
    public static final String ALL = "*";
    public static final String NONE = "NONE";
    public boolean resolution = true;
    public String cache = "*";

    public String getCache() {
        return this.cache;
    }

    public void setCache(String str) {
        this.cache = str;
    }

    public boolean isResolution() {
        return this.resolution;
    }

    public void setResolution(boolean z) {
        this.resolution = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        IvySettings settings = getIvyInstance().getSettings();
        if (isResolution()) {
            settings.getResolutionCacheManager().clean();
        }
        if ("*".equals(getCache())) {
            for (RepositoryCacheManager repositoryCacheManager : settings.getRepositoryCacheManagers()) {
                repositoryCacheManager.clean();
            }
            return;
        }
        if (NONE.equals(getCache())) {
            return;
        }
        RepositoryCacheManager repositoryCacheManager2 = settings.getRepositoryCacheManager(getCache());
        if (repositoryCacheManager2 == null) {
            throw new BuildException("unknown cache '" + getCache() + "'");
        }
        repositoryCacheManager2.clean();
    }
}
