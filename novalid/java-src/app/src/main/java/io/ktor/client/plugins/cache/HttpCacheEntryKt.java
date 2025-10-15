package io.ktor.client.plugins.cache;

import com.blackhub.bronline.game.core.constants.Other;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.http.DateUtilsKt;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaderValueParserKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.DateKt;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.StringsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCacheEntry.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u001a!\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a$\u0010\t\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0000\u001a\u0018\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u0005H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m7105d2 = {"HttpCacheEntry", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", "isShared", "", "response", "Lio/ktor/client/statement/HttpResponse;", "(ZLio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldValidate", "Lio/ktor/client/plugins/cache/ValidateStatus;", "cacheExpires", "Lio/ktor/util/date/GMTDate;", "responseHeaders", "Lio/ktor/http/Headers;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", Other.FALLBACK, "Lkotlin/Function0;", "varyKeys", "", "", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpCacheEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCacheEntry.kt\nio/ktor/client/plugins/cache/HttpCacheEntryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n1747#2,3:144\n288#2,2:147\n288#2,2:149\n288#2,2:152\n1#3:151\n*S KotlinDebug\n*F\n+ 1 HttpCacheEntry.kt\nio/ktor/client/plugins/cache/HttpCacheEntryKt\n*L\n69#1:144,3\n71#1:147,2\n106#1:149,2\n128#1:152,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HttpCacheEntryKt {

    /* compiled from: HttpCacheEntry.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.HttpCacheEntryKt", m7120f = "HttpCacheEntry.kt", m7121i = {0, 0}, m7122l = {18}, m7123m = "HttpCacheEntry", m7124n = {"response", "isShared"}, m7125s = {"L$0", "Z$0"})
    /* renamed from: io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1 */
    /* loaded from: classes7.dex */
    public static final class C101621 extends ContinuationImpl {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C101621(Continuation<? super C101621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheEntryKt.HttpCacheEntry(false, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object HttpCacheEntry(boolean z, @NotNull HttpResponse httpResponse, @NotNull Continuation<? super HttpCacheEntry> continuation) throws Throwable {
        C101621 c101621;
        if (continuation instanceof C101621) {
            c101621 = (C101621) continuation;
            int i = c101621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101621.label = i - Integer.MIN_VALUE;
            } else {
                c101621 = new C101621(continuation);
            }
        }
        C101621 c1016212 = c101621;
        Object remaining$default = c1016212.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1016212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(remaining$default);
            ByteReadChannel content = httpResponse.getContent();
            c1016212.L$0 = httpResponse;
            c1016212.Z$0 = z;
            c1016212.label = 1;
            remaining$default = ByteReadChannel.DefaultImpls.readRemaining$default(content, 0L, c1016212, 1, null);
            if (remaining$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c1016212.Z$0;
            httpResponse = (HttpResponse) c1016212.L$0;
            ResultKt.throwOnFailure(remaining$default);
        }
        byte[] bytes$default = StringsKt.readBytes$default((ByteReadPacket) remaining$default, 0, 1, null);
        HttpResponseKt.complete(httpResponse);
        return new HttpCacheEntry(cacheExpires$default(httpResponse, z, null, 2, null), varyKeys(httpResponse), httpResponse, bytes$default);
    }

    @NotNull
    public static final Map<String, String> varyKeys(@NotNull HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        List<String> listVary = HttpMessagePropertiesKt.vary(httpResponse);
        if (listVary == null) {
            return MapsKt__MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Headers headers = httpResponse.getCall().getRequest().getHeaders();
        for (String str : listVary) {
            String str2 = headers.get(str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put(str, str2);
        }
        return linkedHashMap;
    }

    public static /* synthetic */ GMTDate cacheExpires$default(HttpResponse httpResponse, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0<GMTDate>() { // from class: io.ktor.client.plugins.cache.HttpCacheEntryKt.cacheExpires.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final GMTDate invoke() {
                    return DateJvmKt.GMTDate$default(null, 1, null);
                }
            };
        }
        return cacheExpires(httpResponse, z, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final GMTDate cacheExpires(@NotNull HttpResponse httpResponse, boolean z, @NotNull Function0<GMTDate> fallback) {
        String str;
        Object next;
        String value;
        List listSplit$default;
        String str2;
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        List<HeaderValue> listCacheControl = HttpMessagePropertiesKt.cacheControl(httpResponse);
        Integer numValueOf = null;
        if (z) {
            List<HeaderValue> list = listCacheControl;
            if ((list instanceof Collection) && list.isEmpty()) {
                str = "max-age";
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String value2 = ((HeaderValue) it.next()).getValue();
                    str = io.ktor.client.utils.CacheControl.S_MAX_AGE;
                    if (StringsKt__StringsJVMKt.startsWith$default(value2, io.ktor.client.utils.CacheControl.S_MAX_AGE, false, 2, null)) {
                        break;
                    }
                }
                str = "max-age";
            }
        }
        Iterator<T> it2 = listCacheControl.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (StringsKt__StringsJVMKt.startsWith$default(((HeaderValue) next).getValue(), str, false, 2, null)) {
                break;
            }
        }
        HeaderValue headerValue = (HeaderValue) next;
        if (headerValue != null && (value = headerValue.getValue()) != null && (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) value, new String[]{URLEncodedUtils.NAME_VALUE_SEPARATOR}, false, 0, 6, (Object) null)) != null && (str2 = (String) listSplit$default.get(1)) != null) {
            numValueOf = Integer.valueOf(Integer.parseInt(str2));
        }
        if (numValueOf != null) {
            return DateKt.plus(httpResponse.getRequestTime(), numValueOf.intValue() * 1000);
        }
        String str3 = httpResponse.getHeaders().get(HttpHeaders.INSTANCE.getExpires());
        if (str3 != null) {
            if (Intrinsics.areEqual(str3, "0") || StringsKt__StringsJVMKt.isBlank(str3)) {
                return fallback.invoke();
            }
            try {
                return DateUtilsKt.fromHttpToGmtDate(str3);
            } catch (Throwable unused) {
                return fallback.invoke();
            }
        }
        return fallback.invoke();
    }

    @NotNull
    public static final ValidateStatus shouldValidate(@NotNull GMTDate cacheExpires, @NotNull Headers responseHeaders, @NotNull HttpRequestBuilder request) {
        int iIntValue;
        Object next;
        Integer numValueOf;
        String value;
        Integer intOrNull;
        String value2;
        List listSplit$default;
        String str;
        Intrinsics.checkNotNullParameter(cacheExpires, "cacheExpires");
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(request, "request");
        HeadersBuilder headers = request.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        List<String> all = responseHeaders.getAll(httpHeaders.getCacheControl());
        Object obj = null;
        List<HeaderValue> headerValue = HttpHeaderValueParserKt.parseHeaderValue(all != null ? CollectionsKt___CollectionsKt.joinToString$default(all, ",", null, null, 0, null, null, 62, null) : null);
        List<String> all2 = headers.getAll(httpHeaders.getCacheControl());
        List<HeaderValue> headerValue2 = HttpHeaderValueParserKt.parseHeaderValue(all2 != null ? CollectionsKt___CollectionsKt.joinToString$default(all2, ",", null, null, 0, null, null, 62, null) : null);
        if (headerValue2.contains(CacheControl.INSTANCE.getNO_CACHE$ktor_client_core())) {
            HttpCacheKt.getLOGGER().trace("\"no-cache\" is set for " + request.getUrl() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        List<HeaderValue> list = headerValue2;
        Iterator<T> it = list.iterator();
        while (true) {
            iIntValue = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt__StringsJVMKt.startsWith$default(((HeaderValue) next).getValue(), "max-age=", false, 2, null)) {
                break;
            }
        }
        HeaderValue headerValue3 = (HeaderValue) next;
        if (headerValue3 == null || (value2 = headerValue3.getValue()) == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) value2, new String[]{URLEncodedUtils.NAME_VALUE_SEPARATOR}, false, 0, 6, (Object) null)) == null || (str = (String) listSplit$default.get(1)) == null) {
            numValueOf = null;
        } else {
            Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
            numValueOf = Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0);
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            HttpCacheKt.getLOGGER().trace("\"max-age\" is not set for " + request.getUrl() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        CacheControl cacheControl = CacheControl.INSTANCE;
        if (headerValue.contains(cacheControl.getNO_CACHE$ktor_client_core())) {
            HttpCacheKt.getLOGGER().trace("\"no-cache\" is set for " + request.getUrl() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        long timestamp = cacheExpires.getTimestamp() - DateJvmKt.getTimeMillis();
        if (timestamp > 0) {
            HttpCacheKt.getLOGGER().trace("Cached response is valid for " + request.getUrl() + ", should not validate");
            return ValidateStatus.ShouldNotValidate;
        }
        if (headerValue.contains(cacheControl.getMUST_REVALIDATE$ktor_client_core())) {
            HttpCacheKt.getLOGGER().trace("\"must-revalidate\" is set for " + request.getUrl() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (StringsKt__StringsJVMKt.startsWith$default(((HeaderValue) next2).getValue(), "max-stale=", false, 2, null)) {
                obj = next2;
                break;
            }
        }
        HeaderValue headerValue4 = (HeaderValue) obj;
        if (headerValue4 != null && (value = headerValue4.getValue()) != null) {
            String strSubstring = value.substring(10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (strSubstring != null && (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(strSubstring)) != null) {
                iIntValue = intOrNull.intValue();
            }
        }
        if (timestamp + (iIntValue * 1000) > 0) {
            HttpCacheKt.getLOGGER().trace("Cached response is stale for " + request.getUrl() + " but less than max-stale, should warn");
            return ValidateStatus.ShouldWarn;
        }
        HttpCacheKt.getLOGGER().trace("Cached response is stale for " + request.getUrl() + ", should validate cached response");
        return ValidateStatus.ShouldValidate;
    }
}
