package androidx.media3.extractor.p007ts;

import androidx.annotation.Nullable;
import androidx.media3.common.C2732C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.p007ts.TsPayloadReader;
import java.util.Collections;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@UnstableApi
/* loaded from: classes3.dex */
public final class LatmReader implements ElementaryStreamReader {
    public static final int INITIAL_BUFFER_SIZE = 1024;
    public static final int STATE_FINDING_SYNC_1 = 0;
    public static final int STATE_FINDING_SYNC_2 = 1;
    public static final int STATE_READING_HEADER = 2;
    public static final int STATE_READING_SAMPLE = 3;
    public static final int SYNC_BYTE_FIRST = 86;
    public static final int SYNC_BYTE_SECOND = 224;
    public int audioMuxVersionA;
    public int bytesRead;
    public int channelCount;

    @Nullable
    public String codecs;
    public Format format;
    public String formatId;
    public int frameLengthType;

    @Nullable
    public final String language;
    public int numSubframes;
    public long otherDataLenBits;
    public boolean otherDataPresent;
    public TrackOutput output;
    public final int roleFlags;
    public final ParsableBitArray sampleBitArray;
    public final ParsableByteArray sampleDataBuffer;
    public long sampleDurationUs;
    public int sampleRateHz;
    public int sampleSize;
    public int secondHeaderByte;
    public int state;
    public boolean streamMuxRead;
    public long timeUs;

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void packetFinished() {
    }

    public LatmReader(@Nullable String str, int i) {
        this.language = str;
        this.roleFlags = i;
        ParsableByteArray parsableByteArray = new ParsableByteArray(1024);
        this.sampleDataBuffer = parsableByteArray;
        this.sampleBitArray = new ParsableBitArray(parsableByteArray.getData());
        this.timeUs = C2732C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.timeUs = C2732C.TIME_UNSET;
        this.streamMuxRead = false;
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
        this.formatId = trackIdGenerator.getFormatId();
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        this.timeUs = j;
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) throws ParserException {
        Assertions.checkStateNotNull(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.state;
            if (i != 0) {
                if (i == 1) {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    if ((unsignedByte & 224) == 224) {
                        this.secondHeaderByte = unsignedByte;
                        this.state = 2;
                    } else if (unsignedByte != 86) {
                        this.state = 0;
                    }
                } else if (i == 2) {
                    int unsignedByte2 = ((this.secondHeaderByte & (-225)) << 8) | parsableByteArray.readUnsignedByte();
                    this.sampleSize = unsignedByte2;
                    if (unsignedByte2 > this.sampleDataBuffer.getData().length) {
                        resetBufferForSize(this.sampleSize);
                    }
                    this.bytesRead = 0;
                    this.state = 3;
                } else if (i == 3) {
                    int iMin = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                    parsableByteArray.readBytes(this.sampleBitArray.data, this.bytesRead, iMin);
                    int i2 = this.bytesRead + iMin;
                    this.bytesRead = i2;
                    if (i2 == this.sampleSize) {
                        this.sampleBitArray.setPosition(0);
                        parseAudioMuxElement(this.sampleBitArray);
                        this.state = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (parsableByteArray.readUnsignedByte() == 86) {
                this.state = 1;
            }
        }
    }

    @RequiresNonNull({P2ArtifactParser.RuleHandler.OUTPUT})
    public final void parseAudioMuxElement(ParsableBitArray parsableBitArray) throws ParserException {
        if (!parsableBitArray.readBit()) {
            this.streamMuxRead = true;
            parseStreamMuxConfig(parsableBitArray);
        } else if (!this.streamMuxRead) {
            return;
        }
        if (this.audioMuxVersionA == 0) {
            if (this.numSubframes != 0) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            parsePayloadMux(parsableBitArray, parsePayloadLengthInfo(parsableBitArray));
            if (this.otherDataPresent) {
                parsableBitArray.skipBits((int) this.otherDataLenBits);
                return;
            }
            return;
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    @RequiresNonNull({P2ArtifactParser.RuleHandler.OUTPUT})
    public final void parseStreamMuxConfig(ParsableBitArray parsableBitArray) throws ParserException {
        boolean bit;
        int bits = parsableBitArray.readBits(1);
        int bits2 = bits == 1 ? parsableBitArray.readBits(1) : 0;
        this.audioMuxVersionA = bits2;
        if (bits2 == 0) {
            if (bits == 1) {
                latmGetValue(parsableBitArray);
            }
            if (!parsableBitArray.readBit()) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            this.numSubframes = parsableBitArray.readBits(6);
            int bits3 = parsableBitArray.readBits(4);
            int bits4 = parsableBitArray.readBits(3);
            if (bits3 != 0 || bits4 != 0) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            if (bits == 0) {
                int position = parsableBitArray.getPosition();
                int audioSpecificConfig = parseAudioSpecificConfig(parsableBitArray);
                parsableBitArray.setPosition(position);
                byte[] bArr = new byte[(audioSpecificConfig + 7) / 8];
                parsableBitArray.readBits(bArr, 0, audioSpecificConfig);
                Format formatBuild = new Format.Builder().setId(this.formatId).setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(this.codecs).setChannelCount(this.channelCount).setSampleRate(this.sampleRateHz).setInitializationData(Collections.singletonList(bArr)).setLanguage(this.language).setRoleFlags(this.roleFlags).build();
                if (!formatBuild.equals(this.format)) {
                    this.format = formatBuild;
                    this.sampleDurationUs = 1024000000 / formatBuild.sampleRate;
                    this.output.format(formatBuild);
                }
            } else {
                parsableBitArray.skipBits(((int) latmGetValue(parsableBitArray)) - parseAudioSpecificConfig(parsableBitArray));
            }
            parseFrameLength(parsableBitArray);
            boolean bit2 = parsableBitArray.readBit();
            this.otherDataPresent = bit2;
            this.otherDataLenBits = 0L;
            if (bit2) {
                if (bits == 1) {
                    this.otherDataLenBits = latmGetValue(parsableBitArray);
                } else {
                    do {
                        bit = parsableBitArray.readBit();
                        this.otherDataLenBits = (this.otherDataLenBits << 8) + parsableBitArray.readBits(8);
                    } while (bit);
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(8);
                return;
            }
            return;
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    public final void parseFrameLength(ParsableBitArray parsableBitArray) {
        int bits = parsableBitArray.readBits(3);
        this.frameLengthType = bits;
        if (bits == 0) {
            parsableBitArray.skipBits(8);
            return;
        }
        if (bits == 1) {
            parsableBitArray.skipBits(9);
            return;
        }
        if (bits == 3 || bits == 4 || bits == 5) {
            parsableBitArray.skipBits(6);
        } else {
            if (bits == 6 || bits == 7) {
                parsableBitArray.skipBits(1);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final int parseAudioSpecificConfig(ParsableBitArray parsableBitArray) throws ParserException {
        int iBitsLeft = parsableBitArray.bitsLeft();
        AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(parsableBitArray, true);
        this.codecs = audioSpecificConfig.codecs;
        this.sampleRateHz = audioSpecificConfig.sampleRateHz;
        this.channelCount = audioSpecificConfig.channelCount;
        return iBitsLeft - parsableBitArray.bitsLeft();
    }

    public final int parsePayloadLengthInfo(ParsableBitArray parsableBitArray) throws ParserException {
        int bits;
        if (this.frameLengthType != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        int i = 0;
        do {
            bits = parsableBitArray.readBits(8);
            i += bits;
        } while (bits == 255);
        return i;
    }

    @RequiresNonNull({P2ArtifactParser.RuleHandler.OUTPUT})
    public final void parsePayloadMux(ParsableBitArray parsableBitArray, int i) {
        int position = parsableBitArray.getPosition();
        if ((position & 7) == 0) {
            this.sampleDataBuffer.setPosition(position >> 3);
        } else {
            parsableBitArray.readBits(this.sampleDataBuffer.getData(), 0, i * 8);
            this.sampleDataBuffer.setPosition(0);
        }
        this.output.sampleData(this.sampleDataBuffer, i);
        Assertions.checkState(this.timeUs != C2732C.TIME_UNSET);
        this.output.sampleMetadata(this.timeUs, 1, i, 0, null);
        this.timeUs += this.sampleDurationUs;
    }

    public final void resetBufferForSize(int i) {
        this.sampleDataBuffer.reset(i);
        this.sampleBitArray.reset(this.sampleDataBuffer.getData());
    }

    public static long latmGetValue(ParsableBitArray parsableBitArray) {
        return parsableBitArray.readBits((parsableBitArray.readBits(2) + 1) * 8);
    }
}
