package org.apache.ivy.core.event.retrieve;

import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.retrieve.RetrieveOptions;

/* loaded from: classes7.dex */
public class RetrieveEvent extends IvyEvent {
    public ModuleRevisionId mrid;
    public RetrieveOptions options;

    public RetrieveEvent(String str, ModuleRevisionId moduleRevisionId, String[] strArr, RetrieveOptions retrieveOptions) {
        super(str);
        this.mrid = moduleRevisionId;
        addMridAttributes(moduleRevisionId);
        addConfsAttribute(strArr);
        addAttribute("symlink", String.valueOf(retrieveOptions.isMakeSymlinks()));
        addAttribute("sync", String.valueOf(retrieveOptions.isSync()));
        this.options = retrieveOptions;
    }

    public ModuleRevisionId getModuleRevisionId() {
        return this.mrid;
    }

    public RetrieveOptions getOptions() {
        return this.options;
    }
}
