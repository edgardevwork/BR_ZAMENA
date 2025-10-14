package com.sdkit.paylib.paylibdomain.impl.sbp.entity;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class KnownSbpPackages {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final KSerializer[] f1475b = {new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* renamed from: a */
    public final List f1476a;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/impl/sbp/entity/KnownSbpPackages$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibdomain/impl/sbp/entity/KnownSbpPackages;", "com-sdkit-assistant_paylib_domain"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<KnownSbpPackages> serializer() {
            return KnownSbpPackages$$a.f1477a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ KnownSbpPackages(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, KnownSbpPackages$$a.f1477a.getDescriptor());
        }
        this.f1476a = list;
    }

    /* renamed from: b */
    public final List m1652b() {
        return this.f1476a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KnownSbpPackages) && Intrinsics.areEqual(this.f1476a, ((KnownSbpPackages) obj).f1476a);
    }

    public int hashCode() {
        return this.f1476a.hashCode();
    }

    public String toString() {
        return C8045g.m1489a(new StringBuilder("KnownSbpPackages(packages="), this.f1476a, ')');
    }
}
