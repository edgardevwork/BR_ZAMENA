package io.ktor.client.plugins.cookies;

import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.http.Cookie;
import io.ktor.http.Url;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AcceptAllCookiesStorage.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u00002\u00020\u0019B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0002J!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m7105d2 = {"Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage;", SegmentConstantPool.INITSTRING, "()V", "Lio/ktor/http/Url;", "requestUrl", "Lio/ktor/http/Cookie;", "cookie", "", "addCookie", "(Lio/ktor/http/Url;Lio/ktor/http/Cookie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timestamp", "cleanup", "(J)V", "close", "", "get", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", TtmlNode.RUBY_CONTAINER, "Ljava/util/List;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "ktor-client-core", "Lio/ktor/client/plugins/cookies/CookiesStorage;"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAcceptAllCookiesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AcceptAllCookiesStorage.kt\nio/ktor/client/plugins/cookies/AcceptAllCookiesStorage\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n120#2,8:61\n129#2:72\n120#2,10:73\n766#3:69\n857#3,2:70\n1789#3,2:83\n1791#3:86\n1#4:85\n*S KotlinDebug\n*F\n+ 1 AcceptAllCookiesStorage.kt\nio/ktor/client/plugins/cookies/AcceptAllCookiesStorage\n*L\n23#1:61,8\n23#1:72\n30#1:73,10\n27#1:69\n27#1:70,2\n53#1:83,2\n53#1:86\n*E\n"})
/* loaded from: classes7.dex */
public final class AcceptAllCookiesStorage implements CookiesStorage {

    @NotNull
    public final List<Cookie> container = new ArrayList();

    @NotNull
    private volatile /* synthetic */ long oldestCookie = 0;

    @NotNull
    public final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    /* compiled from: AcceptAllCookiesStorage.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", m7120f = "AcceptAllCookiesStorage.kt", m7121i = {0, 0, 0, 0}, m7122l = {66}, m7123m = "addCookie", m7124n = {"this", "requestUrl", "cookie", "$this$withLock_u24default$iv"}, m7125s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1 */
    public static final class C101791 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C101791(Continuation<? super C101791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AcceptAllCookiesStorage.this.addCookie(null, null, this);
        }
    }

    /* compiled from: AcceptAllCookiesStorage.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", m7120f = "AcceptAllCookiesStorage.kt", m7121i = {0, 0, 0}, m7122l = {66}, m7123m = "get", m7124n = {"this", "requestUrl", "$this$withLock_u24default$iv"}, m7125s = {"L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1 */
    public static final class C101811 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C101811(Continuation<? super C101811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AcceptAllCookiesStorage.this.get(null, this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0013  */
    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object get(@NotNull Url url, @NotNull Continuation<? super List<Cookie>> continuation) throws Throwable {
        C101811 c101811;
        AcceptAllCookiesStorage acceptAllCookiesStorage;
        Url url2;
        Mutex mutex;
        if (continuation instanceof C101811) {
            c101811 = (C101811) continuation;
            int i = c101811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101811.label = i - Integer.MIN_VALUE;
            } else {
                c101811 = new C101811(continuation);
            }
        }
        Object obj = c101811.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.mutex;
            c101811.L$0 = this;
            c101811.L$1 = url;
            c101811.L$2 = mutex2;
            c101811.label = 1;
            if (mutex2.lock(null, c101811) == coroutine_suspended) {
                return coroutine_suspended;
            }
            acceptAllCookiesStorage = this;
            url2 = url;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c101811.L$2;
            url2 = (Url) c101811.L$1;
            acceptAllCookiesStorage = (AcceptAllCookiesStorage) c101811.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            long timeMillis = DateJvmKt.getTimeMillis();
            if (timeMillis >= acceptAllCookiesStorage.oldestCookie) {
                acceptAllCookiesStorage.cleanup(timeMillis);
            }
            List<Cookie> list = acceptAllCookiesStorage.container;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (CookiesStorageKt.matches((Cookie) obj2, url2)) {
                    arrayList.add(obj2);
                }
            }
            mutex.unlock(null);
            return arrayList;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0013  */
    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addCookie(@NotNull final Url url, @NotNull final Cookie cookie, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C101791 c101791;
        Mutex mutex;
        AcceptAllCookiesStorage acceptAllCookiesStorage;
        if (continuation instanceof C101791) {
            c101791 = (C101791) continuation;
            int i = c101791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101791.label = i - Integer.MIN_VALUE;
            } else {
                c101791 = new C101791(continuation);
            }
        }
        Object obj = c101791.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101791.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.mutex;
            c101791.L$0 = this;
            c101791.L$1 = url;
            c101791.L$2 = cookie;
            c101791.L$3 = mutex;
            c101791.label = 1;
            if (mutex.lock(null, c101791) == coroutine_suspended) {
                return coroutine_suspended;
            }
            acceptAllCookiesStorage = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) c101791.L$3;
            cookie = (Cookie) c101791.L$2;
            Url url2 = (Url) c101791.L$1;
            acceptAllCookiesStorage = (AcceptAllCookiesStorage) c101791.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
            url = url2;
        }
        try {
            if (!StringsKt__StringsJVMKt.isBlank(cookie.getName())) {
                CollectionsKt__MutableCollectionsKt.removeAll((List) acceptAllCookiesStorage.container, (Function1) new Function1<Cookie, Boolean>() { // from class: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull Cookie it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(Intrinsics.areEqual(it.getName(), cookie.getName()) && CookiesStorageKt.matches(it, url));
                    }
                });
                acceptAllCookiesStorage.container.add(CookiesStorageKt.fillDefaults(cookie, url));
                GMTDate expires = cookie.getExpires();
                if (expires != null) {
                    long timestamp = expires.getTimestamp();
                    if (acceptAllCookiesStorage.oldestCookie > timestamp) {
                        acceptAllCookiesStorage.oldestCookie = timestamp;
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            return unit;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* compiled from: AcceptAllCookiesStorage.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "cookie", "Lio/ktor/http/Cookie;", "invoke", "(Lio/ktor/http/Cookie;)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$cleanup$1 */
    public static final class C101801 extends Lambda implements Function1<Cookie, Boolean> {
        public final /* synthetic */ long $timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101801(long j) {
            super(1);
            j = j;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull Cookie cookie) {
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            GMTDate expires = cookie.getExpires();
            if (expires != null) {
                return Boolean.valueOf(expires.getTimestamp() < j);
            }
            return Boolean.FALSE;
        }
    }

    public final void cleanup(long timestamp) {
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.container, (Function1) new Function1<Cookie, Boolean>() { // from class: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.cleanup.1
            public final /* synthetic */ long $timestamp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C101801(long timestamp2) {
                super(1);
                j = timestamp2;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Cookie cookie) {
                Intrinsics.checkNotNullParameter(cookie, "cookie");
                GMTDate expires = cookie.getExpires();
                if (expires != null) {
                    return Boolean.valueOf(expires.getTimestamp() < j);
                }
                return Boolean.FALSE;
            }
        });
        Iterator<T> it = this.container.iterator();
        long jMin = Long.MAX_VALUE;
        while (it.hasNext()) {
            GMTDate expires = ((Cookie) it.next()).getExpires();
            if (expires != null) {
                jMin = Math.min(jMin, expires.getTimestamp());
            }
        }
        this.oldestCookie = jMin;
    }
}
