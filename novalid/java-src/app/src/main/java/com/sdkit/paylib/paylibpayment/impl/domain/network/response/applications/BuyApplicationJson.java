package com.sdkit.paylib.paylibpayment.impl.domain.network.response.applications;

import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.BuyApplicationResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.DigitalShopErrorJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.DigitalShopErrorJson$$a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class BuyApplicationJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final KSerializer[] f5161f = {null, null, null, new ArrayListSerializer(DigitalShopErrorJson$$a.f5138a), null};

    /* renamed from: a */
    public final Integer f5162a;

    /* renamed from: b */
    public final String f5163b;

    /* renamed from: c */
    public final String f5164c;

    /* renamed from: d */
    public final List f5165d;

    /* renamed from: e */
    public final ApplicationInfoJson f5166e;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/applications/BuyApplicationJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/applications/BuyApplicationJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<BuyApplicationJson> serializer() {
            return BuyApplicationJson$$a.f5167a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BuyApplicationJson(int i, Integer num, String str, String str2, List list, ApplicationInfoJson applicationInfoJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5162a = null;
        } else {
            this.f5162a = num;
        }
        if ((i & 2) == 0) {
            this.f5163b = null;
        } else {
            this.f5163b = str;
        }
        if ((i & 4) == 0) {
            this.f5164c = null;
        } else {
            this.f5164c = str2;
        }
        if ((i & 8) == 0) {
            this.f5165d = null;
        } else {
            this.f5165d = list;
        }
        if ((i & 16) == 0) {
            this.f5166e = null;
        } else {
            this.f5166e = applicationInfoJson;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public BuyApplicationResponse mo4249a(RequestMeta meta) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        Integer num = this.f5162a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.f5163b;
        String str2 = this.f5164c;
        List list = this.f5165d;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((DigitalShopErrorJson) it.next()).m4238a());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        ApplicationInfoJson applicationInfoJson = this.f5166e;
        return new BuyApplicationResponse(meta, iIntValue, str, str2, arrayList, applicationInfoJson != null ? applicationInfoJson.m4251a() : null);
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4259a(BuyApplicationJson buyApplicationJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5161f;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || buyApplicationJson.f5162a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, buyApplicationJson.f5162a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || buyApplicationJson.f5163b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, buyApplicationJson.f5163b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || buyApplicationJson.f5164c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, buyApplicationJson.f5164c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || buyApplicationJson.f5165d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], buyApplicationJson.f5165d);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && buyApplicationJson.f5166e == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, ApplicationInfoJson$$a.f5151a, buyApplicationJson.f5166e);
    }
}
