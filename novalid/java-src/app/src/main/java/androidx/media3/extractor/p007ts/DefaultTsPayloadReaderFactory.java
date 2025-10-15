package androidx.media3.extractor.p007ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.p007ts.TsPayloadReader;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
/* loaded from: classes3.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {
    public static final int DESCRIPTOR_TAG_CAPTION_SERVICE = 134;
    public static final int FLAG_ALLOW_NON_IDR_KEYFRAMES = 1;
    public static final int FLAG_DETECT_ACCESS_UNITS = 8;
    public static final int FLAG_ENABLE_HDMV_DTS_AUDIO_STREAMS = 64;
    public static final int FLAG_IGNORE_AAC_STREAM = 2;
    public static final int FLAG_IGNORE_H264_STREAM = 4;
    public static final int FLAG_IGNORE_SPLICE_INFO_STREAM = 16;
    public static final int FLAG_OVERRIDE_CAPTION_DESCRIPTORS = 32;
    public final List<Format> closedCaptionFormats;
    public final int flags;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    public DefaultTsPayloadReaderFactory(int i) {
        this(i, ImmutableList.m1171of());
    }

    public DefaultTsPayloadReaderFactory(int i, List<Format> list) {
        this.flags = i;
        this.closedCaptionFormats = list;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader.Factory
    public SparseArray<TsPayloadReader> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    @Override // androidx.media3.extractor.ts.TsPayloadReader.Factory
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TsPayloadReader createPayloadReader(int i, TsPayloadReader.EsInfo esInfo) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new PesReader(new MpegAudioReader(esInfo.language, esInfo.getRoleFlags()));
            }
            if (i == 21) {
                return new PesReader(new Id3Reader());
            }
            if (i == 27) {
                if (isSet(4)) {
                    return null;
                }
                return new PesReader(new H264Reader(buildSeiReader(esInfo), isSet(1), isSet(8)));
            }
            if (i == 36) {
                return new PesReader(new H265Reader(buildSeiReader(esInfo)));
            }
            if (i == 89) {
                return new PesReader(new DvbSubtitleReader(esInfo.dvbSubtitleInfos));
            }
            if (i == 172) {
                return new PesReader(new Ac4Reader(esInfo.language, esInfo.getRoleFlags()));
            }
            if (i != 257) {
                if (i != 138) {
                    if (i != 139) {
                        switch (i) {
                            case 15:
                                if (isSet(2)) {
                                    return null;
                                }
                                return new PesReader(new AdtsReader(false, esInfo.language, esInfo.getRoleFlags()));
                            case 16:
                                return new PesReader(new H263Reader(buildUserDataReader(esInfo)));
                            case 17:
                                if (isSet(2)) {
                                    return null;
                                }
                                return new PesReader(new LatmReader(esInfo.language, esInfo.getRoleFlags()));
                            default:
                                switch (i) {
                                    case 128:
                                        break;
                                    case 129:
                                        return new PesReader(new Ac3Reader(esInfo.language, esInfo.getRoleFlags()));
                                    case 130:
                                        if (!isSet(64)) {
                                            return null;
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 134:
                                                if (isSet(16)) {
                                                    return null;
                                                }
                                                return new SectionReader(new PassthroughSectionPayloadReader(MimeTypes.APPLICATION_SCTE35));
                                            case 135:
                                                break;
                                            case 136:
                                                break;
                                            default:
                                                return null;
                                        }
                                }
                        }
                    } else {
                        return new PesReader(new DtsReader(esInfo.language, esInfo.getRoleFlags(), DtsReader.FTOC_MAX_HEADER_SIZE));
                    }
                }
                return new PesReader(new DtsReader(esInfo.language, esInfo.getRoleFlags(), 4096));
            }
            return new SectionReader(new PassthroughSectionPayloadReader(MimeTypes.APPLICATION_AIT));
        }
        return new PesReader(new H262Reader(buildUserDataReader(esInfo)));
    }

    public final SeiReader buildSeiReader(TsPayloadReader.EsInfo esInfo) {
        return new SeiReader(getClosedCaptionFormats(esInfo));
    }

    public final UserDataReader buildUserDataReader(TsPayloadReader.EsInfo esInfo) {
        return new UserDataReader(getClosedCaptionFormats(esInfo));
    }

    public final List<Format> getClosedCaptionFormats(TsPayloadReader.EsInfo esInfo) {
        String str;
        int i;
        List<byte[]> listBuildCea708InitializationData;
        if (isSet(32)) {
            return this.closedCaptionFormats;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.descriptorBytes);
        List<Format> arrayList = this.closedCaptionFormats;
        while (parsableByteArray.bytesLeft() > 0) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
            if (unsignedByte == 134) {
                arrayList = new ArrayList<>();
                int unsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
                for (int i2 = 0; i2 < unsignedByte2; i2++) {
                    String string = parsableByteArray.readString(3);
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    boolean z = (unsignedByte3 & 128) != 0;
                    if (z) {
                        i = unsignedByte3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte unsignedByte4 = (byte) parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(1);
                    if (z) {
                        listBuildCea708InitializationData = CodecSpecificDataUtil.buildCea708InitializationData((unsignedByte4 & 64) != 0);
                    } else {
                        listBuildCea708InitializationData = null;
                    }
                    arrayList.add(new Format.Builder().setSampleMimeType(str).setLanguage(string).setAccessibilityChannel(i).setInitializationData(listBuildCea708InitializationData).build());
                }
            }
            parsableByteArray.setPosition(position);
        }
        return arrayList;
    }

    public final boolean isSet(int i) {
        return (i & this.flags) != 0;
    }
}
