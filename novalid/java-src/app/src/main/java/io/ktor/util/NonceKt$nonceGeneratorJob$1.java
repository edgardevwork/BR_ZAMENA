package io.ktor.util;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Nonce.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.util.NonceKt$nonceGeneratorJob$1", m7120f = "Nonce.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, m7122l = {76}, m7123m = "invokeSuspend", m7124n = {"seedChannel", "previousRoundNonceList", "secureInstance", "weakRandom", "secureBytes", "weakBytes", "randomNonceList", "lastReseed", FirebaseAnalytics.Param.INDEX}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0"})
/* loaded from: classes7.dex */
public final class NonceKt$nonceGeneratorJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int I$0;
    public int I$1;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;

    public NonceKt$nonceGeneratorJob$1(Continuation<? super NonceKt$nonceGeneratorJob$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new NonceKt$nonceGeneratorJob$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((NonceKt$nonceGeneratorJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[Catch: all -> 0x0040, LOOP:1: B:14:0x007c->B:15:0x007e, LOOP_END, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:25:0x00f7, B:22:0x00d6, B:26:0x00f9, B:28:0x0108, B:13:0x0073, B:15:0x007e, B:16:0x0087, B:18:0x0093, B:20:0x00a4, B:19:0x00a1), top: B:38:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:25:0x00f7, B:22:0x00d6, B:26:0x00f9, B:28:0x0108, B:13:0x0073, B:15:0x007e, B:16:0x0087, B:18:0x0093, B:20:0x00a4, B:19:0x00a1), top: B:38:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:25:0x00f7, B:22:0x00d6, B:26:0x00f9, B:28:0x0108, B:13:0x0073, B:15:0x007e, B:16:0x0087, B:18:0x0093, B:20:0x00a4, B:19:0x00a1), top: B:38:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:25:0x00f7, B:22:0x00d6, B:26:0x00f9, B:28:0x0108, B:13:0x0073, B:15:0x007e, B:16:0x0087, B:18:0x0093, B:20:0x00a4, B:19:0x00a1), top: B:38:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:25:0x00f7, B:22:0x00d6, B:26:0x00f9, B:28:0x0108, B:13:0x0073, B:15:0x007e, B:16:0x0087, B:18:0x0093, B:20:0x00a4, B:19:0x00a1), top: B:38:0x002f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f4 -> B:25:0x00f7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ArrayList arrayList;
        SecureRandom secureRandomLookupSecureRandom;
        SecureRandom weakRandom;
        byte[] bArr;
        byte[] bArr2;
        long j;
        Channel channel;
        int length;
        int i;
        long jCurrentTimeMillis;
        int size;
        int i2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel<String> seedChannel = NonceKt.getSeedChannel();
            arrayList = new ArrayList();
            secureRandomLookupSecureRandom = NonceKt.lookupSecureRandom();
            weakRandom = SecureRandom.getInstance(NonceKt.SHA1PRNG);
            bArr = new byte[128];
            bArr2 = new byte[512];
            weakRandom.setSeed(secureRandomLookupSecureRandom.generateSeed(128));
            j = 0;
            channel = seedChannel;
            secureRandomLookupSecureRandom.nextBytes(bArr);
            weakRandom.nextBytes(bArr2);
            length = bArr.length;
            while (i < length) {
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - j <= 30000) {
            }
            if (i2 >= size) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.I$1;
            i2 = this.I$0;
            long j2 = this.J$0;
            List list = (List) this.L$6;
            byte[] bArr3 = (byte[]) this.L$5;
            byte[] bArr4 = (byte[]) this.L$4;
            SecureRandom secureRandom = (SecureRandom) this.L$3;
            SecureRandom secureRandom2 = (SecureRandom) this.L$2;
            ArrayList arrayList2 = (ArrayList) this.L$1;
            channel = (Channel) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                List list2 = list;
                SecureRandom secureRandom3 = secureRandom;
                byte[] bArr5 = bArr3;
                SecureRandom secureRandom4 = secureRandom2;
                ArrayList arrayList3 = arrayList2;
                long j3 = j2;
                i2++;
                if (i2 >= size) {
                    Object obj2 = list2.get(i2);
                    this.L$0 = channel;
                    this.L$1 = arrayList3;
                    this.L$2 = secureRandom4;
                    this.L$3 = secureRandom3;
                    this.L$4 = bArr4;
                    this.L$5 = bArr5;
                    this.L$6 = list2;
                    this.J$0 = j3;
                    this.I$0 = i2;
                    this.I$1 = size;
                    this.label = 1;
                    if (channel.send(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2++;
                    if (i2 >= size) {
                        arrayList3.clear();
                        int size2 = list2.size();
                        for (int size3 = list2.size() / 2; size3 < size2; size3++) {
                            arrayList3.add(list2.get(size3));
                        }
                        arrayList = arrayList3;
                        secureRandomLookupSecureRandom = secureRandom4;
                        weakRandom = secureRandom3;
                        bArr = bArr4;
                        bArr2 = bArr5;
                        j = j3;
                        secureRandomLookupSecureRandom.nextBytes(bArr);
                        weakRandom.nextBytes(bArr2);
                        length = bArr.length;
                        for (i = 0; i < length; i++) {
                            bArr2[i * 4] = bArr[i];
                        }
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - j <= 30000) {
                            weakRandom.setSeed(j - jCurrentTimeMillis);
                            weakRandom.setSeed(secureRandomLookupSecureRandom.generateSeed(bArr.length));
                            List listPlus = CollectionsKt___CollectionsKt.plus((Collection) StringsKt___StringsKt.chunked(CryptoKt.hex(bArr2), 16), (Iterable) arrayList);
                            Intrinsics.checkNotNullExpressionValue(weakRandom, "weakRandom");
                            List listShuffled = CollectionsKt__CollectionsJVMKt.shuffled(listPlus, weakRandom);
                            byte[] bArr6 = bArr;
                            list2 = listShuffled;
                            size = listShuffled.size() / 2;
                            j3 = jCurrentTimeMillis;
                            bArr5 = bArr2;
                            bArr4 = bArr6;
                            SecureRandom secureRandom5 = secureRandomLookupSecureRandom;
                            arrayList3 = arrayList;
                            i2 = 0;
                            secureRandom3 = weakRandom;
                            secureRandom4 = secureRandom5;
                        } else {
                            weakRandom.setSeed(bArr);
                            List listPlus2 = CollectionsKt___CollectionsKt.plus((Collection) StringsKt___StringsKt.chunked(CryptoKt.hex(bArr2), 16), (Iterable) arrayList);
                            Intrinsics.checkNotNullExpressionValue(weakRandom, "weakRandom");
                            List listShuffled2 = CollectionsKt__CollectionsJVMKt.shuffled(listPlus2, weakRandom);
                            byte[] bArr7 = bArr;
                            list2 = listShuffled2;
                            size = listShuffled2.size() / 2;
                            j3 = j;
                            bArr5 = bArr2;
                            bArr4 = bArr7;
                            SecureRandom secureRandom6 = secureRandomLookupSecureRandom;
                            arrayList3 = arrayList;
                            i2 = 0;
                            secureRandom3 = weakRandom;
                            secureRandom4 = secureRandom6;
                        }
                        if (i2 >= size) {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    channel.close(th);
                    SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    throw th2;
                }
            }
        }
    }
}
