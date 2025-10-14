package com.sdkit.paylib.paylibnative.p033ui.core.sbolpay;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkDetails;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkPaymentType;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SourceState;
import com.sdkit.paylib.paylibdomain.api.deeplink.interactors.DeeplinkSupportInteractor;
import com.sdkit.paylib.paylibdomain.api.sbol.interactors.SbolAvailabilityInteractor;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.domain.error.PaylibIllegalStateException;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.lang3.text.ExtendedMessageFormat;

/* loaded from: classes8.dex */
public final class SbolPayDeeplinkResolver {

    /* renamed from: a */
    public final InterfaceC8238l f2069a;

    /* renamed from: b */
    public final DeeplinkHandler f2070b;

    /* renamed from: c */
    public final PaylibDeeplinkFactory f2071c;

    /* renamed from: d */
    public final SbolAvailabilityInteractor f2072d;

    /* renamed from: e */
    public final DeeplinkSupportInteractor f2073e;

    /* renamed from: f */
    public final InterfaceC8131b f2074f;

    /* renamed from: g */
    public final PaylibLogger f2075g;

    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001d\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\t¨\u0006\n"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/core/sbolpay/SbolPayDeeplinkResolver$SbolPayDeeplinkError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "ex", "", "(Ljava/lang/Throwable;)V", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class SbolPayDeeplinkError extends RuntimeException {
        public SbolPayDeeplinkError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public SbolPayDeeplinkError(String str, Throwable th) {
            super(str, th);
        }

        public /* synthetic */ SbolPayDeeplinkError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }

        public SbolPayDeeplinkError(Throwable th) {
            this(th != null ? th.getMessage() : null, th);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.sbolpay.SbolPayDeeplinkResolver$a */
    /* loaded from: classes6.dex */
    public static final class C8169a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f2076a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8169a(String str) {
            super(0);
            this.f2076a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("makeReturnDeeplink: returnDeeplink("), this.f2076a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.sbolpay.SbolPayDeeplinkResolver$b */
    /* loaded from: classes6.dex */
    public static final class C8170b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Throwable f2077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8170b(Throwable th) {
            super(0);
            this.f2077a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "makeReturnDeeplink: " + this.f2077a.getMessage();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.sbolpay.SbolPayDeeplinkResolver$c */
    /* loaded from: classes6.dex */
    public static final class C8171c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f2078a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8171c(String str) {
            super(0);
            this.f2078a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("openSbolPayDeeplink: payDeeplink("), this.f2078a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.sbolpay.SbolPayDeeplinkResolver$d */
    /* loaded from: classes6.dex */
    public static final class C8172d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Throwable f2079a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8172d(Throwable th) {
            super(0);
            this.f2079a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "openSbolPayDeeplink: " + this.f2079a.getMessage();
        }
    }

    public SbolPayDeeplinkResolver(InterfaceC8238l paylibStateManager, DeeplinkHandler deeplinkHandler, PaylibDeeplinkFactory payDeeplinkFactory, SbolAvailabilityInteractor sbolAccesabilityInteractor, DeeplinkSupportInteractor deeplinkSupportInteractor, InterfaceC8131b config, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(payDeeplinkFactory, "payDeeplinkFactory");
        Intrinsics.checkNotNullParameter(sbolAccesabilityInteractor, "sbolAccesabilityInteractor");
        Intrinsics.checkNotNullParameter(deeplinkSupportInteractor, "deeplinkSupportInteractor");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2069a = paylibStateManager;
        this.f2070b = deeplinkHandler;
        this.f2071c = payDeeplinkFactory;
        this.f2072d = sbolAccesabilityInteractor;
        this.f2073e = deeplinkSupportInteractor;
        this.f2074f = config;
        this.f2075g = loggerFactory.get("SbolPayDeeplinkResolver");
    }

    /* renamed from: a */
    public final Object m2094a(String payDeeplink) {
        Object objM15699constructorimpl;
        Object objM15699constructorimpl2;
        Throwable thM15702exceptionOrNullimpl;
        Intrinsics.checkNotNullParameter(payDeeplink, "payDeeplink");
        try {
            Result.Companion companion = Result.INSTANCE;
            PaylibLogger.DefaultImpls.d$default(this.f2075g, null, new C8171c(payDeeplink), 1, null);
            try {
                objM15699constructorimpl2 = Result.m15699constructorimpl(Boolean.valueOf(this.f2073e.isDeepLinkSupported(payDeeplink) ? this.f2070b.openDeeplink(payDeeplink, null) : false));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM15699constructorimpl2 = Result.m15699constructorimpl(ResultKt.createFailure(th));
            }
            thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl2);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th2));
        }
        if (thM15702exceptionOrNullimpl != null) {
            throw new SbolPayDeeplinkError(thM15702exceptionOrNullimpl);
        }
        Boolean bool = (Boolean) objM15699constructorimpl2;
        bool.booleanValue();
        objM15699constructorimpl = Result.m15699constructorimpl(bool);
        Throwable thM15702exceptionOrNullimpl2 = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
        if (thM15702exceptionOrNullimpl2 != null) {
            this.f2075g.mo1701e(thM15702exceptionOrNullimpl2, new C8172d(thM15702exceptionOrNullimpl2));
        }
        return objM15699constructorimpl;
    }

    /* renamed from: b */
    public final Object m2096b() {
        Object objM15699constructorimpl;
        Throwable th;
        SourceState paymentMethodChangeState;
        Object objM15699constructorimpl2;
        byte b;
        try {
            Result.Companion companion = Result.INSTANCE;
            AbstractC8237k abstractC8237kMo2351c = this.f2069a.mo2351c();
            th = null;
            b = 0;
            if (abstractC8237kMo2351c instanceof AbstractC8237k.e.d) {
                paymentMethodChangeState = new SourceState.Invoice(((AbstractC8237k.e.d) abstractC8237kMo2351c).mo2309a().m2311a());
            } else if (abstractC8237kMo2351c instanceof AbstractC8237k.g.c) {
                paymentMethodChangeState = new SourceState.Product(((AbstractC8237k.g.c) abstractC8237kMo2351c).m2335b(), ((AbstractC8237k.g.c) abstractC8237kMo2351c).m2336c(), ((AbstractC8237k.g.c) abstractC8237kMo2351c).mo2322a().m2341c(), ((AbstractC8237k.g.c) abstractC8237kMo2351c).mo2322a().m2340b(), ((AbstractC8237k.g.c) abstractC8237kMo2351c).mo2322a().m2342d(), ((AbstractC8237k.g.c) abstractC8237kMo2351c).mo2322a().m2339a());
            } else if (abstractC8237kMo2351c instanceof AbstractC8237k.a.d) {
                paymentMethodChangeState = new SourceState.Application(((AbstractC8237k.a.d) abstractC8237kMo2351c).mo2298a().m2299a(), ((AbstractC8237k.a.d) abstractC8237kMo2351c).m2307b(), ((AbstractC8237k.a.d) abstractC8237kMo2351c).m2308c(), ((AbstractC8237k.a.d) abstractC8237kMo2351c).mo2298a().m2300b());
            } else if (abstractC8237kMo2351c instanceof AbstractC8237k.f.c) {
                paymentMethodChangeState = new SourceState.PaymentMethodChangeState(((AbstractC8237k.f.c) abstractC8237kMo2351c).m2319b(), ((AbstractC8237k.f.c) abstractC8237kMo2351c).mo2312a().m2321a(), ((AbstractC8237k.f.c) abstractC8237kMo2351c).m2320c());
            } else {
                paymentMethodChangeState = null;
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th2));
        }
        if (paymentMethodChangeState == null) {
            throw new PaylibIllegalStateException();
        }
        String strProvideInitialReturnDeepLink = this.f2070b.provideInitialReturnDeepLink();
        if (!(!StringsKt__StringsJVMKt.isBlank(strProvideInitialReturnDeepLink))) {
            throw new SbolPayDeeplinkError("provideInitialReturnDeepLink вернул '" + strProvideInitialReturnDeepLink + ExtendedMessageFormat.QUOTE, th, 2, b == true ? 1 : 0);
        }
        try {
            String strCreateDeeplink = this.f2071c.createDeeplink(strProvideInitialReturnDeepLink, new DeeplinkDetails(paymentMethodChangeState, DeeplinkPaymentType.Sbolpay.INSTANCE));
            PaylibLogger.DefaultImpls.d$default(this.f2075g, null, new C8169a(strCreateDeeplink), 1, null);
            objM15699constructorimpl2 = Result.m15699constructorimpl(strCreateDeeplink);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM15699constructorimpl2 = Result.m15699constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl2);
        if (thM15702exceptionOrNullimpl != null) {
            throw new SbolPayDeeplinkError(thM15702exceptionOrNullimpl);
        }
        objM15699constructorimpl = Result.m15699constructorimpl((String) objM15699constructorimpl2);
        Throwable thM15702exceptionOrNullimpl2 = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
        if (thM15702exceptionOrNullimpl2 != null) {
            this.f2075g.mo1701e(thM15702exceptionOrNullimpl2, new C8170b(thM15702exceptionOrNullimpl2));
        }
        return objM15699constructorimpl;
    }

    /* renamed from: a */
    public final boolean m2095a() {
        return this.f2074f.isSbolPayEnabled() && this.f2072d.isSbolSupported();
    }
}
