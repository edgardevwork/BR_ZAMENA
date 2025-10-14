package androidx.media3.extractor.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.location.GpsStatusWrapper;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C2732C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.MetadataUtil;
import androidx.media3.extractor.p007ts.PsExtractor;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.apache.commons.compress.harmony.pack200.BcBands;
import org.apache.http.HttpStatus;

@UnstableApi
/* loaded from: classes2.dex */
public final class Cea608Decoder extends CeaDecoder {
    public static final int CC_FIELD_FLAG = 1;
    public static final byte CC_IMPLICIT_DATA_HEADER = -4;
    public static final int CC_MODE_PAINT_ON = 3;
    public static final int CC_MODE_POP_ON = 2;
    public static final int CC_MODE_ROLL_UP = 1;
    public static final int CC_MODE_UNKNOWN = 0;
    public static final int CC_TYPE_FLAG = 2;
    public static final int CC_VALID_FLAG = 4;
    public static final byte CTRL_BACKSPACE = 33;
    public static final byte CTRL_CARRIAGE_RETURN = 45;
    public static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    public static final byte CTRL_END_OF_CAPTION = 47;
    public static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    public static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    public static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    public static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    public static final byte CTRL_RESUME_TEXT_DISPLAY = 43;
    public static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    public static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    public static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    public static final byte CTRL_TEXT_RESTART = 42;
    public static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    public static final long MIN_DATA_CHANNEL_TIMEOUT_MS = 16000;
    public static final int NTSC_CC_CHANNEL_1 = 0;
    public static final int NTSC_CC_CHANNEL_2 = 1;
    public static final int NTSC_CC_FIELD_1 = 0;
    public static final int NTSC_CC_FIELD_2 = 1;
    public static final int STYLE_ITALICS = 7;
    public static final int STYLE_UNCHANGED = 8;
    public static final String TAG = "Cea608Decoder";
    public int captionMode;
    public int captionRowCount;

    @Nullable
    public List<Cue> cues;
    public boolean isCaptionValid;
    public boolean isInCaptionService;
    public long lastCueUpdateUs;

    @Nullable
    public List<Cue> lastCues;
    public final int packetLength;
    public byte repeatableControlCc1;
    public byte repeatableControlCc2;
    public boolean repeatableControlSet;
    public final int selectedChannel;
    public final int selectedField;
    public final long validDataChannelTimeoutUs;
    public static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, -256, -65281};
    public static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, MatroskaExtractor.ID_TIME_CODE, 247, Cea708Decoder.CueInfoBuilder.HORIZONTAL_SIZE, MatroskaExtractor.ID_CUE_CLUSTER_POSITION, 9632};
    public static final int[] SPECIAL_CHARACTER_SET = {MatroskaExtractor.ID_TRACK_ENTRY, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, MatroskaExtractor.ID_SIMPLE_BLOCK, 9834, 224, 32, 232, 226, ArjArchiveInputStream.ARJ_MAGIC_2, MatroskaExtractor.ID_BLOCK_ADD_ID, SnappyCompressorOutputStream.TWO_SIZE_BYTE_MARKER, MatroskaExtractor.ID_REFERENCE_BLOCK};
    public static final int[] SPECIAL_ES_FR_CHARACTER_SET = {GpsStatusWrapper.QZSS_SVID_MIN, 201, 211, 218, 220, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER, 8216, MatroskaExtractor.ID_BLOCK, 42, 39, 8212, MetadataUtil.TYPE_TOP_BYTE_COPYRIGHT, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, GifHeaderParser.LABEL_GRAPHIC_CONTROL_EXTENSION, 219, BcBands.LOOKUPSWITCH, MatroskaExtractor.ID_CUE_POINT};
    public static final int[] SPECIAL_PT_DE_CHARACTER_SET = {195, 227, HttpStatus.SC_RESET_CONTENT, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, BcBands.WIDE, 228, 214, 246, 223, MatroskaExtractor.ID_BLOCK_ADDITIONAL, 164, 9474, BcBands.MULTIANEWARRAY, 229, 216, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER, 9484, 9488, 9492, 9496};
    public static final boolean[] ODD_PARITY_BYTE_TABLE = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final ParsableByteArray ccData = new ParsableByteArray();
    public final ArrayList<CueBuilder> cueBuilders = new ArrayList<>();
    public CueBuilder currentCueBuilder = new CueBuilder(0, 4);
    public int currentChannel = 0;

    public static int getChannel(byte b) {
        return (b >> 3) & 1;
    }

    public static boolean isCtrlCode(byte b) {
        return (b & 224) == 0;
    }

    public static boolean isExtendedWestEuropeanChar(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    public static boolean isMidrowCtrlCode(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    public static boolean isMiscCode(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    public static boolean isPreambleAddressCode(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & ExifInterface.MARKER_SOF0) == 64;
    }

    public static boolean isRepeatable(byte b) {
        return (b & 240) == 16;
    }

    public static boolean isServiceSwitchCommand(byte b) {
        return (b & 246) == 20;
    }

    public static boolean isSpecialNorthAmericanChar(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    public static boolean isTabCtrlCode(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    public static boolean isXdsControlCode(byte b) {
        return 1 <= b && b <= 15;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public void release() {
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.extractor.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j) {
        super.setPositionUs(j);
    }

    public Cea608Decoder(String str, int i, long j) {
        this.validDataChannelTimeoutUs = j > 0 ? j * 1000 : -9223372036854775807L;
        this.packetLength = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i == 1) {
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else if (i == 2) {
            this.selectedChannel = 1;
            this.selectedField = 0;
        } else if (i == 3) {
            this.selectedChannel = 0;
            this.selectedField = 1;
        } else if (i == 4) {
            this.selectedChannel = 1;
            this.selectedField = 1;
        } else {
            Log.m635w(TAG, "Invalid channel. Defaulting to CC1.");
            this.selectedChannel = 0;
            this.selectedField = 0;
        }
        setCaptionMode(0);
        resetCueBuilders();
        this.isInCaptionService = true;
        this.lastCueUpdateUs = C2732C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.isCaptionValid = false;
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
        this.currentChannel = 0;
        this.isInCaptionService = true;
        this.lastCueUpdateUs = C2732C.TIME_UNSET;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        SubtitleOutputBuffer availableOutputBuffer;
        SubtitleOutputBuffer subtitleOutputBufferDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (subtitleOutputBufferDequeueOutputBuffer != null) {
            return subtitleOutputBufferDequeueOutputBuffer;
        }
        if (!shouldClearStuckCaptions() || (availableOutputBuffer = getAvailableOutputBuffer()) == null) {
            return null;
        }
        this.cues = Collections.emptyList();
        this.lastCueUpdateUs = C2732C.TIME_UNSET;
        availableOutputBuffer.setContent(getPositionUs(), createSubtitle(), Long.MAX_VALUE);
        return availableOutputBuffer;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle((List) Assertions.checkNotNull(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void decode(SubtitleInputBuffer subtitleInputBuffer) {
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(subtitleInputBuffer.data);
        this.ccData.reset(byteBuffer.array(), byteBuffer.limit());
        boolean z = false;
        while (true) {
            int iBytesLeft = this.ccData.bytesLeft();
            int i = this.packetLength;
            if (iBytesLeft < i) {
                break;
            }
            int unsignedByte = i == 2 ? -4 : this.ccData.readUnsignedByte();
            int unsignedByte2 = this.ccData.readUnsignedByte();
            int unsignedByte3 = this.ccData.readUnsignedByte();
            if ((unsignedByte & 2) == 0 && (unsignedByte & 1) == this.selectedField) {
                byte b = (byte) (unsignedByte2 & 127);
                byte b2 = (byte) (unsignedByte3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z2 = this.isCaptionValid;
                    if ((unsignedByte & 4) == 4) {
                        boolean[] zArr = ODD_PARITY_BYTE_TABLE;
                        boolean z3 = zArr[unsignedByte2] && zArr[unsignedByte3];
                        this.isCaptionValid = z3;
                        if (!isRepeatedCommand(z3, b, b2)) {
                            if (this.isCaptionValid) {
                                maybeUpdateIsInCaptionService(b, b2);
                                if (this.isInCaptionService && updateAndVerifyCurrentChannel(b)) {
                                    if (isCtrlCode(b)) {
                                        if (isSpecialNorthAmericanChar(b, b2)) {
                                            this.currentCueBuilder.append(getSpecialNorthAmericanChar(b2));
                                        } else if (isExtendedWestEuropeanChar(b, b2)) {
                                            this.currentCueBuilder.backspace();
                                            this.currentCueBuilder.append(getExtendedWestEuropeanChar(b, b2));
                                        } else if (isMidrowCtrlCode(b, b2)) {
                                            handleMidrowCtrl(b2);
                                        } else if (isPreambleAddressCode(b, b2)) {
                                            handlePreambleAddressCode(b, b2);
                                        } else if (!isTabCtrlCode(b, b2)) {
                                            if (isMiscCode(b, b2)) {
                                                handleMiscCode(b2);
                                            }
                                        } else {
                                            this.currentCueBuilder.tabOffset = b2 - 32;
                                        }
                                    } else {
                                        this.currentCueBuilder.append(getBasicChar(b));
                                        if ((b2 & 224) != 0) {
                                            this.currentCueBuilder.append(getBasicChar(b2));
                                        }
                                    }
                                    z = true;
                                }
                            } else if (z2) {
                                resetCueBuilders();
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            int i2 = this.captionMode;
            if (i2 == 1 || i2 == 3) {
                this.cues = getDisplayCues();
                this.lastCueUpdateUs = getPositionUs();
            }
        }
    }

    public final boolean updateAndVerifyCurrentChannel(byte b) {
        if (isCtrlCode(b)) {
            this.currentChannel = getChannel(b);
        }
        return this.currentChannel == this.selectedChannel;
    }

    public final boolean isRepeatedCommand(boolean z, byte b, byte b2) {
        if (z && isRepeatable(b)) {
            if (this.repeatableControlSet && this.repeatableControlCc1 == b && this.repeatableControlCc2 == b2) {
                this.repeatableControlSet = false;
                return true;
            }
            this.repeatableControlSet = true;
            this.repeatableControlCc1 = b;
            this.repeatableControlCc2 = b2;
        } else {
            this.repeatableControlSet = false;
        }
        return false;
    }

    public final void handleMidrowCtrl(byte b) {
        this.currentCueBuilder.append(' ');
        this.currentCueBuilder.setStyle((b >> 1) & 7, (b & 1) == 1);
    }

    public final void handlePreambleAddressCode(byte b, byte b2) {
        int i = ROW_INDICES[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.currentCueBuilder.row) {
            if (this.captionMode != 1 && !this.currentCueBuilder.isEmpty()) {
                CueBuilder cueBuilder = new CueBuilder(this.captionMode, this.captionRowCount);
                this.currentCueBuilder = cueBuilder;
                this.cueBuilders.add(cueBuilder);
            }
            this.currentCueBuilder.row = i;
        }
        boolean z = (b2 & 16) == 16;
        boolean z2 = (b2 & 1) == 1;
        int i2 = (b2 >> 1) & 7;
        this.currentCueBuilder.setStyle(z ? 8 : i2, z2);
        if (z) {
            this.currentCueBuilder.indent = COLUMN_INDICES[i2];
        }
    }

    public final void handleMiscCode(byte b) {
        if (b == 32) {
            setCaptionMode(2);
            return;
        }
        if (b != 41) {
            switch (b) {
                case 37:
                    setCaptionMode(1);
                    setCaptionRowCount(2);
                    break;
                case 38:
                    setCaptionMode(1);
                    setCaptionRowCount(3);
                    break;
                case 39:
                    setCaptionMode(1);
                    setCaptionRowCount(4);
                    break;
                default:
                    int i = this.captionMode;
                    if (i != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.cues = Collections.emptyList();
                                    int i2 = this.captionMode;
                                    if (i2 == 1 || i2 == 3) {
                                        resetCueBuilders();
                                        break;
                                    }
                                case 45:
                                    if (i == 1 && !this.currentCueBuilder.isEmpty()) {
                                        this.currentCueBuilder.rollUp();
                                        break;
                                    }
                                    break;
                                case 46:
                                    resetCueBuilders();
                                    break;
                                case 47:
                                    this.cues = getDisplayCues();
                                    resetCueBuilders();
                                    break;
                            }
                        } else {
                            this.currentCueBuilder.backspace();
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        setCaptionMode(3);
    }

    public final List<Cue> getDisplayCues() {
        int size = this.cueBuilders.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            Cue cueBuild = this.cueBuilders.get(i).build(Integer.MIN_VALUE);
            arrayList.add(cueBuild);
            if (cueBuild != null) {
                iMin = Math.min(iMin, cueBuild.positionAnchor);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Cue cue = (Cue) arrayList.get(i2);
            if (cue != null) {
                if (cue.positionAnchor != iMin) {
                    cue = (Cue) Assertions.checkNotNull(this.cueBuilders.get(i2).build(iMin));
                }
                arrayList2.add(cue);
            }
        }
        return arrayList2;
    }

    public final void setCaptionMode(int i) {
        int i2 = this.captionMode;
        if (i2 == i) {
            return;
        }
        this.captionMode = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.cueBuilders.size(); i3++) {
                this.cueBuilders.get(i3).setCaptionMode(i);
            }
            return;
        }
        resetCueBuilders();
        if (i2 == 3 || i == 1 || i == 0) {
            this.cues = Collections.emptyList();
        }
    }

    public final void setCaptionRowCount(int i) {
        this.captionRowCount = i;
        this.currentCueBuilder.setCaptionRowCount(i);
    }

    public final void resetCueBuilders() {
        this.currentCueBuilder.reset(this.captionMode);
        this.cueBuilders.clear();
        this.cueBuilders.add(this.currentCueBuilder);
    }

    public final void maybeUpdateIsInCaptionService(byte b, byte b2) {
        if (isXdsControlCode(b)) {
            this.isInCaptionService = false;
            return;
        }
        if (isServiceSwitchCommand(b)) {
            if (b2 != 32 && b2 != 47) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 42:
                            case 43:
                                this.isInCaptionService = false;
                                break;
                        }
                }
            }
            this.isInCaptionService = true;
        }
    }

    public static char getBasicChar(byte b) {
        return (char) BASIC_CHARACTER_SET[(b & Byte.MAX_VALUE) - 32];
    }

    public static char getSpecialNorthAmericanChar(byte b) {
        return (char) SPECIAL_CHARACTER_SET[b & Ascii.f786SI];
    }

    public static char getExtendedWestEuropeanChar(byte b, byte b2) {
        if ((b & 1) == 0) {
            return getExtendedEsFrChar(b2);
        }
        return getExtendedPtDeChar(b2);
    }

    public static char getExtendedEsFrChar(byte b) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b & 31];
    }

    public static char getExtendedPtDeChar(byte b) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b & 31];
    }

    /* loaded from: classes.dex */
    public static final class CueBuilder {
        public static final int BASE_ROW = 15;
        public static final int SCREEN_CHARWIDTH = 32;
        public int captionMode;
        public int captionRowCount;
        public int indent;
        public int row;
        public int tabOffset;
        public final List<CueStyle> cueStyles = new ArrayList();
        public final List<SpannableString> rolledUpCaptions = new ArrayList();
        public final StringBuilder captionStringBuilder = new StringBuilder();

        public CueBuilder(int i, int i2) {
            reset(i);
            this.captionRowCount = i2;
        }

        public void reset(int i) {
            this.captionMode = i;
            this.cueStyles.clear();
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.setLength(0);
            this.row = 15;
            this.indent = 0;
            this.tabOffset = 0;
        }

        public boolean isEmpty() {
            return this.cueStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
        }

        public void setCaptionMode(int i) {
            this.captionMode = i;
        }

        public void setCaptionRowCount(int i) {
            this.captionRowCount = i;
        }

        public void setStyle(int i, boolean z) {
            this.cueStyles.add(new CueStyle(i, z, this.captionStringBuilder.length()));
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
                for (int size = this.cueStyles.size() - 1; size >= 0; size--) {
                    CueStyle cueStyle = this.cueStyles.get(size);
                    int i = cueStyle.start;
                    if (i != length) {
                        return;
                    }
                    cueStyle.start = i - 1;
                }
            }
        }

        public void append(char c) {
            if (this.captionStringBuilder.length() < 32) {
                this.captionStringBuilder.append(c);
            }
        }

        public void rollUp() {
            this.rolledUpCaptions.add(buildCurrentLine());
            this.captionStringBuilder.setLength(0);
            this.cueStyles.clear();
            int iMin = Math.min(this.captionRowCount, this.row);
            while (this.rolledUpCaptions.size() >= iMin) {
                this.rolledUpCaptions.remove(0);
            }
        }

        @Nullable
        public Cue build(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.rolledUpCaptions.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildCurrentLine());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.indent + this.tabOffset;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.captionMode != 2 || (Math.abs(i4) >= 3 && length >= 0)) {
                    i = (this.captionMode != 2 || i4 <= 0) ? 0 : 2;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.row;
            if (i5 > 7) {
                i5 -= 17;
            } else if (this.captionMode == 1) {
                i5 -= this.captionRowCount - 1;
            }
            return new Cue.Builder().setText(spannableStringBuilder).setTextAlignment(Layout.Alignment.ALIGN_NORMAL).setLine(i5, 1).setPosition(f).setPositionAnchor(i).build();
        }

        public final SpannableString buildCurrentLine() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 < this.cueStyles.size()) {
                CueStyle cueStyle = this.cueStyles.get(i5);
                boolean z2 = cueStyle.underline;
                int i7 = cueStyle.style;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = Cea608Decoder.STYLE_COLORS[i7];
                    }
                    z = z3;
                }
                int i8 = cueStyle.start;
                i5++;
                if (i8 != (i5 < this.cueStyles.size() ? this.cueStyles.get(i5).start : length)) {
                    if (i != -1 && !z2) {
                        setUnderlineSpan(spannableStringBuilder, i, i8);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        setItalicSpan(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        setColorSpan(spannableStringBuilder, i6, i8, i3);
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                setUnderlineSpan(spannableStringBuilder, i, length);
            }
            if (i2 != -1 && i2 != length) {
                setItalicSpan(spannableStringBuilder, i2, length);
            }
            if (i6 != length) {
                setColorSpan(spannableStringBuilder, i6, length, i3);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public static void setUnderlineSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        public static void setItalicSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        public static void setColorSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        public static class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int i, boolean z, int i2) {
                this.style = i;
                this.underline = z;
                this.start = i2;
            }
        }
    }

    public final boolean shouldClearStuckCaptions() {
        return (this.validDataChannelTimeoutUs == C2732C.TIME_UNSET || this.lastCueUpdateUs == C2732C.TIME_UNSET || getPositionUs() - this.lastCueUpdateUs < this.validDataChannelTimeoutUs) ? false : true;
    }
}
