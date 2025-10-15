package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.C2732C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import androidx.media3.extractor.mp4.Atom;
import androidx.media3.extractor.mp4.FixedSampleSizeRechunker;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* loaded from: classes.dex */
public final class AtomParsers {
    public static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    public static final String TAG = "AtomParsers";
    public static final int TYPE_clcp = 1668047728;
    public static final int TYPE_mdta = 1835299937;
    public static final int TYPE_meta = 1835365473;
    public static final int TYPE_nclc = 1852009571;
    public static final int TYPE_nclx = 1852009592;
    public static final int TYPE_sbtl = 1935832172;
    public static final int TYPE_soun = 1936684398;
    public static final int TYPE_subt = 1937072756;
    public static final int TYPE_text = 1952807028;
    public static final int TYPE_vide = 1986618469;
    public static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    public static boolean canTrimSamplesWithTimestampChange(int i) {
        return i != 1;
    }

    public static int getTrackTypeForHdlr(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2, Function<Track, Track> function) throws ParserException {
        Track trackApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerAtom.containerChildren.size(); i++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i);
            if (containerAtom2.type == 1953653099 && (trackApply = function.apply(parseTrak(containerAtom2, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(trackApply, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_mdia))).getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i = parsableByteArray.readInt();
            int i2 = parsableByteArray.readInt();
            if (i2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + i));
            } else if (i2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, position + i));
            } else if (i2 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + i);
        }
        return metadata;
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long unsignedInt;
        long unsignedInt2;
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
            unsignedInt2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = parsableByteArray.readLong();
            unsignedInt2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(unsignedInt, unsignedInt2, parsableByteArray.readUnsignedInt());
    }

    @Nullable
    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_hdlr);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_keys);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_ilst);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != 1835299937) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int i = parsableByteArray.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i2] = parsableByteArray.readString(i3 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i4 = parsableByteArray2.readInt();
            int i5 = parsableByteArray2.readInt() - 1;
            if (i5 >= 0 && i5 < i) {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i4, strArr[i5]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            } else {
                Log.m635w(TAG, "Skipped metadata with unknown key index: " + i5);
            }
            parsableByteArray2.setPosition(position + i4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    @Nullable
    public static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        Atom.LeafAtom leafAtom2;
        long j2;
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair<long[], long[]> edts;
        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom.getContainerAtomOfType(Atom.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd))).data);
        long jScaleLargeTimestamp = C2732C.TIME_UNSET;
        if (j == C2732C.TIME_UNSET) {
            leafAtom2 = leafAtom;
            j2 = tkhd.duration;
        } else {
            leafAtom2 = leafAtom;
            j2 = j;
        }
        long j3 = parseMvhd(leafAtom2.data).timescale;
        if (j2 != C2732C.TIME_UNSET) {
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j2, 1000000L, j3);
        }
        long j4 = jScaleLargeTimestamp;
        Atom.ContainerAtom containerAtom3 = (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl));
        Pair<Long, String> mdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_mdhd))).data);
        Atom.LeafAtom leafAtomOfType = containerAtom3.getLeafAtomOfType(Atom.TYPE_stsd);
        if (leafAtomOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData stsd = parseStsd(leafAtomOfType.data, tkhd.f331id, tkhd.rotationDegrees, (String) mdhd.second, drmInitData, z2);
        if (z || (containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_edts)) == null || (edts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        return new Track(tkhd.f331id, trackTypeForHdlr, ((Long) mdhd.first).longValue(), j3, j4, stsd.format, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x042b A[EDGE_INSN: B:215:0x042b->B:170:0x042b BREAK  A[LOOP:2: B:153:0x03ca->B:169:0x0424], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int unsignedIntToInt3;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        Track track2;
        int i7;
        long[] jArr;
        int[] iArr;
        int i8;
        long j;
        long[] jArr2;
        int[] iArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        long[] jArr3;
        int i13;
        boolean z4;
        int i14;
        long[] jArr4;
        int i15;
        long[] jArr5;
        int[] iArr3;
        int i16;
        boolean z5;
        int i17;
        int i18;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_stsz);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType, track.format);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_stz2);
            if (leafAtomOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stco);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_co64));
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_stsc))).data;
        ParsableByteArray parsableByteArray3 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_stts))).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stss);
        ParsableByteArray parsableByteArray4 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_ctts);
        ParsableByteArray parsableByteArray5 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int unsignedIntToInt4 = parsableByteArray3.readUnsignedIntToInt() - 1;
        int unsignedIntToInt5 = parsableByteArray3.readUnsignedIntToInt();
        int unsignedIntToInt6 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            unsignedIntToInt = parsableByteArray5.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            unsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt();
            if (unsignedIntToInt3 > 0) {
                unsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt() - 1;
            } else {
                unsignedIntToInt2 = -1;
                parsableByteArray4 = null;
            }
        } else {
            unsignedIntToInt2 = -1;
            unsignedIntToInt3 = 0;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = track.format.sampleMimeType;
        if (fixedSampleSize == -1 || !((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && unsignedIntToInt4 == 0 && unsignedIntToInt == 0 && unsignedIntToInt3 == 0)) {
            i = unsignedIntToInt3;
            z2 = false;
        } else {
            i = unsignedIntToInt3;
            z2 = true;
        }
        if (z2) {
            int i19 = chunkIterator.length;
            long[] jArr6 = new long[i19];
            int[] iArr4 = new int[i19];
            while (chunkIterator.moveNext()) {
                int i20 = chunkIterator.index;
                jArr6[i20] = chunkIterator.offset;
                iArr4[i20] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results resultsRechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr6, iArr4, unsignedIntToInt6);
            long[] jArr7 = resultsRechunk.offsets;
            int[] iArr5 = resultsRechunk.sizes;
            int i21 = resultsRechunk.maximumSize;
            long[] jArr8 = resultsRechunk.timestamps;
            int[] iArr6 = resultsRechunk.flags;
            long j2 = resultsRechunk.duration;
            track2 = track;
            i7 = sampleCount;
            jArr = jArr7;
            iArr = iArr5;
            i8 = i21;
            iArr2 = iArr6;
            j = j2;
            jArr2 = jArr8;
        } else {
            long[] jArrCopyOf = new long[sampleCount];
            int[] iArrCopyOf = new int[sampleCount];
            long[] jArrCopyOf2 = new long[sampleCount];
            int[] iArrCopyOf2 = new int[sampleCount];
            int unsignedIntToInt7 = unsignedIntToInt2;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int unsignedIntToInt8 = 0;
            long j3 = 0;
            long j4 = 0;
            int i26 = unsignedIntToInt;
            int i27 = unsignedIntToInt6;
            int i28 = unsignedIntToInt5;
            int i29 = unsignedIntToInt4;
            int i30 = i;
            while (true) {
                i2 = i29;
                if (i22 >= sampleCount) {
                    i3 = i28;
                    i4 = i24;
                    i5 = i25;
                    break;
                }
                long j5 = j4;
                int i31 = i24;
                boolean zMoveNext = true;
                while (i31 == 0) {
                    zMoveNext = chunkIterator.moveNext();
                    if (!zMoveNext) {
                        break;
                    }
                    int i32 = i28;
                    long j6 = chunkIterator.offset;
                    i31 = chunkIterator.numSamples;
                    j5 = j6;
                    i28 = i32;
                    i27 = i27;
                    sampleCount = sampleCount;
                }
                int i33 = sampleCount;
                i3 = i28;
                int i34 = i27;
                if (!zMoveNext) {
                    Log.m635w(TAG, "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i22);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i22);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i22);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i22);
                    sampleCount = i22;
                    i5 = i25;
                    i4 = i31;
                    break;
                }
                if (parsableByteArray5 != null) {
                    while (unsignedIntToInt8 == 0 && i26 > 0) {
                        unsignedIntToInt8 = parsableByteArray5.readUnsignedIntToInt();
                        i25 = parsableByteArray5.readInt();
                        i26--;
                    }
                    unsignedIntToInt8--;
                }
                int i35 = i25;
                jArrCopyOf[i22] = j5;
                int nextSampleSize = stz2SampleSizeBox.readNextSampleSize();
                iArrCopyOf[i22] = nextSampleSize;
                if (nextSampleSize > i23) {
                    i23 = nextSampleSize;
                }
                jArrCopyOf2[i22] = j3 + i35;
                iArrCopyOf2[i22] = parsableByteArray4 == null ? 1 : 0;
                if (i22 == unsignedIntToInt7) {
                    iArrCopyOf2[i22] = 1;
                    i30--;
                    if (i30 > 0) {
                        unsignedIntToInt7 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                    }
                }
                int i36 = unsignedIntToInt7;
                j3 += i34;
                int unsignedIntToInt9 = i3 - 1;
                if (unsignedIntToInt9 != 0 || i2 <= 0) {
                    i9 = i34;
                    i10 = i2;
                } else {
                    unsignedIntToInt9 = parsableByteArray3.readUnsignedIntToInt();
                    i9 = parsableByteArray3.readInt();
                    i10 = i2 - 1;
                }
                int i37 = unsignedIntToInt9;
                long j7 = j5 + iArrCopyOf[i22];
                int i38 = i31 - 1;
                i22++;
                j4 = j7;
                unsignedIntToInt7 = i36;
                i27 = i9;
                i24 = i38;
                sampleCount = i33;
                i25 = i35;
                i29 = i10;
                i28 = i37;
            }
            long j8 = j3 + i5;
            if (parsableByteArray5 != null) {
                while (i26 > 0) {
                    if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                        z3 = false;
                        break;
                    }
                    parsableByteArray5.readInt();
                    i26--;
                }
                z3 = true;
                if (i30 != 0 && i3 == 0 && i4 == 0 && i2 == 0) {
                    i6 = unsignedIntToInt8;
                    if (i6 == 0 && z3) {
                        track2 = track;
                    }
                    i7 = sampleCount;
                    jArr = jArrCopyOf;
                    iArr = iArrCopyOf;
                    i8 = i23;
                    j = j8;
                    jArr2 = jArrCopyOf2;
                    iArr2 = iArrCopyOf2;
                } else {
                    i6 = unsignedIntToInt8;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent stbl box for track ");
                track2 = track;
                sb.append(track2.f332id);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i30);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i3);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i4);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i2);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i6);
                sb.append(z3 ? ", ctts invalid" : "");
                Log.m635w(TAG, sb.toString());
                i7 = sampleCount;
                jArr = jArrCopyOf;
                iArr = iArrCopyOf;
                i8 = i23;
                j = j8;
                jArr2 = jArrCopyOf2;
                iArr2 = iArrCopyOf2;
            } else {
                z3 = true;
                if (i30 != 0) {
                    i6 = unsignedIntToInt8;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Inconsistent stbl box for track ");
                    track2 = track;
                    sb2.append(track2.f332id);
                    sb2.append(": remainingSynchronizationSamples ");
                    sb2.append(i30);
                    sb2.append(", remainingSamplesAtTimestampDelta ");
                    sb2.append(i3);
                    sb2.append(", remainingSamplesInChunk ");
                    sb2.append(i4);
                    sb2.append(", remainingTimestampDeltaChanges ");
                    sb2.append(i2);
                    sb2.append(", remainingSamplesAtTimestampOffset ");
                    sb2.append(i6);
                    sb2.append(z3 ? ", ctts invalid" : "");
                    Log.m635w(TAG, sb2.toString());
                    i7 = sampleCount;
                    jArr = jArrCopyOf;
                    iArr = iArrCopyOf;
                    i8 = i23;
                    j = j8;
                    jArr2 = jArrCopyOf2;
                    iArr2 = iArrCopyOf2;
                }
            }
        }
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track2.timescale);
        long[] jArr9 = track2.editListDurations;
        if (jArr9 == null) {
            Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
            return new TrackSampleTable(track, jArr, iArr, i8, jArr2, iArr2, jScaleLargeTimestamp);
        }
        if (jArr9.length == 1 && track2.type == 1 && jArr2.length >= 2) {
            long j9 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
            long jScaleLargeTimestamp2 = j9 + Util.scaleLargeTimestamp(track2.editListDurations[0], track2.timescale, track2.movieTimescale);
            i11 = i7;
            if (canApplyEditWithGaplessInfo(jArr2, j, j9, jScaleLargeTimestamp2)) {
                long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(j9 - jArr2[0], track2.format.sampleRate, track2.timescale);
                i12 = i8;
                long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j - jScaleLargeTimestamp2, track2.format.sampleRate, track2.timescale);
                if ((jScaleLargeTimestamp3 != 0 || jScaleLargeTimestamp4 != 0) && jScaleLargeTimestamp3 <= ParserMinimalBase.MAX_INT_L && jScaleLargeTimestamp4 <= ParserMinimalBase.MAX_INT_L) {
                    gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                    return new TrackSampleTable(track, jArr, iArr, i12, jArr2, iArr2, Util.scaleLargeTimestamp(track2.editListDurations[0], 1000000L, track2.movieTimescale));
                }
            }
            jArr3 = track2.editListDurations;
            if (jArr3.length != 1 && jArr3[0] == 0) {
                long j10 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
                for (int i39 = 0; i39 < jArr2.length; i39++) {
                    jArr2[i39] = Util.scaleLargeTimestamp(jArr2[i39] - j10, 1000000L, track2.timescale);
                }
                return new TrackSampleTable(track, jArr, iArr, i12, jArr2, iArr2, Util.scaleLargeTimestamp(j - j10, 1000000L, track2.timescale));
            }
            boolean z6 = track2.type != 1;
            int[] iArr7 = new int[jArr3.length];
            int[] iArr8 = new int[jArr3.length];
            long[] jArr10 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
            i13 = 0;
            z4 = false;
            int i40 = 0;
            i14 = 0;
            while (true) {
                jArr4 = track2.editListDurations;
                if (i13 < jArr4.length) {
                    break;
                }
                long[] jArr11 = jArr;
                int[] iArr9 = iArr;
                long j11 = jArr10[i13];
                if (j11 != -1) {
                    int i41 = i14;
                    boolean z7 = z4;
                    int i42 = i40;
                    long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(jArr4[i13], track2.timescale, track2.movieTimescale);
                    iArr7[i13] = Util.binarySearchFloor(jArr2, j11, true, true);
                    iArr8[i13] = Util.binarySearchCeil(jArr2, j11 + jScaleLargeTimestamp5, z6, false);
                    while (true) {
                        i18 = iArr7[i13];
                        i17 = iArr8[i13];
                        if (i18 >= i17 || (iArr2[i18] & 1) != 0) {
                            break;
                        }
                        iArr7[i13] = i18 + 1;
                    }
                    i40 = i42 + (i17 - i18);
                    z5 = z7 | (i41 != i18);
                } else {
                    z5 = z4;
                    i17 = i14;
                }
                i13++;
                z4 = z5;
                i14 = i17;
                jArr = jArr11;
                iArr = iArr9;
            }
            long[] jArr12 = jArr;
            int[] iArr10 = iArr;
            boolean z8 = z4;
            i15 = 0;
            boolean z9 = z8 | (i40 != i11);
            long[] jArr13 = !z9 ? new long[i40] : jArr12;
            int[] iArr11 = !z9 ? new int[i40] : iArr10;
            int i43 = !z9 ? 0 : i12;
            int[] iArr12 = !z9 ? new int[i40] : iArr2;
            long[] jArr14 = new long[i40];
            int i44 = i43;
            int[] iArr13 = iArr10;
            long j12 = 0;
            int i45 = 0;
            while (i15 < track2.editListDurations.length) {
                long j13 = track2.editListMediaTimes[i15];
                int i46 = iArr7[i15];
                int[] iArr14 = iArr7;
                int i47 = iArr8[i15];
                int[] iArr15 = iArr8;
                if (z9) {
                    int i48 = i47 - i46;
                    System.arraycopy(jArr12, i46, jArr13, i45, i48);
                    jArr5 = jArr12;
                    iArr3 = iArr13;
                    System.arraycopy(iArr3, i46, iArr11, i45, i48);
                    System.arraycopy(iArr2, i46, iArr12, i45, i48);
                } else {
                    jArr5 = jArr12;
                    iArr3 = iArr13;
                }
                int i49 = i44;
                while (i46 < i47) {
                    int i50 = i49;
                    int i51 = i47;
                    long jScaleLargeTimestamp6 = Util.scaleLargeTimestamp(j12, 1000000L, track2.movieTimescale);
                    long[] jArr15 = jArr2;
                    int[] iArr16 = iArr2;
                    long jScaleLargeTimestamp7 = Util.scaleLargeTimestamp(jArr2[i46] - j13, 1000000L, track2.timescale);
                    int[] iArr17 = iArr12;
                    long j14 = j12;
                    if (canTrimSamplesWithTimestampChange(track2.type)) {
                        jScaleLargeTimestamp7 = Math.max(0L, jScaleLargeTimestamp7);
                    }
                    jArr14[i45] = jScaleLargeTimestamp6 + jScaleLargeTimestamp7;
                    if (z9) {
                        i16 = i50;
                        if (iArr11[i45] > i16) {
                            i49 = iArr3[i46];
                        }
                        i45++;
                        i46++;
                        i47 = i51;
                        jArr2 = jArr15;
                        iArr2 = iArr16;
                        j12 = j14;
                        iArr12 = iArr17;
                    } else {
                        i16 = i50;
                    }
                    i49 = i16;
                    i45++;
                    i46++;
                    i47 = i51;
                    jArr2 = jArr15;
                    iArr2 = iArr16;
                    j12 = j14;
                    iArr12 = iArr17;
                }
                long[] jArr16 = jArr2;
                long j15 = j12 + track2.editListDurations[i15];
                i15++;
                i44 = i49;
                iArr13 = iArr3;
                j12 = j15;
                iArr7 = iArr14;
                jArr2 = jArr16;
                iArr2 = iArr2;
                iArr8 = iArr15;
                jArr12 = jArr5;
                iArr12 = iArr12;
            }
            return new TrackSampleTable(track, jArr13, iArr11, i44, jArr14, iArr12, Util.scaleLargeTimestamp(j12, 1000000L, track2.movieTimescale));
        }
        i11 = i7;
        i12 = i8;
        jArr3 = track2.editListDurations;
        if (jArr3.length != 1) {
        }
        if (track2.type != 1) {
        }
        int[] iArr72 = new int[jArr3.length];
        int[] iArr82 = new int[jArr3.length];
        long[] jArr102 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
        i13 = 0;
        z4 = false;
        int i402 = 0;
        i14 = 0;
        while (true) {
            jArr4 = track2.editListDurations;
            if (i13 < jArr4.length) {
            }
            i13++;
            z4 = z5;
            i14 = i17;
            jArr = jArr11;
            iArr = iArr9;
        }
        long[] jArr122 = jArr;
        int[] iArr102 = iArr;
        boolean z82 = z4;
        i15 = 0;
        boolean z92 = z82 | (i402 != i11);
        if (!z92) {
        }
        if (!z92) {
        }
        if (!z92) {
        }
        if (!z92) {
        }
        long[] jArr142 = new long[i402];
        int i442 = i43;
        int[] iArr132 = iArr102;
        long j122 = 0;
        int i452 = 0;
        while (i15 < track2.editListDurations.length) {
        }
        return new TrackSampleTable(track, jArr13, iArr11, i442, jArr142, iArr12, Util.scaleLargeTimestamp(j122, 1000000L, track2.movieTimescale));
    }

    @Nullable
    public static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i2);
            }
            parsableByteArray.setPosition(position + i2);
        }
        return null;
    }

    @Nullable
    public static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Nullable
    public static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short s = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String string = parsableByteArray.readString(s);
        int iMax = Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(string.substring(0, iMax)), Float.parseFloat(string.substring(iMax, string.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i2 = fullAtomVersion == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j = C2732C.TIME_UNSET;
            if (i4 < i2) {
                if (parsableByteArray.getData()[position + i4] != -1) {
                    long unsignedInt = fullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                    if (unsignedInt != 0) {
                        j = unsignedInt;
                    }
                } else {
                    i4++;
                }
            } else {
                parsableByteArray.skipBytes(i2);
                break;
            }
        }
        parsableByteArray.skipBytes(16);
        int i5 = parsableByteArray.readInt();
        int i6 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i7 = parsableByteArray.readInt();
        int i8 = parsableByteArray.readInt();
        if (i5 == 0 && i6 == 65536 && i7 == -65536 && i8 == 0) {
            i3 = 90;
        } else if (i5 == 0 && i6 == -65536 && i7 == 65536 && i8 == 0) {
            i3 = BottomAppBarTopEdgeTreatment.ANGLE_UP;
        } else if (i5 == -65536 && i6 == 0 && i7 == 0 && i8 == -65536) {
            i3 = 180;
        }
        return new TkhdData(i, j, i3);
    }

    public static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    public static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(unsignedInt), "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    public static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, @Nullable DrmInitData drmInitData, boolean z) throws ParserException {
        int i3;
        parsableByteArray.setPosition(12);
        int i4 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            int position = parsableByteArray.getPosition();
            int i6 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i6 > 0, "childAtomSize must be positive");
            int i7 = parsableByteArray.readInt();
            if (i7 == 1635148593 || i7 == 1635148595 || i7 == 1701733238 || i7 == 1831958048 || i7 == 1836070006 || i7 == 1752589105 || i7 == 1751479857 || i7 == 1932670515 || i7 == 1211250227 || i7 == 1987063864 || i7 == 1987063865 || i7 == 1635135537 || i7 == 1685479798 || i7 == 1685479729 || i7 == 1685481573 || i7 == 1685481521) {
                i3 = position;
                parseVideoSampleEntry(parsableByteArray, i7, i3, i6, i, i2, drmInitData, stsdData, i5);
            } else if (i7 == 1836069985 || i7 == 1701733217 || i7 == 1633889587 || i7 == 1700998451 || i7 == 1633889588 || i7 == 1835823201 || i7 == 1685353315 || i7 == 1685353317 || i7 == 1685353320 || i7 == 1685353324 || i7 == 1685353336 || i7 == 1935764850 || i7 == 1935767394 || i7 == 1819304813 || i7 == 1936684916 || i7 == 1953984371 || i7 == 778924082 || i7 == 778924083 || i7 == 1835557169 || i7 == 1835560241 || i7 == 1634492771 || i7 == 1634492791 || i7 == 1970037111 || i7 == 1332770163 || i7 == 1716281667) {
                i3 = position;
                parseAudioSampleEntry(parsableByteArray, i7, position, i6, i, str, z, drmInitData, stsdData, i5);
            } else {
                if (i7 == 1414810956 || i7 == 1954034535 || i7 == 2004251764 || i7 == 1937010800 || i7 == 1664495672) {
                    parseTextSampleEntry(parsableByteArray, i7, position, i6, i, str, stsdData);
                } else if (i7 == 1835365492) {
                    parseMetaDataSampleEntry(parsableByteArray, i7, position, i, stsdData);
                } else if (i7 == 1667329389) {
                    stsdData.format = new Format.Builder().setId(i).setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION).build();
                }
                i3 = position;
            }
            parsableByteArray.setPosition(i3 + i6);
        }
        return stsdData;
    }

    public static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        ImmutableList immutableListM1172of = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableListM1172of = ImmutableList.m1172of(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableListM1172of).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, @Nullable DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        String str;
        String str2;
        DrmInitData drmInitData2;
        int i7;
        int i8;
        float f;
        int i9;
        int i10;
        int i11;
        String str3;
        int i12 = i2;
        int i13 = i3;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i12 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i12, i13);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i6] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str4 = MimeTypes.VIDEO_H263;
        if (iIntValue != 1831958048) {
            str = iIntValue == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        } else {
            str = MimeTypes.VIDEO_MPEG;
        }
        float paspFromParent = 1.0f;
        int i14 = 8;
        int i15 = 8;
        List listM1172of = null;
        String str5 = null;
        byte[] projFromParent = null;
        int i16 = -1;
        int iIsoColorPrimariesToColorSpace = -1;
        int i17 = -1;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        EsdsData esdsFromParent = null;
        boolean z = false;
        while (position - i12 < i13) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i18 = parsableByteArray.readInt();
            if (i18 == 0) {
                str2 = str4;
                if (parsableByteArray.getPosition() - i12 == i13) {
                    break;
                }
            } else {
                str2 = str4;
            }
            ExtractorUtil.checkContainerInput(i18 > 0, "childAtomSize must be positive");
            int i19 = parsableByteArray.readInt();
            if (i19 == 1635148611) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                List list = avcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                String str6 = avcConfig.codecs;
                int i20 = avcConfig.colorSpace;
                int i21 = avcConfig.colorRange;
                int i22 = avcConfig.colorTransfer;
                int i23 = avcConfig.bitdepthLuma;
                drmInitData2 = drmInitDataCopyWithSchemeType;
                i7 = iIntValue;
                str5 = str6;
                iIsoColorPrimariesToColorSpace = i20;
                i17 = i21;
                iIsoTransferCharacteristicsToColorTransfer = i22;
                i15 = avcConfig.bitdepthChroma;
                i14 = i23;
                str3 = MimeTypes.VIDEO_H264;
                listM1172of = list;
            } else {
                if (i19 == 1752589123) {
                    ExtractorUtil.checkContainerInput(str == null, null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                    List list2 = hevcConfig.initializationData;
                    stsdData2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    if (!z) {
                        paspFromParent = hevcConfig.pixelWidthHeightRatio;
                    }
                    String str7 = hevcConfig.codecs;
                    int i24 = hevcConfig.colorSpace;
                    int i25 = hevcConfig.colorRange;
                    int i26 = hevcConfig.colorTransfer;
                    i14 = hevcConfig.bitdepthLuma;
                    int i27 = hevcConfig.bitdepthChroma;
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    str5 = str7;
                    i7 = iIntValue;
                    iIsoColorPrimariesToColorSpace = i24;
                    i17 = i25;
                    iIsoTransferCharacteristicsToColorTransfer = i26;
                    str = MimeTypes.VIDEO_H265;
                    i15 = i27;
                    listM1172of = list2;
                } else {
                    if (i19 == 1685480259 || i19 == 1685485123) {
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                        i7 = iIntValue;
                        i8 = i15;
                        f = paspFromParent;
                        i9 = i14;
                        i10 = iIsoColorPrimariesToColorSpace;
                        i11 = iIsoTransferCharacteristicsToColorTransfer;
                        DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                        if (dolbyVisionConfig != null) {
                            str5 = dolbyVisionConfig.codecs;
                            str = MimeTypes.VIDEO_DOLBY_VISION;
                        }
                    } else if (i19 == 1987076931) {
                        ExtractorUtil.checkContainerInput(str == null, null);
                        String str8 = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                        parsableByteArray.setPosition(position2 + 12);
                        parsableByteArray.skipBytes(2);
                        int unsignedByte = parsableByteArray.readUnsignedByte();
                        int i28 = unsignedByte >> 4;
                        boolean z2 = (unsignedByte & 1) != 0;
                        int unsignedByte2 = parsableByteArray.readUnsignedByte();
                        int unsignedByte3 = parsableByteArray.readUnsignedByte();
                        iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedByte2);
                        i17 = z2 ? 1 : 2;
                        iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedByte3);
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                        i15 = i28;
                        i14 = i15;
                        i7 = iIntValue;
                        str = str8;
                    } else if (i19 == 1635135811) {
                        parsableByteArray.setPosition(position2 + 8);
                        ColorInfo av1c = parseAv1c(parsableByteArray);
                        int i29 = av1c.lumaBitdepth;
                        int i30 = av1c.chromaBitdepth;
                        int i31 = av1c.colorSpace;
                        int i32 = av1c.colorRange;
                        iIsoTransferCharacteristicsToColorTransfer = av1c.colorTransfer;
                        i14 = i29;
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                        i7 = iIntValue;
                        iIsoColorPrimariesToColorSpace = i31;
                        i17 = i32;
                        str3 = MimeTypes.VIDEO_AV1;
                        i15 = i30;
                    } else if (i19 == 1668050025) {
                        if (byteBufferAllocateHdrStaticInfo == null) {
                            byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                        }
                        ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                        byteBuffer.position(21);
                        byteBuffer.putShort(parsableByteArray.readShort());
                        byteBuffer.putShort(parsableByteArray.readShort());
                        byteBufferAllocateHdrStaticInfo = byteBuffer;
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                        i7 = iIntValue;
                    } else if (i19 == 1835295606) {
                        if (byteBufferAllocateHdrStaticInfo == null) {
                            byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                        }
                        ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                        short s = parsableByteArray.readShort();
                        short s2 = parsableByteArray.readShort();
                        short s3 = parsableByteArray.readShort();
                        i7 = iIntValue;
                        short s4 = parsableByteArray.readShort();
                        short s5 = parsableByteArray.readShort();
                        int i33 = i15;
                        short s6 = parsableByteArray.readShort();
                        int i34 = i14;
                        short s7 = parsableByteArray.readShort();
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                        short s8 = parsableByteArray.readShort();
                        long unsignedInt = parsableByteArray.readUnsignedInt();
                        long unsignedInt2 = parsableByteArray.readUnsignedInt();
                        byteBuffer2.position(1);
                        byteBuffer2.putShort(s5);
                        byteBuffer2.putShort(s6);
                        byteBuffer2.putShort(s);
                        byteBuffer2.putShort(s2);
                        byteBuffer2.putShort(s3);
                        byteBuffer2.putShort(s4);
                        byteBuffer2.putShort(s7);
                        byteBuffer2.putShort(s8);
                        byteBuffer2.putShort((short) (unsignedInt / 10000));
                        byteBuffer2.putShort((short) (unsignedInt2 / 10000));
                        byteBufferAllocateHdrStaticInfo = byteBuffer2;
                        i15 = i33;
                        i14 = i34;
                        paspFromParent = paspFromParent;
                    } else {
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                        i7 = iIntValue;
                        i8 = i15;
                        f = paspFromParent;
                        i9 = i14;
                        if (i19 == 1681012275) {
                            ExtractorUtil.checkContainerInput(str == null, null);
                            str = str2;
                        } else if (i19 == 1702061171) {
                            ExtractorUtil.checkContainerInput(str == null, null);
                            esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                            String str9 = esdsFromParent.mimeType;
                            byte[] bArr = esdsFromParent.initializationData;
                            if (bArr != null) {
                                listM1172of = ImmutableList.m1172of(bArr);
                            }
                            str = str9;
                        } else if (i19 == 1885434736) {
                            paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                            i15 = i8;
                            i14 = i9;
                            z = true;
                        } else if (i19 == 1937126244) {
                            projFromParent = parseProjFromParent(parsableByteArray, position2, i18);
                        } else if (i19 == 1936995172) {
                            int unsignedByte4 = parsableByteArray.readUnsignedByte();
                            parsableByteArray.skipBytes(3);
                            if (unsignedByte4 == 0) {
                                int unsignedByte5 = parsableByteArray.readUnsignedByte();
                                if (unsignedByte5 == 0) {
                                    i16 = 0;
                                } else if (unsignedByte5 == 1) {
                                    i16 = 1;
                                } else if (unsignedByte5 == 2) {
                                    i16 = 2;
                                } else if (unsignedByte5 == 3) {
                                    i16 = 3;
                                }
                            }
                        } else if (i19 == 1668246642) {
                            i10 = iIsoColorPrimariesToColorSpace;
                            i11 = iIsoTransferCharacteristicsToColorTransfer;
                            if (i10 == -1 && i11 == -1) {
                                int i35 = parsableByteArray.readInt();
                                if (i35 == 1852009592 || i35 == 1852009571) {
                                    int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                    parsableByteArray.skipBytes(2);
                                    boolean z3 = i18 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                    iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                    i17 = z3 ? 1 : 2;
                                    iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                    i15 = i8;
                                    i14 = i9;
                                    paspFromParent = f;
                                } else {
                                    Log.m635w(TAG, "Unsupported color type: " + Atom.getAtomTypeString(i35));
                                }
                            }
                        } else {
                            i10 = iIsoColorPrimariesToColorSpace;
                            i11 = iIsoTransferCharacteristicsToColorTransfer;
                        }
                        i15 = i8;
                        i14 = i9;
                        paspFromParent = f;
                    }
                    iIsoColorPrimariesToColorSpace = i10;
                    iIsoTransferCharacteristicsToColorTransfer = i11;
                    i15 = i8;
                    i14 = i9;
                    paspFromParent = f;
                }
                position += i18;
                i12 = i2;
                i13 = i3;
                stsdData2 = stsdData;
                str4 = str2;
                iIntValue = i7;
                drmInitDataCopyWithSchemeType = drmInitData2;
            }
            str = str3;
            position += i18;
            i12 = i2;
            i13 = i3;
            stsdData2 = stsdData;
            str4 = str2;
            iIntValue = i7;
            drmInitDataCopyWithSchemeType = drmInitData2;
        }
        DrmInitData drmInitData3 = drmInitDataCopyWithSchemeType;
        int i36 = i15;
        float f2 = paspFromParent;
        int i37 = i14;
        int i38 = iIsoColorPrimariesToColorSpace;
        int i39 = iIsoTransferCharacteristicsToColorTransfer;
        if (str == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(i4).setSampleMimeType(str).setCodecs(str5).setWidth(unsignedShort).setHeight(unsignedShort2).setPixelWidthHeightRatio(f2).setRotationDegrees(i5).setProjectionData(projFromParent).setStereoMode(i16).setInitializationData(listM1172of).setDrmInitData(drmInitData3).setColorInfo(new ColorInfo.Builder().setColorSpace(i38).setColorRange(i17).setColorTransfer(i39).setHdrStaticInfo(byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null).setLumaBitdepth(i37).setChromaBitdepth(i36).build());
        if (esdsFromParent != null) {
            colorInfo.setAverageBitrate(Ints.saturatedCast(esdsFromParent.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsFromParent.peakBitrate));
        }
        stsdData.format = colorInfo.build();
    }

    public static ColorInfo parseAv1c(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(3);
        parsableBitArray.skipBits(6);
        boolean bit = parsableBitArray.readBit();
        boolean bit2 = parsableBitArray.readBit();
        if (bits == 2 && bit) {
            builder.setLumaBitdepth(bit2 ? 12 : 10);
            builder.setChromaBitdepth(bit2 ? 12 : 10);
        } else if (bits <= 2) {
            builder.setLumaBitdepth(bit ? 10 : 8);
            builder.setChromaBitdepth(bit ? 10 : 8);
        }
        parsableBitArray.skipBits(13);
        parsableBitArray.skipBit();
        int bits2 = parsableBitArray.readBits(4);
        if (bits2 != 1) {
            Log.m633i(TAG, "Unsupported obu_type: " + bits2);
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.m633i(TAG, "Unsupported obu_extension_flag");
            return builder.build();
        }
        boolean bit3 = parsableBitArray.readBit();
        parsableBitArray.skipBit();
        if (bit3 && parsableBitArray.readBits(8) > 127) {
            Log.m633i(TAG, "Excessive obu_size");
            return builder.build();
        }
        int bits3 = parsableBitArray.readBits(3);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            Log.m633i(TAG, "Unsupported reduced_still_picture_header");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.m633i(TAG, "Unsupported timing_info_present_flag");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.m633i(TAG, "Unsupported initial_display_delay_present_flag");
            return builder.build();
        }
        int bits4 = parsableBitArray.readBits(5);
        boolean z = false;
        for (int i = 0; i <= bits4; i++) {
            parsableBitArray.skipBits(12);
            if (parsableBitArray.readBits(5) > 7) {
                parsableBitArray.skipBit();
            }
        }
        int bits5 = parsableBitArray.readBits(4);
        int bits6 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(bits5 + 1);
        parsableBitArray.skipBits(bits6 + 1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(7);
        }
        parsableBitArray.skipBits(7);
        boolean bit4 = parsableBitArray.readBit();
        if (bit4) {
            parsableBitArray.skipBits(2);
        }
        if ((parsableBitArray.readBit() ? 2 : parsableBitArray.readBits(1)) > 0 && !parsableBitArray.readBit()) {
            parsableBitArray.skipBits(1);
        }
        if (bit4) {
            parsableBitArray.skipBits(3);
        }
        parsableBitArray.skipBits(3);
        boolean bit5 = parsableBitArray.readBit();
        if (bits3 == 2 && bit5) {
            parsableBitArray.skipBit();
        }
        if (bits3 != 1 && parsableBitArray.readBit()) {
            z = true;
        }
        if (parsableBitArray.readBit()) {
            int bits7 = parsableBitArray.readBits(8);
            int bits8 = parsableBitArray.readBits(8);
            builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(bits7)).setColorRange(((z || bits7 != 1 || bits8 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8));
        }
        return builder.build();
    }

    public static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    @Nullable
    public static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i = 0; i < unsignedIntToInt; i++) {
            jArr[i] = fullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = fullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, boolean z, @Nullable DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int unsignedShort;
        int unsignedShort2;
        int unsignedFixedPoint1616;
        int i6;
        int i7;
        String str2;
        String str3;
        int i8;
        String str4;
        char c;
        String str5;
        ImmutableList immutableListM1173of;
        int i9 = i2;
        int i10 = i3;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i9 + 16);
        if (z) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        if (unsignedShort == 0 || unsignedShort == 1) {
            unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            i6 = parsableByteArray.readInt();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            i7 = -1;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            unsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            unsignedShort2 = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(4);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            int unsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            boolean z2 = (unsignedIntToInt2 & 1) != 0;
            boolean z3 = (unsignedIntToInt2 & 2) != 0;
            if (!z2) {
                i7 = unsignedIntToInt == 8 ? 3 : unsignedIntToInt == 16 ? z3 ? 268435456 : 2 : unsignedIntToInt == 24 ? z3 ? C2732C.ENCODING_PCM_24BIT_BIG_ENDIAN : 21 : unsignedIntToInt == 32 ? z3 ? C2732C.ENCODING_PCM_32BIT_BIG_ENDIAN : 22 : -1;
                parsableByteArray.skipBytes(8);
                i6 = 0;
            } else {
                if (unsignedIntToInt == 32) {
                    i7 = 4;
                }
                parsableByteArray.skipBytes(8);
                i6 = 0;
            }
        }
        int position = parsableByteArray.getPosition();
        int iIntValue = i;
        if (iIntValue == 1701733217) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i9, i10);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str6 = MimeTypes.AUDIO_MPEGH_MHM1;
        if (iIntValue == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (iIntValue == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue == 1633889588) {
            str2 = MimeTypes.AUDIO_AC4;
        } else if (iIntValue == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue == 1685353336) {
            str2 = MimeTypes.AUDIO_DTS_X;
        } else if (iIntValue == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (iIntValue == 1935767394) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else {
            str3 = MimeTypes.AUDIO_RAW;
            if (iIntValue != 1936684916) {
                if (iIntValue == 1953984371) {
                    i8 = 268435456;
                } else if (iIntValue == 1819304813) {
                    i8 = i7 == -1 ? 2 : i7;
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = MimeTypes.AUDIO_MPEG;
                } else if (iIntValue == 1835557169) {
                    str2 = MimeTypes.AUDIO_MPEGH_MHA1;
                } else if (iIntValue == 1835560241) {
                    i8 = i7;
                    str3 = MimeTypes.AUDIO_MPEGH_MHM1;
                } else if (iIntValue == 1634492771) {
                    str2 = MimeTypes.AUDIO_ALAC;
                } else if (iIntValue == 1634492791) {
                    str2 = MimeTypes.AUDIO_ALAW;
                } else if (iIntValue == 1970037111) {
                    str2 = MimeTypes.AUDIO_MLAW;
                } else if (iIntValue == 1332770163) {
                    str2 = MimeTypes.AUDIO_OPUS;
                } else if (iIntValue == 1716281667) {
                    str2 = MimeTypes.AUDIO_FLAC;
                } else if (iIntValue == 1835823201) {
                    str2 = MimeTypes.AUDIO_TRUEHD;
                } else {
                    i8 = i7;
                    str3 = null;
                }
            }
            int i11 = i8;
            String str7 = str3;
            List<byte[]> listM1172of = null;
            String str8 = null;
            EsdsData esdsFromParent = null;
            while (position - i9 < i10) {
                parsableByteArray.setPosition(position);
                int i12 = parsableByteArray.readInt();
                ExtractorUtil.checkContainerInput(i12 > 0, "childAtomSize must be positive");
                int i13 = parsableByteArray.readInt();
                if (i13 == 1835557187) {
                    parsableByteArray.setPosition(position + 8);
                    parsableByteArray.skipBytes(1);
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(1);
                    if (Objects.equals(str7, str6)) {
                        str5 = String.format("mhm1.%02X", Integer.valueOf(unsignedByte));
                    } else {
                        str5 = String.format("mha1.%02X", Integer.valueOf(unsignedByte));
                    }
                    String str9 = str5;
                    int unsignedShort3 = parsableByteArray.readUnsignedShort();
                    byte[] bArr = new byte[unsignedShort3];
                    parsableByteArray.readBytes(bArr, 0, unsignedShort3);
                    if (listM1172of == null) {
                        immutableListM1173of = ImmutableList.m1172of(bArr);
                    } else {
                        immutableListM1173of = ImmutableList.m1173of(bArr, listM1172of.get(0));
                    }
                    listM1172of = immutableListM1173of;
                    str8 = str9;
                } else {
                    if (i13 == 1835557200) {
                        parsableByteArray.setPosition(position + 8);
                        int unsignedByte2 = parsableByteArray.readUnsignedByte();
                        if (unsignedByte2 > 0) {
                            byte[] bArr2 = new byte[unsignedByte2];
                            str4 = str6;
                            parsableByteArray.readBytes(bArr2, 0, unsignedByte2);
                            if (listM1172of == null) {
                                listM1172of = ImmutableList.m1172of(bArr2);
                            } else {
                                listM1172of = ImmutableList.m1173of(listM1172of.get(0), bArr2);
                            }
                        }
                    } else {
                        str4 = str6;
                        if (i13 == 1702061171 || (z && i13 == 2002876005)) {
                            int iFindBoxPosition = i13 == 1702061171 ? position : findBoxPosition(parsableByteArray, Atom.TYPE_esds, position, i12);
                            if (iFindBoxPosition != -1) {
                                esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                                str7 = esdsFromParent.mimeType;
                                byte[] bArr3 = esdsFromParent.initializationData;
                                if (bArr3 != null) {
                                    if (MimeTypes.AUDIO_VORBIS.equals(str7)) {
                                        listM1172of = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr3);
                                    } else {
                                        if (MimeTypes.AUDIO_AAC.equals(str7)) {
                                            AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr3);
                                            int i14 = audioSpecificConfig.sampleRateHz;
                                            int i15 = audioSpecificConfig.channelCount;
                                            str8 = audioSpecificConfig.codecs;
                                            unsignedFixedPoint1616 = i14;
                                            unsignedShort2 = i15;
                                        }
                                        listM1172of = ImmutableList.m1172of(bArr3);
                                    }
                                }
                            }
                        } else {
                            if (i13 == 1684103987) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitDataCopyWithSchemeType);
                            } else if (i13 == 1684366131) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitDataCopyWithSchemeType);
                            } else if (i13 == 1684103988) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i4), str, drmInitDataCopyWithSchemeType);
                            } else if (i13 == 1684892784) {
                                if (i6 <= 0) {
                                    throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + i6, null);
                                }
                                unsignedFixedPoint1616 = i6;
                                unsignedShort2 = 2;
                            } else if (i13 == 1684305011 || i13 == 1969517683) {
                                c = 24931;
                                stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str7).setChannelCount(unsignedShort2).setSampleRate(unsignedFixedPoint1616).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str).build();
                            } else if (i13 == 1682927731) {
                                int i16 = i12 - 8;
                                byte[] bArr4 = opusMagic;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i16);
                                parsableByteArray.setPosition(position + 8);
                                parsableByteArray.readBytes(bArrCopyOf, bArr4.length, i16);
                                listM1172of = OpusUtil.buildInitializationData(bArrCopyOf);
                            } else if (i13 == 1684425825) {
                                byte[] bArr5 = new byte[i12 - 8];
                                bArr5[0] = 102;
                                bArr5[1] = TarConstants.LF_GNUTYPE_LONGNAME;
                                bArr5[2] = 97;
                                bArr5[3] = 67;
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr5, 4, i12 - 12);
                                listM1172of = ImmutableList.m1172of(bArr5);
                            } else {
                                c = 24931;
                                if (i13 == 1634492771) {
                                    int i17 = i12 - 12;
                                    byte[] bArr6 = new byte[i17];
                                    parsableByteArray.setPosition(position + 12);
                                    parsableByteArray.readBytes(bArr6, 0, i17);
                                    Pair<Integer, Integer> alacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr6);
                                    int iIntValue2 = ((Integer) alacAudioSpecificConfig.first).intValue();
                                    unsignedShort2 = ((Integer) alacAudioSpecificConfig.second).intValue();
                                    listM1172of = ImmutableList.m1172of(bArr6);
                                    unsignedFixedPoint1616 = iIntValue2;
                                }
                            }
                            c = 24931;
                        }
                        position += i12;
                        i9 = i2;
                        i10 = i3;
                        str6 = str4;
                    }
                    position += i12;
                    i9 = i2;
                    i10 = i3;
                    str6 = str4;
                }
                str4 = str6;
                position += i12;
                i9 = i2;
                i10 = i3;
                str6 = str4;
            }
            if (stsdData.format == null || str7 == null) {
            }
            Format.Builder language = new Format.Builder().setId(i4).setSampleMimeType(str7).setCodecs(str8).setChannelCount(unsignedShort2).setSampleRate(unsignedFixedPoint1616).setPcmEncoding(i11).setInitializationData(listM1172of).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str);
            if (esdsFromParent != null) {
                language.setAverageBitrate(Ints.saturatedCast(esdsFromParent.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsFromParent.peakBitrate));
            }
            stsdData.format = language.build();
            return;
        }
        str3 = str2;
        int i112 = i8;
        String str72 = str3;
        List<byte[]> listM1172of2 = null;
        String str82 = null;
        EsdsData esdsFromParent2 = null;
        while (position - i9 < i10) {
        }
        if (stsdData.format == null) {
        }
    }

    public static int findBoxPosition(ParsableByteArray parsableByteArray, int i, int i2, int i3) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i4 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i4 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += i4;
        }
        return -1;
    }

    public static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, unsignedInt2 > 0 ? unsignedInt2 : -1L, unsignedInt > 0 ? unsignedInt : -1L);
    }

    @Nullable
    public static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i3)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i3;
        }
        return null;
    }

    @Nullable
    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i6 = parsableByteArray.readInt();
            int i7 = parsableByteArray.readInt();
            if (i7 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i7 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i7 == 1935894633) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!"cenc".equals(string) && !C2732C.CENC_TYPE_cbc1.equals(string) && !C2732C.CENC_TYPE_cens.equals(string) && !C2732C.CENC_TYPE_cbcs.equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, string);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(schiFromParent));
    }

    @Nullable
    public static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int i6 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = unsignedByte & 15;
                    i4 = (unsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z, str, unsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += i6;
        }
    }

    @Nullable
    public static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i4 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    public static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (unsignedByte & 127);
        }
        return i;
    }

    public static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    public static final class ChunkIterator {
        public final ParsableByteArray chunkOffsets;
        public final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        public int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        public int remainingSamplesPerChunkChanges;
        public final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long unsignedInt;
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                unsignedInt = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                unsignedInt = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = unsignedInt;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    public static final class TkhdData {
        public final long duration;

        /* renamed from: id */
        public final int f331id;
        public final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.f331id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;

        @Nullable
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    public static final class EsdsData {
        public final long bitrate;
        public final byte[] initializationData;
        public final String mimeType;
        public final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class StszSampleSizeBox implements SampleSizeBox {
        public final ParsableByteArray data;
        public final int fixedSampleSize;
        public final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    Log.m635w(AtomParsers.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        public int currentByte;
        public final ParsableByteArray data;
        public final int fieldSize;
        public final int sampleCount;
        public int sampleIndex;

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 == 0) {
                int unsignedByte = this.data.readUnsignedByte();
                this.currentByte = unsignedByte;
                return (unsignedByte & 240) >> 4;
            }
            return this.currentByte & 15;
        }
    }
}
