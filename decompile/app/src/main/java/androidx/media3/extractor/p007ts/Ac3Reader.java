package androidx.media3.extractor.p007ts;

import androidx.annotation.Nullable;
import androidx.media3.common.C2732C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.p007ts.TsPayloadReader;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@UnstableApi
/* loaded from: classes3.dex */
public final class Ac3Reader implements ElementaryStreamReader {
    public static final int HEADER_SIZE = 128;
    public static final int STATE_FINDING_SYNC = 0;
    public static final int STATE_READING_HEADER = 1;
    public static final int STATE_READING_SAMPLE = 2;
    public int bytesRead;
    public Format format;
    public String formatId;
    public final ParsableBitArray headerScratchBits;
    public final ParsableByteArray headerScratchBytes;

    @Nullable
    public final String language;
    public boolean lastByteWas0B;
    public TrackOutput output;
    public final int roleFlags;
    public long sampleDurationUs;
    public int sampleSize;
    public int state;
    public long timeUs;

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void packetFinished() {
    }

    public Ac3Reader() {
        this(null, 0);
    }

    public Ac3Reader(@Nullable String str, int i) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[128]);
        this.headerScratchBits = parsableBitArray;
        this.headerScratchBytes = new ParsableByteArray(parsableBitArray.data);
        this.state = 0;
        this.timeUs = C2732C.TIME_UNSET;
        this.language = str;
        this.roleFlags = i;
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.lastByteWas0B = false;
        this.timeUs = C2732C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        this.timeUs = j;
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.state;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                        this.output.sampleData(parsableByteArray, iMin);
                        int i2 = this.bytesRead + iMin;
                        this.bytesRead = i2;
                        if (i2 == this.sampleSize) {
                            Assertions.checkState(this.timeUs != C2732C.TIME_UNSET);
                            this.output.sampleMetadata(this.timeUs, 1, this.sampleSize, 0, null);
                            this.timeUs += this.sampleDurationUs;
                            this.state = 0;
                        }
                    }
                } else if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), 128)) {
                    parseHeader();
                    this.headerScratchBytes.setPosition(0);
                    this.output.sampleData(this.headerScratchBytes, 128);
                    this.state = 2;
                }
            } else if (skipToNextSync(parsableByteArray)) {
                this.state = 1;
                this.headerScratchBytes.getData()[0] = 11;
                this.headerScratchBytes.getData()[1] = 119;
                this.bytesRead = 2;
            }
        }
    }

    public final boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int iMin = Math.min(parsableByteArray.bytesLeft(), i - this.bytesRead);
        parsableByteArray.readBytes(bArr, this.bytesRead, iMin);
        int i2 = this.bytesRead + iMin;
        this.bytesRead = i2;
        return i2 == i;
    }

    public final boolean skipToNextSync(ParsableByteArray parsableByteArray) {
        while (true) {
            if (parsableByteArray.bytesLeft() <= 0) {
                return false;
            }
            if (!this.lastByteWas0B) {
                this.lastByteWas0B = parsableByteArray.readUnsignedByte() == 11;
            } else {
                int unsignedByte = parsableByteArray.readUnsignedByte();
                if (unsignedByte == 119) {
                    this.lastByteWas0B = false;
                    return true;
                }
                this.lastByteWas0B = unsignedByte == 11;
            }
        }
    }

    @RequiresNonNull({P2ArtifactParser.RuleHandler.OUTPUT})
    public final void parseHeader() {
        this.headerScratchBits.setPosition(0);
        Ac3Util.SyncFrameInfo ac3SyncframeInfo = Ac3Util.parseAc3SyncframeInfo(this.headerScratchBits);
        Format format = this.format;
        if (format == null || ac3SyncframeInfo.channelCount != format.channelCount || ac3SyncframeInfo.sampleRate != format.sampleRate || !Util.areEqual(ac3SyncframeInfo.mimeType, format.sampleMimeType)) {
            Format.Builder peakBitrate = new Format.Builder().setId(this.formatId).setSampleMimeType(ac3SyncframeInfo.mimeType).setChannelCount(ac3SyncframeInfo.channelCount).setSampleRate(ac3SyncframeInfo.sampleRate).setLanguage(this.language).setRoleFlags(this.roleFlags).setPeakBitrate(ac3SyncframeInfo.bitrate);
            if (MimeTypes.AUDIO_AC3.equals(ac3SyncframeInfo.mimeType)) {
                peakBitrate.setAverageBitrate(ac3SyncframeInfo.bitrate);
            }
            Format formatBuild = peakBitrate.build();
            this.format = formatBuild;
            this.output.format(formatBuild);
        }
        this.sampleSize = ac3SyncframeInfo.frameSize;
        this.sampleDurationUs = (ac3SyncframeInfo.sampleCount * 1000000) / this.format.sampleRate;
    }
}
