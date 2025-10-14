package ru.rustore.sdk.billingclient.impl.data.converter;

import com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductStatus;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductType;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.converter.a */
/* loaded from: classes5.dex */
public final /* synthetic */ class C11421a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f10201a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f10202b;

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
        f10201a = iArr;
        int[] iArr2 = new int[ProductStatus.values().length];
        try {
            iArr2[ProductStatus.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ProductStatus.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f10202b = iArr2;
    }
}
