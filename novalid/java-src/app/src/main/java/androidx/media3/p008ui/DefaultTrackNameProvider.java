package androidx.media3.p008ui;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.C2732C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Locale;

@UnstableApi
/* loaded from: classes3.dex */
public class DefaultTrackNameProvider implements TrackNameProvider {
    public final Resources resources;

    public DefaultTrackNameProvider(Resources resources) {
        this.resources = (Resources) Assertions.checkNotNull(resources);
    }

    @Override // androidx.media3.p008ui.TrackNameProvider
    public String getTrackName(Format format) {
        String strBuildLanguageOrLabelString;
        int iInferPrimaryTrackType = inferPrimaryTrackType(format);
        if (iInferPrimaryTrackType == 2) {
            strBuildLanguageOrLabelString = joinWithSeparator(buildRoleString(format), buildResolutionString(format), buildBitrateString(format));
        } else if (iInferPrimaryTrackType == 1) {
            strBuildLanguageOrLabelString = joinWithSeparator(buildLanguageOrLabelString(format), buildAudioChannelString(format), buildBitrateString(format));
        } else {
            strBuildLanguageOrLabelString = buildLanguageOrLabelString(format);
        }
        if (strBuildLanguageOrLabelString.length() != 0) {
            return strBuildLanguageOrLabelString;
        }
        String str = format.language;
        if (str == null || str.trim().isEmpty()) {
            return this.resources.getString(C2997R.string.exo_track_unknown);
        }
        return this.resources.getString(C2997R.string.exo_track_unknown_name, str);
    }

    public final String buildResolutionString(Format format) {
        int i = format.width;
        int i2 = format.height;
        if (i == -1 || i2 == -1) {
            return "";
        }
        return this.resources.getString(C2997R.string.exo_track_resolution, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final String buildBitrateString(Format format) {
        int i = format.bitrate;
        if (i == -1) {
            return "";
        }
        return this.resources.getString(C2997R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    public final String buildAudioChannelString(Format format) {
        int i = format.channelCount;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.resources.getString(C2997R.string.exo_track_mono);
        }
        if (i == 2) {
            return this.resources.getString(C2997R.string.exo_track_stereo);
        }
        if (i == 6 || i == 7) {
            return this.resources.getString(C2997R.string.exo_track_surround_5_point_1);
        }
        if (i == 8) {
            return this.resources.getString(C2997R.string.exo_track_surround_7_point_1);
        }
        return this.resources.getString(C2997R.string.exo_track_surround);
    }

    public final String buildLanguageOrLabelString(Format format) {
        String strJoinWithSeparator = joinWithSeparator(buildLanguageString(format), buildRoleString(format));
        return TextUtils.isEmpty(strJoinWithSeparator) ? buildLabelString(format) : strJoinWithSeparator;
    }

    public final String buildLabelString(Format format) {
        return TextUtils.isEmpty(format.label) ? "" : format.label;
    }

    public final String buildLanguageString(Format format) {
        String str = format.language;
        if (TextUtils.isEmpty(str) || C2732C.LANGUAGE_UNDETERMINED.equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Util.SDK_INT >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale defaultDisplayLocale = Util.getDefaultDisplayLocale();
        String displayName = localeForLanguageTag.getDisplayName(defaultDisplayLocale);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(defaultDisplayLocale) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    public final String buildRoleString(Format format) throws Resources.NotFoundException {
        String strJoinWithSeparator;
        if ((format.roleFlags & 2) == 0) {
            strJoinWithSeparator = "";
        } else {
            strJoinWithSeparator = this.resources.getString(C2997R.string.exo_track_role_alternate);
        }
        if ((format.roleFlags & 4) != 0) {
            strJoinWithSeparator = joinWithSeparator(strJoinWithSeparator, this.resources.getString(C2997R.string.exo_track_role_supplementary));
        }
        if ((format.roleFlags & 8) != 0) {
            strJoinWithSeparator = joinWithSeparator(strJoinWithSeparator, this.resources.getString(C2997R.string.exo_track_role_commentary));
        }
        return (format.roleFlags & 1088) != 0 ? joinWithSeparator(strJoinWithSeparator, this.resources.getString(C2997R.string.exo_track_role_closed_captions)) : strJoinWithSeparator;
    }

    public final String joinWithSeparator(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.resources.getString(C2997R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public static int inferPrimaryTrackType(Format format) {
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1 && format.height == -1) {
            return (format.channelCount == -1 && format.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }
}
