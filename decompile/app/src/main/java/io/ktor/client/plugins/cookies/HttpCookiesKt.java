package io.ktor.client.plugins.cookies;

import androidx.media3.extractor.text.cea.Cea708Decoder;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.http.Cookie;
import io.ktor.http.CookieKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

/* compiled from: HttpCookies.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0086\u0002\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m7105d2 = {"LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "renderClientCookies", "", "cookies", "", "Lio/ktor/http/Cookie;", "Lio/ktor/client/HttpClient;", "url", "Lio/ktor/http/Url;", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "name", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpCookies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookiesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
/* loaded from: classes4.dex */
public final class HttpCookiesKt {

    @NotNull
    public static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCookies");

    /* compiled from: HttpCookies.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cookies.HttpCookiesKt", m7120f = "HttpCookies.kt", m7121i = {}, m7122l = {136}, m7123m = "cookies", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1 */
    /* loaded from: classes7.dex */
    public static final class C101831 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C101831(Continuation<? super C101831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCookiesKt.cookies((HttpClient) null, (Url) null, this);
        }
    }

    /* compiled from: HttpCookies.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cookies.HttpCookiesKt", m7120f = "HttpCookies.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DLC}, m7123m = "cookies", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2 */
    /* loaded from: classes7.dex */
    public static final class C101842 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C101842(Continuation<? super C101842> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCookiesKt.cookies((HttpClient) null, (String) null, this);
        }
    }

    /* compiled from: HttpCookies.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.client.plugins.cookies.HttpCookiesKt$renderClientCookies$1 */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C101851 extends FunctionReferenceImpl implements Function1<Cookie, String> {
        public static final C101851 INSTANCE = new C101851();

        public C101851() {
            super(1, CookieKt.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull Cookie p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return CookieKt.renderCookieHeader(p0);
        }
    }

    public static final String renderClientCookies(List<Cookie> list) {
        return CollectionsKt___CollectionsKt.joinToString$default(list, "; ", null, null, 0, null, C101851.INSTANCE, 30, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object cookies(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Continuation<? super List<Cookie>> continuation) throws Throwable {
        C101831 c101831;
        if (continuation instanceof C101831) {
            c101831 = (C101831) continuation;
            int i = c101831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101831.label = i - Integer.MIN_VALUE;
            } else {
                c101831 = new C101831(continuation);
            }
        }
        Object obj = c101831.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HttpCookies httpCookies = (HttpCookies) HttpClientPluginKt.pluginOrNull(httpClient, HttpCookies.INSTANCE);
            if (httpCookies != null) {
                c101831.label = 1;
                obj = httpCookies.get(url, c101831);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) obj;
        if (list != null) {
            return list;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object cookies(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Continuation<? super List<Cookie>> continuation) throws Throwable {
        C101842 c101842;
        if (continuation instanceof C101842) {
            c101842 = (C101842) continuation;
            int i = c101842.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101842.label = i - Integer.MIN_VALUE;
            } else {
                c101842 = new C101842(continuation);
            }
        }
        Object obj = c101842.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101842.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HttpCookies httpCookies = (HttpCookies) HttpClientPluginKt.pluginOrNull(httpClient, HttpCookies.INSTANCE);
            if (httpCookies != null) {
                Url Url = URLUtilsKt.Url(str);
                c101842.label = 1;
                obj = httpCookies.get(Url, c101842);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) obj;
        if (list != null) {
            return list;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Nullable
    public static final Cookie get(@NotNull List<Cookie> list, @NotNull String name) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Cookie) next).getName(), name)) {
                break;
            }
        }
        return (Cookie) next;
    }
}
