package org.apache.ivy.core.publish;

import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes7.dex */
public interface PublishEngineSettings extends ParserSettings {
    DependencyResolver getResolver(String str);

    @Override // org.apache.ivy.plugins.parser.ParserSettings
    String substitute(String str);
}
