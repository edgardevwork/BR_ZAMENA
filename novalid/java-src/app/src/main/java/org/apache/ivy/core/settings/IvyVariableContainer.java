package org.apache.ivy.core.settings;

/* loaded from: classes5.dex */
public interface IvyVariableContainer extends Cloneable {
    Object clone();

    String getVariable(String str);

    void setEnvironmentPrefix(String str);

    void setVariable(String str, String str2, boolean z);
}
