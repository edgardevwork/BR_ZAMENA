package org.apache.ivy.core.module.descriptor;

import java.util.Map;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.plugins.matcher.PatternMatcher;

/* loaded from: classes5.dex */
public class DefaultExcludeRule extends AbstractIncludeExcludeRule implements ExcludeRule {
    public DefaultExcludeRule(ArtifactId artifactId, PatternMatcher patternMatcher, Map<String, String> map) {
        super(artifactId, patternMatcher, map);
    }

    @Override // org.apache.ivy.core.module.descriptor.AbstractIncludeExcludeRule
    public String toString() {
        return "E:" + super.toString();
    }
}
