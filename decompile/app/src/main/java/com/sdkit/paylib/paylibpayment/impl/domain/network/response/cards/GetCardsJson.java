package com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.cards.CardsResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.ErrorJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.ErrorJson$$a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes8.dex */
public final class GetCardsJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    public static final KSerializer[] f5217c = {null, new ArrayListSerializer(CardJson$$a.f5212a)};

    /* renamed from: a */
    public final ErrorJson f5218a;

    /* renamed from: b */
    public final List f5219b;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/cards/GetCardsJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/cards/GetCardsJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<GetCardsJson> serializer() {
            return GetCardsJson$$a.f5220a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GetCardsJson(int i, ErrorJson errorJson, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5218a = null;
        } else {
            this.f5218a = errorJson;
        }
        if ((i & 2) == 0) {
            this.f5219b = null;
        } else {
            this.f5219b = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public CardsResponse mo4249a(RequestMeta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        ErrorJson errorJson = this.f5218a;
        List listEmptyList = 0;
        ErrorModel errorModelM4242a = errorJson != null ? errorJson.m4242a() : null;
        List list = this.f5219b;
        if (list != null) {
            listEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                listEmptyList.add(((CardJson) it.next()).m4287a());
            }
        }
        if (listEmptyList == 0) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return new CardsResponse(meta, errorModelM4242a, listEmptyList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCardsJson)) {
            return false;
        }
        GetCardsJson getCardsJson = (GetCardsJson) obj;
        return Intrinsics.areEqual(this.f5218a, getCardsJson.f5218a) && Intrinsics.areEqual(this.f5219b, getCardsJson.f5219b);
    }

    public int hashCode() {
        ErrorJson errorJson = this.f5218a;
        int iHashCode = (errorJson == null ? 0 : errorJson.hashCode()) * 31;
        List list = this.f5219b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetCardsJson(error=");
        sb.append(this.f5218a);
        sb.append(", cards=");
        return C8045g.m1489a(sb, this.f5219b, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4294a(GetCardsJson getCardsJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5217c;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || getCardsJson.f5218a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ErrorJson$$a.f5143a, getCardsJson.f5218a);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && getCardsJson.f5219b == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], getCardsJson.f5219b);
    }
}
