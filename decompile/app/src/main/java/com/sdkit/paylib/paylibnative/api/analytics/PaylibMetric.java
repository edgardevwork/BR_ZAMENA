package com.sdkit.paylib.paylibnative.api.analytics;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibMetric;", "", "", "component1", "", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibMetric$Param;", "component2", "name", "params", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getParams", "()Ljava/util/List;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/util/List;)V", "IntParam", "Param", "StringParam", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final /* data */ class PaylibMetric {

    /* renamed from: a, reason: from kotlin metadata */
    public final String name;

    /* renamed from: b, reason: from kotlin metadata */
    public final List params;

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibMetric$IntParam;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibMetric$Param;", "", "component1", "", "component2", "name", "value", "copy", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "I", "getValue", "()I", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;I)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class IntParam extends Param {

        /* renamed from: a, reason: from kotlin metadata */
        public final String name;

        /* renamed from: b, reason: from kotlin metadata */
        public final int value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntParam(String name, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.value = i;
        }

        public static /* synthetic */ IntParam copy$default(IntParam intParam, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = intParam.name;
            }
            if ((i2 & 2) != 0) {
                i = intParam.value;
            }
            return intParam.copy(str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final IntParam copy(String name, int value) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new IntParam(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntParam)) {
                return false;
            }
            IntParam intParam = (IntParam) other;
            return Intrinsics.areEqual(this.name, intParam.name) && this.value == intParam.value;
        }

        @Override // com.sdkit.paylib.paylibnative.api.analytics.PaylibMetric.Param
        public String getName() {
            return this.name;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value) + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "IntParam(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibMetric$Param;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibMetric$IntParam;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibMetric$StringParam;", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static abstract class Param {
        public Param() {
        }

        public abstract String getName();

        public /* synthetic */ Param(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibMetric$StringParam;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibMetric$Param;", "", "component1", "component2", "name", "value", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getValue", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class StringParam extends Param {

        /* renamed from: a, reason: from kotlin metadata */
        public final String name;

        /* renamed from: b, reason: from kotlin metadata */
        public final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringParam(String name, String value) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }

        public static /* synthetic */ StringParam copy$default(StringParam stringParam, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stringParam.name;
            }
            if ((i & 2) != 0) {
                str2 = stringParam.value;
            }
            return stringParam.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final StringParam copy(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return new StringParam(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringParam)) {
                return false;
            }
            StringParam stringParam = (StringParam) other;
            return Intrinsics.areEqual(this.name, stringParam.name) && Intrinsics.areEqual(this.value, stringParam.value);
        }

        @Override // com.sdkit.paylib.paylibnative.api.analytics.PaylibMetric.Param
        public String getName() {
            return this.name;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("StringParam(name=");
            sb.append(this.name);
            sb.append(", value=");
            return C8032c.m1430a(sb, this.value, ')');
        }
    }

    public PaylibMetric(String name, List<? extends Param> params) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(params, "params");
        this.name = name;
        this.params = params;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaylibMetric copy$default(PaylibMetric paylibMetric, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paylibMetric.name;
        }
        if ((i & 2) != 0) {
            list = paylibMetric.params;
        }
        return paylibMetric.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<Param> component2() {
        return this.params;
    }

    public final PaylibMetric copy(String name, List<? extends Param> params) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(params, "params");
        return new PaylibMetric(name, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaylibMetric)) {
            return false;
        }
        PaylibMetric paylibMetric = (PaylibMetric) other;
        return Intrinsics.areEqual(this.name, paylibMetric.name) && Intrinsics.areEqual(this.params, paylibMetric.params);
    }

    public final String getName() {
        return this.name;
    }

    public final List<Param> getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.params.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaylibMetric(name=");
        sb.append(this.name);
        sb.append(", params=");
        return C8045g.m1489a(sb, this.params, ')');
    }
}
