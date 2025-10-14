package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.ColorInt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class ColorResourcesTableCreator {
    public static final byte ANDROID_PACKAGE_ID = 1;
    public static final byte APPLICATION_PACKAGE_ID = Byte.MAX_VALUE;
    public static final short HEADER_TYPE_PACKAGE = 512;
    public static final short HEADER_TYPE_RES_TABLE = 2;
    public static final short HEADER_TYPE_STRING_POOL = 1;
    public static final short HEADER_TYPE_TYPE = 513;
    public static final short HEADER_TYPE_TYPE_SPEC = 514;
    public static final String RESOURCE_TYPE_NAME_COLOR = "color";
    public static byte typeIdColor;
    public static final PackageInfo ANDROID_PACKAGE_INFO = new PackageInfo(1, "android");
    public static final Comparator<ColorResource> COLOR_RESOURCE_COMPARATOR = new Comparator<ColorResource>() { // from class: com.google.android.material.color.ColorResourcesTableCreator.1
        @Override // java.util.Comparator
        public int compare(ColorResource colorResource, ColorResource colorResource2) {
            return colorResource.entryId - colorResource2.entryId;
        }
    };

    public static byte[] create(Context context, Map<Integer, Integer> map) throws IOException {
        PackageInfo packageInfo;
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        PackageInfo packageInfo2 = new PackageInfo(127, context.getPackageName());
        HashMap map2 = new HashMap();
        ColorResource colorResource = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ColorResource colorResource2 = new ColorResource(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
            if (!context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                throw new IllegalArgumentException("Non color resource found: name=" + colorResource2.name + ", typeId=" + Integer.toHexString(colorResource2.typeId & 255));
            }
            if (colorResource2.packageId == 1) {
                packageInfo = ANDROID_PACKAGE_INFO;
            } else {
                if (colorResource2.packageId != Byte.MAX_VALUE) {
                    throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) colorResource2.packageId));
                }
                packageInfo = packageInfo2;
            }
            if (!map2.containsKey(packageInfo)) {
                map2.put(packageInfo, new ArrayList());
            }
            ((List) map2.get(packageInfo)).add(colorResource2);
            colorResource = colorResource2;
        }
        byte b = colorResource.typeId;
        typeIdColor = b;
        if (b == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ResTable(map2).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static class ResTable {
        public static final short HEADER_SIZE = 12;
        public final ResChunkHeader header;
        public final int packageCount;
        public final List<PackageChunk> packageChunks = new ArrayList();
        public final StringPoolChunk stringPool = new StringPoolChunk(new String[0]);

        public ResTable(Map<PackageInfo, List<ColorResource>> map) {
            this.packageCount = map.size();
            for (Map.Entry<PackageInfo, List<ColorResource>> entry : map.entrySet()) {
                List<ColorResource> value = entry.getValue();
                Collections.sort(value, ColorResourcesTableCreator.COLOR_RESOURCE_COMPARATOR);
                this.packageChunks.add(new PackageChunk(entry.getKey(), value));
            }
            this.header = new ResChunkHeader((short) 2, (short) 12, getOverallSize());
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.packageCount));
            this.stringPool.writeTo(byteArrayOutputStream);
            Iterator<PackageChunk> it = this.packageChunks.iterator();
            while (it.hasNext()) {
                it.next().writeTo(byteArrayOutputStream);
            }
        }

        public final int getOverallSize() {
            Iterator<PackageChunk> it = this.packageChunks.iterator();
            int chunkSize = 0;
            while (it.hasNext()) {
                chunkSize += it.next().getChunkSize();
            }
            return this.stringPool.getChunkSize() + 12 + chunkSize;
        }
    }

    public static class ResChunkHeader {
        public final int chunkSize;
        public final short headerSize;
        public final short type;

        public ResChunkHeader(short s, short s2, int i) {
            this.type = s;
            this.headerSize = s2;
            this.chunkSize = i;
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray(this.type));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray(this.headerSize));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.chunkSize));
        }
    }

    public static class StringPoolChunk {
        public static final int FLAG_UTF8 = 256;
        public static final short HEADER_SIZE = 28;
        public static final int STYLED_SPAN_LIST_END = -1;
        public final int chunkSize;
        public final ResChunkHeader header;
        public final int stringCount;
        public final List<Integer> stringIndex;
        public final List<byte[]> strings;
        public final int stringsPaddingSize;
        public final int stringsStart;
        public final int styledSpanCount;
        public final List<Integer> styledSpanIndex;
        public final List<List<StringStyledSpan>> styledSpans;
        public final int styledSpansStart;
        public final boolean utf8Encode;

        public StringPoolChunk(String... strArr) {
            this(false, strArr);
        }

        public StringPoolChunk(boolean z, String... strArr) {
            this.stringIndex = new ArrayList();
            this.styledSpanIndex = new ArrayList();
            this.strings = new ArrayList();
            this.styledSpans = new ArrayList();
            this.utf8Encode = z;
            int length = 0;
            for (String str : strArr) {
                Pair<byte[], List<StringStyledSpan>> pairProcessString = processString(str);
                this.stringIndex.add(Integer.valueOf(length));
                Object obj = pairProcessString.first;
                length += ((byte[]) obj).length;
                this.strings.add((byte[]) obj);
                this.styledSpans.add((List) pairProcessString.second);
            }
            int size = 0;
            for (List<StringStyledSpan> list : this.styledSpans) {
                for (StringStyledSpan stringStyledSpan : list) {
                    this.stringIndex.add(Integer.valueOf(length));
                    length += stringStyledSpan.styleString.length;
                    this.strings.add(stringStyledSpan.styleString);
                }
                this.styledSpanIndex.add(Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i = length % 4;
            int i2 = i == 0 ? 0 : 4 - i;
            this.stringsPaddingSize = i2;
            int size2 = this.strings.size();
            this.stringCount = size2;
            this.styledSpanCount = this.strings.size() - strArr.length;
            boolean z2 = this.strings.size() - strArr.length > 0;
            if (!z2) {
                this.styledSpanIndex.clear();
                this.styledSpans.clear();
            }
            int size3 = (size2 * 4) + 28 + (this.styledSpanIndex.size() * 4);
            this.stringsStart = size3;
            int i3 = length + i2;
            this.styledSpansStart = z2 ? size3 + i3 : 0;
            int i4 = size3 + i3 + (z2 ? size : 0);
            this.chunkSize = i4;
            this.header = new ResChunkHeader((short) 1, (short) 28, i4);
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.stringCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.styledSpanCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.utf8Encode ? 256 : 0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.stringsStart));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.styledSpansStart));
            Iterator<Integer> it = this.stringIndex.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(it.next().intValue()));
            }
            Iterator<Integer> it2 = this.styledSpanIndex.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(it2.next().intValue()));
            }
            Iterator<byte[]> it3 = this.strings.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i = this.stringsPaddingSize;
            if (i > 0) {
                byteArrayOutputStream.write(new byte[i]);
            }
            Iterator<List<StringStyledSpan>> it4 = this.styledSpans.iterator();
            while (it4.hasNext()) {
                Iterator<StringStyledSpan> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().writeTo(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(-1));
            }
        }

        public int getChunkSize() {
            return this.chunkSize;
        }

        public final Pair<byte[], List<StringStyledSpan>> processString(String str) {
            return new Pair<>(this.utf8Encode ? ColorResourcesTableCreator.stringToByteArrayUtf8(str) : ColorResourcesTableCreator.stringToByteArray(str), Collections.emptyList());
        }
    }

    public static class StringStyledSpan {
        public int firstCharacterIndex;
        public int lastCharacterIndex;
        public int nameReference;
        public byte[] styleString;

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.nameReference));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.firstCharacterIndex));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.lastCharacterIndex));
        }
    }

    public static class PackageChunk {
        public static final short HEADER_SIZE = 288;
        public static final int PACKAGE_NAME_MAX_LENGTH = 128;
        public final ResChunkHeader header;
        public final StringPoolChunk keyStrings;
        public final PackageInfo packageInfo;
        public final TypeSpecChunk typeSpecChunk;
        public final StringPoolChunk typeStrings = new StringPoolChunk(false, "?1", "?2", "?3", "?4", "?5", "color");

        public PackageChunk(PackageInfo packageInfo, List<ColorResource> list) {
            this.packageInfo = packageInfo;
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i).name;
            }
            this.keyStrings = new StringPoolChunk(true, strArr);
            this.typeSpecChunk = new TypeSpecChunk(list);
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, HEADER_SIZE, getChunkSize());
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.packageInfo.f688id));
            char[] charArray = this.packageInfo.name.toCharArray();
            for (int i = 0; i < 128; i++) {
                if (i < charArray.length) {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.charToByteArray(charArray[i]));
                } else {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.charToByteArray((char) 0));
                }
            }
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.typeStrings.getChunkSize() + 288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            this.typeStrings.writeTo(byteArrayOutputStream);
            this.keyStrings.writeTo(byteArrayOutputStream);
            this.typeSpecChunk.writeTo(byteArrayOutputStream);
        }

        public int getChunkSize() {
            return this.typeStrings.getChunkSize() + 288 + this.keyStrings.getChunkSize() + this.typeSpecChunk.getChunkSizeWithTypeChunk();
        }
    }

    public static class TypeSpecChunk {
        public static final short HEADER_SIZE = 16;
        public static final int SPEC_PUBLIC = 1073741824;
        public final int entryCount;
        public final int[] entryFlags;
        public final ResChunkHeader header;
        public final TypeChunk typeChunk;

        public TypeSpecChunk(List<ColorResource> list) {
            this.entryCount = list.get(list.size() - 1).entryId + 1;
            HashSet hashSet = new HashSet();
            Iterator<ColorResource> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().entryId));
            }
            this.entryFlags = new int[this.entryCount];
            for (short s = 0; s < this.entryCount; s = (short) (s + 1)) {
                if (hashSet.contains(Short.valueOf(s))) {
                    this.entryFlags[s] = 1073741824;
                }
            }
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_TYPE_SPEC, (short) 16, getChunkSize());
            this.typeChunk = new TypeChunk(list, hashSet, this.entryCount);
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.typeIdColor, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.entryCount));
            for (int i : this.entryFlags) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(i));
            }
            this.typeChunk.writeTo(byteArrayOutputStream);
        }

        public int getChunkSizeWithTypeChunk() {
            return getChunkSize() + this.typeChunk.getChunkSize();
        }

        public final int getChunkSize() {
            return (this.entryCount * 4) + 16;
        }
    }

    public static class TypeChunk {
        public static final byte CONFIG_SIZE = 64;
        public static final short HEADER_SIZE = 84;
        public static final int OFFSET_NO_ENTRY = -1;
        public final byte[] config;
        public final int entryCount;
        public final ResChunkHeader header;
        public final int[] offsetTable;
        public final ResEntry[] resEntries;

        public TypeChunk(List<ColorResource> list, Set<Short> set, int i) {
            byte[] bArr = new byte[64];
            this.config = bArr;
            this.entryCount = i;
            bArr[0] = 64;
            this.resEntries = new ResEntry[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.resEntries[i2] = new ResEntry(i2, list.get(i2).value);
            }
            this.offsetTable = new int[i];
            int i3 = 0;
            for (short s = 0; s < i; s = (short) (s + 1)) {
                if (set.contains(Short.valueOf(s))) {
                    this.offsetTable[s] = i3;
                    i3 += 16;
                } else {
                    this.offsetTable[s] = -1;
                }
            }
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_TYPE, (short) 84, getChunkSize());
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.typeIdColor, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.entryCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(getEntryStart()));
            byteArrayOutputStream.write(this.config);
            for (int i : this.offsetTable) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(i));
            }
            for (ResEntry resEntry : this.resEntries) {
                resEntry.writeTo(byteArrayOutputStream);
            }
        }

        public int getChunkSize() {
            return getEntryStart() + (this.resEntries.length * 16);
        }

        public final int getEntryStart() {
            return getOffsetTableSize() + 84;
        }

        public final int getOffsetTableSize() {
            return this.offsetTable.length * 4;
        }
    }

    public static class ResEntry {
        public static final byte DATA_TYPE_AARRGGBB = 28;
        public static final short ENTRY_SIZE = 8;
        public static final short FLAG_PUBLIC = 2;
        public static final int SIZE = 16;
        public static final short VALUE_SIZE = 8;
        public final int data;
        public final int keyStringIndex;

        public ResEntry(int i, @ColorInt int i2) {
            this.keyStringIndex = i;
            this.data = i2;
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 8));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 2));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.keyStringIndex));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.data));
        }
    }

    public static class PackageInfo {

        /* renamed from: id */
        public final int f688id;
        public final String name;

        public PackageInfo(int i, String str) {
            this.f688id = i;
            this.name = str;
        }
    }

    public static class ColorResource {
        public final short entryId;
        public final String name;
        public final byte packageId;
        public final byte typeId;

        @ColorInt
        public final int value;

        public ColorResource(int i, String str, int i2) {
            this.name = str;
            this.value = i2;
            this.entryId = (short) (65535 & i);
            this.typeId = (byte) ((i >> 16) & 255);
            this.packageId = (byte) ((i >> 24) & 255);
        }
    }

    public static byte[] shortToByteArray(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    public static byte[] charToByteArray(char c) {
        return new byte[]{(byte) (c & 255), (byte) ((c >> '\b') & 255)};
    }

    public static byte[] intToByteArray(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] stringToByteArray(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] bArrShortToByteArray = shortToByteArray((short) charArray.length);
        bArr[0] = bArrShortToByteArray[0];
        bArr[1] = bArrShortToByteArray[1];
        for (int i = 0; i < charArray.length; i++) {
            byte[] bArrCharToByteArray = charToByteArray(charArray[i]);
            int i2 = i * 2;
            bArr[i2 + 2] = bArrCharToByteArray[0];
            bArr[i2 + 3] = bArrCharToByteArray[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }

    public static byte[] stringToByteArrayUtf8(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length;
        byte[] bArr = new byte[length2 + 3];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 + 2] = 0;
        return bArr;
    }
}
