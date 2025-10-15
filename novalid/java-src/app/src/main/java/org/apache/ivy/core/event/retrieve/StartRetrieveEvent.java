package org.apache.ivy.core.event.retrieve;

import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.retrieve.RetrieveOptions;

/* loaded from: classes8.dex */
public class StartRetrieveEvent extends RetrieveEvent {
    public static final String NAME = "pre-retrieve";

    public StartRetrieveEvent(ModuleRevisionId moduleRevisionId, String[] strArr, RetrieveOptions retrieveOptions) {
        super(NAME, moduleRevisionId, strArr, retrieveOptions);
    }
}
