package org.apache.ivy.tools.analyser;

import java.io.File;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes8.dex */
public class JarModule {
    public File jar;
    public ModuleRevisionId mrid;

    public JarModule(ModuleRevisionId moduleRevisionId, File file) {
        this.mrid = moduleRevisionId;
        this.jar = file;
    }

    public File getJar() {
        return this.jar;
    }

    public ModuleRevisionId getMrid() {
        return this.mrid;
    }

    public String toString() {
        return this.jar + " " + this.mrid;
    }
}
