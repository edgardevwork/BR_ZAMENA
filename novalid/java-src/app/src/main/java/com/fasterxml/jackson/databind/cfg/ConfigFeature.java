package com.fasterxml.jackson.databind.cfg;

/* loaded from: classes4.dex */
public interface ConfigFeature {
    boolean enabledByDefault();

    boolean enabledIn(int i);

    int getMask();
}
