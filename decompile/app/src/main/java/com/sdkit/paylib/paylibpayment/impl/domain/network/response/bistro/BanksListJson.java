package com.sdkit.paylib.paylibpayment.impl.domain.network.response.bistro;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibpayment.api.network.entity.bistro.BankInfo;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.bistro.BanksListResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes8.dex */
public final class BanksListJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final KSerializer[] f5182b = {new ArrayListSerializer(BankJson$$a.f5180a)};

    /* renamed from: a */
    public final List f5183a;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/bistro/BanksListJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/bistro/BanksListJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<BanksListJson> serializer() {
            return BanksListJson$$a.f5184a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BanksListJson(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, BanksListJson$$a.f5184a.getDescriptor());
        }
        this.f5183a = list;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public BanksListResponse mo4249a(RequestMeta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        List list = this.f5183a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BankInfo bankInfoM4270a = ((BankJson) it.next()).m4270a();
            if (bankInfoM4270a != null) {
                arrayList.add(bankInfoM4270a);
            }
        }
        return new BanksListResponse(meta, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BanksListJson) && Intrinsics.areEqual(this.f5183a, ((BanksListJson) obj).f5183a);
    }

    public int hashCode() {
        return this.f5183a.hashCode();
    }

    public String toString() {
        return C8045g.m1489a(new StringBuilder("BanksListJson(banksList="), this.f5183a, ')');
    }
}
