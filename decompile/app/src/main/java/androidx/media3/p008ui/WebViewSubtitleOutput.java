package androidx.media3.p008ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import androidx.media3.p008ui.SpannedToHtmlConverter;
import androidx.media3.p008ui.SubtitleView;
import com.google.common.base.Charsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    public static final float CSS_LINE_HEIGHT = 1.2f;
    public static final String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    public float bottomPaddingFraction;
    public final CanvasSubtitleOutput canvasSubtitleOutput;
    public float defaultTextSize;
    public int defaultTextSizeType;
    public CaptionStyleCompat style;
    public List<Cue> textCues;
    public final WebView webView;

    public static int anchorTypeToTranslatePercent(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = Collections.emptyList();
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        C30001 c30001 = new WebView(context, attributeSet) { // from class: androidx.media3.ui.WebViewSubtitleOutput.1
            public C30001(Context context2, AttributeSet attributeSet2) {
                super(context2, attributeSet2);
            }

            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.webView = c30001;
        c30001.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(c30001);
    }

    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$1 */
    /* loaded from: classes3.dex */
    public class C30001 extends WebView {
        public C30001(Context context2, AttributeSet attributeSet2) {
            super(context2, attributeSet2);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f;
        this.defaultTextSizeType = i;
        this.bottomPaddingFraction = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Cue cue = list.get(i2);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f, i, f2);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.textCues.isEmpty()) {
            return;
        }
        updateWebView();
    }

    public void destroy() {
        this.webView.destroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateWebView() {
        String invariant;
        int iAnchorTypeToTranslatePercent;
        String invariant2;
        boolean z;
        float f;
        String invariant3;
        int i;
        String str;
        Object obj;
        Object obj2;
        Layout.Alignment alignment;
        StringBuilder sb = new StringBuilder();
        float f2 = 1.2f;
        sb.append(Util.formatInvariant("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", HtmlUtils.toCssRgba(this.style.foregroundColor), convertTextSizeToCss(this.defaultTextSizeType, this.defaultTextSize), Float.valueOf(1.2f), convertCaptionStyleToCssTextShadow(this.style)));
        HashMap map = new HashMap();
        map.put(HtmlUtils.cssAllClassDescendantsSelector(DEFAULT_BACKGROUND_CSS_CLASS), Util.formatInvariant("background-color:%s;", HtmlUtils.toCssRgba(this.style.backgroundColor)));
        int i2 = 0;
        while (i2 < this.textCues.size()) {
            Cue cue = this.textCues.get(i2);
            float f3 = cue.position;
            float f4 = f3 != -3.4028235E38f ? f3 * 100.0f : 50.0f;
            int iAnchorTypeToTranslatePercent2 = anchorTypeToTranslatePercent(cue.positionAnchor);
            float f5 = cue.line;
            if (f5 != -3.4028235E38f) {
                if (cue.lineType != 1) {
                    invariant = Util.formatInvariant("%.2f%%", Float.valueOf(f5 * 100.0f));
                    if (cue.verticalType == 1) {
                        iAnchorTypeToTranslatePercent = -anchorTypeToTranslatePercent(cue.lineAnchor);
                    } else {
                        iAnchorTypeToTranslatePercent = anchorTypeToTranslatePercent(cue.lineAnchor);
                    }
                } else {
                    if (f5 >= 0.0f) {
                        invariant2 = Util.formatInvariant("%.2fem", Float.valueOf(f5 * f2));
                        z = false;
                    } else {
                        invariant2 = Util.formatInvariant("%.2fem", Float.valueOf(((-f5) - 1.0f) * f2));
                        z = true;
                    }
                    iAnchorTypeToTranslatePercent = 0;
                    f = cue.size;
                    if (f == -3.4028235E38f) {
                        invariant3 = Util.formatInvariant("%.2f%%", Float.valueOf(f * 100.0f));
                    } else {
                        invariant3 = "fit-content";
                    }
                    String str2 = invariant3;
                    String strConvertAlignmentToCss = convertAlignmentToCss(cue.textAlignment);
                    String strConvertVerticalTypeToCss = convertVerticalTypeToCss(cue.verticalType);
                    String strConvertTextSizeToCss = convertTextSizeToCss(cue.textSizeType, cue.textSize);
                    String cssRgba = HtmlUtils.toCssRgba(!cue.windowColorSet ? cue.windowColor : this.style.windowColor);
                    i = cue.verticalType;
                    String str3 = TtmlNode.RIGHT;
                    if (i != 1) {
                        if (z) {
                        }
                        str = str3;
                        obj = "top";
                    } else if (i != 2) {
                        str = z ? "bottom" : "top";
                        obj = TtmlNode.LEFT;
                    } else {
                        if (!z) {
                            str3 = TtmlNode.LEFT;
                        }
                        str = str3;
                        obj = "top";
                    }
                    if (i != 2 || i == 1) {
                        obj2 = "height";
                        int i3 = iAnchorTypeToTranslatePercent;
                        iAnchorTypeToTranslatePercent = iAnchorTypeToTranslatePercent2;
                        iAnchorTypeToTranslatePercent2 = i3;
                    } else {
                        obj2 = "width";
                    }
                    SpannedToHtmlConverter.HtmlAndCss htmlAndCssConvert = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
                    for (String str4 : map.keySet()) {
                        String str5 = (String) map.put(str4, (String) map.get(str4));
                        Assertions.checkState(str5 == null || str5.equals(map.get(str4)));
                    }
                    sb.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i2), obj, Float.valueOf(f4), str, invariant2, obj2, str2, strConvertAlignmentToCss, strConvertVerticalTypeToCss, strConvertTextSizeToCss, cssRgba, Integer.valueOf(iAnchorTypeToTranslatePercent2), Integer.valueOf(iAnchorTypeToTranslatePercent), getBlockShearTransformFunction(cue)));
                    sb.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
                    alignment = cue.multiRowAlignment;
                    if (alignment == null) {
                        sb.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(alignment)));
                        sb.append(htmlAndCssConvert.html);
                        sb.append("</span>");
                    } else {
                        sb.append(htmlAndCssConvert.html);
                    }
                    sb.append("</span>");
                    sb.append("</div>");
                    i2++;
                    f2 = 1.2f;
                }
            } else {
                invariant = Util.formatInvariant("%.2f%%", Float.valueOf((1.0f - this.bottomPaddingFraction) * 100.0f));
                iAnchorTypeToTranslatePercent = -100;
            }
            invariant2 = invariant;
            z = false;
            f = cue.size;
            if (f == -3.4028235E38f) {
            }
            String str22 = invariant3;
            String strConvertAlignmentToCss2 = convertAlignmentToCss(cue.textAlignment);
            String strConvertVerticalTypeToCss2 = convertVerticalTypeToCss(cue.verticalType);
            String strConvertTextSizeToCss2 = convertTextSizeToCss(cue.textSizeType, cue.textSize);
            String cssRgba2 = HtmlUtils.toCssRgba(!cue.windowColorSet ? cue.windowColor : this.style.windowColor);
            i = cue.verticalType;
            String str32 = TtmlNode.RIGHT;
            if (i != 1) {
            }
            if (i != 2) {
                obj2 = "height";
                int i32 = iAnchorTypeToTranslatePercent;
                iAnchorTypeToTranslatePercent = iAnchorTypeToTranslatePercent2;
                iAnchorTypeToTranslatePercent2 = i32;
            }
            SpannedToHtmlConverter.HtmlAndCss htmlAndCssConvert2 = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
            while (r5.hasNext()) {
            }
            sb.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i2), obj, Float.valueOf(f4), str, invariant2, obj2, str22, strConvertAlignmentToCss2, strConvertVerticalTypeToCss2, strConvertTextSizeToCss2, cssRgba2, Integer.valueOf(iAnchorTypeToTranslatePercent2), Integer.valueOf(iAnchorTypeToTranslatePercent), getBlockShearTransformFunction(cue)));
            sb.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
            alignment = cue.multiRowAlignment;
            if (alignment == null) {
            }
            sb.append("</span>");
            sb.append("</div>");
            i2++;
            f2 = 1.2f;
        }
        sb.append("</div></body></html>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<html><head><style>");
        for (String str6 : map.keySet()) {
            sb2.append(str6);
            sb2.append(WebvttCssParser.RULE_START);
            sb2.append((String) map.get(str6));
            sb2.append(WebvttCssParser.RULE_END);
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.webView.loadData(Base64.encodeToString(sb.toString().getBytes(Charsets.UTF_8), 1), "text/html", "base64");
    }

    public static String getBlockShearTransformFunction(Cue cue) {
        String str;
        float f = cue.shearDegrees;
        if (f != 0.0f) {
            int i = cue.verticalType;
            if (i == 2 || i == 1) {
                str = "skewY";
            } else {
                str = "skewX";
            }
            return Util.formatInvariant("%s(%.2fdeg)", str, Float.valueOf(f));
        }
        return "";
    }

    public final String convertTextSizeToCss(int i, float f) {
        float fResolveTextSize = SubtitleViewUtils.resolveTextSize(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fResolveTextSize == -3.4028235E38f) {
            return "unset";
        }
        return Util.formatInvariant("%.2fpx", Float.valueOf(fResolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    public static String convertCaptionStyleToCssTextShadow(CaptionStyleCompat captionStyleCompat) {
        int i = captionStyleCompat.edgeType;
        if (i == 1) {
            return Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i == 2) {
            return Util.formatInvariant("0.1em 0.12em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i == 3) {
            return Util.formatInvariant("0.06em 0.08em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i == 4) {
            return Util.formatInvariant("-0.05em -0.05em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        return "unset";
    }

    public static String convertVerticalTypeToCss(int i) {
        if (i == 1) {
            return "vertical-rl";
        }
        if (i == 2) {
            return "vertical-lr";
        }
        return "horizontal-tb";
    }

    public static String convertAlignmentToCss(@Nullable Layout.Alignment alignment) {
        if (alignment == null) {
            return TtmlNode.CENTER;
        }
        int i = C30012.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        if (i == 1) {
            return TtmlNode.START;
        }
        if (i != 2) {
            return TtmlNode.CENTER;
        }
        return "end";
    }

    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$2 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C30012 {
        public static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
