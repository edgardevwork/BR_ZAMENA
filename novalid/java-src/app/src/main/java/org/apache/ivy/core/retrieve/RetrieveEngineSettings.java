package org.apache.ivy.core.retrieve;

import org.apache.ivy.core.settings.IvyVariableContainer;
import org.apache.ivy.plugins.parser.ParserSettings;

/* loaded from: classes7.dex */
public interface RetrieveEngineSettings extends ParserSettings {
    String[] getIgnorableFilenames();

    IvyVariableContainer getVariables();

    boolean isCheckUpToDate();
}
