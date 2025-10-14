package okio;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Options.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0015B\u001f\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0096\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m7105d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$okio", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$okio", "()[I", "get", FirebaseAnalytics.Param.INDEX, "Companion", "okio"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class Options extends AbstractList<ByteString> implements RandomAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public final ByteString[] byteStrings;

    @NotNull
    public final int[] trie;

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    @JvmStatic
    @NotNull
    /* renamed from: of */
    public static final Options m7276of(@NotNull ByteString... byteStringArr) {
        return INSTANCE.m7277of(byteStringArr);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Options) byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Options) byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Options) byteString);
    }

    @NotNull
    /* renamed from: getByteStrings$okio, reason: from getter */
    public final ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    @NotNull
    /* renamed from: getTrie$okio, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    public Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.byteStrings.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ByteString get(int i) {
        return this.byteStrings[i];
    }

    /* compiled from: Options.kt */
    @Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m7105d2 = {"Lokio/Options$Companion;", "", "()V", "intCount", "", "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", "", "nodeOffset", "node", "byteStringOffset", "", "byteStrings", "", "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", "", "([Lokio/ByteString;)Lokio/Options;", "okio"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n11065#2:237\n11400#2,3:238\n13374#2,3:243\n37#3,2:241\n1#4:246\n74#5:247\n74#5:248\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n43#1:237\n43#1:238,3\n44#1:243,3\n43#1:241,2\n151#1:247\n208#1:248\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:95:0x00d7, code lost:
        
            continue;
         */
        @JvmStatic
        @NotNull
        /* renamed from: of */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Options m7277of(@NotNull ByteString... byteStrings) throws IOException {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            int i = 0;
            if (byteStrings.length == 0) {
                return new Options(new ByteString[0], new int[]{0, -1}, null);
            }
            List mutableList = ArraysKt___ArraysKt.toMutableList(byteStrings);
            CollectionsKt__MutableCollectionsJVMKt.sort(mutableList);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (ByteString byteString : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                listMutableListOf.set(CollectionsKt__CollectionsKt.binarySearch$default(mutableList, byteStrings[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((ByteString) mutableList.get(0)).size() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i4 = 0;
            while (i4 < mutableList.size()) {
                ByteString byteString2 = (ByteString) mutableList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < mutableList.size()) {
                    ByteString byteString3 = (ByteString) mutableList.get(i6);
                    if (byteString3.startsWith(byteString2)) {
                        if (byteString3.size() == byteString2.size()) {
                            throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                        }
                        if (((Number) listMutableListOf.get(i6)).intValue() > ((Number) listMutableListOf.get(i4)).intValue()) {
                            mutableList.remove(i6);
                            listMutableListOf.remove(i6);
                        } else {
                            i6++;
                        }
                    }
                }
                i4 = i5;
            }
            Buffer buffer = new Buffer();
            buildTrieRecursive$default(this, 0L, buffer, 0, mutableList, 0, 0, listMutableListOf, 53, null);
            int[] iArr = new int[(int) getIntCount(buffer)];
            while (!buffer.exhausted()) {
                iArr[i] = buffer.readInt();
                i++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            return new Options((ByteString[]) objArrCopyOf, iArr, null);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j, Buffer buffer, int i, List list, int i2, int i3, List list2, int i4, Object obj) throws IOException {
            companion.buildTrieRecursive((i4 & 1) != 0 ? 0L : j, buffer, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        public final void buildTrieRecursive(long nodeOffset, Buffer node, int byteStringOffset, List<? extends ByteString> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) throws IOException {
            int i;
            int i2;
            int i3;
            int i4;
            Buffer buffer;
            int i5 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i6 = fromIndex; i6 < toIndex; i6++) {
                if (byteStrings.get(i6).size() < i5) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = byteStrings.get(fromIndex);
            ByteString byteString2 = byteStrings.get(toIndex - 1);
            int i7 = -1;
            if (i5 == byteString.size()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i8 = fromIndex + 1;
                ByteString byteString3 = byteStrings.get(i8);
                i = i8;
                i2 = iIntValue;
                byteString = byteString3;
            } else {
                i = fromIndex;
                i2 = -1;
            }
            if (byteString.getByte(i5) != byteString2.getByte(i5)) {
                int i9 = 1;
                for (int i10 = i + 1; i10 < toIndex; i10++) {
                    if (byteStrings.get(i10 - 1).getByte(i5) != byteStrings.get(i10).getByte(i5)) {
                        i9++;
                    }
                }
                long intCount = nodeOffset + getIntCount(node) + 2 + (i9 * 2);
                node.writeInt(i9);
                node.writeInt(i2);
                for (int i11 = i; i11 < toIndex; i11++) {
                    byte b = byteStrings.get(i11).getByte(i5);
                    if (i11 == i || b != byteStrings.get(i11 - 1).getByte(i5)) {
                        node.writeInt(b & 255);
                    }
                }
                Buffer buffer2 = new Buffer();
                while (i < toIndex) {
                    byte b2 = byteStrings.get(i).getByte(i5);
                    int i12 = i + 1;
                    int i13 = i12;
                    while (true) {
                        if (i13 >= toIndex) {
                            i3 = toIndex;
                            break;
                        } else {
                            if (b2 != byteStrings.get(i13).getByte(i5)) {
                                i3 = i13;
                                break;
                            }
                            i13++;
                        }
                    }
                    if (i12 == i3 && i5 + 1 == byteStrings.get(i).size()) {
                        node.writeInt(indexes.get(i).intValue());
                        i4 = i3;
                        buffer = buffer2;
                    } else {
                        node.writeInt(((int) (intCount + getIntCount(buffer2))) * i7);
                        i4 = i3;
                        buffer = buffer2;
                        buildTrieRecursive(intCount, buffer2, i5 + 1, byteStrings, i, i3, indexes);
                    }
                    buffer2 = buffer;
                    i = i4;
                    i7 = -1;
                }
                node.writeAll(buffer2);
                return;
            }
            int iMin = Math.min(byteString.size(), byteString2.size());
            int i14 = 0;
            for (int i15 = i5; i15 < iMin && byteString.getByte(i15) == byteString2.getByte(i15); i15++) {
                i14++;
            }
            long intCount2 = nodeOffset + getIntCount(node) + 2 + i14 + 1;
            node.writeInt(-i14);
            node.writeInt(i2);
            int i16 = i14 + i5;
            while (i5 < i16) {
                node.writeInt(byteString.getByte(i5) & 255);
                i5++;
            }
            if (i + 1 == toIndex) {
                if (i16 != byteStrings.get(i).size()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                node.writeInt(indexes.get(i).intValue());
            } else {
                Buffer buffer3 = new Buffer();
                node.writeInt(((int) (getIntCount(buffer3) + intCount2)) * (-1));
                buildTrieRecursive(intCount2, buffer3, i16, byteStrings, i, toIndex, indexes);
                node.writeAll(buffer3);
            }
        }

        public final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }
    }
}
