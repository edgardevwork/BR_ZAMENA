package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotIdSet.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J\u001d\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0012H\u0086\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0002J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0096\u0002J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m7105d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "upperSet", "", "lowerSet", "lowerBound", "belowBound", "", "(JJI[I)V", "and", "bits", "andNot", "clear", "bit", "fastForEach", "", "block", "Lkotlin/Function1;", "get", "", "iterator", "", "lowest", "default", "or", "set", "toString", "", "Companion", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Immutable
@SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n13600#2,2:398\n1789#3,3:400\n1789#3,3:403\n1789#3,3:406\n1789#3,3:409\n1789#3,3:412\n1549#3:415\n1620#3,3:416\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n107#1:398,2\n236#1:400,3\n257#1:403,3\n261#1:406,3\n283#1:409,3\n286#1:412,3\n343#1:415\n343#1:416,3\n*E\n"})
/* loaded from: classes4.dex */
public final class SnapshotIdSet implements Iterable<Integer>, KMappedMarker {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);

    @Nullable
    private final int[] belowBound;
    private final int lowerBound;
    private final long lowerSet;
    private final long upperSet;

    private SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.upperSet = j;
        this.lowerSet = j2;
        this.lowerBound = i;
        this.belowBound = iArr;
    }

    public final boolean get(int bit) {
        int[] iArr;
        int i = bit - this.lowerBound;
        if (i >= 0 && i < 64) {
            return ((1 << i) & this.lowerSet) != 0;
        }
        if (i >= 64 && i < 128) {
            return ((1 << (i - 64)) & this.upperSet) != 0;
        }
        if (i <= 0 && (iArr = this.belowBound) != null) {
            return SnapshotIdSetKt.binarySearch(iArr, bit) >= 0;
        }
        return false;
    }

    @NotNull
    public final SnapshotIdSet set(int bit) {
        int i;
        int[] intArray;
        int i2 = this.lowerBound;
        int i3 = bit - i2;
        long j = 0;
        if (i3 >= 0 && i3 < 64) {
            long j2 = 1 << i3;
            long j3 = this.lowerSet;
            if ((j3 & j2) == 0) {
                return new SnapshotIdSet(this.upperSet, j3 | j2, i2, this.belowBound);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j4 = 1 << (i3 - 64);
            long j5 = this.upperSet;
            if ((j5 & j4) == 0) {
                return new SnapshotIdSet(j5 | j4, this.lowerSet, i2, this.belowBound);
            }
        } else if (i3 >= 128) {
            if (!get(bit)) {
                long j6 = this.upperSet;
                long j7 = this.lowerSet;
                int i4 = this.lowerBound;
                int i5 = ((bit + 1) / 64) * 64;
                ArrayList arrayList = null;
                long j8 = j7;
                long j9 = j6;
                while (true) {
                    if (i4 >= i5) {
                        i = i4;
                        break;
                    }
                    if (j8 != j) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            int[] iArr = this.belowBound;
                            if (iArr != null) {
                                for (int i6 : iArr) {
                                    arrayList.add(Integer.valueOf(i6));
                                }
                            }
                        }
                        for (int i7 = 0; i7 < 64; i7++) {
                            if (((1 << i7) & j8) != 0) {
                                arrayList.add(Integer.valueOf(i7 + i4));
                            }
                        }
                        j = 0;
                    }
                    if (j9 == j) {
                        i = i5;
                        j8 = j;
                        break;
                    }
                    i4 += 64;
                    j8 = j9;
                    j9 = j;
                }
                if (arrayList == null || (intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList)) == null) {
                    intArray = this.belowBound;
                }
                return new SnapshotIdSet(j9, j8, i, intArray).set(bit);
            }
        } else {
            int[] iArr2 = this.belowBound;
            if (iArr2 == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, i2, new int[]{bit});
            }
            int iBinarySearch = SnapshotIdSetKt.binarySearch(iArr2, bit);
            if (iBinarySearch < 0) {
                int i8 = -(iBinarySearch + 1);
                int length = iArr2.length;
                int[] iArr3 = new int[length + 1];
                ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr3, 0, 0, i8);
                ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr3, i8 + 1, i8, length);
                iArr3[i8] = bit;
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr3);
            }
        }
        return this;
    }

    @NotNull
    public final SnapshotIdSet clear(int bit) {
        int[] iArr;
        int iBinarySearch;
        int i = this.lowerBound;
        int i2 = bit - i;
        if (i2 >= 0 && i2 < 64) {
            long j = 1 << i2;
            long j2 = this.lowerSet;
            if ((j2 & j) != 0) {
                return new SnapshotIdSet(this.upperSet, j2 & (~j), i, this.belowBound);
            }
        } else if (i2 >= 64 && i2 < 128) {
            long j3 = 1 << (i2 - 64);
            long j4 = this.upperSet;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(j4 & (~j3), this.lowerSet, i, this.belowBound);
            }
        } else if (i2 < 0 && (iArr = this.belowBound) != null && (iBinarySearch = SnapshotIdSetKt.binarySearch(iArr, bit)) >= 0) {
            int length = iArr.length;
            int i3 = length - 1;
            if (i3 == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[i3];
            if (iBinarySearch > 0) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, iBinarySearch);
            }
            if (iBinarySearch < i3) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, iBinarySearch, iBinarySearch + 1, length);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    @NotNull
    public final SnapshotIdSet andNot(@NotNull SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        int i = bits.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet & (~bits.upperSet), this.lowerSet & (~bits.lowerSet), i2, iArr2);
            }
        }
        Iterator<Integer> it = bits.iterator();
        SnapshotIdSet snapshotIdSetClear = this;
        while (it.hasNext()) {
            snapshotIdSetClear = snapshotIdSetClear.clear(it.next().intValue());
        }
        return snapshotIdSetClear;
    }

    @NotNull
    public final SnapshotIdSet and(@NotNull SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (Intrinsics.areEqual(bits, snapshotIdSet) || Intrinsics.areEqual(this, snapshotIdSet)) {
            return snapshotIdSet;
        }
        int i = bits.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                long j = this.upperSet;
                long j2 = bits.upperSet;
                long j3 = j & j2;
                long j4 = this.lowerSet;
                long j5 = bits.lowerSet;
                return (j3 == 0 && (j4 & j5) == 0 && iArr2 == null) ? snapshotIdSet : new SnapshotIdSet(j2 & j, j4 & j5, i2, iArr2);
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (bits.get(iIntValue)) {
                    snapshotIdSet = snapshotIdSet.set(iIntValue);
                }
            }
            return snapshotIdSet;
        }
        Iterator<Integer> it2 = bits.iterator();
        while (it2.hasNext()) {
            int iIntValue2 = it2.next().intValue();
            if (get(iIntValue2)) {
                snapshotIdSet = snapshotIdSet.set(iIntValue2);
            }
        }
        return snapshotIdSet;
    }

    @NotNull
    /* renamed from: or */
    public final SnapshotIdSet m100or(@NotNull SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return bits;
        }
        int i = bits.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet | bits.upperSet, this.lowerSet | bits.lowerSet, i2, iArr2);
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                bits = bits.set(it.next().intValue());
            }
            return bits;
        }
        Iterator<Integer> it2 = bits.iterator();
        SnapshotIdSet snapshotIdSet2 = this;
        while (it2.hasNext()) {
            snapshotIdSet2 = snapshotIdSet2.set(it2.next().intValue());
        }
        return snapshotIdSet2;
    }

    /* compiled from: SnapshotIdSet.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", m7120f = "SnapshotIdSet.kt", m7121i = {0, 0, 1, 1, 2, 2}, m7122l = {295, 300, 307}, m7123m = "invokeSuspend", m7124n = {"$this$sequence", "belowBound", "$this$sequence", FirebaseAnalytics.Param.INDEX, "$this$sequence", FirebaseAnalytics.Param.INDEX}, m7125s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1 */
    /* loaded from: classes2.dex */
    public static final class C18291 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        public C18291(Continuation<? super C18291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C18291 c18291 = SnapshotIdSet.this.new C18291(continuation);
            c18291.L$0 = obj;
            return c18291;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super Integer> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C18291) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:19:0x0075). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0092 -> B:30:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ab -> B:30:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ca -> B:43:0x00ea). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e8 -> B:42:0x00e9). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SequenceScope sequenceScope;
            SequenceScope sequenceScope2;
            int length;
            int[] iArr;
            int i;
            SequenceScope sequenceScope3;
            int i2;
            SequenceScope sequenceScope4;
            int i3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.L$0;
                int[] iArr2 = SnapshotIdSet.this.belowBound;
                if (iArr2 != null) {
                    sequenceScope2 = sequenceScope;
                    length = iArr2.length;
                    iArr = iArr2;
                    i = 0;
                    if (i < length) {
                    }
                }
                if (SnapshotIdSet.this.lowerSet != 0) {
                }
                if (SnapshotIdSet.this.upperSet != 0) {
                }
                return Unit.INSTANCE;
            }
            if (i4 == 1) {
                length = this.I$1;
                i = this.I$0;
                iArr = (int[]) this.L$1;
                sequenceScope2 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                i++;
                if (i < length) {
                    Integer numBoxInt = Boxing.boxInt(iArr[i]);
                    this.L$0 = sequenceScope2;
                    this.L$1 = iArr;
                    this.I$0 = i;
                    this.I$1 = length;
                    this.label = 1;
                    if (sequenceScope2.yield(numBoxInt, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i++;
                    if (i < length) {
                        sequenceScope = sequenceScope2;
                        if (SnapshotIdSet.this.lowerSet != 0) {
                            sequenceScope3 = sequenceScope;
                            i2 = 0;
                            if (i2 >= 64) {
                            }
                        }
                        if (SnapshotIdSet.this.upperSet != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = this.I$0;
                    sequenceScope4 = (SequenceScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    i3 = i5;
                    i3++;
                    if (i3 < 64) {
                        if ((SnapshotIdSet.this.upperSet & (1 << i3)) != 0) {
                            Integer numBoxInt2 = Boxing.boxInt(i3 + 64 + SnapshotIdSet.this.lowerBound);
                            this.L$0 = sequenceScope4;
                            this.L$1 = null;
                            this.I$0 = i3;
                            this.label = 3;
                            if (sequenceScope4.yield(numBoxInt2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i5 = i3;
                            i3 = i5;
                        }
                        i3++;
                        if (i3 < 64) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                i2 = this.I$0;
                sequenceScope3 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                i2++;
                if (i2 >= 64) {
                    sequenceScope = sequenceScope3;
                    if (SnapshotIdSet.this.upperSet != 0) {
                        sequenceScope4 = sequenceScope;
                        i3 = 0;
                        if (i3 < 64) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if ((SnapshotIdSet.this.lowerSet & (1 << i2)) != 0) {
                    Integer numBoxInt3 = Boxing.boxInt(SnapshotIdSet.this.lowerBound + i2);
                    this.L$0 = sequenceScope3;
                    this.L$1 = null;
                    this.I$0 = i2;
                    this.label = 2;
                    if (sequenceScope3.yield(numBoxInt3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                i2++;
                if (i2 >= 64) {
                }
            }
        }
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Integer> iterator() {
        return SequencesKt__SequenceBuilderKt.sequence(new C18291(null)).iterator();
    }

    public final void fastForEach(@NotNull Function1<? super Integer, Unit> block) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i : iArr) {
                block.invoke(Integer.valueOf(i));
            }
        }
        if (this.lowerSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.lowerSet & (1 << i2)) != 0) {
                    block.invoke(Integer.valueOf(this.lowerBound + i2));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((this.upperSet & (1 << i3)) != 0) {
                    block.invoke(Integer.valueOf(i3 + 64 + this.lowerBound));
                }
            }
        }
    }

    public final int lowest(int i) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.lowerSet;
        if (j != 0) {
            return this.lowerBound + SnapshotIdSetKt.lowestBitOf(j);
        }
        long j2 = this.upperSet;
        return j2 != 0 ? this.lowerBound + 64 + SnapshotIdSetKt.lowestBitOf(j2) : i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    /* compiled from: SnapshotIdSet.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }
    }
}
