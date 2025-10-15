package ru.rustore.sdk.remoteconfig.internal;

import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p051io.CloseableKt;
import kotlin.p051io.TextStreamsKt;
import kotlin.text.Charsets;
import ru.rustore.sdk.remoteconfig.C11664R;
import ru.rustore.sdk.remoteconfig.ConfigRequestParameterProvider;
import ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;
import ru.rustore.sdk.remoteconfig.UpdateBehaviour;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.F0 */
/* loaded from: classes5.dex */
public final class C11676F0 extends AbstractC11678G0 {

    /* renamed from: Q */
    public static volatile C11676F0 f10747Q;

    /* renamed from: L */
    public final Context f10748L;

    /* renamed from: M */
    public final ConfigRequestParameterProvider f10749M;

    /* renamed from: N */
    public final RemoteConfigClientEventListener f10750N;

    /* renamed from: O */
    public final Lazy f10751O;

    /* renamed from: P */
    public final Lazy f10752P;

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.F0$a */
    public static final class a {
        /* renamed from: a */
        public static void m7512a(Context applicationContext, String appId, C11711X0 staticRequestParameterHolder, UpdateBehaviour updateBehaviour, ConfigRequestParameterProvider configRequestParameterProvider, RemoteConfigClientEventListener remoteConfigClientEventListener, Map map) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(staticRequestParameterHolder, "staticRequestParameterHolder");
            Intrinsics.checkNotNullParameter(updateBehaviour, "updateBehaviour");
            Intrinsics.checkNotNullParameter(configRequestParameterProvider, "configRequestParameterProvider");
            Intrinsics.checkNotNullParameter(remoteConfigClientEventListener, "remoteConfigClientEventListener");
            synchronized (a.class) {
                if (C11676F0.f10747Q != null) {
                    throw new RemoteConfigException.RemoteConfigClientAlreadyExist("RemoteConfigClient instance already exist", null, 2, null);
                }
                C11676F0.f10747Q = new C11676F0(applicationContext, appId, staticRequestParameterHolder, updateBehaviour, configRequestParameterProvider, remoteConfigClientEventListener, map);
            }
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.F0$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0<List<? extends String>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends String> invoke() throws Resources.NotFoundException {
            Context context = C11676F0.this.f10748L;
            Intrinsics.checkNotNullParameter(context, "context");
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C11664R.raw.remote_config_rustore_ru), Integer.valueOf(C11664R.raw.global_sign_rsa_ov_ssl_ca_2018), Integer.valueOf(C11664R.raw.global_sing)});
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                InputStream stream = context.getResources().openRawResource(((Number) it.next()).intValue());
                try {
                    Intrinsics.checkNotNullExpressionValue(stream, "stream");
                    String text = TextStreamsKt.readText(new InputStreamReader(stream, Charsets.UTF_8));
                    CloseableKt.closeFinally(stream, null);
                    arrayList.add(text);
                } finally {
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.F0$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function0<X509TrustManager> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final X509TrustManager invoke() {
            return C11731d1.m7537a((List) C11676F0.this.f10752P.getValue());
        }
    }

    public C11676F0(Context context, String str, C11711X0 c11711x0, UpdateBehaviour updateBehaviour, ConfigRequestParameterProvider configRequestParameterProvider, RemoteConfigClientEventListener remoteConfigClientEventListener, Map map) {
        super(context, str, c11711x0, updateBehaviour, configRequestParameterProvider, remoteConfigClientEventListener, map);
        this.f10748L = context;
        this.f10749M = configRequestParameterProvider;
        this.f10750N = remoteConfigClientEventListener;
        this.f10751O = LazyKt__LazyJVMKt.lazy(new c());
        this.f10752P = LazyKt__LazyJVMKt.lazy(new b());
    }
}
