package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventKeys;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebRequest;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebRequestMethod;
import com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags;
import com.sdkit.paylib.paylibpayment.impl.domain.network.utils.C8584a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.j */
/* loaded from: classes8.dex */
public final class C8539j {

    /* renamed from: i */
    public static final a f4948i = new a(null);

    /* renamed from: a */
    public final PayLibPaymentFeatureFlags f4949a;

    /* renamed from: b */
    public final PaylibLogger f4950b;

    /* renamed from: c */
    public WebRequestMethod f4951c;

    /* renamed from: d */
    public String f4952d;

    /* renamed from: e */
    public final Map f4953e;

    /* renamed from: f */
    public String f4954f;

    /* renamed from: g */
    public Long f4955g;

    /* renamed from: h */
    public C8584a f4956h;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.j$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.j$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ C8584a f4957a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C8584a c8584a) {
            super(0);
            this.f4957a = c8584a;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "b3, " + this.f4957a.m4645b();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.j$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ C8584a f4958a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C8584a c8584a) {
            super(0);
            this.f4958a = c8584a;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "b3, " + this.f4958a.m4645b() + ", DISABLED!";
        }
    }

    public C8539j(PayLibPaymentFeatureFlags payLibPaymentFeatureFlags, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(payLibPaymentFeatureFlags, "payLibPaymentFeatureFlags");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f4949a = payLibPaymentFeatureFlags;
        this.f4950b = loggerFactory.get("PaylibWebRequestBuilder");
        this.f4953e = new LinkedHashMap();
    }

    /* renamed from: a */
    public final WebRequest m4070a() throws IllegalAccessException {
        WebRequestMethod webRequestMethod = this.f4951c;
        if (webRequestMethod == null) {
            throw new IllegalAccessException("Setup method for request");
        }
        String str = this.f4952d;
        if (str == null) {
            throw new IllegalAccessException("Setup url for request");
        }
        Map map = MapsKt__MapsKt.toMap(this.f4953e);
        if (!(!map.isEmpty())) {
            map = null;
        }
        return new WebRequest(webRequestMethod, str, map, this.f4954f, this.f4955g);
    }

    /* renamed from: b */
    public final C8539j m4074b() {
        this.f4951c = WebRequestMethod.GET;
        return this;
    }

    /* renamed from: c */
    public final WebRequestMethod m4076c() {
        return this.f4951c;
    }

    /* renamed from: d */
    public final C8539j m4078d(String bodyString) {
        Intrinsics.checkNotNullParameter(bodyString, "bodyString");
        this.f4951c = WebRequestMethod.POST;
        this.f4954f = bodyString;
        return this;
    }

    /* renamed from: e */
    public final C8539j m4080e(String bodyString) {
        Intrinsics.checkNotNullParameter(bodyString, "bodyString");
        this.f4951c = WebRequestMethod.PUT;
        this.f4954f = bodyString;
        return this;
    }

    /* renamed from: f */
    public final C8539j m4082f(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f4952d = url;
        return this;
    }

    /* renamed from: a */
    public final C8539j m4071a(C8584a b3) {
        Intrinsics.checkNotNullParameter(b3, "b3");
        this.f4956h = b3;
        if (Intrinsics.areEqual(this.f4949a.isTracingEnabled(), Boolean.TRUE)) {
            PaylibLogger.DefaultImpls.d$default(this.f4950b, null, new b(b3), 1, null);
            this.f4953e.put(UpgradeObjectEventKeys.EVENT_UPGRADE_PRICE_THREE_KEY, b3.m4645b());
        } else {
            PaylibLogger.DefaultImpls.d$default(this.f4950b, null, new c(b3), 1, null);
        }
        return this;
    }

    /* renamed from: b */
    public final C8539j m4075b(String str) {
        this.f4951c = WebRequestMethod.DELETE;
        this.f4954f = str;
        return this;
    }

    /* renamed from: c */
    public final C8539j m4077c(String bodyString) {
        Intrinsics.checkNotNullParameter(bodyString, "bodyString");
        this.f4951c = WebRequestMethod.PATCH;
        this.f4954f = bodyString;
        return this;
    }

    /* renamed from: d */
    public final String m4079d() {
        return this.f4952d;
    }

    /* renamed from: e */
    public final String m4081e() {
        C8584a c8584a = this.f4956h;
        if (c8584a != null) {
            return c8584a.m4644a();
        }
        return null;
    }

    /* renamed from: a */
    public final C8539j m4072a(Long l) {
        this.f4955g = l;
        return this;
    }

    /* renamed from: a */
    public final C8539j m4073a(String tokenString) {
        Intrinsics.checkNotNullParameter(tokenString, "tokenString");
        this.f4953e.put("Authorization", tokenString);
        return this;
    }
}
