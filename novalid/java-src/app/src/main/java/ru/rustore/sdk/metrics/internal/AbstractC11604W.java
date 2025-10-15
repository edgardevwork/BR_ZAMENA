package ru.rustore.sdk.metrics.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.metrics.internal.W */
/* loaded from: classes8.dex */
public abstract class AbstractC11604W {

    /* renamed from: ru.rustore.sdk.metrics.internal.W$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC11604W {

        /* renamed from: a */
        public static final a f10655a = new a();
    }

    /* renamed from: ru.rustore.sdk.metrics.internal.W$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC11604W {

        /* renamed from: a */
        public final List<C11586D> f10656a;

        public b(ArrayList values) {
            Intrinsics.checkNotNullParameter(values, "values");
            this.f10656a = values;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f10656a, ((b) obj).f10656a);
        }

        public final int hashCode() {
            return this.f10656a.hashCode();
        }

        public final String toString() {
            return "Sent(values=" + this.f10656a + ')';
        }
    }
}
