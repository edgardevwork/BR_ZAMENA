package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* renamed from: io.appmetrica.analytics.impl.sc */
/* loaded from: classes7.dex */
public final class C9853sc {

    /* renamed from: c */
    public static final SparseArray f9043c;

    /* renamed from: a */
    public final String f9044a;

    /* renamed from: b */
    public final String f9045b;

    static {
        SparseArray sparseArray = new SparseArray();
        f9043c = sparseArray;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new C9853sc("jvm", "binder"));
        sparseArray.put(5890, new C9853sc("jvm", "intent"));
        sparseArray.put(5889, new C9853sc("jvm", PomReader.PomProfileElement.FILE));
        sparseArray.put(5897, new C9853sc("jni_native", PomReader.PomProfileElement.FILE));
        sparseArray.put(5898, new C9853sc("jni_native", PomReader.PomProfileElement.FILE));
    }

    public C9853sc(String str, String str2) {
        this.f9044a = str;
        this.f9045b = str2;
    }
}
