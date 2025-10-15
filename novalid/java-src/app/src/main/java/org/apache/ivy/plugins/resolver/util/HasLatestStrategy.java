package org.apache.ivy.plugins.resolver.util;

import org.apache.ivy.plugins.latest.LatestStrategy;

/* loaded from: classes6.dex */
public interface HasLatestStrategy {
    String getLatest();

    LatestStrategy getLatestStrategy();

    void setLatestStrategy(LatestStrategy latestStrategy);
}
