package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Ascii;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@UnstableApi
/* loaded from: classes2.dex */
public final class WebvttCssStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    public static final int OFF = 0;

    /* renamed from: ON */
    public static final int f339ON = 1;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    public int backgroundColor;

    @ColorInt
    public int fontColor;
    public float fontSize;
    public String targetId = "";
    public String targetTag = "";
    public Set<String> targetClasses = Collections.emptySet();
    public String targetVoice = "";

    @Nullable
    public String fontFamily = null;
    public boolean hasFontColor = false;
    public boolean hasBackgroundColor = false;
    public int linethrough = -1;
    public int underline = -1;
    public int bold = -1;
    public int italic = -1;
    public int fontSizeUnit = -1;
    public int rubyPosition = -1;
    public boolean combineUpright = false;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public void setTargetId(String str) {
        this.targetId = str;
    }

    public void setTargetTagName(String str) {
        this.targetTag = str;
    }

    public void setTargetClasses(String[] strArr) {
        this.targetClasses = new HashSet(Arrays.asList(strArr));
    }

    public void setTargetVoice(String str) {
        this.targetVoice = str;
    }

    public int getSpecificityScore(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        if (this.targetId.isEmpty() && this.targetTag.isEmpty() && this.targetClasses.isEmpty() && this.targetVoice.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iUpdateScoreForMatch = updateScoreForMatch(updateScoreForMatch(updateScoreForMatch(0, this.targetId, str, 1073741824), this.targetTag, str2, 2), this.targetVoice, str3, 4);
        if (iUpdateScoreForMatch == -1 || !set.containsAll(this.targetClasses)) {
            return 0;
        }
        return iUpdateScoreForMatch + (this.targetClasses.size() * 4);
    }

    public int getStyle() {
        int i = this.bold;
        if (i == -1 && this.italic == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.italic == 1 ? 2 : 0);
    }

    public boolean isLinethrough() {
        return this.linethrough == 1;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setLinethrough(boolean z) {
        this.linethrough = z ? 1 : 0;
        return this;
    }

    public boolean isUnderline() {
        return this.underline == 1;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setUnderline(boolean z) {
        this.underline = z ? 1 : 0;
        return this;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setBold(boolean z) {
        this.bold = z ? 1 : 0;
        return this;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setItalic(boolean z) {
        this.italic = z ? 1 : 0;
        return this;
    }

    @Nullable
    public String getFontFamily() {
        return this.fontFamily;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setFontFamily(@Nullable String str) {
        this.fontFamily = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public int getFontColor() {
        if (!this.hasFontColor) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.fontColor;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setFontColor(int i) {
        this.fontColor = i;
        this.hasFontColor = true;
        return this;
    }

    public boolean hasFontColor() {
        return this.hasFontColor;
    }

    public int getBackgroundColor() {
        if (!this.hasBackgroundColor) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.backgroundColor;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setBackgroundColor(int i) {
        this.backgroundColor = i;
        this.hasBackgroundColor = true;
        return this;
    }

    public boolean hasBackgroundColor() {
        return this.hasBackgroundColor;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setFontSize(float f) {
        this.fontSize = f;
        return this;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setFontSizeUnit(int i) {
        this.fontSizeUnit = i;
        return this;
    }

    public int getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    public float getFontSize() {
        return this.fontSize;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setRubyPosition(int i) {
        this.rubyPosition = i;
        return this;
    }

    public int getRubyPosition() {
        return this.rubyPosition;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setCombineUpright(boolean z) {
        this.combineUpright = z;
        return this;
    }

    public boolean getCombineUpright() {
        return this.combineUpright;
    }

    public static int updateScoreForMatch(int i, String str, @Nullable String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
