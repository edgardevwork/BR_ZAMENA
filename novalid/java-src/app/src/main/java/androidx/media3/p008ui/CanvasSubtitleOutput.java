package androidx.media3.p008ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.p008ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class CanvasSubtitleOutput extends View implements SubtitleView.Output {
    public float bottomPaddingFraction;
    public List<Cue> cues;
    public final List<SubtitlePainter> painters;
    public CaptionStyleCompat style;
    public float textSize;
    public int textSizeType;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.painters = new ArrayList();
        this.cues = Collections.emptyList();
        this.textSizeType = 0;
        this.textSize = 0.0533f;
        this.style = CaptionStyleCompat.DEFAULT;
        this.bottomPaddingFraction = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.cues = list;
        this.style = captionStyleCompat;
        this.textSize = f;
        this.textSizeType = i;
        this.bottomPaddingFraction = f2;
        while (this.painters.size() < list.size()) {
            this.painters.add(new SubtitlePainter(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<Cue> list = this.cues;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float fResolveTextSize = SubtitleViewUtils.resolveTextSize(this.textSizeType, this.textSize, height, i);
        if (fResolveTextSize <= 0.0f) {
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Cue cueRepositionVerticalCue = list.get(i2);
            if (cueRepositionVerticalCue.verticalType != Integer.MIN_VALUE) {
                cueRepositionVerticalCue = repositionVerticalCue(cueRepositionVerticalCue);
            }
            Cue cue = cueRepositionVerticalCue;
            int i3 = paddingBottom;
            this.painters.get(i2).draw(cue, this.style, fResolveTextSize, SubtitleViewUtils.resolveTextSize(cue.textSizeType, cue.textSize, height, i), this.bottomPaddingFraction, canvas, paddingLeft, paddingTop, width, i3);
            i2++;
            size = size;
            i = i;
            paddingBottom = i3;
            width = width;
        }
    }

    public static Cue repositionVerticalCue(Cue cue) {
        Cue.Builder textAlignment = cue.buildUpon().setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
        if (cue.lineType == 0) {
            textAlignment.setLine(1.0f - cue.line, 0);
        } else {
            textAlignment.setLine((-cue.line) - 1.0f, 1);
        }
        int i = cue.lineAnchor;
        if (i == 0) {
            textAlignment.setLineAnchor(2);
        } else if (i == 2) {
            textAlignment.setLineAnchor(0);
        }
        return textAlignment.build();
    }
}
