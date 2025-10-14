package org.apache.ivy.core.install;

import java.util.Collection;
import org.apache.ivy.core.module.status.StatusManager;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.report.ReportOutputter;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes7.dex */
public interface InstallEngineSettings extends ParserSettings {
    @Override // org.apache.ivy.plugins.parser.ParserSettings
    PatternMatcher getMatcher(String str);

    Collection<String> getMatcherNames();

    ReportOutputter[] getReportOutputters();

    DependencyResolver getResolver(String str);

    Collection<String> getResolverNames();

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    StatusManager getStatusManager();

    boolean logNotConvertedExclusionRule();

    void setLogNotConvertedExclusionRule(boolean z);
}
