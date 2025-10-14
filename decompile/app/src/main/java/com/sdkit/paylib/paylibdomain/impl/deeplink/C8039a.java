package com.sdkit.paylib.paylibdomain.impl.deeplink;

import com.blackhub.bronline.game.gui.craft.CraftKeys;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkDetails;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkPaymentType;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SourceState;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.lang3.StringUtils;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.a */
/* loaded from: classes6.dex */
public final class C8039a {

    /* renamed from: b */
    public static final a f1140b = new a(null);

    /* renamed from: a */
    public final PaylibLogger f1141a;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.a$b */
    /* loaded from: classes7.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ List f1142a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f1142a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8045g.m1489a(new StringBuilder("decode props("), this.f1142a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.a$c */
    /* loaded from: classes7.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ List f1143a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f1143a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8045g.m1489a(new StringBuilder("encode props("), this.f1143a, ')');
        }
    }

    public C8039a(PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1141a = loggerFactory.get("DeeplinkDetailsCoder");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DeeplinkDetails m1461a(String string) {
        int i;
        int iHashCode;
        DeeplinkPaymentType tBank;
        Intrinsics.checkNotNullParameter(string, "string");
        List listM1464b = m1464b(string);
        SourceState application = null;
        PaylibLogger.DefaultImpls.d$default(this.f1141a, null, new b(listM1464b), 1, null);
        String str = (String) listM1464b.get(0);
        int iHashCode2 = str.hashCode();
        if (iHashCode2 == 0) {
            if (str.equals("")) {
                i = 1;
                int i2 = i + 1;
                String str2 = (String) listM1464b.get(i);
                iHashCode = str2.hashCode();
                if (iHashCode == 43) {
                }
            }
            throw new IllegalArgumentException("decodeFromDeeplink failed (нераспознанный SourceState)");
        }
        i = 4;
        if (iHashCode2 == 97) {
            if (str.equals("a")) {
                application = new SourceState.Application((String) listM1464b.get(1), (String) listM1464b.get(2), (String) listM1464b.get(3), null);
                int i22 = i + 1;
                String str22 = (String) listM1464b.get(i);
                iHashCode = str22.hashCode();
                if (iHashCode == 43) {
                }
            }
            throw new IllegalArgumentException("decodeFromDeeplink failed (нераспознанный SourceState)");
        }
        if (iHashCode2 == 105) {
            if (str.equals("i")) {
                application = new SourceState.Invoice((String) listM1464b.get(1));
                i = 2;
                int i222 = i + 1;
                String str222 = (String) listM1464b.get(i);
                iHashCode = str222.hashCode();
                if (iHashCode == 43) {
                }
            }
            throw new IllegalArgumentException("decodeFromDeeplink failed (нераспознанный SourceState)");
        }
        if (iHashCode2 == 112) {
            if (str.equals("p")) {
                String str3 = (String) listM1464b.get(1);
                String str4 = (String) listM1464b.get(2);
                String str5 = (String) listM1464b.get(3);
                Object obj = listM1464b.get(4);
                if (((String) obj).length() <= 0) {
                    obj = null;
                }
                String str6 = (String) obj;
                Object obj2 = listM1464b.get(5);
                if (((String) obj2).length() <= 0) {
                    obj2 = null;
                }
                String str7 = (String) obj2;
                application = new SourceState.Product(str3, str4, str5, str6, str7 != null ? Integer.valueOf(Integer.parseInt(str7)) : null, null);
                i = 6;
                int i2222 = i + 1;
                String str2222 = (String) listM1464b.get(i);
                iHashCode = str2222.hashCode();
                if (iHashCode == 43) {
                }
            }
            throw new IllegalArgumentException("decodeFromDeeplink failed (нераспознанный SourceState)");
        }
        if (iHashCode2 == 3581 && str.equals(CraftKeys.PERCENT_OF_SKILL_KEY)) {
            application = new SourceState.PaymentMethodChangeState((String) listM1464b.get(1), (String) listM1464b.get(3), (String) listM1464b.get(2));
            int i22222 = i + 1;
            String str22222 = (String) listM1464b.get(i);
            iHashCode = str22222.hashCode();
            if (iHashCode == 43) {
                if (str22222.equals("+")) {
                    tBank = new DeeplinkPaymentType.TBank(true);
                    if (listM1464b.size() > i22222) {
                    }
                }
                throw new IllegalArgumentException("decodeFromDeeplink failed (неизвестный DeeplinkPaymentType)");
            }
            if (iHashCode == 45) {
                if (str22222.equals("-")) {
                    tBank = new DeeplinkPaymentType.TBank(false);
                    if (listM1464b.size() > i22222) {
                    }
                }
                throw new IllegalArgumentException("decodeFromDeeplink failed (неизвестный DeeplinkPaymentType)");
            }
            if (iHashCode == 98) {
                if (str22222.equals("b")) {
                    tBank = DeeplinkPaymentType.Sbp.INSTANCE;
                    if (listM1464b.size() > i22222) {
                    }
                }
                throw new IllegalArgumentException("decodeFromDeeplink failed (неизвестный DeeplinkPaymentType)");
            }
            if (iHashCode == 115 && str22222.equals("s")) {
                tBank = DeeplinkPaymentType.Sbolpay.INSTANCE;
                if (listM1464b.size() > i22222) {
                    return new DeeplinkDetails(application, tBank);
                }
                throw new IllegalArgumentException("decodeFromDeeplink failed (неверное число параметров)");
            }
            throw new IllegalArgumentException("decodeFromDeeplink failed (неизвестный DeeplinkPaymentType)");
        }
        throw new IllegalArgumentException("decodeFromDeeplink failed (нераспознанный SourceState)");
    }

    /* renamed from: b */
    public final List m1464b(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        byte[] bArrDecode = Base64.getDecoder().decode(str);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "getDecoder()\n        .decode(str)");
        return StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsJVMKt.decodeToString(bArrDecode), new char[]{'\n'}, false, 0, 6, (Object) null);
    }

    /* renamed from: a */
    public final String m1462a(DeeplinkDetails obj) {
        List listListOf;
        String string;
        String str;
        Intrinsics.checkNotNullParameter(obj, "obj");
        ArrayList arrayList = new ArrayList();
        SourceState sourceState = obj.getSourceState();
        if (sourceState == null) {
            arrayList.add("");
        } else {
            if (sourceState instanceof SourceState.Invoice) {
                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"i", ((SourceState.Invoice) sourceState).getInvoiceId()});
            } else if (sourceState instanceof SourceState.Product) {
                SourceState.Product product = (SourceState.Product) sourceState;
                String invoiceId = product.getInvoiceId();
                String purchaseId = product.getPurchaseId();
                String productId = product.getProductId();
                String orderId = product.getOrderId();
                String str2 = orderId == null ? "" : orderId;
                Integer quantity = product.getQuantity();
                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"p", invoiceId, purchaseId, productId, str2, (quantity == null || (string = quantity.toString()) == null) ? "" : string});
            } else if (sourceState instanceof SourceState.Application) {
                SourceState.Application application = (SourceState.Application) sourceState;
                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"a", application.getApplicationId(), application.getInvoiceId(), application.getPurchaseId()});
            } else if (sourceState instanceof SourceState.PaymentMethodChangeState) {
                SourceState.PaymentMethodChangeState paymentMethodChangeState = (SourceState.PaymentMethodChangeState) sourceState;
                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{CraftKeys.PERCENT_OF_SKILL_KEY, paymentMethodChangeState.getInvoiceId(), paymentMethodChangeState.getPurchaseId(), paymentMethodChangeState.getOldPurchaseId()});
            }
            arrayList.addAll(listListOf);
        }
        DeeplinkPaymentType deeplinkPaymentType = obj.getDeeplinkPaymentType();
        if (Intrinsics.areEqual(deeplinkPaymentType, DeeplinkPaymentType.Sbolpay.INSTANCE)) {
            str = "s";
        } else {
            if (!Intrinsics.areEqual(deeplinkPaymentType, DeeplinkPaymentType.Sbp.INSTANCE)) {
                if (deeplinkPaymentType instanceof DeeplinkPaymentType.TBank) {
                    boolean zIsSuccessful = ((DeeplinkPaymentType.TBank) deeplinkPaymentType).isSuccessful();
                    if (zIsSuccessful) {
                        str = "+";
                    } else if (!zIsSuccessful) {
                        str = "-";
                    }
                }
                PaylibLogger.DefaultImpls.d$default(this.f1141a, null, new c(arrayList), 1, null);
                return m1463a(arrayList);
            }
            str = "b";
        }
        arrayList.add(str);
        PaylibLogger.DefaultImpls.d$default(this.f1141a, null, new c(arrayList), 1, null);
        return m1463a(arrayList);
    }

    /* renamed from: a */
    public final String m1463a(List props) {
        Intrinsics.checkNotNullParameter(props, "props");
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = CollectionsKt___CollectionsKt.joinToString$default(props, StringUtils.f9903LF, null, null, 0, null, null, 62, null).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString = encoder.encodeToString(bytes);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "getEncoder()\n        .en…oString()).toByteArray())");
        return StringsKt__StringsKt.trimEnd(strEncodeToString, '=');
    }
}
