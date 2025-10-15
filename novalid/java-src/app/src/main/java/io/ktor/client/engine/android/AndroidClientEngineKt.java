package io.ktor.client.engine.android;

import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.http.HttpMethod;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.CoroutinesKt;
import io.ktor.utils.p050io.jvm.javaio.WritingKt;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.p051io.CloseableKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidClientEngine.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\n\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m7105d2 = {"METHODS_WITHOUT_BODY", "", "Lio/ktor/http/HttpMethod;", "writeTo", "", "Lio/ktor/http/content/OutgoingContent;", "stream", "Ljava/io/OutputStream;", "callContext", "Lkotlin/coroutines/CoroutineContext;", "(Lio/ktor/http/content/OutgoingContent;Ljava/io/OutputStream;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-android"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class AndroidClientEngineKt {

    @NotNull
    public static final List<HttpMethod> METHODS_WITHOUT_BODY;

    /* compiled from: AndroidClientEngine.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.engine.android.AndroidClientEngineKt", m7120f = "AndroidClientEngine.kt", m7121i = {}, m7122l = {116, 123}, m7123m = "writeTo", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1 */
    /* loaded from: classes8.dex */
    public static final class C101251 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C101251(Continuation<? super C101251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidClientEngineKt.writeTo(null, null, null, this);
        }
    }

    static {
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        METHODS_WITHOUT_BODY = CollectionsKt__CollectionsKt.listOf((Object[]) new HttpMethod[]{companion.getGet(), companion.getHead()});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x001a  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeTo(@NotNull OutgoingContent outgoingContent, @NotNull OutputStream outputStream, @NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C101251 c101251;
        Throwable th;
        Object obj;
        OutputStream outputStream2 = outputStream;
        if (continuation instanceof C101251) {
            c101251 = (C101251) continuation;
            int i = c101251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101251.label = i - Integer.MIN_VALUE;
            } else {
                c101251 = new C101251(continuation);
            }
        }
        C101251 c1012512 = c101251;
        Object objCopyTo$default = c1012512.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = c1012512.label;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(objCopyTo$default);
                try {
                    if (outgoingContent instanceof OutgoingContent.ByteArrayContent) {
                        outputStream2.write(((OutgoingContent.ByteArrayContent) outgoingContent).getContent());
                    } else if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
                        ByteReadChannel channel = ((OutgoingContent.ReadChannelContent) outgoingContent).getChannel();
                        c1012512.L$0 = outputStream2;
                        c1012512.label = 1;
                        objCopyTo$default = WritingKt.copyTo$default(channel, outputStream, 0L, c1012512, 2, null);
                        if (objCopyTo$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = outputStream2;
                        ((Number) objCopyTo$default).longValue();
                        r2 = obj;
                    } else if (outgoingContent instanceof OutgoingContent.WriteChannelContent) {
                        ByteReadChannel channel2 = CoroutinesKt.writer$default((CoroutineScope) GlobalScope.INSTANCE, coroutineContext, false, (Function2) new AndroidClientEngineKt$writeTo$2$channel$1(outgoingContent, null), 2, (Object) null).getChannel();
                        c1012512.L$0 = outputStream2;
                        c1012512.label = 2;
                        if (WritingKt.copyTo$default(channel2, outputStream, 0L, c1012512, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (!(outgoingContent instanceof OutgoingContent.NoContent)) {
                        throw new UnsupportedContentTypeException(outgoingContent);
                    }
                    r2 = outputStream2;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(outputStream2, th);
                        throw th3;
                    }
                }
            } else if (r2 == 1) {
                Object obj2 = (Closeable) c1012512.L$0;
                ResultKt.throwOnFailure(objCopyTo$default);
                obj = obj2;
                ((Number) objCopyTo$default).longValue();
                r2 = obj;
            } else {
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Closeable closeable = (Closeable) c1012512.L$0;
                ResultKt.throwOnFailure(objCopyTo$default);
                r2 = closeable;
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(r2, null);
            return unit;
        } catch (Throwable th4) {
            th = th4;
            outputStream2 = r2;
        }
    }
}
