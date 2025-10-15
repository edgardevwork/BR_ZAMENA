package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.http.LinkHeader;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: ScatterMap.kt */
@Metadata(m7104d1 = {"\u0000-\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0002J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR,\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m7105d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "iterator", "", "getIterator", "()Ljava/util/Iterator;", "setIterator", "(Ljava/util/Iterator;)V", "hasNext", "", LinkHeader.Rel.Next, "remove", "", "collection"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
    public int current = -1;

    @NotNull
    public Iterator<? extends Map.Entry<K, V>> iterator;
    public final /* synthetic */ MutableScatterMap<K, V> this$0;

    public MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
        this.iterator = SequencesKt__SequenceBuilderKt.iterator(new C02421(mutableScatterMap, this, null));
    }

    @NotNull
    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    public final void setIterator(@NotNull Iterator<? extends Map.Entry<K, V>> it) {
        Intrinsics.checkNotNullParameter(it, "<set-?>");
        this.iterator = it;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    /* compiled from: ScatterMap.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/sequences/SequenceScope;", ""}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", m7120f = "ScatterMap.kt", m7121i = {0, 0, 0, 0, 0, 0, 0}, m7122l = {1312}, m7123m = "invokeSuspend", m7124n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, m7125s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n*L\n1310#1:1835,6\n1310#1:1842,3\n1310#1:1846,9\n1310#1:1841\n1310#1:1845\n*E\n"})
    /* renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1 */
    /* loaded from: classes4.dex */
    public static final class C02421 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<K, V>>, Continuation<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public long J$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ MutableScatterMap<K, V> this$0;
        public final /* synthetic */ MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02421(MutableScatterMap<K, V> mutableScatterMap, MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$1, Continuation<? super C02421> continuation) {
            super(2, continuation);
            this.this$0 = mutableScatterMap;
            this.this$1 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C02421 c02421 = new C02421(this.this$0, this.this$1, continuation);
            c02421.L$0 = obj;
            return c02421;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super Map.Entry<K, V>> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C02421) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:14:0x0071). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a8 -> B:20:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ae -> B:22:0x00af). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c0 -> B:27:0x00c1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SequenceScope sequenceScope;
            MutableScatterMap<K, V> mutableScatterMap;
            MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
            long[] jArr;
            int length;
            int i;
            long j;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            int i3 = 8;
            int i4 = 1;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.L$0;
                mutableScatterMap = this.this$0;
                mutableScatterMap$MutableMapWrapper$entries$1$iterator$1 = this.this$1;
                jArr = mutableScatterMap.metadata;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = this.I$3;
            int i6 = this.I$2;
            long j2 = this.J$0;
            int i7 = this.I$1;
            int i8 = this.I$0;
            long[] jArr2 = (long[]) this.L$3;
            MutableScatterMap<K, V> mutableScatterMap2 = (MutableScatterMap) this.L$2;
            MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$12 = (MutableScatterMap$MutableMapWrapper$entries$1$iterator$1) this.L$1;
            SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            int i9 = 1;
            i3 = 8;
            j2 >>= i3;
            i5 += i9;
            i4 = i9;
            if (i5 < i6) {
                int i10 = i4;
                if (i6 == i3) {
                    jArr = jArr2;
                    mutableScatterMap = mutableScatterMap2;
                    mutableScatterMap$MutableMapWrapper$entries$1$iterator$1 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$12;
                    sequenceScope = sequenceScope2;
                    int i11 = i8;
                    i = i7;
                    length = i11;
                    if (i != length) {
                        i++;
                        i4 = i10;
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            sequenceScope2 = sequenceScope;
                            i5 = 0;
                            mutableScatterMap2 = mutableScatterMap;
                            jArr2 = jArr;
                            i6 = 8 - ((~(i - length)) >>> 31);
                            mutableScatterMap$MutableMapWrapper$entries$1$iterator$12 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
                            j2 = j;
                            int i12 = i;
                            i8 = length;
                            i7 = i12;
                            if (i5 < i6) {
                                if ((255 & j2) < 128) {
                                    mutableScatterMap$MutableMapWrapper$entries$1$iterator$12.setCurrent((i7 << 3) + i5);
                                    MutableMapEntry mutableMapEntry = new MutableMapEntry(mutableScatterMap2.keys, mutableScatterMap2.values, mutableScatterMap$MutableMapWrapper$entries$1$iterator$12.getCurrent());
                                    this.L$0 = sequenceScope2;
                                    this.L$1 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$12;
                                    this.L$2 = mutableScatterMap2;
                                    this.L$3 = jArr2;
                                    this.I$0 = i8;
                                    this.I$1 = i7;
                                    this.J$0 = j2;
                                    this.I$2 = i6;
                                    this.I$3 = i5;
                                    i9 = 1;
                                    this.label = 1;
                                    if (sequenceScope2.yield(mutableMapEntry, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    i3 = 8;
                                    j2 >>= i3;
                                    i5 += i9;
                                    i4 = i9;
                                    if (i5 < i6) {
                                    }
                                } else {
                                    i9 = i4;
                                    j2 >>= i3;
                                    i5 += i9;
                                    i4 = i9;
                                    if (i5 < i6) {
                                    }
                                }
                            }
                        } else {
                            i10 = i4;
                            if (i != length) {
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    @NotNull
    public Map.Entry<K, V> next() {
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.current;
        if (i != -1) {
            this.this$0.removeValueAt(i);
            this.current = -1;
        }
    }
}
