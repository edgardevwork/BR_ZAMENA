package org.apache.ivy.plugins.parser;

import java.io.File;
import java.util.Map;
import org.apache.ivy.core.RelativeUrlResolver;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.module.status.StatusManager;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes6.dex */
public interface ParserSettings {
    ConflictManager getConflictManager(String str);

    Namespace getContextNamespace();

    String getDefaultBranch(ModuleId moduleId);

    PatternMatcher getMatcher(String str);

    Namespace getNamespace(String str);

    RelativeUrlResolver getRelativeUrlResolver();

    ResolutionCacheManager getResolutionCacheManager();

    DependencyResolver getResolver(ModuleRevisionId moduleRevisionId);

    StatusManager getStatusManager();

    TimeoutConstraint getTimeoutConstraint(String str);

    String getVariable(String str);

    File resolveFile(String str);

    String substitute(String str);

    Map<String, String> substitute(Map<String, String> map);
}
