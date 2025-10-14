package org.jfrog.build.api;

import java.io.Serializable;
import java.util.Properties;

/* loaded from: classes8.dex */
public interface BuildBean extends Serializable {
    public static final String ARTIFACT = "artifact";
    public static final String ARTIFACTS = "artifacts";
    public static final String DEPENDENCIES = "dependencies";
    public static final String DEPENDENCY = "dependency";
    public static final String EXCLUDED_ARTIFACTS = "excludedArtifacts";
    public static final String MODULE = "module";
    public static final String MODULES = "modules";
    public static final String ROOT = "build";
    public static final String RUN_PARAMETERS = "runParameters";

    Properties getProperties();

    void setProperties(Properties properties);
}
