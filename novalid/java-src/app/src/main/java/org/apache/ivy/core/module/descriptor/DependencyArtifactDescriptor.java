package org.apache.ivy.core.module.descriptor;

import java.net.URL;
import org.apache.ivy.util.extendable.ExtendableItem;

/* loaded from: classes7.dex */
public interface DependencyArtifactDescriptor extends ExtendableItem {
    String[] getConfigurations();

    DependencyDescriptor getDependencyDescriptor();

    String getExt();

    String getName();

    String getType();

    URL getUrl();
}
