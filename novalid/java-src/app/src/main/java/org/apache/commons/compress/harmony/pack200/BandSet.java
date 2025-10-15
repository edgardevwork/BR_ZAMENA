package org.apache.commons.compress.harmony.pack200;

import androidx.media3.extractor.text.cea.Cea708Decoder;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.IntStream;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;

/* loaded from: classes7.dex */
public abstract class BandSet {
    public static final int[] effortThresholds = {0, 0, 1000, 500, 100, 100, 100, 100, 100, 0};
    public long[] canonicalLargest;
    public long[] canonicalSmallest;
    public final int effort;
    public final SegmentHeader segmentHeader;

    public abstract void pack(OutputStream outputStream) throws Pack200Exception, IOException;

    public BandSet(int i, SegmentHeader segmentHeader) {
        this.effort = i;
        this.segmentHeader = segmentHeader;
    }

    public byte[] encodeScalar(int[] iArr, BHSDCodec bHSDCodec) throws Pack200Exception {
        return bHSDCodec.encode(iArr);
    }

    public byte[] encodeScalar(int i, BHSDCodec bHSDCodec) throws Pack200Exception {
        return bHSDCodec.encode(i);
    }

    public byte[] encodeBandInt(String str, int[] iArr, BHSDCodec bHSDCodec) throws Pack200Exception {
        byte[] bArrEncode;
        int i = this.effort;
        if (i <= 1 || iArr.length < effortThresholds[i]) {
            bArrEncode = null;
        } else {
            BandAnalysisResults bandAnalysisResultsAnalyseBand = analyseBand(str, iArr, bHSDCodec);
            Codec codec = bandAnalysisResultsAnalyseBand.betterCodec;
            bArrEncode = bandAnalysisResultsAnalyseBand.encodedBand;
            if (codec != null) {
                if (codec instanceof BHSDCodec) {
                    int[] specifier = CodecEncoding.getSpecifier(codec, bHSDCodec);
                    int i2 = specifier[0];
                    if (specifier.length > 1) {
                        for (int i3 = 1; i3 < specifier.length; i3++) {
                            this.segmentHeader.appendBandCodingSpecifier(specifier[i3]);
                        }
                    }
                    byte[] bArrEncode2 = bHSDCodec.encode(new int[]{bHSDCodec.isSigned() ? (-1) - i2 : i2 + bHSDCodec.getL()});
                    byte[] bArr = new byte[bArrEncode2.length + bArrEncode.length];
                    System.arraycopy(bArrEncode2, 0, bArr, 0, bArrEncode2.length);
                    System.arraycopy(bArrEncode, 0, bArr, bArrEncode2.length, bArrEncode.length);
                    return bArr;
                }
                if (!(codec instanceof PopulationCodec)) {
                    boolean z = codec instanceof RunCodec;
                } else {
                    IntStream intStreamOf = IntStream.of(bandAnalysisResultsAnalyseBand.extraMetadata);
                    final SegmentHeader segmentHeader = this.segmentHeader;
                    segmentHeader.getClass();
                    intStreamOf.forEach(new IntConsumer() { // from class: org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda3
                        @Override // java.util.function.IntConsumer
                        public final void accept(int i4) {
                            segmentHeader.appendBandCodingSpecifier(i4);
                        }
                    });
                    return bArrEncode;
                }
            }
        }
        if (iArr.length > 0) {
            if (bArrEncode == null) {
                bArrEncode = bHSDCodec.encode(iArr);
            }
            int i4 = iArr[0];
            if (bHSDCodec.getB() != 1) {
                if (bHSDCodec.isSigned() && i4 >= -256 && i4 <= -1) {
                    byte[] bArrEncode3 = bHSDCodec.encode(new int[]{(-1) - CodecEncoding.getSpecifierForDefaultCodec(bHSDCodec)});
                    byte[] bArr2 = new byte[bArrEncode3.length + bArrEncode.length];
                    System.arraycopy(bArrEncode3, 0, bArr2, 0, bArrEncode3.length);
                    System.arraycopy(bArrEncode, 0, bArr2, bArrEncode3.length, bArrEncode.length);
                    return bArr2;
                }
                if (!bHSDCodec.isSigned() && i4 >= bHSDCodec.getL() && i4 <= bHSDCodec.getL() + 255) {
                    byte[] bArrEncode4 = bHSDCodec.encode(new int[]{CodecEncoding.getSpecifierForDefaultCodec(bHSDCodec) + bHSDCodec.getL()});
                    byte[] bArr3 = new byte[bArrEncode4.length + bArrEncode.length];
                    System.arraycopy(bArrEncode4, 0, bArr3, 0, bArrEncode4.length);
                    System.arraycopy(bArrEncode, 0, bArr3, bArrEncode4.length, bArrEncode.length);
                    return bArr3;
                }
            }
            return bArrEncode;
        }
        return new byte[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BandAnalysisResults analyseBand(String str, int[] iArr, BHSDCodec bHSDCodec) throws Pack200Exception {
        BandAnalysisResults bandAnalysisResults = new BandAnalysisResults();
        if (this.canonicalLargest == null) {
            this.canonicalLargest = new long[116];
            this.canonicalSmallest = new long[116];
            int i = 1;
            while (true) {
                long[] jArr = this.canonicalLargest;
                if (i >= jArr.length) {
                    break;
                }
                jArr[i] = CodecEncoding.getCanonicalCodec(i).largest();
                this.canonicalSmallest[i] = CodecEncoding.getCanonicalCodec(i).smallest();
                i++;
            }
        }
        BandData bandData = new BandData(iArr);
        byte[] bArrEncode = bHSDCodec.encode(iArr);
        bandAnalysisResults.encodedBand = bArrEncode;
        if (bArrEncode.length <= (iArr.length + 23) - (this.effort * 2)) {
            return bandAnalysisResults;
        }
        if (!bandData.anyNegatives()) {
            long j = bandData.largest;
            BHSDCodec bHSDCodec2 = Codec.BYTE1;
            if (j <= bHSDCodec2.largest()) {
                bandAnalysisResults.encodedBand = bHSDCodec2.encode(iArr);
                bandAnalysisResults.betterCodec = bHSDCodec2;
                return bandAnalysisResults;
            }
        }
        if (this.effort > 3 && !str.equals("POPULATION")) {
            int iNumDistinctValues = bandData.numDistinctValues();
            float length = iNumDistinctValues / iArr.length;
            if (iNumDistinctValues >= 100) {
                double d = length;
                if (d < 0.02d || (this.effort > 6 && d < 0.04d)) {
                    encodeWithPopulationCodec(str, iArr, bHSDCodec, bandData, bandAnalysisResults);
                    if (timeToStop(bandAnalysisResults)) {
                        return bandAnalysisResults;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (bandData.mainlyPositiveDeltas() && bandData.mainlySmallDeltas()) {
            arrayList.add(CanonicalCodecFamilies.deltaUnsignedCodecs2);
        }
        if (bandData.wellCorrelated()) {
            if (bandData.mainlyPositiveDeltas()) {
                arrayList.add(CanonicalCodecFamilies.deltaUnsignedCodecs1);
                arrayList.add(CanonicalCodecFamilies.deltaUnsignedCodecs3);
                arrayList.add(CanonicalCodecFamilies.deltaUnsignedCodecs4);
                arrayList.add(CanonicalCodecFamilies.deltaUnsignedCodecs5);
                arrayList.add(CanonicalCodecFamilies.nonDeltaUnsignedCodecs1);
                arrayList.add(CanonicalCodecFamilies.nonDeltaUnsignedCodecs3);
                arrayList.add(CanonicalCodecFamilies.nonDeltaUnsignedCodecs4);
                arrayList.add(CanonicalCodecFamilies.nonDeltaUnsignedCodecs5);
                arrayList.add(CanonicalCodecFamilies.nonDeltaUnsignedCodecs2);
            } else {
                arrayList.add(CanonicalCodecFamilies.deltaSignedCodecs1);
                arrayList.add(CanonicalCodecFamilies.deltaSignedCodecs3);
                arrayList.add(CanonicalCodecFamilies.deltaSignedCodecs2);
                arrayList.add(CanonicalCodecFamilies.deltaSignedCodecs4);
                arrayList.add(CanonicalCodecFamilies.deltaSignedCodecs5);
                arrayList.add(CanonicalCodecFamilies.nonDeltaSignedCodecs1);
                arrayList.add(CanonicalCodecFamilies.nonDeltaSignedCodecs2);
            }
        } else if (bandData.anyNegatives()) {
            arrayList.add(CanonicalCodecFamilies.nonDeltaSignedCodecs1);
            arrayList.add(CanonicalCodecFamilies.nonDeltaSignedCodecs2);
            arrayList.add(CanonicalCodecFamilies.deltaSignedCodecs1);
            arrayList.add(CanonicalCodecFamilies.deltaSignedCodecs2);
            arrayList.add(CanonicalCodecFamilies.deltaSignedCodecs3);
            arrayList.add(CanonicalCodecFamilies.deltaSignedCodecs4);
            arrayList.add(CanonicalCodecFamilies.deltaSignedCodecs5);
        } else {
            arrayList.add(CanonicalCodecFamilies.nonDeltaUnsignedCodecs1);
            arrayList.add(CanonicalCodecFamilies.nonDeltaUnsignedCodecs3);
            arrayList.add(CanonicalCodecFamilies.nonDeltaUnsignedCodecs4);
            arrayList.add(CanonicalCodecFamilies.nonDeltaUnsignedCodecs5);
            arrayList.add(CanonicalCodecFamilies.nonDeltaUnsignedCodecs2);
            arrayList.add(CanonicalCodecFamilies.deltaUnsignedCodecs1);
            arrayList.add(CanonicalCodecFamilies.deltaUnsignedCodecs3);
            arrayList.add(CanonicalCodecFamilies.deltaUnsignedCodecs4);
            arrayList.add(CanonicalCodecFamilies.deltaUnsignedCodecs5);
        }
        if (str.equalsIgnoreCase("cpint")) {
            System.out.print("");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tryCodecs(str, iArr, bHSDCodec, bandData, bandAnalysisResults, bArrEncode, (BHSDCodec[]) it.next());
            if (timeToStop(bandAnalysisResults)) {
                break;
            }
        }
        return bandAnalysisResults;
    }

    public final boolean timeToStop(BandAnalysisResults bandAnalysisResults) {
        return this.effort > 6 ? bandAnalysisResults.numCodecsTried >= this.effort * 2 : bandAnalysisResults.numCodecsTried >= this.effort;
    }

    public final void tryCodecs(String str, int[] iArr, BHSDCodec bHSDCodec, BandData bandData, BandAnalysisResults bandAnalysisResults, byte[] bArr, BHSDCodec[] bHSDCodecArr) throws Pack200Exception {
        for (BHSDCodec bHSDCodec2 : bHSDCodecArr) {
            if (bHSDCodec2.equals(bHSDCodec)) {
                return;
            }
            if (bHSDCodec2.isDelta()) {
                if (bHSDCodec2.largest() >= bandData.largestDelta && bHSDCodec2.smallest() <= bandData.smallestDelta && bHSDCodec2.largest() >= bandData.largest && bHSDCodec2.smallest() <= bandData.smallest) {
                    byte[] bArrEncode = bHSDCodec2.encode(iArr);
                    BandAnalysisResults.access$408(bandAnalysisResults);
                    int length = (bArr.length - bArrEncode.length) - bHSDCodec.encode(CodecEncoding.getSpecifier(bHSDCodec2, null)).length;
                    if (length > bandAnalysisResults.saved) {
                        bandAnalysisResults.betterCodec = bHSDCodec2;
                        bandAnalysisResults.encodedBand = bArrEncode;
                        bandAnalysisResults.saved = length;
                    }
                }
            } else if (bHSDCodec2.largest() >= bandData.largest && bHSDCodec2.smallest() <= bandData.smallest) {
                byte[] bArrEncode2 = bHSDCodec2.encode(iArr);
                BandAnalysisResults.access$408(bandAnalysisResults);
                int length2 = (bArr.length - bArrEncode2.length) - bHSDCodec.encode(CodecEncoding.getSpecifier(bHSDCodec2, null)).length;
                if (length2 > bandAnalysisResults.saved) {
                    bandAnalysisResults.betterCodec = bHSDCodec2;
                    bandAnalysisResults.encodedBand = bArrEncode2;
                    bandAnalysisResults.saved = length2;
                }
            }
            if (timeToStop(bandAnalysisResults)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void encodeWithPopulationCodec(String str, int[] iArr, BHSDCodec bHSDCodec, BandData bandData, BandAnalysisResults bandAnalysisResults) throws Pack200Exception {
        Codec codec;
        int l;
        byte[] bArr;
        byte[] bArr2;
        int i;
        Codec codec2;
        Codec codec3;
        byte[] bArrEncode;
        int length;
        bandAnalysisResults.numCodecsTried += 3;
        final Map map = bandData.distinctValues;
        final ArrayList arrayList = new ArrayList();
        map.forEach(new BiConsumer() { // from class: org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                BandSet.lambda$encodeWithPopulationCodec$0(map, arrayList, (Integer) obj, (Integer) obj2);
            }
        });
        if (map.size() > 255) {
            arrayList.sort(new Comparator() { // from class: org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return BandSet.lambda$encodeWithPopulationCodec$1(map, (Integer) obj, (Integer) obj2);
                }
            });
        }
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            map2.put(arrayList.get(i2), Integer.valueOf(i2));
        }
        IntList intList = new IntList();
        int[] iArr2 = new int[iArr.length];
        int i3 = 0;
        while (true) {
            if (i3 >= iArr.length) {
                break;
            }
            Integer num = (Integer) map2.get(Integer.valueOf(iArr[i3]));
            if (num == null) {
                iArr2[i3] = 0;
                intList.add(iArr[i3]);
            } else {
                iArr2[i3] = num.intValue() + 1;
            }
            i3++;
        }
        arrayList.add(arrayList.get(arrayList.size() - 1));
        int[] iArrIntegerListToArray = integerListToArray(arrayList);
        int[] array = intList.toArray();
        BandAnalysisResults bandAnalysisResultsAnalyseBand = analyseBand("POPULATION", iArrIntegerListToArray, bHSDCodec);
        BandAnalysisResults bandAnalysisResultsAnalyseBand2 = analyseBand("POPULATION", array, bHSDCodec);
        int size = arrayList.size() - 1;
        if (size < 256) {
            byte[] bArrEncode2 = Codec.BYTE1.encode(iArr2);
            l = 0;
            codec = null;
            bArr2 = bArrEncode2;
        } else {
            BandAnalysisResults bandAnalysisResultsAnalyseBand3 = analyseBand("POPULATION", iArr2, bHSDCodec);
            codec = bandAnalysisResultsAnalyseBand3.betterCodec;
            byte[] bArr3 = bandAnalysisResultsAnalyseBand3.encodedBand;
            if (codec == null) {
                codec = bHSDCodec;
            }
            BHSDCodec bHSDCodec2 = (BHSDCodec) codec;
            l = bHSDCodec2.getL();
            int h = bHSDCodec2.getH();
            int s = bHSDCodec2.getS();
            int b = bHSDCodec2.getB();
            boolean zIsDelta = bHSDCodec2.isDelta();
            if (s != 0 || zIsDelta) {
                bArr = bArr3;
            } else {
                if (b > 1) {
                    bArr = bArr3;
                    if (new BHSDCodec(b - 1, h).largest() >= size) {
                    }
                    byte[] bArr4 = bandAnalysisResultsAnalyseBand.encodedBand;
                    byte[] bArr5 = bandAnalysisResultsAnalyseBand2.encodedBand;
                    codec2 = bandAnalysisResultsAnalyseBand.betterCodec;
                    codec3 = bandAnalysisResultsAnalyseBand2.betterCodec;
                    int i4 = (codec2 != null ? 0 : 1) + Cea708Decoder.COMMAND_DLY + (i * 4) + (codec3 != null ? 2 : 0);
                    final IntList intList2 = new IntList(3);
                    if (codec2 != null) {
                        IntStream.of(CodecEncoding.getSpecifier(codec2, null)).forEach(new IntConsumer() { // from class: org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda2
                            @Override // java.util.function.IntConsumer
                            public final void accept(int i5) {
                                intList2.add(i5);
                            }
                        });
                    }
                    if (i == 0) {
                        IntStream.of(CodecEncoding.getSpecifier(codec, null)).forEach(new IntConsumer() { // from class: org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda2
                            @Override // java.util.function.IntConsumer
                            public final void accept(int i5) {
                                intList2.add(i5);
                            }
                        });
                    }
                    if (codec3 != null) {
                        IntStream.of(CodecEncoding.getSpecifier(codec3, null)).forEach(new IntConsumer() { // from class: org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda2
                            @Override // java.util.function.IntConsumer
                            public final void accept(int i5) {
                                intList2.add(i5);
                            }
                        });
                    }
                    int[] array2 = intList2.toArray();
                    bArrEncode = Codec.UNSIGNED5.encode(array2);
                    byte[] bArrEncode3 = bHSDCodec.encode(new int[]{!bHSDCodec.isSigned() ? (-1) - i4 : bHSDCodec.getL() + i4});
                    length = bArrEncode3.length + bArr4.length + bArr2.length + bArr5.length;
                    if (bArrEncode.length + length >= bandAnalysisResults.encodedBand.length) {
                        bandAnalysisResults.saved += bandAnalysisResults.encodedBand.length - (bArrEncode.length + length);
                        byte[] bArr6 = new byte[length];
                        System.arraycopy(bArrEncode3, 0, bArr6, 0, bArrEncode3.length);
                        System.arraycopy(bArr4, 0, bArr6, bArrEncode3.length, bArr4.length);
                        System.arraycopy(bArr2, 0, bArr6, bArrEncode3.length + bArr4.length, bArr2.length);
                        System.arraycopy(bArr5, 0, bArr6, bArrEncode3.length + bArr4.length + bArr2.length, bArr5.length);
                        bandAnalysisResults.encodedBand = bArr6;
                        bandAnalysisResults.extraMetadata = array2;
                        if (l != 0) {
                            bandAnalysisResults.betterCodec = new PopulationCodec(codec2, l, codec3);
                            return;
                        } else {
                            bandAnalysisResults.betterCodec = new PopulationCodec(codec2, codec, codec3);
                            return;
                        }
                    }
                    return;
                }
                bArr = bArr3;
                switch (l) {
                    case 4:
                        bArr2 = bArr;
                        break;
                    case 8:
                        bArr2 = bArr;
                        i = 2;
                        break;
                    case 16:
                        bArr2 = bArr;
                        i = 3;
                        break;
                    case 32:
                        i = 4;
                        bArr2 = bArr;
                        break;
                    case 64:
                        i = 5;
                        bArr2 = bArr;
                        break;
                    case 128:
                        i = 6;
                        bArr2 = bArr;
                        break;
                    case 192:
                        i = 7;
                        bArr2 = bArr;
                        break;
                    case 224:
                        i = 8;
                        bArr2 = bArr;
                        break;
                    case 240:
                        i = 9;
                        bArr2 = bArr;
                        break;
                    case SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER /* 248 */:
                        i = 10;
                        bArr2 = bArr;
                        break;
                    case SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER /* 252 */:
                        i = 11;
                        bArr2 = bArr;
                        break;
                }
                byte[] bArr42 = bandAnalysisResultsAnalyseBand.encodedBand;
                byte[] bArr52 = bandAnalysisResultsAnalyseBand2.encodedBand;
                codec2 = bandAnalysisResultsAnalyseBand.betterCodec;
                codec3 = bandAnalysisResultsAnalyseBand2.betterCodec;
                int i42 = (codec2 != null ? 0 : 1) + Cea708Decoder.COMMAND_DLY + (i * 4) + (codec3 != null ? 2 : 0);
                final IntList intList22 = new IntList(3);
                if (codec2 != null) {
                }
                if (i == 0) {
                }
                if (codec3 != null) {
                }
                int[] array22 = intList22.toArray();
                bArrEncode = Codec.UNSIGNED5.encode(array22);
                byte[] bArrEncode32 = bHSDCodec.encode(new int[]{!bHSDCodec.isSigned() ? (-1) - i42 : bHSDCodec.getL() + i42});
                length = bArrEncode32.length + bArr42.length + bArr2.length + bArr52.length;
                if (bArrEncode.length + length >= bandAnalysisResults.encodedBand.length) {
                }
            }
            bArr2 = bArr;
            i = 0;
            byte[] bArr422 = bandAnalysisResultsAnalyseBand.encodedBand;
            byte[] bArr522 = bandAnalysisResultsAnalyseBand2.encodedBand;
            codec2 = bandAnalysisResultsAnalyseBand.betterCodec;
            codec3 = bandAnalysisResultsAnalyseBand2.betterCodec;
            int i422 = (codec2 != null ? 0 : 1) + Cea708Decoder.COMMAND_DLY + (i * 4) + (codec3 != null ? 2 : 0);
            final IntList intList222 = new IntList(3);
            if (codec2 != null) {
            }
            if (i == 0) {
            }
            if (codec3 != null) {
            }
            int[] array222 = intList222.toArray();
            bArrEncode = Codec.UNSIGNED5.encode(array222);
            byte[] bArrEncode322 = bHSDCodec.encode(new int[]{!bHSDCodec.isSigned() ? (-1) - i422 : bHSDCodec.getL() + i422});
            length = bArrEncode322.length + bArr422.length + bArr2.length + bArr522.length;
            if (bArrEncode.length + length >= bandAnalysisResults.encodedBand.length) {
            }
        }
        i = 1;
        byte[] bArr4222 = bandAnalysisResultsAnalyseBand.encodedBand;
        byte[] bArr5222 = bandAnalysisResultsAnalyseBand2.encodedBand;
        codec2 = bandAnalysisResultsAnalyseBand.betterCodec;
        codec3 = bandAnalysisResultsAnalyseBand2.betterCodec;
        int i4222 = (codec2 != null ? 0 : 1) + Cea708Decoder.COMMAND_DLY + (i * 4) + (codec3 != null ? 2 : 0);
        final IntList intList2222 = new IntList(3);
        if (codec2 != null) {
        }
        if (i == 0) {
        }
        if (codec3 != null) {
        }
        int[] array2222 = intList2222.toArray();
        bArrEncode = Codec.UNSIGNED5.encode(array2222);
        byte[] bArrEncode3222 = bHSDCodec.encode(new int[]{!bHSDCodec.isSigned() ? (-1) - i4222 : bHSDCodec.getL() + i4222});
        length = bArrEncode3222.length + bArr4222.length + bArr2.length + bArr5222.length;
        if (bArrEncode.length + length >= bandAnalysisResults.encodedBand.length) {
        }
    }

    public static /* synthetic */ void lambda$encodeWithPopulationCodec$0(Map map, List list, Integer num, Integer num2) {
        if (num2.intValue() > 2 || map.size() < 256) {
            list.add(num);
        }
    }

    public static /* synthetic */ int lambda$encodeWithPopulationCodec$1(Map map, Integer num, Integer num2) {
        return ((Integer) map.get(num2)).compareTo((Integer) map.get(num));
    }

    public byte[] encodeFlags(String str, final long[] jArr, BHSDCodec bHSDCodec, BHSDCodec bHSDCodec2, boolean z) throws Pack200Exception {
        if (!z) {
            int[] iArr = new int[jArr.length];
            Arrays.setAll(iArr, new IntUnaryOperator() { // from class: org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda5
                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i) {
                    return BandSet.lambda$encodeFlags$2(jArr, i);
                }
            });
            return encodeBandInt(str, iArr, bHSDCodec);
        }
        int[] iArr2 = new int[jArr.length];
        int[] iArr3 = new int[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            long j = jArr[i];
            iArr2[i] = (int) (j >> 32);
            iArr3[i] = (int) j;
        }
        byte[] bArrEncodeBandInt = encodeBandInt(str, iArr2, bHSDCodec2);
        byte[] bArrEncodeBandInt2 = encodeBandInt(str, iArr3, bHSDCodec);
        byte[] bArr = new byte[bArrEncodeBandInt.length + bArrEncodeBandInt2.length];
        System.arraycopy(bArrEncodeBandInt, 0, bArr, 0, bArrEncodeBandInt.length);
        System.arraycopy(bArrEncodeBandInt2, 0, bArr, bArrEncodeBandInt.length + 1, bArrEncodeBandInt2.length);
        return bArr;
    }

    public static /* synthetic */ int lambda$encodeFlags$2(long[] jArr, int i) {
        return (int) jArr[i];
    }

    public int[] integerListToArray(List<Integer> list) {
        return list.stream().mapToInt(new ToIntFunction() { // from class: org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda6
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((Integer) obj).intValue();
            }
        }).toArray();
    }

    public long[] longListToArray(List<Long> list) {
        return list.stream().mapToLong(new ToLongFunction() { // from class: org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda4
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((Long) obj).longValue();
            }
        }).toArray();
    }

    public int[] cpEntryListToArray(List<? extends ConstantPoolEntry> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            int index = list.get(i).getIndex();
            iArr[i] = index;
            if (index < 0) {
                throw new IllegalArgumentException("Index should be > 0");
            }
        }
        return iArr;
    }

    public int[] cpEntryOrNullListToArray(List<? extends ConstantPoolEntry> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            ConstantPoolEntry constantPoolEntry = list.get(i);
            iArr[i] = constantPoolEntry == null ? 0 : constantPoolEntry.getIndex() + 1;
            if (constantPoolEntry != null && constantPoolEntry.getIndex() < 0) {
                throw new IllegalArgumentException("Index should be > 0");
            }
        }
        return iArr;
    }

    public byte[] encodeFlags(String str, long[][] jArr, BHSDCodec bHSDCodec, BHSDCodec bHSDCodec2, boolean z) throws Pack200Exception {
        return encodeFlags(str, flatten(jArr), bHSDCodec, bHSDCodec2, z);
    }

    public final long[] flatten(long[][] jArr) {
        int length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        long[] jArr3 = new long[length];
        int i = 0;
        for (long[] jArr4 : jArr) {
            for (long j : jArr4) {
                jArr3[i] = j;
                i++;
            }
        }
        return jArr3;
    }

    public class BandData {
        public final int[] band;
        public Map<Integer, Integer> distinctValues;
        public int largest;
        public int largestDelta;
        public int smallest;
        public int smallestDelta;
        public int deltaIsAscending = 0;
        public int smallDeltaCount = 0;
        public double averageAbsoluteDelta = 0.0d;
        public double averageAbsoluteValue = 0.0d;

        public BandData(int[] iArr) {
            Integer numValueOf;
            this.smallest = Integer.MAX_VALUE;
            this.largest = Integer.MIN_VALUE;
            this.band = iArr;
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                if (i2 < this.smallest) {
                    this.smallest = i2;
                }
                if (i2 > this.largest) {
                    this.largest = i2;
                }
                if (i != 0) {
                    int i3 = i2 - iArr[i - 1];
                    if (i3 < this.smallestDelta) {
                        this.smallestDelta = i3;
                    }
                    if (i3 > this.largestDelta) {
                        this.largestDelta = i3;
                    }
                    if (i3 >= 0) {
                        this.deltaIsAscending++;
                    }
                    this.averageAbsoluteDelta += Math.abs(i3) / (iArr.length - 1);
                    if (Math.abs(i3) < 256) {
                        this.smallDeltaCount++;
                    }
                } else {
                    int i4 = iArr[0];
                    this.smallestDelta = i4;
                    this.largestDelta = i4;
                }
                this.averageAbsoluteValue += Math.abs(iArr[i]) / iArr.length;
                if (BandSet.this.effort > 3) {
                    if (this.distinctValues == null) {
                        this.distinctValues = new HashMap();
                    }
                    Integer numValueOf2 = Integer.valueOf(iArr[i]);
                    Integer num = this.distinctValues.get(numValueOf2);
                    if (num == null) {
                        numValueOf = 1;
                    } else {
                        numValueOf = Integer.valueOf(num.intValue() + 1);
                    }
                    this.distinctValues.put(numValueOf2, numValueOf);
                }
            }
        }

        public boolean mainlySmallDeltas() {
            return ((float) this.smallDeltaCount) / ((float) this.band.length) > 0.7f;
        }

        public boolean wellCorrelated() {
            return this.averageAbsoluteDelta * 3.1d < this.averageAbsoluteValue;
        }

        public boolean mainlyPositiveDeltas() {
            return ((float) this.deltaIsAscending) / ((float) this.band.length) > 0.95f;
        }

        public boolean anyNegatives() {
            return this.smallest < 0;
        }

        public int numDistinctValues() {
            Map<Integer, Integer> map = this.distinctValues;
            if (map == null) {
                return this.band.length;
            }
            return map.size();
        }
    }

    public class BandAnalysisResults {
        public Codec betterCodec;
        public byte[] encodedBand;
        public int[] extraMetadata;
        public int numCodecsTried = 0;
        public int saved = 0;

        public BandAnalysisResults() {
        }

        public static /* synthetic */ int access$408(BandAnalysisResults bandAnalysisResults) {
            int i = bandAnalysisResults.numCodecsTried;
            bandAnalysisResults.numCodecsTried = i + 1;
            return i;
        }
    }
}
