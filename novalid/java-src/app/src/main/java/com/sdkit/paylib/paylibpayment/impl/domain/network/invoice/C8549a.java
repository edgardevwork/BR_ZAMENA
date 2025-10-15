package com.sdkit.paylib.paylibpayment.impl.domain.network.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.CancelInvoiceResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.GetInvoiceResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.GetInvoicesResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.PostInvoiceResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.RequestSmsResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.VerifyPhoneNumberResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.AbstractC8503a;
import com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8519f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8520g;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8535h;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.model.C8558a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.VerificationOperationJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.VerificationOperationsListJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.CancelInvoiceJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.GetInvoiceJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.GetInvoicesJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.PostInvoiceJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.RequestSmsJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.VerifyPhoneNumberJson;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlinx.serialization.SerializersKt;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a */
/* loaded from: classes8.dex */
public final class C8549a implements InvoiceNetworkClient {

    /* renamed from: g */
    public static final a f4986g = new a(null);

    /* renamed from: a */
    public final C8552d f4987a;

    /* renamed from: b */
    public final C8533f f4988b;

    /* renamed from: c */
    public final InterfaceC8511f f4989c;

    /* renamed from: d */
    public final C8554f f4990d;

    /* renamed from: e */
    public final InterfaceC8556a f4991e;

    /* renamed from: f */
    public final PaylibLogger f4992f;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f4993a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f4993a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("cancelInvoice("), this.f4993a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f4994a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f4994a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("getFullInvoice("), this.f4994a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$d */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f4995a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f4995a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("getInvoice("), this.f4995a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f4996a;

        /* renamed from: b */
        public final /* synthetic */ String f4997b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2) {
            super(0);
            this.f4996a = str;
            this.f4997b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("getInvoice(");
            sb.append(this.f4996a);
            sb.append(") with status(");
            return C8032c.m1430a(sb, this.f4997b, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ int f4998a;

        /* renamed from: b */
        public final /* synthetic */ int f4999b;

        /* renamed from: c */
        public final /* synthetic */ ClosedRange f5000c;

        /* renamed from: d */
        public final /* synthetic */ List f5001d;

        /* renamed from: e */
        public final /* synthetic */ IntRange f5002e;

        /* renamed from: f */
        public final /* synthetic */ String f5003f;

        /* renamed from: g */
        public final /* synthetic */ String f5004g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, int i2, ClosedRange closedRange, List list, IntRange intRange, String str, String str2) {
            super(0);
            this.f4998a = i;
            this.f4999b = i2;
            this.f5000c = closedRange;
            this.f5001d = list;
            this.f5002e = intRange;
            this.f5003f = str;
            this.f5004g = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getInvoices with pageIndex=" + this.f4998a + ", pageSize=" + this.f4999b + ", dates=" + this.f5000c + ", statuses=" + this.f5001d + ", amounts=" + this.f5002e + ", maskedPan=" + this.f5003f + ", orderNumber=" + this.f5004g;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5005a;

        /* renamed from: b */
        public final /* synthetic */ PaymentMethod f5006b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, PaymentMethod paymentMethod) {
            super(0);
            this.f5005a = str;
            this.f5006b = paymentMethod;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "postInvoice(" + this.f5005a + ", " + this.f5006b + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$h */
    public static final class h extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5007a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.f5007a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("requestSmsWithVerifyCode("), this.f5007a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$i */
    public static final class i extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f5008a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.f5008a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("verifyPhoneNumber("), this.f5008a, ')');
        }
    }

    public C8549a(C8552d invoiceUrlPathProvider, C8533f networkClient, InterfaceC8511f infoProvider, C8554f paymentRequestBodyEncoder, InterfaceC8556a json, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(invoiceUrlPathProvider, "invoiceUrlPathProvider");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        Intrinsics.checkNotNullParameter(paymentRequestBodyEncoder, "paymentRequestBodyEncoder");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f4987a = invoiceUrlPathProvider;
        this.f4988b = networkClient;
        this.f4989c = infoProvider;
        this.f4990d = paymentRequestBodyEncoder;
        this.f4991e = json;
        this.f4992f = loggerFactory.get("InvoiceNetworkClientImpl");
    }

    /* renamed from: a */
    public static final CancelInvoiceResponse m4106a(C8549a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4991e;
        return (CancelInvoiceResponse) ((InterfaceC8572a) C8519f.m3975a(CancelInvoiceJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: b */
    public static final GetInvoiceResponse m4107b(C8549a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4991e;
        return (GetInvoiceResponse) ((InterfaceC8572a) C8519f.m3975a(GetInvoiceJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: c */
    public static final GetInvoiceResponse m4108c(C8549a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4991e;
        return (GetInvoiceResponse) ((InterfaceC8572a) C8519f.m3975a(GetInvoiceJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: d */
    public static final GetInvoiceResponse m4109d(C8549a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4991e;
        return (GetInvoiceResponse) ((InterfaceC8572a) C8519f.m3975a(GetInvoiceJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: e */
    public static final GetInvoicesResponse m4110e(C8549a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4991e;
        return (GetInvoicesResponse) ((InterfaceC8572a) C8519f.m3975a(GetInvoicesJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: f */
    public static final PostInvoiceResponse m4111f(C8549a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4991e;
        return (PostInvoiceResponse) ((InterfaceC8572a) C8519f.m3975a(PostInvoiceJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: g */
    public static final RequestSmsResponse m4112g(C8549a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4991e;
        return (RequestSmsResponse) ((InterfaceC8572a) C8519f.m3975a(RequestSmsJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    /* renamed from: h */
    public static final VerifyPhoneNumberResponse m4113h(C8549a this$0, C8535h it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC8556a interfaceC8556a = this$0.f4991e;
        return (VerifyPhoneNumberResponse) ((InterfaceC8572a) C8519f.m3975a(VerifyPhoneNumberJson.class, interfaceC8556a.getSerializersModule(), interfaceC8556a, it.m4052a())).mo4249a(new RequestMeta(C8520g.m3976a(it)));
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient
    public Object cancelInvoice(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4992f, null, new b(str), 1, null);
        return this.f4988b.m4037b(this.f4987a.m4128a(str), AbstractC8550b.f5009a, "", new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$$ExternalSyntheticLambda7
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8549a.m4106a(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient
    public Object getFullInvoice(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4992f, null, new c(str), 1, null);
        return this.f4988b.m4028a(this.f4987a.m4130a(str, m4114a(), 10L), AbstractC8550b.f5009a, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$$ExternalSyntheticLambda6
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8549a.m4107b(this.f$0, c8535h);
            }
        }, Boxing.boxLong(10L), continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient
    public Object getInvoice(String str, String str2, Long l, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4992f, null, new e(str, str2), 1, null);
        long jLongValue = l != null ? l.longValue() : 30L;
        return this.f4988b.m4028a(this.f4987a.m4131a(str, str2, m4114a(), jLongValue), AbstractC8550b.f5009a, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$$ExternalSyntheticLambda3
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8549a.m4109d(this.f$0, c8535h);
            }
        }, Boxing.boxLong(jLongValue), continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient
    public Object getInvoices(int i2, int i3, ClosedRange closedRange, List list, IntRange intRange, String str, String str2, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4992f, null, new f(i2, i3, closedRange, list, intRange, str, str2), 1, null);
        return C8533f.m4015a(this.f4988b, this.f4987a.m4127a(i2, i3, closedRange, list, intRange, str, str2), AbstractC8550b.f5009a, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$$ExternalSyntheticLambda2
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8549a.m4110e(this.f$0, c8535h);
            }
        }, null, continuation, 8, null);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient
    public Object postInvoice(String str, PaymentMethod paymentMethod, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4992f, null, new g(str, paymentMethod), 1, null);
        return this.f4988b.m4040c(this.f4987a.m4132b(str), AbstractC8550b.f5009a, this.f4990d.m4139a(paymentMethod, m4114a()), new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$$ExternalSyntheticLambda4
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8549a.m4111f(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient
    public Object requestSmsWithVerifyCode(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4992f, null, new h(str), 1, null);
        VerificationOperationsListJson verificationOperationsListJson = new VerificationOperationsListJson(CollectionsKt__CollectionsJVMKt.listOf(new VerificationOperationJson("payment", "mobile_b_get_otp", "")));
        C8533f c8533f = this.f4988b;
        String strM4133c = this.f4987a.m4133c(str);
        PaylibContext paylibContext = AbstractC8550b.f5009a;
        InterfaceC8556a interfaceC8556a = this.f4991e;
        return c8533f.m4040c(strM4133c, paylibContext, interfaceC8556a.encodeToString(SerializersKt.serializer(interfaceC8556a.getSerializersModule(), Reflection.typeOf(VerificationOperationsListJson.class)), verificationOperationsListJson), new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$$ExternalSyntheticLambda5
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8549a.m4112g(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient
    public Object verifyPhoneNumber(String str, String str2, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4992f, null, new i(str), 1, null);
        VerificationOperationsListJson verificationOperationsListJson = new VerificationOperationsListJson(CollectionsKt__CollectionsJVMKt.listOf(new VerificationOperationJson("payment", "mobile_b_enter_otp", str2)));
        C8533f c8533f = this.f4988b;
        String strM4134d = this.f4987a.m4134d(str);
        PaylibContext paylibContext = AbstractC8550b.f5009a;
        InterfaceC8556a interfaceC8556a = this.f4991e;
        return c8533f.m4040c(strM4134d, paylibContext, interfaceC8556a.encodeToString(SerializersKt.serializer(interfaceC8556a.getSerializersModule(), Reflection.typeOf(VerificationOperationsListJson.class)), verificationOperationsListJson), new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$$ExternalSyntheticLambda0
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8549a.m4113h(this.f$0, c8535h);
            }
        }, continuation);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient
    public Object getInvoice(String str, Continuation continuation) {
        PaylibLogger.DefaultImpls.d$default(this.f4992f, null, new d(str), 1, null);
        return C8533f.m4015a(this.f4988b, this.f4987a.m4129a(str, m4114a()), AbstractC8550b.f5009a, new C8533f.a() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.a$$ExternalSyntheticLambda1
            @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f.a
            /* renamed from: a */
            public final Object mo3960a(C8535h c8535h) {
                return C8549a.m4108c(this.f$0, c8535h);
            }
        }, null, continuation, 8, null);
    }

    /* renamed from: a */
    public final C8558a m4114a() {
        return AbstractC8503a.m3941a(this.f4989c);
    }
}
