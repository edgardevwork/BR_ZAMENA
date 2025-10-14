package androidx.media3.extractor.flv;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.exoplayer.source.SilenceMediaSource;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.flv.TagPayloadReader;
import java.util.Collections;

/* loaded from: classes.dex */
public final class AudioTagPayloadReader extends TagPayloadReader {
    public static final int AAC_PACKET_TYPE_AAC_RAW = 1;
    public static final int AAC_PACKET_TYPE_SEQUENCE_HEADER = 0;
    public static final int AUDIO_FORMAT_AAC = 10;
    public static final int AUDIO_FORMAT_ALAW = 7;
    public static final int AUDIO_FORMAT_MP3 = 2;
    public static final int AUDIO_FORMAT_ULAW = 8;
    public static final int[] AUDIO_SAMPLING_RATE_TABLE = {5512, 11025, 22050, SilenceMediaSource.SAMPLE_RATE_HZ};
    public int audioFormat;
    public boolean hasOutputFormat;
    public boolean hasParsedAudioDataHeader;

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public void seek() {
    }

    public AudioTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean parseHeader(ParsableByteArray parsableByteArray) throws TagPayloadReader.UnsupportedFormatException {
        if (!this.hasParsedAudioDataHeader) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int i = (unsignedByte >> 4) & 15;
            this.audioFormat = i;
            if (i == 2) {
                this.output.format(new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_MPEG).setChannelCount(1).setSampleRate(AUDIO_SAMPLING_RATE_TABLE[(unsignedByte >> 2) & 3]).build());
                this.hasOutputFormat = true;
            } else if (i == 7 || i == 8) {
                this.output.format(new Format.Builder().setSampleMimeType(i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW).setChannelCount(1).setSampleRate(8000).build());
                this.hasOutputFormat = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.audioFormat);
            }
            this.hasParsedAudioDataHeader = true;
        } else {
            parsableByteArray.skipBytes(1);
        }
        return true;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean parsePayload(ParsableByteArray parsableByteArray, long j) throws ParserException {
        if (this.audioFormat == 2) {
            int iBytesLeft = parsableByteArray.bytesLeft();
            this.output.sampleData(parsableByteArray, iBytesLeft);
            this.output.sampleMetadata(j, 1, iBytesLeft, 0, null);
            return true;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if (unsignedByte == 0 && !this.hasOutputFormat) {
            int iBytesLeft2 = parsableByteArray.bytesLeft();
            byte[] bArr = new byte[iBytesLeft2];
            parsableByteArray.readBytes(bArr, 0, iBytesLeft2);
            AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr);
            this.output.format(new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(audioSpecificConfig.codecs).setChannelCount(audioSpecificConfig.channelCount).setSampleRate(audioSpecificConfig.sampleRateHz).setInitializationData(Collections.singletonList(bArr)).build());
            this.hasOutputFormat = true;
            return false;
        }
        if (this.audioFormat == 10 && unsignedByte != 1) {
            return false;
        }
        int iBytesLeft3 = parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, iBytesLeft3);
        this.output.sampleMetadata(j, 1, iBytesLeft3, 0, null);
        return true;
    }
}
