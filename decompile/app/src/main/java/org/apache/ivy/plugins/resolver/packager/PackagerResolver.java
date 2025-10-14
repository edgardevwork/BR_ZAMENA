package org.apache.ivy.plugins.resolver.packager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.resolver.URLResolver;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public class PackagerResolver extends URLResolver {
    public static final String PACKAGER_ARTIFACT_EXT = "xml";
    public static final String PACKAGER_ARTIFACT_NAME = "packager";
    public static final String PACKAGER_ARTIFACT_TYPE = "packager";
    public File buildRoot;
    public boolean preserve;
    public boolean quiet;
    public File resourceCache;
    public String resourceURL;
    public boolean verbose;
    public final Map<ModuleRevisionId, PackagerCacheEntry> packagerCache = new HashMap();
    public final Map<String, String> properties = new LinkedHashMap();
    public boolean validate = true;
    public boolean restricted = true;

    public PackagerResolver() {
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: org.apache.ivy.plugins.resolver.packager.PackagerResolver.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                PackagerResolver.this.clearCache();
            }
        });
    }

    public synchronized void clearCache() {
        try {
            if (this.preserve) {
                return;
            }
            Iterator<PackagerCacheEntry> it = this.packagerCache.values().iterator();
            while (it.hasNext()) {
                it.next().cleanup();
            }
            this.packagerCache.clear();
            File file = this.buildRoot;
            if (file != null) {
                FileUtil.forceDelete(file);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setBuildRoot(File file) {
        this.buildRoot = file;
    }

    public File getBuildRoot() {
        return this.buildRoot;
    }

    public void setResourceCache(File file) {
        this.resourceCache = file;
    }

    public File getResourceCache() {
        return this.resourceCache;
    }

    public void setResourceURL(String str) {
        this.resourceURL = str;
    }

    public void setPackagerPattern(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        setArtifactPatterns(arrayList);
    }

    public void setPreserveBuildDirectories(boolean z) {
        this.preserve = z;
    }

    public void setRestricted(boolean z) {
        this.restricted = z;
    }

    public void setVerbose(boolean z) {
        this.verbose = z;
    }

    public void setQuiet(boolean z) {
        this.quiet = z;
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver
    public void setValidate(boolean z) {
        this.validate = z;
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public void setAllownomd(boolean z) {
        Message.error("allownomd not supported by resolver " + this);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public void setDescriptor(String str) {
        if ("optional".equals(str)) {
            Message.error("descriptor=\"optional\" not supported by resolver " + this);
            return;
        }
        super.setDescriptor(str);
    }

    public void setProperty(String str, String str2) {
        this.properties.put(str, str2);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.core.settings.Validatable
    public void validate() {
        super.validate();
        if (this.buildRoot == null) {
            throw new IllegalStateException("no buildRoot specified");
        }
        if (getArtifactPatterns().size() == 0) {
            throw new IllegalStateException("no packager pattern specified");
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver, org.apache.ivy.plugins.resolver.BasicResolver
    public synchronized ResolvedResource findArtifactRef(Artifact artifact, Date date) {
        if ("packager".equals(artifact.getName()) && "packager".equals(artifact.getType()) && "xml".equals(artifact.getExt())) {
            return super.findArtifactRef(artifact, date);
        }
        ModuleRevisionId moduleRevisionId = artifact.getModuleRevisionId();
        PackagerCacheEntry packagerCacheEntry = this.packagerCache.get(moduleRevisionId);
        if (packagerCacheEntry != null && !packagerCacheEntry.isBuilt()) {
            this.packagerCache.remove(moduleRevisionId);
            packagerCacheEntry.cleanup();
            packagerCacheEntry = null;
        }
        if (packagerCacheEntry == null) {
            ResolvedResource resolvedResourceFindArtifactRef = findArtifactRef(new DefaultArtifact(moduleRevisionId, null, "packager", "packager", "xml"), date);
            if (resolvedResourceFindArtifactRef == null) {
                return null;
            }
            PackagerCacheEntry packagerCacheEntry2 = new PackagerCacheEntry(moduleRevisionId, this.buildRoot, this.resourceCache, this.resourceURL, this.validate, this.preserve, this.restricted, this.verbose, this.quiet);
            try {
                packagerCacheEntry2.build(resolvedResourceFindArtifactRef.getResource(), this.properties);
                this.packagerCache.put(moduleRevisionId, packagerCacheEntry2);
                packagerCacheEntry = packagerCacheEntry2;
            } catch (IOException e) {
                throw new RuntimeException("can't build artifact " + artifact, e);
            }
        }
        return packagerCacheEntry.getBuiltArtifact(artifact);
    }

    @Override // org.apache.ivy.plugins.resolver.URLResolver, org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return "packager";
    }
}
