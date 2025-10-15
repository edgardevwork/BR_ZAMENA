package com.sdkit.paylib.paylibdomain.impl.deeplink;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkParser;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkDetails;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkPaymentType;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.ReturnDeeplinkParseError;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SbolPayFinishState;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SourceState;
import com.sdkit.paylib.paylibdomain.api.entity.FinishReason;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.e */
/* loaded from: classes6.dex */
public final class C8043e implements PaylibDeeplinkParser {

    /* renamed from: a */
    public final C8039a f1152a;

    /* renamed from: b */
    public final PaylibLogger f1153b;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.e$a */
    public enum a {
        STATE_SUCCESS(FirebaseAnalytics.Param.SUCCESS),
        STATE_CANCEL("cancel"),
        STATE_RETURN("return");


        /* renamed from: a */
        public final String f1158a;

        a(String str) {
            this.f1158a = str;
        }

        /* renamed from: b */
        public final String m1483b() {
            return this.f1158a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.e$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1159a;

        static {
            int[] iArr = new int[SbolPayFinishState.values().length];
            try {
                iArr[SbolPayFinishState.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SbolPayFinishState.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SbolPayFinishState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SbolPayFinishState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SbolPayFinishState.INCORRECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1159a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.e$c */
    /* loaded from: classes7.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ DeeplinkDetails f1160a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DeeplinkDetails deeplinkDetails) {
            super(0);
            this.f1160a = deeplinkDetails;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "parseFinishDeeplink deeplinkDetails: " + this.f1160a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.e$d */
    /* loaded from: classes7.dex */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1161a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f1161a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "parseFinishDeeplink " + this.f1161a;
        }
    }

    public C8043e(C8039a deeplinkDetailsCoder, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(deeplinkDetailsCoder, "deeplinkDetailsCoder");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1152a = deeplinkDetailsCoder;
        this.f1153b = loggerFactory.get("PaylibDeeplinkParserImpl");
    }

    /* renamed from: a */
    public final SbolPayFinishState m1478a(Uri uri) {
        SbolPayFinishState sbolPayFinishStateM1479a = m1479a(uri.getQueryParameter("paylib_sp"));
        int[] iArr = b.f1159a;
        int i = iArr[sbolPayFinishStateM1479a.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return sbolPayFinishStateM1479a;
        }
        if (i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        SbolPayFinishState sbolPayFinishStateM1479a2 = m1479a(uri.getQueryParameter("state"));
        int i2 = iArr[sbolPayFinishStateM1479a2.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return sbolPayFinishStateM1479a2;
        }
        if (i2 == 4 || i2 == 5) {
            return sbolPayFinishStateM1479a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final FinishReason m1481b(Uri uri) {
        Object objM15699constructorimpl;
        String queryParameter = uri.getQueryParameter("paylib_src");
        if (queryParameter == null) {
            throw new ReturnDeeplinkParseError("Невозможно распарсить диплинк", null, 2, null);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(this.f1152a.m1461a(queryParameter));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
        if (thM15702exceptionOrNullimpl != null) {
            throw new ReturnDeeplinkParseError("Невозможно распарсить диплинк", thM15702exceptionOrNullimpl);
        }
        DeeplinkDetails deeplinkDetails = (DeeplinkDetails) objM15699constructorimpl;
        PaylibLogger.DefaultImpls.d$default(this.f1153b, null, new c(deeplinkDetails), 1, null);
        return m1480a(deeplinkDetails, uri);
    }

    @Override // com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkParser
    public FinishReason parseFinishDeeplink(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        PaylibLogger.DefaultImpls.d$default(this.f1153b, null, new d(deeplink), 1, null);
        Uri deeplinkUri = Uri.parse(deeplink);
        Intrinsics.checkNotNullExpressionValue(deeplinkUri, "deeplinkUri");
        return m1481b(deeplinkUri);
    }

    /* renamed from: a */
    public final SbolPayFinishState m1479a(String str) {
        return Intrinsics.areEqual(str, a.STATE_SUCCESS.m1483b()) ? SbolPayFinishState.SUCCESS : Intrinsics.areEqual(str, a.STATE_CANCEL.m1483b()) ? SbolPayFinishState.CANCELLED : Intrinsics.areEqual(str, a.STATE_RETURN.m1483b()) ? SbolPayFinishState.FAILED : str == null ? SbolPayFinishState.UNKNOWN : SbolPayFinishState.INCORRECT;
    }

    /* renamed from: a */
    public final FinishReason m1480a(DeeplinkDetails deeplinkDetails, Uri uri) {
        DeeplinkPaymentType deeplinkPaymentType = deeplinkDetails.getDeeplinkPaymentType();
        if (deeplinkPaymentType instanceof DeeplinkPaymentType.Sbolpay) {
            SbolPayFinishState sbolPayFinishStateM1478a = m1478a(uri);
            SourceState sourceState = deeplinkDetails.getSourceState();
            return sourceState != null ? new FinishReason.SbolPayCompletedWithState(sbolPayFinishStateM1478a, sourceState) : new FinishReason.SbolPayCompleted(sbolPayFinishStateM1478a);
        }
        if (deeplinkPaymentType instanceof DeeplinkPaymentType.Sbp) {
            SourceState sourceState2 = deeplinkDetails.getSourceState();
            if (sourceState2 != null) {
                return new FinishReason.SbpPayCompletedWithState(sourceState2);
            }
            throw new ReturnDeeplinkParseError("Невозможно распарсить диплинк", null, 2, null);
        }
        if (!(deeplinkPaymentType instanceof DeeplinkPaymentType.TBank)) {
            throw new NoWhenBranchMatchedException();
        }
        SourceState sourceState3 = deeplinkDetails.getSourceState();
        if (sourceState3 != null) {
            return new FinishReason.TPayCompletedWithState(sourceState3, ((DeeplinkPaymentType.TBank) deeplinkPaymentType).isSuccessful());
        }
        throw new ReturnDeeplinkParseError("Невозможно распарсить диплинк", null, 2, null);
    }
}
