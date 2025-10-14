package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* renamed from: io.appmetrica.analytics.impl.um */
/* loaded from: classes7.dex */
public abstract class AbstractC9913um {

    /* renamed from: a */
    public static final List f9199a = CollectionUtils.createSortedListWithoutRepetitions("id", PomReader.SCOPE, "data", "timestamp");
}
