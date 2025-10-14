package ru.rustore.sdk.billingclient.impl.data.mapper;

import com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductType;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.mapper.g */
/* loaded from: classes5.dex */
public final class C11452g {

    /* renamed from: ru.rustore.sdk.billingclient.impl.data.mapper.g$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10236a;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.NON_CONSUMABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.CONSUMABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.SUBSCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductType.APPLICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10236a = iArr;
        }
    }
}
