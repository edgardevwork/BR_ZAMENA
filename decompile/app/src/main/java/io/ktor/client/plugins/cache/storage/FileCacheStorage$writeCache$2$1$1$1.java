package io.ktor.client.plugins.cache.storage;

import io.ktor.utils.p050io.ByteChannel;
import io.ktor.utils.p050io.ByteWriteChannelKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileCacheStorage.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$1$1$1", m7120f = "FileCacheStorage.kt", m7121i = {}, m7122l = {96, 98}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes6.dex */
public final class FileCacheStorage$writeCache$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<CachedResponseData> $caches;
    public final /* synthetic */ ByteChannel $channel;
    public Object L$0;
    public int label;
    public final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileCacheStorage$writeCache$2$1$1$1(ByteChannel byteChannel, List<CachedResponseData> list, FileCacheStorage fileCacheStorage, Continuation<? super FileCacheStorage$writeCache$2$1$1$1> continuation) {
        super(2, continuation);
        this.$channel = byteChannel;
        this.$caches = list;
        this.this$0 = fileCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FileCacheStorage$writeCache$2$1$1$1(this.$channel, this.$caches, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FileCacheStorage$writeCache$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Iterator<CachedResponseData> it;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ByteChannel byteChannel = this.$channel;
            int size = this.$caches.size();
            this.label = 1;
            if (byteChannel.writeInt(size, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    CachedResponseData next = it.next();
                    FileCacheStorage fileCacheStorage = this.this$0;
                    ByteChannel byteChannel2 = this.$channel;
                    this.L$0 = it;
                    this.label = 2;
                    if (fileCacheStorage.writeCache(byteChannel2, next, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                ByteWriteChannelKt.close(this.$channel);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        it = this.$caches.iterator();
        while (it.hasNext()) {
        }
        ByteWriteChannelKt.close(this.$channel);
        return Unit.INSTANCE;
    }
}
