package org.apache.ivy.plugins.resolver;

import java.util.Collection;
import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.plugins.latest.LatestStrategy;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.signer.SignatureGenerator;
import org.apache.ivy.plugins.version.VersionMatcher;

/* loaded from: classes5.dex */
public interface ResolverSettings extends ParserSettings {
    void configureRepositories(boolean z);

    void filterIgnore(Collection<String> collection);

    LatestStrategy getDefaultLatestStrategy();

    RepositoryCacheManager getDefaultRepositoryCacheManager();

    LatestStrategy getLatestStrategy(String str);

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    Namespace getNamespace(String str);

    RepositoryCacheManager getRepositoryCacheManager(String str);

    RepositoryCacheManager[] getRepositoryCacheManagers();

    String getResolveMode(ModuleId moduleId);

    SignatureGenerator getSignatureGenerator(String str);

    Namespace getSystemNamespace();

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    String getVariable(String str);

    VersionMatcher getVersionMatcher();
}
