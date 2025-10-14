package com.sdkit.paylib.paylibdomain.impl.deeplink;

import android.net.Uri;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkDetails;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkPaymentType;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.ReturnDeeplinkParseError;
import com.sdkit.paylib.paylibdomain.impl.utils.AbstractC8075b;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.lang3.text.ExtendedMessageFormat;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.c */
/* loaded from: classes6.dex */
public final class C8041c implements PaylibDeeplinkFactory {

    /* renamed from: c */
    public static final a f1145c = new a(null);

    /* renamed from: a */
    public final C8039a f1146a;

    /* renamed from: b */
    public final PaylibLogger f1147b;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.c$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.c$b */
    /* loaded from: classes7.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1148a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f1148a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "encoded deeplinkDetails = " + this.f1148a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.c$c */
    /* loaded from: classes7.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f1149a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f1149a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8032c.m1430a(new StringBuilder("deeplink = '"), this.f1149a, ExtendedMessageFormat.QUOTE);
        }
    }

    public C8041c(C8039a deeplinkDetailsCoder, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(deeplinkDetailsCoder, "deeplinkDetailsCoder");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1146a = deeplinkDetailsCoder;
        this.f1147b = loggerFactory.get("PaylibDeeplinkFactoryImpl");
    }

    /* renamed from: a */
    public final String m1472a(DeeplinkPaymentType deeplinkPaymentType, Map map) {
        String str;
        if (deeplinkPaymentType instanceof DeeplinkPaymentType.Sbolpay) {
            map.remove("paylib_sp");
            str = "&paylib_sp=@{BankResultState}";
        } else {
            if (!(deeplinkPaymentType instanceof DeeplinkPaymentType.Sbp ? true : deeplinkPaymentType instanceof DeeplinkPaymentType.TBank)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "";
        }
        return (String) AbstractC8075b.m1691a(str);
    }

    @Override // com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory
    public String createDeeplink(String baseDeeplink, DeeplinkDetails deeplinkDetails) {
        String host;
        Object objM15699constructorimpl;
        Intrinsics.checkNotNullParameter(baseDeeplink, "baseDeeplink");
        Intrinsics.checkNotNullParameter(deeplinkDetails, "deeplinkDetails");
        if (StringsKt__StringsJVMKt.isBlank(baseDeeplink)) {
            throw new ReturnDeeplinkParseError("baseDeeplink is empty", null, 2, null);
        }
        Uri uri = Uri.parse(baseDeeplink);
        String scheme = uri.getScheme();
        if (scheme == null || StringsKt__StringsJVMKt.isBlank(scheme) || (host = uri.getHost()) == null || StringsKt__StringsJVMKt.isBlank(host)) {
            throw new ReturnDeeplinkParseError("baseDeeplink is not valid", null, 2, null);
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "originalUri.queryParameterNames");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : queryParameterNames) {
            String queryParameter = uri.getQueryParameter((String) obj);
            if (queryParameter == null) {
                queryParameter = "";
            }
            linkedHashMap.put(obj, queryParameter);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(this.f1146a.m1462a(deeplinkDetails));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
        if (thM15702exceptionOrNullimpl != null) {
            throw new ReturnDeeplinkParseError("deeplinkDetails is not valid", thM15702exceptionOrNullimpl);
        }
        String str = (String) objM15699constructorimpl;
        PaylibLogger.DefaultImpls.d$default(this.f1147b, null, new b(str), 1, null);
        Pair pairM7112to = TuplesKt.m7112to("paylib_src", str);
        linkedHashMap.put(pairM7112to.getFirst(), pairM7112to.getSecond());
        String strM1472a = m1472a(deeplinkDetails.getDeeplinkPaymentType(), linkedHashMap);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String str2 = builderBuildUpon.build() + strM1472a;
        PaylibLogger.DefaultImpls.d$default(this.f1147b, null, new c(str2), 1, null);
        return str2;
    }
}
