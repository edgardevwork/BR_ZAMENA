package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: ScopeMap.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\rJ\u0011\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0086\u0002J4\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\r0\u0017H\u0086\bJ\u001b\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u001dJ.\u0010\u001e\u001a\u00020\r2#\b\u0004\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00130\u0017H\u0086\bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, m7105d2 = {"Landroidx/compose/runtime/collection/ScopeMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "map", "Landroidx/collection/MutableScatterMap;", "getMap", "()Landroidx/collection/MutableScatterMap;", "size", "", "getSize", "()I", "add", "", "key", PomReader.SCOPE, "(Ljava/lang/Object;Ljava/lang/Object;)V", "clear", "contains", "", "element", "forEachScopeOf", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeScope", "(Ljava/lang/Object;)V", "removeScopeIf", "predicate", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n1#1,148:1\n124#1:246\n125#1,5:262\n130#1,5:296\n138#1:311\n874#2,18:149\n1047#2:194\n1049#2:208\n1050#2,3:236\n1053#2:245\n1047#2:247\n1049#2:261\n1050#2,3:301\n1053#2:310\n267#3,4:167\n237#3,7:171\n248#3,3:179\n251#3,2:183\n272#3,2:185\n254#3,6:187\n274#3:193\n237#3,7:211\n248#3,3:219\n251#3,2:223\n254#3,6:229\n237#3,16:269\n254#3,6:289\n1810#4:178\n1672#4:182\n1810#4:201\n1672#4:205\n1810#4:218\n1672#4:222\n1810#4:254\n1672#4:258\n363#5,6:195\n373#5,3:202\n376#5,2:206\n379#5,6:239\n363#5,6:248\n373#5,3:255\n376#5,2:259\n379#5,6:304\n842#6,2:209\n845#6,4:225\n849#6:235\n842#6,2:267\n845#6,4:285\n849#6:295\n*S KotlinDebug\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n*L\n145#1:246\n145#1:262,5\n145#1:296,5\n145#1:311\n37#1:149,18\n124#1:194\n124#1:208\n124#1:236,3\n124#1:245\n145#1:247\n145#1:261\n145#1:301,3\n145#1:310\n74#1:167,4\n74#1:171,7\n74#1:179,3\n74#1:183,2\n74#1:185,2\n74#1:187,6\n74#1:193\n129#1:211,7\n129#1:219,3\n129#1:223,2\n129#1:229,6\n145#1:269,16\n145#1:289,6\n74#1:178\n74#1:182\n124#1:201\n124#1:205\n129#1:218\n129#1:222\n145#1:254\n145#1:258\n124#1:195,6\n124#1:202,3\n124#1:206,2\n124#1:239,6\n145#1:248,6\n145#1:255,3\n145#1:259,2\n145#1:304,6\n129#1:209,2\n129#1:225,4\n129#1:235\n145#1:267,2\n145#1:285,4\n145#1:295\n*E\n"})
/* loaded from: classes.dex */
public final class ScopeMap<T> {
    public static final int $stable = 8;

    @NotNull
    private final MutableScatterMap<Object, Object> map = ScatterMapKt.mutableScatterMapOf();

    @NotNull
    public final MutableScatterMap<Object, Object> getMap() {
        return this.map;
    }

    public final int getSize() {
        return this.map.get_size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.collection.MutableScatterSet] */
    public final void add(@NotNull Object key, @NotNull T scope) {
        MutableScatterMap<Object, Object> mutableScatterMap = this.map;
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(key);
        boolean z = iFindInsertIndex < 0;
        T t = z ? null : mutableScatterMap.values[iFindInsertIndex];
        if (t != null) {
            if (t instanceof MutableScatterSet) {
                Intrinsics.checkNotNull(t, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((MutableScatterSet) t).add(scope);
            } else if (t != scope) {
                ?? mutableScatterSet = new MutableScatterSet(0, 1, null);
                Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                mutableScatterSet.add(t);
                mutableScatterSet.add(scope);
                scope = mutableScatterSet;
            }
            scope = t;
        }
        if (z) {
            int i = ~iFindInsertIndex;
            mutableScatterMap.keys[i] = key;
            mutableScatterMap.values[i] = scope;
            return;
        }
        mutableScatterMap.values[iFindInsertIndex] = scope;
    }

    public final boolean contains(@NotNull Object element) {
        return this.map.containsKey(element);
    }

    public final void forEachScopeOf(@NotNull Object key, @NotNull Function1<? super T, Unit> block) {
        Object obj = getMap().get(key);
        if (obj == null) {
            return;
        }
        if (obj instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            block.invoke(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        } else {
            block.invoke(obj);
        }
    }

    public final void clear() {
        this.map.clear();
    }

    public final boolean remove(@NotNull Object key, @NotNull T scope) {
        Object obj = this.map.get(key);
        if (obj == null) {
            return false;
        }
        if (obj instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            boolean zRemove = mutableScatterSet.remove(scope);
            if (zRemove && mutableScatterSet.isEmpty()) {
                this.map.remove(key);
            }
            return zRemove;
        }
        if (!Intrinsics.areEqual(obj, scope)) {
            return false;
        }
        this.map.remove(key);
        return true;
    }

    public final void removeScopeIf(@NotNull Function1<? super T, Boolean> predicate) {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        boolean zBooleanValue;
        int i6;
        MutableScatterMap<Object, Object> map = getMap();
        long[] jArr3 = map.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j2 = jArr3[i7];
            char c = 7;
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j2 & 255) < 128) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = map.keys[i11];
                        Object obj2 = map.values[i11];
                        if (obj2 instanceof MutableScatterSet) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            Object[] objArr = mutableScatterSet.elements;
                            long[] jArr4 = mutableScatterSet.metadata;
                            int length2 = jArr4.length - 2;
                            jArr2 = jArr3;
                            i2 = length;
                            if (length2 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j4 = jArr4[i12];
                                    i4 = i9;
                                    long[] jArr5 = jArr4;
                                    j = -9187201950435737472L;
                                    if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j4 & 255) < 128) {
                                                int i15 = (i12 << 3) + i14;
                                                i6 = i7;
                                                if (predicate.invoke(objArr[i15]).booleanValue()) {
                                                    mutableScatterSet.removeElementAt(i15);
                                                }
                                            } else {
                                                i6 = i7;
                                            }
                                            j4 >>= 8;
                                            i14++;
                                            i7 = i6;
                                        }
                                        i3 = i7;
                                        if (i13 != 8) {
                                            break;
                                        }
                                    } else {
                                        i3 = i7;
                                    }
                                    if (i12 == length2) {
                                        break;
                                    }
                                    i12++;
                                    i9 = i4;
                                    jArr4 = jArr5;
                                    i7 = i3;
                                    c = 7;
                                }
                            } else {
                                i3 = i7;
                                i4 = i9;
                                j = -9187201950435737472L;
                            }
                            zBooleanValue = mutableScatterSet.isEmpty();
                        } else {
                            jArr2 = jArr3;
                            i2 = length;
                            i3 = i7;
                            i4 = i9;
                            j = j3;
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                            zBooleanValue = predicate.invoke(obj2).booleanValue();
                        }
                        if (zBooleanValue) {
                            map.removeValueAt(i11);
                        }
                        i5 = 8;
                    } else {
                        jArr2 = jArr3;
                        i2 = length;
                        i3 = i7;
                        i4 = i9;
                        j = j3;
                        i5 = i8;
                    }
                    j2 >>= i5;
                    i10++;
                    i8 = i5;
                    j3 = j;
                    jArr3 = jArr2;
                    length = i2;
                    i9 = i4;
                    i7 = i3;
                    c = 7;
                }
                jArr = jArr3;
                int i16 = length;
                int i17 = i7;
                if (i9 != i8) {
                    return;
                }
                length = i16;
                i = i17;
            } else {
                jArr = jArr3;
                i = i7;
            }
            if (i == length) {
                return;
            }
            i7 = i + 1;
            jArr3 = jArr;
        }
    }

    public final void removeScope(@NotNull T scope) {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        boolean zIsEmpty;
        int i6;
        MutableScatterMap<Object, Object> map = getMap();
        long[] jArr3 = map.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j2 = jArr3[i7];
            char c = 7;
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j2 & 255) < 128) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = map.keys[i11];
                        Object obj2 = map.values[i11];
                        if (obj2 instanceof MutableScatterSet) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            Object[] objArr = mutableScatterSet.elements;
                            long[] jArr4 = mutableScatterSet.metadata;
                            int length2 = jArr4.length - 2;
                            jArr2 = jArr3;
                            i2 = length;
                            if (length2 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j4 = jArr4[i12];
                                    i4 = i9;
                                    long[] jArr5 = jArr4;
                                    j = -9187201950435737472L;
                                    if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j4 & 255) < 128) {
                                                int i15 = (i12 << 3) + i14;
                                                i6 = i7;
                                                if (objArr[i15] == scope) {
                                                    mutableScatterSet.removeElementAt(i15);
                                                }
                                            } else {
                                                i6 = i7;
                                            }
                                            j4 >>= 8;
                                            i14++;
                                            i7 = i6;
                                        }
                                        i3 = i7;
                                        if (i13 != 8) {
                                            break;
                                        }
                                    } else {
                                        i3 = i7;
                                    }
                                    if (i12 == length2) {
                                        break;
                                    }
                                    i12++;
                                    i9 = i4;
                                    jArr4 = jArr5;
                                    i7 = i3;
                                    c = 7;
                                }
                            } else {
                                i3 = i7;
                                i4 = i9;
                                j = -9187201950435737472L;
                            }
                            zIsEmpty = mutableScatterSet.isEmpty();
                        } else {
                            jArr2 = jArr3;
                            i2 = length;
                            i3 = i7;
                            i4 = i9;
                            j = j3;
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                            zIsEmpty = obj2 == scope;
                        }
                        if (zIsEmpty) {
                            map.removeValueAt(i11);
                        }
                        i5 = 8;
                    } else {
                        jArr2 = jArr3;
                        i2 = length;
                        i3 = i7;
                        i4 = i9;
                        j = j3;
                        i5 = i8;
                    }
                    j2 >>= i5;
                    i10++;
                    i8 = i5;
                    j3 = j;
                    jArr3 = jArr2;
                    length = i2;
                    i9 = i4;
                    i7 = i3;
                    c = 7;
                }
                jArr = jArr3;
                int i16 = length;
                int i17 = i7;
                if (i9 != i8) {
                    return;
                }
                length = i16;
                i = i17;
            } else {
                jArr = jArr3;
                i = i7;
            }
            if (i == length) {
                return;
            }
            i7 = i + 1;
            jArr3 = jArr;
        }
    }
}
