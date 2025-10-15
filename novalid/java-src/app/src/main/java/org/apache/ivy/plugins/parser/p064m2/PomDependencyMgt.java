package org.apache.ivy.plugins.parser.p064m2;

import java.util.List;
import org.apache.ivy.core.module.p062id.ModuleId;

/* loaded from: classes6.dex */
public interface PomDependencyMgt {
    String getArtifactId();

    List<ModuleId> getExcludedModules();

    String getGroupId();

    String getScope();

    String getVersion();
}
