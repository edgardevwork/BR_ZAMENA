package androidx.media3.extractor.p007ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.C2732C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.p007ts.TsPayloadReader;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;

@UnstableApi
/* loaded from: classes3.dex */
public final class H262Reader implements ElementaryStreamReader {
    public static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public static final int START_EXTENSION = 181;
    public static final int START_GROUP = 184;
    public static final int START_PICTURE = 0;
    public static final int START_SEQUENCE_HEADER = 179;
    public static final int START_USER_DATA = 178;
    public final CsdBuffer csdBuffer;
    public String formatId;
    public long frameDurationUs;
    public boolean hasOutputFormat;
    public TrackOutput output;
    public long pesTimeUs;
    public final boolean[] prefixFlags;
    public boolean sampleHasPicture;
    public boolean sampleIsKeyframe;
    public long samplePosition;
    public long sampleTimeUs;
    public boolean startedFirstSample;
    public long totalBytesWritten;

    @Nullable
    public final NalUnitTargetBuffer userData;

    @Nullable
    public final ParsableByteArray userDataParsable;

    @Nullable
    public final UserDataReader userDataReader;

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void packetFinished() {
    }

    public H262Reader() {
        this(null);
    }

    public H262Reader(@Nullable UserDataReader userDataReader) {
        this.userDataReader = userDataReader;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(178, 128);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = C2732C.TIME_UNSET;
        this.sampleTimeUs = C2732C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = C2732C.TIME_UNSET;
        this.sampleTimeUs = C2732C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        this.pesTimeUs = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void consume(ParsableByteArray parsableByteArray) {
        int i;
        long j;
        boolean z;
        int i2;
        Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i3 = iFindNalUnit + 3;
            int i4 = parsableByteArray.getData()[i3] & 255;
            int i5 = iFindNalUnit - position;
            if (!this.hasOutputFormat) {
                if (i5 > 0) {
                    this.csdBuffer.onData(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.onStartCode(i4, i5 < 0 ? -i5 : 0)) {
                    Pair<Format, Long> csdBuffer = parseCsdBuffer(this.csdBuffer, (String) Assertions.checkNotNull(this.formatId));
                    this.output.format((Format) csdBuffer.first);
                    this.frameDurationUs = ((Long) csdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i5 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, iFindNalUnit);
                    i2 = 0;
                } else {
                    i2 = -i5;
                }
                if (this.userData.endNalUnit(i2)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    ((UserDataReader) Util.castNonNull(this.userDataReader)).consume(this.sampleTimeUs, this.userDataParsable);
                }
                if (i4 == 178 && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i4);
                }
            }
            if (i4 == 0 || i4 == 179) {
                int i6 = iLimit - iFindNalUnit;
                if (!this.sampleHasPicture || !this.hasOutputFormat) {
                    i = i4;
                    if (this.startedFirstSample || this.sampleHasPicture) {
                        this.samplePosition = this.totalBytesWritten - i6;
                        j = this.pesTimeUs;
                        if (j == C2732C.TIME_UNSET) {
                            long j2 = this.sampleTimeUs;
                            j = j2 != C2732C.TIME_UNSET ? j2 + this.frameDurationUs : -9223372036854775807L;
                        }
                        this.sampleTimeUs = j;
                        this.sampleIsKeyframe = false;
                        this.pesTimeUs = C2732C.TIME_UNSET;
                        z = true;
                        this.startedFirstSample = true;
                    } else {
                        z = true;
                    }
                    this.sampleHasPicture = i == 0 ? z : false;
                } else {
                    long j3 = this.sampleTimeUs;
                    if (j3 != C2732C.TIME_UNSET) {
                        i = i4;
                        this.output.sampleMetadata(j3, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i6, i6, null);
                    }
                    if (this.startedFirstSample) {
                        this.samplePosition = this.totalBytesWritten - i6;
                        j = this.pesTimeUs;
                        if (j == C2732C.TIME_UNSET) {
                        }
                        this.sampleTimeUs = j;
                        this.sampleIsKeyframe = false;
                        this.pesTimeUs = C2732C.TIME_UNSET;
                        z = true;
                        this.startedFirstSample = true;
                        this.sampleHasPicture = i == 0 ? z : false;
                    }
                }
            } else if (i4 == 184) {
                this.sampleIsKeyframe = true;
            }
            position = i3;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, iLimit);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.userData;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.appendToNalUnit(data, position, iLimit);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Format, Long> parseCsdBuffer(CsdBuffer csdBuffer, String str) {
        float f;
        int i;
        float f2;
        int i2;
        long j;
        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        int i3 = bArrCopyOf[4] & 255;
        byte b = bArrCopyOf[5];
        int i4 = (i3 << 4) | ((b & 255) >> 4);
        int i5 = ((b & Ascii.f786SI) << 8) | (bArrCopyOf[6] & 255);
        int i6 = (bArrCopyOf[7] & 240) >> 4;
        if (i6 == 2) {
            f = i5 * 4;
            i = i4 * 3;
        } else if (i6 == 3) {
            f = i5 * 16;
            i = i4 * 9;
        } else {
            if (i6 != 4) {
                f2 = 1.0f;
                Format formatBuild = new Format.Builder().setId(str).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i4).setHeight(i5).setPixelWidthHeightRatio(f2).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
                i2 = (bArrCopyOf[7] & Ascii.f786SI) - 1;
                if (i2 < 0) {
                    double[] dArr = FRAME_RATE_VALUES;
                    if (i2 < dArr.length) {
                        double d = dArr[i2];
                        byte b2 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                        int i7 = (b2 & 96) >> 5;
                        if (i7 != (b2 & 31)) {
                            d *= (i7 + 1.0d) / (r8 + 1);
                        }
                        j = (long) (1000000.0d / d);
                    } else {
                        j = 0;
                    }
                }
                return Pair.create(formatBuild, Long.valueOf(j));
            }
            f = i5 * 121;
            i = i4 * 100;
        }
        f2 = f / i;
        Format formatBuild2 = new Format.Builder().setId(str).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i4).setHeight(i5).setPixelWidthHeightRatio(f2).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
        i2 = (bArrCopyOf[7] & Ascii.f786SI) - 1;
        if (i2 < 0) {
        }
        return Pair.create(formatBuild2, Long.valueOf(j));
    }

    /* loaded from: classes2.dex */
    public static final class CsdBuffer {
        public static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        public boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i) {
            this.data = new byte[i];
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }

        public boolean onStartCode(int i, int i2) {
            if (this.isFilling) {
                int i3 = this.length - i2;
                this.length = i3;
                if (this.sequenceExtensionPosition == 0 && i == 181) {
                    this.sequenceExtensionPosition = i3;
                } else {
                    this.isFilling = false;
                    return true;
                }
            } else if (i == 179) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.isFilling) {
                int i3 = i2 - i;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i4 = this.length;
                if (length < i4 + i3) {
                    this.data = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.data, this.length, i3);
                this.length += i3;
            }
        }
    }
}
