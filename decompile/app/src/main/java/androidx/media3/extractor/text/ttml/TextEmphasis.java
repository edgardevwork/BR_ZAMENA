package androidx.media3.extractor.text.ttml;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    public static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    public static final ImmutableSet<String> SINGLE_STYLE_VALUES = ImmutableSet.m1220of("auto", "none");
    public static final ImmutableSet<String> MARK_SHAPE_VALUES = ImmutableSet.m1221of(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    public static final ImmutableSet<String> MARK_FILL_VALUES = ImmutableSet.m1220of(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, "open");
    public static final ImmutableSet<String> POSITION_VALUES = ImmutableSet.m1221of(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    public TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }

    @Nullable
    public static TextEmphasis parse(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return parseWords(ImmutableSet.copyOf(TextUtils.split(lowerCase, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TextEmphasis parseWords(ImmutableSet<String> immutableSet) {
        boolean z;
        int i;
        int iHashCode;
        String str = (String) Iterables.getFirst(Sets.intersection(POSITION_VALUES, immutableSet), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode2 = str.hashCode();
        boolean z2 = false;
        int i2 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                z = (iHashCode2 == 92734940 && str.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) ? false : -1;
            } else if (str.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                z = true;
            }
        } else if (str.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
            z = 2;
        }
        int i3 = z ? !z ? 1 : -2 : 2;
        Sets.SetView setViewIntersection = Sets.intersection(SINGLE_STYLE_VALUES, immutableSet);
        if (!setViewIntersection.isEmpty()) {
            String str2 = (String) setViewIntersection.iterator().next();
            int iHashCode3 = str2.hashCode();
            if (iHashCode3 == 3005871) {
                str2.equals("auto");
            } else if (iHashCode3 == 3387192 && str2.equals("none")) {
                i2 = 0;
            }
            return new TextEmphasis(i2, 0, i3);
        }
        Sets.SetView setViewIntersection2 = Sets.intersection(MARK_FILL_VALUES, immutableSet);
        Sets.SetView setViewIntersection3 = Sets.intersection(MARK_SHAPE_VALUES, immutableSet);
        if (setViewIntersection2.isEmpty() && setViewIntersection3.isEmpty()) {
            return new TextEmphasis(-1, 0, i3);
        }
        String str3 = (String) Iterables.getFirst(setViewIntersection2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        int iHashCode4 = str3.hashCode();
        if (iHashCode4 == -1274499742) {
            str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        } else {
            if (iHashCode4 == 3417674 && str3.equals("open")) {
                i = 2;
            }
            String str4 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode = str4.hashCode();
            if (iHashCode == -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode != 99657 || !str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        z2 = -1;
                    }
                } else if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    z2 = true;
                }
            } else if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
                z2 = 2;
            }
            return new TextEmphasis(z2 ? !z2 ? 1 : 3 : 2, i, i3);
        }
        i = 1;
        String str42 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        iHashCode = str42.hashCode();
        if (iHashCode == -1360216880) {
        }
        return new TextEmphasis(z2 ? !z2 ? 1 : 3 : 2, i, i3);
    }
}
