package androidx.media3.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.C2732C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import androidx.media3.extractor.text.cea.Cea608Decoder;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.common.collect.ImmutableList;
import com.google.common.xml.XmlEscapers;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@UnstableApi
/* loaded from: classes.dex */
public class MatroskaExtractor implements Extractor {
    public static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    public static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    public static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    public static final int BLOCK_STATE_DATA = 2;
    public static final int BLOCK_STATE_HEADER = 1;
    public static final int BLOCK_STATE_START = 0;
    public static final String CODEC_ID_AAC = "A_AAC";
    public static final String CODEC_ID_AC3 = "A_AC3";
    public static final String CODEC_ID_ACM = "A_MS/ACM";
    public static final String CODEC_ID_ASS = "S_TEXT/ASS";
    public static final String CODEC_ID_AV1 = "V_AV1";
    public static final String CODEC_ID_DTS = "A_DTS";
    public static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    public static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    public static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    public static final String CODEC_ID_E_AC3 = "A_EAC3";
    public static final String CODEC_ID_FLAC = "A_FLAC";
    public static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    public static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    public static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    public static final String CODEC_ID_MP2 = "A_MPEG/L2";
    public static final String CODEC_ID_MP3 = "A_MPEG/L3";
    public static final String CODEC_ID_MPEG2 = "V_MPEG2";
    public static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    public static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    public static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    public static final String CODEC_ID_OPUS = "A_OPUS";
    public static final String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    public static final String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    public static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    public static final String CODEC_ID_PGS = "S_HDMV/PGS";
    public static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    public static final String CODEC_ID_THEORA = "V_THEORA";
    public static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    public static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    public static final String CODEC_ID_VORBIS = "A_VORBIS";
    public static final String CODEC_ID_VP8 = "V_VP8";
    public static final String CODEC_ID_VP9 = "V_VP9";
    public static final String CODEC_ID_VTT = "S_TEXT/WEBVTT";
    public static final String DOC_TYPE_MATROSKA = "matroska";
    public static final String DOC_TYPE_WEBM = "webm";
    public static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 2;
    public static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    public static final int FOURCC_COMPRESSION_H263 = 859189832;
    public static final int FOURCC_COMPRESSION_VC1 = 826496599;
    public static final int ID_AUDIO = 225;
    public static final int ID_AUDIO_BIT_DEPTH = 25188;
    public static final int ID_BLOCK = 161;
    public static final int ID_BLOCK_ADDITIONAL = 165;
    public static final int ID_BLOCK_ADDITIONS = 30113;
    public static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    public static final int ID_BLOCK_ADD_ID = 238;
    public static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    public static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    public static final int ID_BLOCK_DURATION = 155;
    public static final int ID_BLOCK_GROUP = 160;
    public static final int ID_BLOCK_MORE = 166;
    public static final int ID_CHANNELS = 159;
    public static final int ID_CLUSTER = 524531317;
    public static final int ID_CODEC_DELAY = 22186;
    public static final int ID_CODEC_ID = 134;
    public static final int ID_CODEC_PRIVATE = 25506;
    public static final int ID_COLOUR = 21936;
    public static final int ID_COLOUR_BITS_PER_CHANNEL = 21938;
    public static final int ID_COLOUR_PRIMARIES = 21947;
    public static final int ID_COLOUR_RANGE = 21945;
    public static final int ID_COLOUR_TRANSFER = 21946;
    public static final int ID_CONTENT_COMPRESSION = 20532;
    public static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    public static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    public static final int ID_CONTENT_ENCODING = 25152;
    public static final int ID_CONTENT_ENCODINGS = 28032;
    public static final int ID_CONTENT_ENCODING_ORDER = 20529;
    public static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    public static final int ID_CONTENT_ENCRYPTION = 20533;
    public static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    public static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    public static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    public static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    public static final int ID_CUES = 475249515;
    public static final int ID_CUE_CLUSTER_POSITION = 241;
    public static final int ID_CUE_POINT = 187;
    public static final int ID_CUE_TIME = 179;
    public static final int ID_CUE_TRACK_POSITIONS = 183;
    public static final int ID_DEFAULT_DURATION = 2352003;
    public static final int ID_DISCARD_PADDING = 30114;
    public static final int ID_DISPLAY_HEIGHT = 21690;
    public static final int ID_DISPLAY_UNIT = 21682;
    public static final int ID_DISPLAY_WIDTH = 21680;
    public static final int ID_DOC_TYPE = 17026;
    public static final int ID_DOC_TYPE_READ_VERSION = 17029;
    public static final int ID_DURATION = 17545;
    public static final int ID_EBML = 440786851;
    public static final int ID_EBML_READ_VERSION = 17143;
    public static final int ID_FLAG_DEFAULT = 136;
    public static final int ID_FLAG_FORCED = 21930;
    public static final int ID_INFO = 357149030;
    public static final int ID_LANGUAGE = 2274716;
    public static final int ID_LUMNINANCE_MAX = 21977;
    public static final int ID_LUMNINANCE_MIN = 21978;
    public static final int ID_MASTERING_METADATA = 21968;
    public static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    public static final int ID_MAX_CLL = 21948;
    public static final int ID_MAX_FALL = 21949;
    public static final int ID_NAME = 21358;
    public static final int ID_PIXEL_HEIGHT = 186;
    public static final int ID_PIXEL_WIDTH = 176;
    public static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    public static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    public static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    public static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    public static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    public static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    public static final int ID_PROJECTION = 30320;
    public static final int ID_PROJECTION_POSE_PITCH = 30324;
    public static final int ID_PROJECTION_POSE_ROLL = 30325;
    public static final int ID_PROJECTION_POSE_YAW = 30323;
    public static final int ID_PROJECTION_PRIVATE = 30322;
    public static final int ID_PROJECTION_TYPE = 30321;
    public static final int ID_REFERENCE_BLOCK = 251;
    public static final int ID_SAMPLING_FREQUENCY = 181;
    public static final int ID_SEEK = 19899;
    public static final int ID_SEEK_HEAD = 290298740;
    public static final int ID_SEEK_ID = 21419;
    public static final int ID_SEEK_POSITION = 21420;
    public static final int ID_SEEK_PRE_ROLL = 22203;
    public static final int ID_SEGMENT = 408125543;
    public static final int ID_SEGMENT_INFO = 357149030;
    public static final int ID_SIMPLE_BLOCK = 163;
    public static final int ID_STEREO_MODE = 21432;
    public static final int ID_TIMECODE_SCALE = 2807729;
    public static final int ID_TIME_CODE = 231;
    public static final int ID_TRACKS = 374648427;
    public static final int ID_TRACK_ENTRY = 174;
    public static final int ID_TRACK_NUMBER = 215;
    public static final int ID_TRACK_TYPE = 131;
    public static final int ID_VIDEO = 224;
    public static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    public static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    public static final int LACING_EBML = 3;
    public static final int LACING_FIXED_SIZE = 2;
    public static final int LACING_NONE = 0;
    public static final int LACING_XIPH = 1;
    public static final int OPUS_MAX_INPUT_SIZE = 5760;
    public static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    public static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    public static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    public static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    public static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    public static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    public static final String TAG = "MatroskaExtractor";
    public static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    public static final int TRACK_TYPE_AUDIO = 2;
    public static final int UNSET_ENTRY_ID = -1;
    public static final int VORBIS_MAX_INPUT_SIZE = 8192;
    public static final int VTT_PREFIX_END_TIMECODE_OFFSET = 25;
    public static final String VTT_TIMECODE_FORMAT = "%02d:%02d:%02d.%03d";
    public static final long VTT_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    public static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    public static final int WAVE_FORMAT_PCM = 1;
    public static final int WAVE_FORMAT_SIZE = 18;
    public int blockAdditionalId;
    public long blockDurationUs;
    public int blockFlags;
    public long blockGroupDiscardPaddingNs;
    public boolean blockHasReferenceBlock;
    public int blockSampleCount;
    public int blockSampleIndex;
    public int[] blockSampleSizes;
    public int blockState;
    public long blockTimeUs;
    public int blockTrackNumber;
    public int blockTrackNumberLength;
    public long clusterTimecodeUs;

    @Nullable
    public LongArray cueClusterPositions;

    @Nullable
    public LongArray cueTimesUs;
    public long cuesContentPosition;

    @Nullable
    public Track currentTrack;
    public long durationTimecode;
    public long durationUs;
    public final ParsableByteArray encryptionInitializationVector;
    public final ParsableByteArray encryptionSubsampleData;
    public ByteBuffer encryptionSubsampleDataBuffer;
    public ExtractorOutput extractorOutput;
    public boolean haveOutputSample;
    public final ParsableByteArray nalLength;
    public final ParsableByteArray nalStartCode;
    public final boolean parseSubtitlesDuringExtraction;
    public final EbmlReader reader;
    public int sampleBytesRead;
    public int sampleBytesWritten;
    public int sampleCurrentNalBytesRemaining;
    public boolean sampleEncodingHandled;
    public boolean sampleInitializationVectorRead;
    public int samplePartitionCount;
    public boolean samplePartitionCountRead;
    public byte sampleSignalByte;
    public boolean sampleSignalByteRead;
    public final ParsableByteArray sampleStrippedBytes;
    public final ParsableByteArray scratch;
    public int seekEntryId;
    public final ParsableByteArray seekEntryIdBytes;
    public long seekEntryPosition;
    public boolean seekForCues;
    public final boolean seekForCuesEnabled;
    public long seekPositionAfterBuildingCues;
    public boolean seenClusterPositionForCurrentCuePoint;
    public long segmentContentPosition;
    public long segmentContentSize;
    public boolean sentSeekMap;
    public final SubtitleParser.Factory subtitleParserFactory;
    public final ParsableByteArray subtitleSample;
    public final ParsableByteArray supplementalData;
    public long timecodeScale;
    public final SparseArray<Track> tracks;
    public final VarintReader varintReader;
    public final ParsableByteArray vorbisNumPageSamples;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.MatroskaExtractor$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return MatroskaExtractor.lambda$static$1();
        }
    };
    public static final byte[] SUBRIP_PREFIX = {TarConstants.LF_LINK, 10, 48, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, 44, 48, 48, 48, 32, Cea608Decoder.CTRL_CARRIAGE_RETURN, Cea608Decoder.CTRL_CARRIAGE_RETURN, 62, 32, 48, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, UTF8JsonGenerator.BYTE_u, 101, UTF8JsonGenerator.BYTE_COLON, 32, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, 44, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, 44};
    public static final byte[] VTT_PREFIX = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, Cea608Decoder.CTRL_ERASE_NON_DISPLAYED_MEMORY, 48, 48, 48, 32, Cea608Decoder.CTRL_CARRIAGE_RETURN, Cea608Decoder.CTRL_CARRIAGE_RETURN, 62, 32, 48, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, UTF8JsonGenerator.BYTE_COLON, 48, 48, Cea608Decoder.CTRL_ERASE_NON_DISPLAYED_MEMORY, 48, 48, 48, 10};
    public static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @CallSuper
    public int getElementType(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case ID_PIXEL_HEIGHT /* 186 */:
            case ID_TRACK_NUMBER /* 215 */:
            case ID_TIME_CODE /* 231 */:
            case ID_BLOCK_ADD_ID /* 238 */:
            case ID_CUE_CLUSTER_POSITION /* 241 */:
            case ID_REFERENCE_BLOCK /* 251 */:
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
            case ID_EBML_READ_VERSION /* 17143 */:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
            case ID_CONTENT_ENCODING_ORDER /* 20529 */:
            case ID_CONTENT_ENCODING_SCOPE /* 20530 */:
            case ID_SEEK_POSITION /* 21420 */:
            case ID_STEREO_MODE /* 21432 */:
            case ID_DISPLAY_WIDTH /* 21680 */:
            case ID_DISPLAY_UNIT /* 21682 */:
            case ID_DISPLAY_HEIGHT /* 21690 */:
            case ID_FLAG_FORCED /* 21930 */:
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
            case ID_COLOUR_RANGE /* 21945 */:
            case ID_COLOUR_TRANSFER /* 21946 */:
            case ID_COLOUR_PRIMARIES /* 21947 */:
            case ID_MAX_CLL /* 21948 */:
            case ID_MAX_FALL /* 21949 */:
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
            case ID_CODEC_DELAY /* 22186 */:
            case ID_SEEK_PRE_ROLL /* 22203 */:
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
            case ID_DISCARD_PADDING /* 30114 */:
            case ID_PROJECTION_TYPE /* 30321 */:
            case ID_DEFAULT_DURATION /* 2352003 */:
            case ID_TIMECODE_SCALE /* 2807729 */:
                return 2;
            case 134:
            case 17026:
            case ID_NAME /* 21358 */:
            case ID_LANGUAGE /* 2274716 */:
                return 3;
            case 160:
            case ID_BLOCK_MORE /* 166 */:
            case ID_TRACK_ENTRY /* 174 */:
            case ID_CUE_TRACK_POSITIONS /* 183 */:
            case ID_CUE_POINT /* 187 */:
            case 224:
            case 225:
            case ID_BLOCK_ADDITION_MAPPING /* 16868 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
            case ID_SEEK /* 19899 */:
            case ID_CONTENT_COMPRESSION /* 20532 */:
            case ID_CONTENT_ENCRYPTION /* 20533 */:
            case ID_COLOUR /* 21936 */:
            case ID_MASTERING_METADATA /* 21968 */:
            case ID_CONTENT_ENCODING /* 25152 */:
            case ID_CONTENT_ENCODINGS /* 28032 */:
            case ID_BLOCK_ADDITIONS /* 30113 */:
            case ID_PROJECTION /* 30320 */:
            case ID_SEEK_HEAD /* 290298740 */:
            case 357149030:
            case ID_TRACKS /* 374648427 */:
            case ID_SEGMENT /* 408125543 */:
            case 440786851:
            case ID_CUES /* 475249515 */:
            case ID_CLUSTER /* 524531317 */:
                return 1;
            case ID_BLOCK /* 161 */:
            case ID_SIMPLE_BLOCK /* 163 */:
            case ID_BLOCK_ADDITIONAL /* 165 */:
            case 16877:
            case ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
            case ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
            case ID_SEEK_ID /* 21419 */:
            case ID_CODEC_PRIVATE /* 25506 */:
            case ID_PROJECTION_PRIVATE /* 30322 */:
                return 4;
            case 181:
            case ID_DURATION /* 17545 */:
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
            case ID_LUMNINANCE_MAX /* 21977 */:
            case ID_LUMNINANCE_MIN /* 21978 */:
            case ID_PROJECTION_POSE_YAW /* 30323 */:
            case ID_PROJECTION_POSE_PITCH /* 30324 */:
            case ID_PROJECTION_POSE_ROLL /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    @CallSuper
    public boolean isLevel1Element(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    public static /* synthetic */ Extractor[] lambda$newFactory$0(SubtitleParser.Factory factory) {
        return new Extractor[]{new MatroskaExtractor(factory)};
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.MatroskaExtractor$$ExternalSyntheticLambda0
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return MatroskaExtractor.lambda$newFactory$0(factory);
            }
        };
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", Integer.valueOf(BottomAppBarTopEdgeTreatment.ANGLE_UP));
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(map);
    }

    public static /* synthetic */ Extractor[] lambda$static$1() {
        return new Extractor[]{new MatroskaExtractor(SubtitleParser.Factory.UNSUPPORTED, 2)};
    }

    @Deprecated
    public MatroskaExtractor() {
        this(new DefaultEbmlReader(), 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    @Deprecated
    public MatroskaExtractor(int i) {
        this(new DefaultEbmlReader(), i | 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory) {
        this(new DefaultEbmlReader(), 0, factory);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory, int i) {
        this(new DefaultEbmlReader(), i, factory);
    }

    public MatroskaExtractor(EbmlReader ebmlReader, int i, SubtitleParser.Factory factory) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = C2732C.TIME_UNSET;
        this.durationTimecode = C2732C.TIME_UNSET;
        this.durationUs = C2732C.TIME_UNSET;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = C2732C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.subtitleParserFactory = factory;
        this.seekForCuesEnabled = (i & 1) == 0;
        this.parseSubtitlesDuringExtraction = (i & 2) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.supplementalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException {
        return new Sniffer().sniff(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    @CallSuper
    public void seek(long j, long j2) {
        this.clusterTimecodeUs = C2732C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).reset();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        this.haveOutputSample = false;
        boolean z = true;
        while (z && !this.haveOutputSample) {
            z = this.reader.read(extractorInput);
            if (z && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            Track trackValueAt = this.tracks.valueAt(i);
            trackValueAt.assertOutputInitialized();
            trackValueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    @CallSuper
    public void startMasterElement(int i, long j, long j2) throws ParserException {
        assertInitialized();
        if (i == 160) {
            this.blockHasReferenceBlock = false;
            this.blockGroupDiscardPaddingNs = 0L;
            return;
        }
        if (i == 174) {
            this.currentTrack = new Track();
            return;
        }
        if (i == 187) {
            this.seenClusterPositionForCurrentCuePoint = false;
            return;
        }
        if (i == 19899) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1L;
            return;
        }
        if (i == 20533) {
            getCurrentTrack(i).hasContentEncryption = true;
            return;
        }
        if (i == 21968) {
            getCurrentTrack(i).hasColorInfo = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.segmentContentPosition;
            if (j3 != -1 && j3 != j) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.segmentContentPosition = j;
            this.segmentContentSize = j2;
            return;
        }
        if (i == 475249515) {
            this.cueTimesUs = new LongArray();
            this.cueClusterPositions = new LongArray();
        } else if (i == 524531317 && !this.sentSeekMap) {
            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                this.seekForCues = true;
            } else {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
            }
        }
    }

    @CallSuper
    public void endMasterElement(int i) throws ParserException {
        assertInitialized();
        if (i == 160) {
            if (this.blockState != 2) {
                return;
            }
            Track track = this.tracks.get(this.blockTrackNumber);
            track.assertOutputInitialized();
            if (this.blockGroupDiscardPaddingNs > 0 && CODEC_ID_OPUS.equals(track.codecId)) {
                this.supplementalData.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.blockGroupDiscardPaddingNs).array());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.blockSampleCount; i3++) {
                i2 += this.blockSampleSizes[i3];
            }
            int i4 = 0;
            while (i4 < this.blockSampleCount) {
                long j = this.blockTimeUs + ((track.defaultSampleDurationNs * i4) / 1000);
                int i5 = this.blockFlags;
                if (i4 == 0 && !this.blockHasReferenceBlock) {
                    i5 |= 1;
                }
                int i6 = this.blockSampleSizes[i4];
                int i7 = i2 - i6;
                commitSampleToOutput(track, j, i5, i6, i7);
                i4++;
                i2 = i7;
            }
            this.blockState = 0;
            return;
        }
        if (i == 174) {
            Track track2 = (Track) Assertions.checkStateNotNull(this.currentTrack);
            String str = track2.codecId;
            if (str == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (isCodecSupported(str)) {
                track2.initializeOutput(this.extractorOutput, track2.number);
                this.tracks.put(track2.number, track2);
            }
            this.currentTrack = null;
            return;
        }
        if (i == 19899) {
            int i8 = this.seekEntryId;
            if (i8 != -1) {
                long j2 = this.seekEntryPosition;
                if (j2 != -1) {
                    if (i8 == 475249515) {
                        this.cuesContentPosition = j2;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            assertInTrackEntry(i);
            Track track3 = this.currentTrack;
            if (track3.hasContentEncryption) {
                if (track3.cryptoData == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                track3.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C2732C.UUID_NIL, "video/webm", this.currentTrack.cryptoData.encryptionKey));
                return;
            }
            return;
        }
        if (i == 28032) {
            assertInTrackEntry(i);
            Track track4 = this.currentTrack;
            if (track4.hasContentEncryption && track4.sampleStrippedBytes != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.timecodeScale == C2732C.TIME_UNSET) {
                this.timecodeScale = 1000000L;
            }
            long j3 = this.durationTimecode;
            if (j3 != C2732C.TIME_UNSET) {
                this.durationUs = scaleTimecodeToUs(j3);
                return;
            }
            return;
        }
        if (i != 374648427) {
            if (i != 475249515) {
                return;
            }
            if (!this.sentSeekMap) {
                this.extractorOutput.seekMap(buildSeekMap(this.cueTimesUs, this.cueClusterPositions));
                this.sentSeekMap = true;
            }
            this.cueTimesUs = null;
            this.cueClusterPositions = null;
        } else {
            if (this.tracks.size() == 0) {
                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            this.extractorOutput.endTracks();
        }
    }

    @CallSuper
    public void integerElement(int i, long j) throws ParserException {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                getCurrentTrack(i).type = (int) j;
                return;
            case 136:
                getCurrentTrack(i).flagDefault = j == 1;
                return;
            case 155:
                this.blockDurationUs = scaleTimecodeToUs(j);
                return;
            case 159:
                getCurrentTrack(i).channelCount = (int) j;
                return;
            case 176:
                getCurrentTrack(i).width = (int) j;
                return;
            case 179:
                assertInCues(i);
                this.cueTimesUs.add(scaleTimecodeToUs(j));
                return;
            case ID_PIXEL_HEIGHT /* 186 */:
                getCurrentTrack(i).height = (int) j;
                return;
            case ID_TRACK_NUMBER /* 215 */:
                getCurrentTrack(i).number = (int) j;
                return;
            case ID_TIME_CODE /* 231 */:
                this.clusterTimecodeUs = scaleTimecodeToUs(j);
                return;
            case ID_BLOCK_ADD_ID /* 238 */:
                this.blockAdditionalId = (int) j;
                return;
            case ID_CUE_CLUSTER_POSITION /* 241 */:
                if (this.seenClusterPositionForCurrentCuePoint) {
                    return;
                }
                assertInCues(i);
                this.cueClusterPositions.add(j);
                this.seenClusterPositionForCurrentCuePoint = true;
                return;
            case ID_REFERENCE_BLOCK /* 251 */:
                this.blockHasReferenceBlock = true;
                return;
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
                getCurrentTrack(i).blockAddIdType = (int) j;
                return;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j == 3) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentCompAlgo " + j + " not supported", null);
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                if (j < 1 || j > 2) {
                    throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case ID_EBML_READ_VERSION /* 17143 */:
                if (j == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("EBMLReadVersion " + j + " not supported", null);
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j == 5) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncAlgo " + j + " not supported", null);
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j + " not supported", null);
            case ID_SEEK_POSITION /* 21420 */:
                this.seekEntryPosition = j + this.segmentContentPosition;
                return;
            case ID_STEREO_MODE /* 21432 */:
                int i2 = (int) j;
                assertInTrackEntry(i);
                if (i2 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i2 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i2 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case ID_DISPLAY_WIDTH /* 21680 */:
                getCurrentTrack(i).displayWidth = (int) j;
                return;
            case ID_DISPLAY_UNIT /* 21682 */:
                getCurrentTrack(i).displayUnit = (int) j;
                return;
            case ID_DISPLAY_HEIGHT /* 21690 */:
                getCurrentTrack(i).displayHeight = (int) j;
                return;
            case ID_FLAG_FORCED /* 21930 */:
                getCurrentTrack(i).flagForced = j == 1;
                return;
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
                assertInTrackEntry(i);
                Track track = this.currentTrack;
                track.hasColorInfo = true;
                track.bitsPerChannel = (int) j;
                return;
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
                getCurrentTrack(i).maxBlockAdditionId = (int) j;
                return;
            case ID_CODEC_DELAY /* 22186 */:
                getCurrentTrack(i).codecDelayNs = j;
                return;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                getCurrentTrack(i).seekPreRollNs = j;
                return;
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
                getCurrentTrack(i).audioBitDepth = (int) j;
                return;
            case ID_DISCARD_PADDING /* 30114 */:
                this.blockGroupDiscardPaddingNs = j;
                return;
            case ID_PROJECTION_TYPE /* 30321 */:
                assertInTrackEntry(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i3 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i3 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case ID_DEFAULT_DURATION /* 2352003 */:
                getCurrentTrack(i).defaultSampleDurationNs = (int) j;
                return;
            case ID_TIMECODE_SCALE /* 2807729 */:
                this.timecodeScale = j;
                return;
            default:
                switch (i) {
                    case ID_COLOUR_RANGE /* 21945 */:
                        assertInTrackEntry(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.currentTrack.colorRange = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.currentTrack.colorRange = 1;
                            return;
                        }
                    case ID_COLOUR_TRANSFER /* 21946 */:
                        assertInTrackEntry(i);
                        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.currentTrack.colorTransfer = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case ID_COLOUR_PRIMARIES /* 21947 */:
                        assertInTrackEntry(i);
                        this.currentTrack.hasColorInfo = true;
                        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.currentTrack.colorSpace = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case ID_MAX_CLL /* 21948 */:
                        getCurrentTrack(i).maxContentLuminance = (int) j;
                        return;
                    case ID_MAX_FALL /* 21949 */:
                        getCurrentTrack(i).maxFrameAverageLuminance = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    public void floatElement(int i, double d) throws ParserException {
        if (i == 181) {
            getCurrentTrack(i).sampleRate = (int) d;
        }
        if (i == 17545) {
            this.durationTimecode = (long) d;
            return;
        }
        switch (i) {
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                getCurrentTrack(i).primaryRChromaticityX = (float) d;
                break;
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                getCurrentTrack(i).primaryRChromaticityY = (float) d;
                break;
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                getCurrentTrack(i).primaryGChromaticityX = (float) d;
                break;
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                getCurrentTrack(i).primaryGChromaticityY = (float) d;
                break;
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                getCurrentTrack(i).primaryBChromaticityX = (float) d;
                break;
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                getCurrentTrack(i).primaryBChromaticityY = (float) d;
                break;
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                getCurrentTrack(i).whitePointChromaticityX = (float) d;
                break;
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                getCurrentTrack(i).whitePointChromaticityY = (float) d;
                break;
            case ID_LUMNINANCE_MAX /* 21977 */:
                getCurrentTrack(i).maxMasteringLuminance = (float) d;
                break;
            case ID_LUMNINANCE_MIN /* 21978 */:
                getCurrentTrack(i).minMasteringLuminance = (float) d;
                break;
            default:
                switch (i) {
                    case ID_PROJECTION_POSE_YAW /* 30323 */:
                        getCurrentTrack(i).projectionPoseYaw = (float) d;
                        break;
                    case ID_PROJECTION_POSE_PITCH /* 30324 */:
                        getCurrentTrack(i).projectionPosePitch = (float) d;
                        break;
                    case ID_PROJECTION_POSE_ROLL /* 30325 */:
                        getCurrentTrack(i).projectionPoseRoll = (float) d;
                        break;
                }
        }
    }

    @CallSuper
    public void stringElement(int i, String str) throws ParserException {
        if (i == 134) {
            getCurrentTrack(i).codecId = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                getCurrentTrack(i).name = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                getCurrentTrack(i).language = str;
                return;
            }
        }
        if (DOC_TYPE_WEBM.equals(str) || DOC_TYPE_MATROSKA.equals(str)) {
            return;
        }
        throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    @CallSuper
    public void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException {
        Track track;
        int i3;
        Track track2;
        Track track3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.blockState != 2) {
                    return;
                }
                handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput, i2);
                return;
            }
            if (i == 16877) {
                handleBlockAddIDExtraData(getCurrentTrack(i), extractorInput, i2);
                return;
            }
            if (i == 16981) {
                assertInTrackEntry(i);
                byte[] bArr = new byte[i2];
                this.currentTrack.sampleStrippedBytes = bArr;
                extractorInput.readFully(bArr, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr2 = new byte[i2];
                extractorInput.readFully(bArr2, 0, i2);
                getCurrentTrack(i).cryptoData = new TrackOutput.CryptoData(1, bArr2, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(this.seekEntryIdBytes.getData(), (byte) 0);
                extractorInput.readFully(this.seekEntryIdBytes.getData(), 4 - i2, i2);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            }
            if (i == 25506) {
                assertInTrackEntry(i);
                byte[] bArr3 = new byte[i2];
                this.currentTrack.codecPrivate = bArr3;
                extractorInput.readFully(bArr3, 0, i2);
                return;
            }
            if (i == 30322) {
                assertInTrackEntry(i);
                byte[] bArr4 = new byte[i2];
                this.currentTrack.projectionData = bArr4;
                extractorInput.readFully(bArr4, 0, i2);
                return;
            }
            throw ParserException.createForMalformedContainer("Unexpected id: " + i, null);
        }
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = C2732C.TIME_UNSET;
            this.blockState = 1;
            this.scratch.reset(0);
        }
        Track track4 = this.tracks.get(this.blockTrackNumber);
        if (track4 == null) {
            extractorInput.skipFully(i2 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        track4.assertOutputInitialized();
        if (this.blockState == 1) {
            readScratch(extractorInput, 3);
            int i9 = (this.scratch.getData()[2] & 6) >> 1;
            byte b = 255;
            if (i9 == 0) {
                this.blockSampleCount = 1;
                int[] iArrEnsureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                this.blockSampleSizes = iArrEnsureArrayCapacity;
                iArrEnsureArrayCapacity[0] = (i2 - this.blockTrackNumberLength) - 3;
            } else {
                int i10 = 4;
                readScratch(extractorInput, 4);
                int i11 = (this.scratch.getData()[3] & 255) + 1;
                this.blockSampleCount = i11;
                int[] iArrEnsureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i11);
                this.blockSampleSizes = iArrEnsureArrayCapacity2;
                if (i9 == 2) {
                    int i12 = (i2 - this.blockTrackNumberLength) - 4;
                    int i13 = this.blockSampleCount;
                    Arrays.fill(iArrEnsureArrayCapacity2, 0, i13, i12 / i13);
                } else {
                    if (i9 != 1) {
                        if (i9 == 3) {
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                int i16 = this.blockSampleCount;
                                if (i14 < i16 - 1) {
                                    this.blockSampleSizes[i14] = i7;
                                    int i17 = i10 + 1;
                                    readScratch(extractorInput, i17);
                                    if (this.scratch.getData()[i10] == 0) {
                                        throw ParserException.createForMalformedContainer("No valid varint length mask found", null);
                                    }
                                    int i18 = i7;
                                    while (true) {
                                        if (i18 >= 8) {
                                            track3 = track4;
                                            j = 0;
                                            break;
                                        }
                                        int i19 = i8 << (7 - i18);
                                        if ((this.scratch.getData()[i10] & i19) != 0) {
                                            i17 += i18;
                                            readScratch(extractorInput, i17);
                                            track3 = track4;
                                            j = (~i19) & this.scratch.getData()[i10] & b;
                                            int i20 = i10 + 1;
                                            while (i20 < i17) {
                                                j = (j << 8) | (this.scratch.getData()[i20] & b);
                                                i20++;
                                                b = 255;
                                            }
                                            if (i14 > 0) {
                                                j -= (1 << ((i18 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i18++;
                                            i8 = 1;
                                            b = 255;
                                        }
                                    }
                                    i10 = i17;
                                    if (j < ParserMinimalBase.MIN_INT_L || j > ParserMinimalBase.MAX_INT_L) {
                                        break;
                                    }
                                    int i21 = (int) j;
                                    int[] iArr = this.blockSampleSizes;
                                    if (i14 != 0) {
                                        i21 += iArr[i14 - 1];
                                    }
                                    iArr[i14] = i21;
                                    i15 += i21;
                                    i14++;
                                    track4 = track3;
                                    i7 = 0;
                                    i8 = 1;
                                    b = 255;
                                } else {
                                    track2 = track4;
                                    this.blockSampleSizes[i16 - 1] = ((i2 - this.blockTrackNumberLength) - i10) - i15;
                                    break;
                                }
                            }
                            throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                        }
                        throw ParserException.createForMalformedContainer("Unexpected lacing value: " + i9, null);
                    }
                    int i22 = 0;
                    int i23 = 0;
                    while (true) {
                        i4 = this.blockSampleCount;
                        if (i22 >= i4 - 1) {
                            break;
                        }
                        this.blockSampleSizes[i22] = 0;
                        while (true) {
                            i5 = i10 + 1;
                            readScratch(extractorInput, i5);
                            int i24 = this.scratch.getData()[i10] & 255;
                            int[] iArr2 = this.blockSampleSizes;
                            i6 = iArr2[i22] + i24;
                            iArr2[i22] = i6;
                            if (i24 != 255) {
                                break;
                            } else {
                                i10 = i5;
                            }
                        }
                        i23 += i6;
                        i22++;
                        i10 = i5;
                    }
                    this.blockSampleSizes[i4 - 1] = ((i2 - this.blockTrackNumberLength) - i10) - i23;
                }
            }
            track2 = track4;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[0] << 8) | (this.scratch.getData()[1] & 255));
            track = track2;
            this.blockFlags = (track.type == 2 || (i == 163 && (this.scratch.getData()[2] & 128) == 128)) ? 1 : 0;
            this.blockState = 2;
            this.blockSampleIndex = 0;
            i3 = ID_SIMPLE_BLOCK;
        } else {
            track = track4;
            i3 = 163;
        }
        if (i == i3) {
            while (true) {
                int i25 = this.blockSampleIndex;
                if (i25 < this.blockSampleCount) {
                    commitSampleToOutput(track, ((this.blockSampleIndex * track.defaultSampleDurationNs) / 1000) + this.blockTimeUs, this.blockFlags, writeSampleData(extractorInput, track, this.blockSampleSizes[i25], false), 0);
                    this.blockSampleIndex++;
                } else {
                    this.blockState = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i26 = this.blockSampleIndex;
                if (i26 >= this.blockSampleCount) {
                    return;
                }
                int[] iArr3 = this.blockSampleSizes;
                iArr3[i26] = writeSampleData(extractorInput, track, iArr3[i26], true);
                this.blockSampleIndex++;
            }
        }
    }

    public void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i) throws IOException {
        if (track.blockAddIdType == 1685485123 || track.blockAddIdType == 1685480259) {
            byte[] bArr = new byte[i];
            track.dolbyVisionConfigBytes = bArr;
            extractorInput.readFully(bArr, 0, i);
            return;
        }
        extractorInput.skipFully(i);
    }

    public void handleBlockAdditionalData(Track track, int i, ExtractorInput extractorInput, int i2) throws IOException {
        if (i == 4 && CODEC_ID_VP9.equals(track.codecId)) {
            this.supplementalData.reset(i2);
            extractorInput.readFully(this.supplementalData.getData(), 0, i2);
        } else {
            extractorInput.skipFully(i2);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    public final void assertInTrackEntry(int i) throws ParserException {
        if (this.currentTrack != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i + " must be in a TrackEntry", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void assertInCues(int i) throws ParserException {
        if (this.cueTimesUs == null || this.cueClusterPositions == null) {
            throw ParserException.createForMalformedContainer("Element " + i + " must be in a Cues", null);
        }
    }

    public Track getCurrentTrack(int i) throws ParserException {
        assertInTrackEntry(i);
        return this.currentTrack;
    }

    @RequiresNonNull({"#1.output"})
    public final void commitSampleToOutput(Track track, long j, int i, int i2, int i3) {
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track.output, j, i, i2, i3, track.cryptoData);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId) || CODEC_ID_ASS.equals(track.codecId) || CODEC_ID_VTT.equals(track.codecId)) {
                if (this.blockSampleCount > 1) {
                    Log.m635w(TAG, "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.blockDurationUs;
                    if (j2 == C2732C.TIME_UNSET) {
                        Log.m635w(TAG, "Skipping subtitle sample with no duration.");
                    } else {
                        setSubtitleEndTime(track.codecId, j2, this.subtitleSample.getData());
                        int position = this.subtitleSample.getPosition();
                        while (true) {
                            if (position >= this.subtitleSample.limit()) {
                                break;
                            }
                            if (this.subtitleSample.getData()[position] == 0) {
                                this.subtitleSample.setLimit(position);
                                break;
                            }
                            position++;
                        }
                        TrackOutput trackOutput = track.output;
                        ParsableByteArray parsableByteArray = this.subtitleSample;
                        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                        i2 += this.subtitleSample.limit();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.blockSampleCount > 1) {
                    this.supplementalData.reset(0);
                } else {
                    int iLimit = this.supplementalData.limit();
                    track.output.sampleData(this.supplementalData, iLimit, 2);
                    i2 += iLimit;
                }
            }
            track.output.sampleMetadata(j, i, i2, i3, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    public final void readScratch(ExtractorInput extractorInput, int i) throws IOException {
        if (this.scratch.limit() >= i) {
            return;
        }
        if (this.scratch.capacity() < i) {
            ParsableByteArray parsableByteArray = this.scratch;
            parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i));
        }
        extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i - this.scratch.limit());
        this.scratch.setLimit(i);
    }

    @RequiresNonNull({"#2.output"})
    public final int writeSampleData(ExtractorInput extractorInput, Track track, int i, boolean z) throws IOException {
        int i2;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i);
            return finishWriteSampleData();
        }
        if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i);
            return finishWriteSampleData();
        }
        if (CODEC_ID_VTT.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i);
            return finishWriteSampleData();
        }
        TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.getData(), 0, 1);
                    this.sampleBytesRead++;
                    if ((this.scratch.getData()[0] & 128) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.sampleSignalByte = this.scratch.getData()[0];
                    this.sampleSignalByteRead = true;
                }
                byte b = this.sampleSignalByte;
                if ((b & 1) == 1) {
                    boolean z2 = (b & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        this.scratch.getData()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.scratch.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (z2) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.getData(), 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i3 = this.samplePartitionCount * 4;
                        this.scratch.reset(i3);
                        extractorInput.readFully(this.scratch.getData(), 0, i3);
                        this.sampleBytesRead += i3;
                        short s = (short) ((this.samplePartitionCount / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i4);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.samplePartitionCount;
                            if (i5 >= i2) {
                                break;
                            }
                            int unsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            if (i5 % 2 == 0) {
                                this.encryptionSubsampleDataBuffer.putShort((short) (unsignedIntToInt - i6));
                            } else {
                                this.encryptionSubsampleDataBuffer.putInt(unsignedIntToInt - i6);
                            }
                            i5++;
                            i6 = unsignedIntToInt;
                        }
                        int i7 = (i - this.sampleBytesRead) - i6;
                        if (i2 % 2 == 1) {
                            this.encryptionSubsampleDataBuffer.putInt(i7);
                        } else {
                            this.encryptionSubsampleDataBuffer.putShort((short) i7);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i4);
                        trackOutput.sampleData(this.encryptionSubsampleData, i4, 1);
                        this.sampleBytesWritten += i4;
                    }
                }
            } else {
                byte[] bArr = track.sampleStrippedBytes;
                if (bArr != null) {
                    this.sampleStrippedBytes.reset(bArr, bArr.length);
                }
            }
            if (track.samplesHaveSupplementalData(z)) {
                this.blockFlags |= 268435456;
                this.supplementalData.reset(0);
                int iLimit = (this.sampleStrippedBytes.limit() + i) - this.sampleBytesRead;
                this.scratch.reset(4);
                this.scratch.getData()[0] = (byte) ((iLimit >> 24) & 255);
                this.scratch.getData()[1] = (byte) ((iLimit >> 16) & 255);
                this.scratch.getData()[2] = (byte) ((iLimit >> 8) & 255);
                this.scratch.getData()[3] = (byte) (iLimit & 255);
                trackOutput.sampleData(this.scratch, 4, 2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int iLimit2 = i + this.sampleStrippedBytes.limit();
        if (CODEC_ID_H264.equals(track.codecId) || CODEC_ID_H265.equals(track.codecId)) {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i8 = track.nalUnitLengthFieldLength;
            int i9 = 4 - i8;
            while (this.sampleBytesRead < iLimit2) {
                int i10 = this.sampleCurrentNalBytesRemaining;
                if (i10 == 0) {
                    writeToTarget(extractorInput, data, i9, i8);
                    this.sampleBytesRead += i8;
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    int iWriteToOutput = writeToOutput(extractorInput, trackOutput, i10);
                    this.sampleBytesRead += iWriteToOutput;
                    this.sampleBytesWritten += iWriteToOutput;
                    this.sampleCurrentNalBytesRemaining -= iWriteToOutput;
                }
            }
        } else {
            if (track.trueHdSampleRechunker != null) {
                Assertions.checkState(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i11 = this.sampleBytesRead;
                if (i11 >= iLimit2) {
                    break;
                }
                int iWriteToOutput2 = writeToOutput(extractorInput, trackOutput, iLimit2 - i11);
                this.sampleBytesRead += iWriteToOutput2;
                this.sampleBytesWritten += iWriteToOutput2;
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
        return finishWriteSampleData();
    }

    public final int finishWriteSampleData() {
        int i = this.sampleBytesWritten;
        resetWriteSampleData();
        return i;
    }

    public final void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    public final void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.reset(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    public static void setSubtitleEndTime(String str, long j, byte[] bArr) {
        byte[] subtitleTimecode;
        int i;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                subtitleTimecode = formatSubtitleTimecode(j, SSA_TIMECODE_FORMAT, 10000L);
                i = 21;
                break;
            case "S_TEXT/WEBVTT":
                subtitleTimecode = formatSubtitleTimecode(j, VTT_TIMECODE_FORMAT, 1000L);
                i = 25;
                break;
            case "S_TEXT/UTF8":
                subtitleTimecode = formatSubtitleTimecode(j, SUBRIP_TIMECODE_FORMAT, 1000L);
                i = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(subtitleTimecode, 0, bArr, i, subtitleTimecode.length);
    }

    public static byte[] formatSubtitleTimecode(long j, String str, long j2) {
        Assertions.checkArgument(j != C2732C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    public final void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws IOException {
        int iMin = Math.min(i2, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i, iMin);
        }
    }

    public final int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i) throws IOException {
        int iBytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (iBytesLeft > 0) {
            int iMin = Math.min(i, iBytesLeft);
            trackOutput.sampleData(this.sampleStrippedBytes, iMin);
            return iMin;
        }
        return trackOutput.sampleData((DataReader) extractorInput, i, false);
    }

    public final SeekMap buildSeekMap(@Nullable LongArray longArray, @Nullable LongArray longArray2) {
        int i;
        if (this.segmentContentPosition == -1 || this.durationUs == C2732C.TIME_UNSET || longArray == null || longArray.size() == 0 || longArray2 == null || longArray2.size() != longArray.size()) {
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = longArray.size();
        int[] iArrCopyOf = new int[size];
        long[] jArrCopyOf = new long[size];
        long[] jArrCopyOf2 = new long[size];
        long[] jArrCopyOf3 = new long[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jArrCopyOf3[i3] = longArray.get(i3);
            jArrCopyOf[i3] = this.segmentContentPosition + longArray2.get(i3);
        }
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArrCopyOf[i2] = (int) (jArrCopyOf[i4] - jArrCopyOf[i2]);
            jArrCopyOf2[i2] = jArrCopyOf3[i4] - jArrCopyOf3[i2];
            i2 = i4;
        }
        iArrCopyOf[i] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArrCopyOf[i]);
        long j = this.durationUs - jArrCopyOf3[i];
        jArrCopyOf2[i] = j;
        if (j <= 0) {
            Log.m635w(TAG, "Discarding last cue point with unexpected duration: " + j);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
        }
        return new ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    public final boolean maybeSeekForCues(PositionHolder positionHolder, long j) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j2 = this.seekPositionAfterBuildingCues;
            if (j2 != -1) {
                positionHolder.position = j2;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    public final long scaleTimecodeToUs(long j) throws ParserException {
        long j2 = this.timecodeScale;
        if (j2 == C2732C.TIME_UNSET) {
            throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return Util.scaleLargeTimestamp(j, j2, 1000L);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean isCodecSupported(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(CODEC_ID_MPEG4_AP)) {
                    c = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals(CODEC_ID_MPEG4_SP)) {
                    c = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals(CODEC_ID_ACM)) {
                    c = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals(CODEC_ID_TRUEHD)) {
                    c = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals(CODEC_ID_VORBIS)) {
                    c = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals(CODEC_ID_MP2)) {
                    c = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals(CODEC_ID_MP3)) {
                    c = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals(CODEC_ID_FOURCC)) {
                    c = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals(CODEC_ID_DVBSUB)) {
                    c = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals(CODEC_ID_MPEG4_ASP)) {
                    c = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals(CODEC_ID_H264)) {
                    c = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals(CODEC_ID_VOBSUB)) {
                    c = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals(CODEC_ID_DTS_LOSSLESS)) {
                    c = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals(CODEC_ID_AAC)) {
                    c = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals(CODEC_ID_AC3)) {
                    c = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals(CODEC_ID_DTS)) {
                    c = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals(CODEC_ID_AV1)) {
                    c = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals(CODEC_ID_VP8)) {
                    c = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals(CODEC_ID_VP9)) {
                    c = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals(CODEC_ID_PGS)) {
                    c = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals(CODEC_ID_THEORA)) {
                    c = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals(CODEC_ID_DTS_EXPRESS)) {
                    c = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals(CODEC_ID_PCM_FLOAT)) {
                    c = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals(CODEC_ID_PCM_INT_BIG)) {
                    c = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals(CODEC_ID_PCM_INT_LIT)) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals(CODEC_ID_ASS)) {
                    c = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals(CODEC_ID_H265)) {
                    c = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals(CODEC_ID_VTT)) {
                    c = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals(CODEC_ID_SUBRIP)) {
                    c = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals(CODEC_ID_MPEG2)) {
                    c = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals(CODEC_ID_E_AC3)) {
                    c = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals(CODEC_ID_FLAC)) {
                    c = XmlEscapers.MAX_ASCII_CONTROL_CHAR;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals(CODEC_ID_OPUS)) {
                    c = ' ';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    public static int[] ensureArrayCapacity(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    @EnsuresNonNull({"extractorOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.extractorOutput);
    }

    public final class InnerEbmlProcessor implements EbmlProcessor {
        public InnerEbmlProcessor() {
        }

        public /* synthetic */ InnerEbmlProcessor(MatroskaExtractor matroskaExtractor, C29701 c29701) {
            this();
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public int getElementType(int i) {
            return MatroskaExtractor.this.getElementType(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i) {
            return MatroskaExtractor.this.isLevel1Element(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i, long j, long j2) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i, j, j2);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void integerElement(int i, long j) throws ParserException {
            MatroskaExtractor.this.integerElement(i, j);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void floatElement(int i, double d) throws ParserException {
            MatroskaExtractor.this.floatElement(i, d);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void stringElement(int i, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i, str);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException {
            MatroskaExtractor.this.binaryElement(i, i2, extractorInput);
        }
    }

    public static final class Track {
        public static final int DEFAULT_MAX_CLL = 1000;
        public static final int DEFAULT_MAX_FALL = 200;
        public static final int DISPLAY_UNIT_PIXELS = 0;
        public static final int MAX_CHROMATICITY = 50000;
        public int blockAddIdType;
        public String codecId;
        public byte[] codecPrivate;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagForced;
        public boolean hasContentEncryption;
        public int maxBlockAdditionId;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public byte[] sampleStrippedBytes;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public int width = -1;
        public int height = -1;
        public int bitsPerChannel = -1;
        public int displayWidth = -1;
        public int displayHeight = -1;
        public int displayUnit = 0;
        public int projectionType = -1;
        public float projectionPoseYaw = 0.0f;
        public float projectionPosePitch = 0.0f;
        public float projectionPoseRoll = 0.0f;
        public byte[] projectionData = null;
        public int stereoMode = -1;
        public boolean hasColorInfo = false;
        public int colorSpace = -1;
        public int colorTransfer = -1;
        public int colorRange = -1;
        public int maxContentLuminance = 1000;
        public int maxFrameAverageLuminance = 200;
        public float primaryRChromaticityX = -1.0f;
        public float primaryRChromaticityY = -1.0f;
        public float primaryGChromaticityX = -1.0f;
        public float primaryGChromaticityY = -1.0f;
        public float primaryBChromaticityX = -1.0f;
        public float primaryBChromaticityY = -1.0f;
        public float whitePointChromaticityX = -1.0f;
        public float whitePointChromaticityY = -1.0f;
        public float maxMasteringLuminance = -1.0f;
        public float minMasteringLuminance = -1.0f;
        public int channelCount = 1;
        public int audioBitDepth = -1;
        public int sampleRate = 8000;
        public long codecDelayNs = 0;
        public long seekPreRollNs = 0;
        public boolean flagDefault = true;
        public String language = "eng";

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:297:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:504:0x0449  */
        /* JADX WARN: Removed duplicated region for block: B:509:0x0463  */
        /* JADX WARN: Removed duplicated region for block: B:510:0x0465  */
        /* JADX WARN: Removed duplicated region for block: B:513:0x0472  */
        /* JADX WARN: Removed duplicated region for block: B:514:0x0484  */
        /* JADX WARN: Removed duplicated region for block: B:561:0x0558  */
        /* JADX WARN: Removed duplicated region for block: B:581:0x05af  */
        @EnsuresNonNull({"this.output"})
        @RequiresNonNull({"codecId"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void initializeOutput(ExtractorOutput extractorOutput, int i) throws ParserException {
            char c;
            int i2;
            List<byte[]> listSingletonList;
            String str;
            int i3;
            int i4;
            List<byte[]> list;
            String str2;
            String str3;
            Format.Builder builder;
            int i5;
            int iIntValue;
            int i6;
            DolbyVisionConfig dolbyVisionConfig;
            String str4 = this.codecId;
            str4.hashCode();
            String str5 = MimeTypes.AUDIO_RAW;
            switch (str4.hashCode()) {
                case -2095576542:
                    if (!str4.equals(MatroskaExtractor.CODEC_ID_MPEG4_AP)) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case -2095575984:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MPEG4_SP)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1985379776:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_ACM)) {
                        c = 2;
                        break;
                    }
                    break;
                case -1784763192:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_TRUEHD)) {
                        c = 3;
                        break;
                    }
                    break;
                case -1730367663:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VORBIS)) {
                        c = 4;
                        break;
                    }
                    break;
                case -1482641358:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MP2)) {
                        c = 5;
                        break;
                    }
                    break;
                case -1482641357:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MP3)) {
                        c = 6;
                        break;
                    }
                    break;
                case -1373388978:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_FOURCC)) {
                        c = 7;
                        break;
                    }
                    break;
                case -933872740:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_DVBSUB)) {
                        c = '\b';
                        break;
                    }
                    break;
                case -538363189:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MPEG4_ASP)) {
                        c = '\t';
                        break;
                    }
                    break;
                case -538363109:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_H264)) {
                        c = '\n';
                        break;
                    }
                    break;
                case -425012669:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VOBSUB)) {
                        c = 11;
                        break;
                    }
                    break;
                case -356037306:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_DTS_LOSSLESS)) {
                        c = '\f';
                        break;
                    }
                    break;
                case 62923557:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_AAC)) {
                        c = '\r';
                        break;
                    }
                    break;
                case 62923603:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_AC3)) {
                        c = 14;
                        break;
                    }
                    break;
                case 62927045:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_DTS)) {
                        c = 15;
                        break;
                    }
                    break;
                case 82318131:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_AV1)) {
                        c = 16;
                        break;
                    }
                    break;
                case 82338133:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VP8)) {
                        c = 17;
                        break;
                    }
                    break;
                case 82338134:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VP9)) {
                        c = 18;
                        break;
                    }
                    break;
                case 99146302:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_PGS)) {
                        c = 19;
                        break;
                    }
                    break;
                case 444813526:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_THEORA)) {
                        c = 20;
                        break;
                    }
                    break;
                case 542569478:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_DTS_EXPRESS)) {
                        c = 21;
                        break;
                    }
                    break;
                case 635596514:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_PCM_FLOAT)) {
                        c = 22;
                        break;
                    }
                    break;
                case 725948237:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_PCM_INT_BIG)) {
                        c = 23;
                        break;
                    }
                    break;
                case 725957860:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_PCM_INT_LIT)) {
                        c = 24;
                        break;
                    }
                    break;
                case 738597099:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_ASS)) {
                        c = 25;
                        break;
                    }
                    break;
                case 855502857:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_H265)) {
                        c = 26;
                        break;
                    }
                    break;
                case 1045209816:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VTT)) {
                        c = 27;
                        break;
                    }
                    break;
                case 1422270023:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_SUBRIP)) {
                        c = 28;
                        break;
                    }
                    break;
                case 1809237540:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MPEG2)) {
                        c = 29;
                        break;
                    }
                    break;
                case 1950749482:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_E_AC3)) {
                        c = 30;
                        break;
                    }
                    break;
                case 1950789798:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_FLAC)) {
                        c = XmlEscapers.MAX_ASCII_CONTROL_CHAR;
                        break;
                    }
                    break;
                case 1951062397:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_OPUS)) {
                        c = ' ';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case '\t':
                    i2 = 0;
                    byte[] bArr = this.codecPrivate;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str5 = MimeTypes.VIDEO_MP4V;
                    str = null;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null && (dolbyVisionConfig = DolbyVisionConfig.parse(new ParsableByteArray(this.dolbyVisionConfigBytes))) != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i7 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i3);
                        i5 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.displayUnit == 0) {
                            int i8 = this.displayWidth;
                            iIntValue = -1;
                            if (i8 == -1) {
                                i8 = this.width;
                            }
                            this.displayWidth = i8;
                            int i9 = this.displayHeight;
                            if (i9 == -1) {
                                i9 = this.height;
                            }
                            this.displayHeight = i9;
                        } else {
                            iIntValue = -1;
                        }
                        float f = (this.displayWidth == iIntValue || (i6 = this.displayHeight) == iIntValue) ? -1.0f : (this.height * r7) / (this.width * i6);
                        ColorInfo colorInfoBuild = this.hasColorInfo ? new ColorInfo.Builder().setColorSpace(this.colorSpace).setColorRange(this.colorRange).setColorTransfer(this.colorTransfer).setHdrStaticInfo(getHdrStaticInfo()).setLumaBitdepth(this.bitsPerChannel).setChromaBitdepth(this.bitsPerChannel).build() : null;
                        if (this.name != null && MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                            iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                        }
                        if (this.projectionType == 0 && Float.compare(this.projectionPoseYaw, 0.0f) == 0 && Float.compare(this.projectionPosePitch, 0.0f) == 0) {
                            if (Float.compare(this.projectionPoseRoll, 0.0f) != 0) {
                                if (Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    i2 = 90;
                                } else if (Float.compare(this.projectionPoseRoll, -180.0f) == 0 || Float.compare(this.projectionPoseRoll, 180.0f) == 0) {
                                    i2 = 180;
                                } else if (Float.compare(this.projectionPoseRoll, -90.0f) == 0) {
                                    i2 = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i2).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i5 = 2;
                        } else {
                            i2 = iIntValue;
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i2).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i5 = 2;
                        }
                    } else {
                        if (!MimeTypes.APPLICATION_SUBRIP.equals(str3) && !MimeTypes.TEXT_SSA.equals(str3) && !MimeTypes.TEXT_VTT.equals(str3) && !MimeTypes.APPLICATION_VOBSUB.equals(str3) && !MimeTypes.APPLICATION_PGS.equals(str3) && !MimeTypes.APPLICATION_DVBSUBS.equals(str3)) {
                            throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                        }
                        i5 = 3;
                    }
                    if (this.name != null && !MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i7).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack;
                    trackOutputTrack.format(formatBuild);
                    return;
                case 2:
                    i2 = 0;
                    if (parseMsAcmCodecPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)))) {
                        int pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                        if (pcmEncoding == 0) {
                            Log.m635w(MatroskaExtractor.TAG, "Unsupported PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                        } else {
                            i3 = pcmEncoding;
                            listSingletonList = null;
                            str = null;
                            i4 = -1;
                            if (this.dolbyVisionConfigBytes != null) {
                                str = dolbyVisionConfig.codecs;
                                str5 = MimeTypes.VIDEO_DOLBY_VISION;
                                break;
                            }
                            str3 = str5;
                            int i72 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                            builder = new Format.Builder();
                            if (!MimeTypes.isAudio(str3)) {
                            }
                            if (this.name != null) {
                                builder.setLabel(this.name);
                                break;
                            }
                            Format formatBuild2 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i72).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                            TrackOutput trackOutputTrack2 = extractorOutput.track(this.number, i5);
                            this.output = trackOutputTrack2;
                            trackOutputTrack2.format(formatBuild2);
                            return;
                        }
                    } else {
                        Log.m635w(MatroskaExtractor.TAG, "Non-PCM MS/ACM is unsupported. Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                    }
                    listSingletonList = null;
                    str = null;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i722 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i722).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack22;
                    trackOutputTrack22.format(formatBuild22);
                    return;
                case 3:
                    i2 = 0;
                    this.trueHdSampleRechunker = new TrueHdSampleRechunker();
                    str5 = MimeTypes.AUDIO_TRUEHD;
                    listSingletonList = null;
                    str = null;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i7222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i7222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack222;
                    trackOutputTrack222.format(formatBuild222);
                    return;
                case 4:
                    i2 = 0;
                    listSingletonList = parseVorbisCodecPrivate(getCodecPrivate(this.codecId));
                    str5 = MimeTypes.AUDIO_VORBIS;
                    i4 = 8192;
                    str = null;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i72222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i72222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack2222;
                    trackOutputTrack2222.format(formatBuild2222);
                    return;
                case 5:
                    i2 = 0;
                    str5 = MimeTypes.AUDIO_MPEG_L2;
                    listSingletonList = null;
                    str = null;
                    i4 = 4096;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i722222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i722222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack22222;
                    trackOutputTrack22222.format(formatBuild22222);
                    return;
                case 6:
                    i2 = 0;
                    str5 = MimeTypes.AUDIO_MPEG;
                    listSingletonList = null;
                    str = null;
                    i4 = 4096;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i7222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i7222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack222222;
                    trackOutputTrack222222.format(formatBuild222222);
                    return;
                case 7:
                    i2 = 0;
                    Pair<String, List<byte[]>> fourCcPrivate = parseFourCcPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    str5 = (String) fourCcPrivate.first;
                    listSingletonList = (List) fourCcPrivate.second;
                    str = null;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i72222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i72222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack2222222;
                    trackOutputTrack2222222.format(formatBuild2222222);
                    return;
                case '\b':
                    byte[] bArr2 = new byte[4];
                    i2 = 0;
                    System.arraycopy(getCodecPrivate(this.codecId), 0, bArr2, 0, 4);
                    listSingletonList = ImmutableList.m1172of(bArr2);
                    str5 = MimeTypes.APPLICATION_DVBSUBS;
                    str = null;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i722222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i722222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack22222222;
                    trackOutputTrack22222222.format(formatBuild22222222);
                    return;
                case '\n':
                    AvcConfig avcConfig = AvcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = avcConfig.initializationData;
                    this.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                    str2 = avcConfig.codecs;
                    str5 = MimeTypes.VIDEO_H264;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i7222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i7222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack222222222;
                    trackOutputTrack222222222.format(formatBuild222222222);
                    return;
                case 11:
                    listSingletonList = ImmutableList.m1172of(getCodecPrivate(this.codecId));
                    str5 = MimeTypes.APPLICATION_VOBSUB;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i72222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i72222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack2222222222;
                    trackOutputTrack2222222222.format(formatBuild2222222222);
                    return;
                case '\f':
                    str5 = MimeTypes.AUDIO_DTS_HD;
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i722222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i722222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack22222222222;
                    trackOutputTrack22222222222.format(formatBuild22222222222);
                    return;
                case '\r':
                    listSingletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(this.codecPrivate);
                    this.sampleRate = audioSpecificConfig.sampleRateHz;
                    this.channelCount = audioSpecificConfig.channelCount;
                    str = audioSpecificConfig.codecs;
                    str5 = MimeTypes.AUDIO_AAC;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i7222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i7222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack222222222222;
                    trackOutputTrack222222222222.format(formatBuild222222222222);
                    return;
                case 14:
                    str5 = MimeTypes.AUDIO_AC3;
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i72222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i72222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack2222222222222;
                    trackOutputTrack2222222222222.format(formatBuild2222222222222);
                    return;
                case 15:
                case 21:
                    str5 = MimeTypes.AUDIO_DTS;
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i722222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i722222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack22222222222222;
                    trackOutputTrack22222222222222.format(formatBuild22222222222222);
                    return;
                case 16:
                    str5 = MimeTypes.VIDEO_AV1;
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i7222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i7222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack222222222222222;
                    trackOutputTrack222222222222222.format(formatBuild222222222222222);
                    return;
                case 17:
                    str5 = MimeTypes.VIDEO_VP8;
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i72222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i72222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack2222222222222222;
                    trackOutputTrack2222222222222222.format(formatBuild2222222222222222);
                    return;
                case 18:
                    str5 = MimeTypes.VIDEO_VP9;
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i722222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i722222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack22222222222222222;
                    trackOutputTrack22222222222222222.format(formatBuild22222222222222222);
                    return;
                case 19:
                    str5 = MimeTypes.APPLICATION_PGS;
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i7222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i7222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack222222222222222222;
                    trackOutputTrack222222222222222222.format(formatBuild222222222222222222);
                    return;
                case 20:
                    str5 = MimeTypes.VIDEO_UNKNOWN;
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i72222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i72222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack2222222222222222222;
                    trackOutputTrack2222222222222222222.format(formatBuild2222222222222222222);
                    return;
                case 22:
                    if (this.audioBitDepth != 32) {
                        Log.m635w(MatroskaExtractor.TAG, "Unsupported floating point PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                        listSingletonList = null;
                        str = null;
                        str5 = MimeTypes.AUDIO_UNKNOWN;
                        i2 = 0;
                        i4 = -1;
                        i3 = -1;
                        if (this.dolbyVisionConfigBytes != null) {
                        }
                        str3 = str5;
                        int i722222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                        builder = new Format.Builder();
                        if (!MimeTypes.isAudio(str3)) {
                        }
                        if (this.name != null) {
                        }
                        Format formatBuild22222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i722222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack22222222222222222222 = extractorOutput.track(this.number, i5);
                        this.output = trackOutputTrack22222222222222222222;
                        trackOutputTrack22222222222222222222.format(formatBuild22222222222222222222);
                        return;
                    }
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = 4;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i7222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i7222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack222222222222222222222;
                    trackOutputTrack222222222222222222222.format(formatBuild222222222222222222222);
                    return;
                case 23:
                    int i10 = this.audioBitDepth;
                    if (i10 == 8) {
                        i3 = 3;
                    } else if (i10 == 16) {
                        i3 = 268435456;
                    } else if (i10 == 24) {
                        i3 = C2732C.ENCODING_PCM_24BIT_BIG_ENDIAN;
                    } else {
                        if (i10 != 32) {
                            Log.m635w(MatroskaExtractor.TAG, "Unsupported big endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                            listSingletonList = null;
                            str = null;
                            str5 = MimeTypes.AUDIO_UNKNOWN;
                            i2 = 0;
                            i4 = -1;
                            i3 = -1;
                            if (this.dolbyVisionConfigBytes != null) {
                            }
                            str3 = str5;
                            int i72222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                            builder = new Format.Builder();
                            if (!MimeTypes.isAudio(str3)) {
                            }
                            if (this.name != null) {
                            }
                            Format formatBuild2222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i72222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                            TrackOutput trackOutputTrack2222222222222222222222 = extractorOutput.track(this.number, i5);
                            this.output = trackOutputTrack2222222222222222222222;
                            trackOutputTrack2222222222222222222222.format(formatBuild2222222222222222222222);
                            return;
                        }
                        i3 = C2732C.ENCODING_PCM_32BIT_BIG_ENDIAN;
                    }
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i722222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i722222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack22222222222222222222222;
                    trackOutputTrack22222222222222222222222.format(formatBuild22222222222222222222222);
                    return;
                case 24:
                    int pcmEncoding2 = Util.getPcmEncoding(this.audioBitDepth);
                    if (pcmEncoding2 == 0) {
                        Log.m635w(MatroskaExtractor.TAG, "Unsupported little endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                        listSingletonList = null;
                        str = null;
                        str5 = MimeTypes.AUDIO_UNKNOWN;
                        i2 = 0;
                        i4 = -1;
                        i3 = -1;
                        if (this.dolbyVisionConfigBytes != null) {
                        }
                        str3 = str5;
                        int i7222222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                        builder = new Format.Builder();
                        if (!MimeTypes.isAudio(str3)) {
                        }
                        if (this.name != null) {
                        }
                        Format formatBuild222222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i7222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack222222222222222222222222 = extractorOutput.track(this.number, i5);
                        this.output = trackOutputTrack222222222222222222222222;
                        trackOutputTrack222222222222222222222222.format(formatBuild222222222222222222222222);
                        return;
                    }
                    i3 = pcmEncoding2;
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i72222222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i72222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack2222222222222222222222222;
                    trackOutputTrack2222222222222222222222222.format(formatBuild2222222222222222222222222);
                    return;
                case 25:
                    listSingletonList = ImmutableList.m1173of(MatroskaExtractor.SSA_DIALOGUE_FORMAT, getCodecPrivate(this.codecId));
                    str = null;
                    str5 = MimeTypes.TEXT_SSA;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i722222222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i722222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack22222222222222222222222222;
                    trackOutputTrack22222222222222222222222222.format(formatBuild22222222222222222222222222);
                    return;
                case 26:
                    HevcConfig hevcConfig = HevcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = hevcConfig.initializationData;
                    this.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    str2 = hevcConfig.codecs;
                    str5 = MimeTypes.VIDEO_H265;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    List<byte[]> list22 = list;
                    str = str2;
                    listSingletonList = list22;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i7222222222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i7222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack222222222222222222222222222;
                    trackOutputTrack222222222222222222222222222.format(formatBuild222222222222222222222222222);
                    return;
                case 27:
                    listSingletonList = null;
                    str = null;
                    str5 = MimeTypes.TEXT_VTT;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i72222222222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i72222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack2222222222222222222222222222;
                    trackOutputTrack2222222222222222222222222222.format(formatBuild2222222222222222222222222222);
                    return;
                case 28:
                    listSingletonList = null;
                    str = null;
                    str5 = MimeTypes.APPLICATION_SUBRIP;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i722222222222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i722222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack22222222222222222222222222222;
                    trackOutputTrack22222222222222222222222222222.format(formatBuild22222222222222222222222222222);
                    return;
                case 29:
                    str5 = MimeTypes.VIDEO_MPEG2;
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i7222222222222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i7222222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack222222222222222222222222222222;
                    trackOutputTrack222222222222222222222222222222.format(formatBuild222222222222222222222222222222);
                    return;
                case 30:
                    str5 = MimeTypes.AUDIO_E_AC3;
                    listSingletonList = null;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i72222222222222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i72222222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222222222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack2222222222222222222222222222222;
                    trackOutputTrack2222222222222222222222222222222.format(formatBuild2222222222222222222222222222222);
                    return;
                case 31:
                    listSingletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    str5 = MimeTypes.AUDIO_FLAC;
                    str = null;
                    i2 = 0;
                    i4 = -1;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i722222222222222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i722222222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222222222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack22222222222222222222222222222222;
                    trackOutputTrack22222222222222222222222222222222.format(formatBuild22222222222222222222222222222222);
                    return;
                case ' ':
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(getCodecPrivate(this.codecId));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.codecDelayNs).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.seekPreRollNs).array());
                    str5 = MimeTypes.AUDIO_OPUS;
                    i4 = MatroskaExtractor.OPUS_MAX_INPUT_SIZE;
                    str = null;
                    i2 = 0;
                    i3 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i7222222222222222222222222222222222 = (!this.flagForced ? 2 : i2) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222222222222222222222 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i7222222222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222222222222222222222 = extractorOutput.track(this.number, i5);
                    this.output = trackOutputTrack222222222222222222222222222222222;
                    trackOutputTrack222222222222222222222222222222222.format(formatBuild222222222222222222222222222222222);
                    return;
                default:
                    throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
            }
        }

        @RequiresNonNull({P2ArtifactParser.RuleHandler.OUTPUT})
        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }

        public final boolean samplesHaveSupplementalData(boolean z) {
            return MatroskaExtractor.CODEC_ID_OPUS.equals(this.codecId) ? z : this.maxBlockAdditionId > 0;
        }

        @Nullable
        public final byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.maxMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) (this.minMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) this.maxContentLuminance);
            byteBufferOrder.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        public static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_DIVX, null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (littleEndianUnsignedInt == 826496599) {
                    byte[] data = parsableByteArray.getData();
                    for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                        if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                            return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                        }
                    }
                    throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
                }
                Log.m635w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        public static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4];
                    if ((i & 255) != 255) {
                        break;
                    }
                    i3 += 255;
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 + (i & 255);
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if ((i2 & 255) != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + (i2 & 255);
                if (bArr[i8] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        public static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort != 65534) {
                    return false;
                }
                parsableByteArray.setPosition(24);
                if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits()) {
                    if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        @EnsuresNonNull({P2ArtifactParser.RuleHandler.OUTPUT})
        public final void assertOutputInitialized() {
            Assertions.checkNotNull(this.output);
        }

        @EnsuresNonNull({"codecPrivate"})
        public final byte[] getCodecPrivate(String str) throws ParserException {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }
    }
}
