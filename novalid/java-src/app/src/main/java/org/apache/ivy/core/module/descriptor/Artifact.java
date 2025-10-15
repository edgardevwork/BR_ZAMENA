package org.apache.ivy.core.module.descriptor;

import java.net.URL;
import java.util.Date;
import org.apache.ivy.core.module.p062id.ArtifactRevisionId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.util.extendable.ExtendableItem;

/* loaded from: classes7.dex */
public interface Artifact extends ExtendableItem {
    String[] getConfigurations();

    String getExt();

    ArtifactRevisionId getId();

    ModuleRevisionId getModuleRevisionId();

    String getName();

    Date getPublicationDate();

    String getType();

    URL getUrl();

    boolean isMetadata();
}
