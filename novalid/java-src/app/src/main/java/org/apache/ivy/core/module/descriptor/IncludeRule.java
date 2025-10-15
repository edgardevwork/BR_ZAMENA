package org.apache.ivy.core.module.descriptor;

import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.util.extendable.ExtendableItem;

/* loaded from: classes7.dex */
public interface IncludeRule extends ExtendableItem {
    String[] getConfigurations();

    ArtifactId getId();

    PatternMatcher getMatcher();
}
