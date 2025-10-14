package com.blackhub.bronline.game.common.roundcornerprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import androidx.annotation.Px;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.customview.view.AbsSavedState;
import com.blackhub.bronline.C3489R;
import com.blackhub.bronline.game.common.roundcornerprogressbar.TextRoundCornerProgressBar;
import com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar;
import com.bless.client.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextRoundCornerProgressBar.kt */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(m7104d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0004LMNOB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002JH\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020(H\u0014J\b\u0010)\u001a\u00020\u0019H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020\u0019H\u0002J\b\u0010,\u001a\u00020\u0019H\u0002J\b\u0010-\u001a\u00020\u0019H\u0002J\b\u0010.\u001a\u0004\u0018\u00010\u0013J\u0006\u0010/\u001a\u00020\nJ\u0006\u00100\u001a\u00020\nJ\u0006\u00101\u001a\u00020\nJ\u0006\u00102\u001a\u00020\nJ\u0006\u00103\u001a\u00020\nJ\u0006\u00104\u001a\u00020\nJ\b\u00105\u001a\u00020\nH\u0014J\u001a\u00106\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u00107\u001a\u00020\u0019H\u0014J\b\u00108\u001a\u00020\u0019H\u0016J\u0012\u00109\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\n\u0010<\u001a\u0004\u0018\u00010;H\u0014J\b\u0010=\u001a\u00020\u0019H\u0014J\u0010\u0010>\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010>\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\nH\u0016J\u000e\u0010?\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u0013J\u000e\u0010A\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\nJ\u000e\u0010C\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\nJ\u000e\u0010D\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\nJ\u0010\u0010F\u001a\u00020\u00192\b\b\u0001\u0010G\u001a\u00020\nJ\u0010\u0010H\u001a\u00020\u00192\b\b\u0001\u0010I\u001a\u00020\nJ\u0010\u0010J\u001a\u00020\u00192\b\b\u0001\u0010K\u001a\u00020\nR\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000¨\u0006P"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/TextRoundCornerProgressBar;", "Lcom/blackhub/bronline/game/common/roundcornerprogressbar/common/AnimatedRoundCornerProgressBar;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "colorTextProgress", "textInsideGravity", "textOutsideGravity", "textPositionPriority", "textProgress", "", "textProgressMargin", "textProgressSize", "tvProgress", "Landroid/widget/TextView;", "alignTextProgressInsideProgress", "", "alignTextProgressOutsideProgress", "clearTextProgressAlign", "drawProgress", "layoutProgress", "Landroid/widget/LinearLayout;", "progressDrawable", "Landroid/graphics/drawable/GradientDrawable;", "max", "", "progress", "totalWidth", "radius", "padding", "isReverse", "", "drawTextProgress", "drawTextProgressColor", "drawTextProgressMargin", "drawTextProgressPosition", "drawTextProgressSize", "getProgressText", "getTextInsideGravity", "getTextOutsideGravity", "getTextPositionPriority", "getTextProgressColor", "getTextProgressMargin", "getTextProgressSize", "initLayout", "initStyleable", "initView", "onGlobalLayout", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "onViewDraw", "setProgress", "setProgressText", "text", "setTextInsideGravity", NotificationCompat.WearableExtender.KEY_GRAVITY, "setTextOutsideGravity", "setTextPositionPriority", "priority", "setTextProgressColor", "color", "setTextProgressMargin", "margin", "setTextProgressSize", "size", "Companion", "SavedState", "TextPositionPriority", "TextProgressGravity", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public class TextRoundCornerProgressBar extends AnimatedRoundCornerProgressBar implements ViewTreeObserver.OnGlobalLayoutListener {
    protected static final int DEFAULT_TEXT_MARGIN = 10;
    protected static final int DEFAULT_TEXT_SIZE = 16;
    public static final int GRAVITY_END = 1;
    public static final int GRAVITY_START = 0;
    public static final int PRIORITY_INSIDE = 0;
    public static final int PRIORITY_OUTSIDE = 1;
    private int colorTextProgress;
    private int textInsideGravity;
    private int textOutsideGravity;
    private int textPositionPriority;

    @Nullable
    private String textProgress;
    private int textProgressMargin;
    private int textProgressSize;
    private TextView tvProgress;
    public static final int $stable = 8;

    /* compiled from: TextRoundCornerProgressBar.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/TextRoundCornerProgressBar$TextPositionPriority;", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: classes.dex */
    public @interface TextPositionPriority {
    }

    /* compiled from: TextRoundCornerProgressBar.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/TextRoundCornerProgressBar$TextProgressGravity;", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: classes.dex */
    public @interface TextProgressGravity {
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public int initLayout() {
        return R.layout.widget_text_round_corner_progress_bar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextRoundCornerProgressBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i, int i2) {
        super(context, attrs, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initStyleable(@NotNull Context context, @Nullable AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (attrs == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C3489R.styleable.TextRoundCornerProgressBar);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.colorTextProgress = typedArrayObtainStyledAttributes.getColor(4, -1);
        this.textProgressSize = (int) typedArrayObtainStyledAttributes.getDimension(6, dp2px(16.0f));
        this.textProgressMargin = (int) typedArrayObtainStyledAttributes.getDimension(5, dp2px(10.0f));
        this.textProgress = typedArrayObtainStyledAttributes.getString(3);
        this.textInsideGravity = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.textOutsideGravity = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.textPositionPriority = typedArrayObtainStyledAttributes.getInt(2, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initView() {
        View viewFindViewById = findViewById(R.id.tv_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.tvProgress = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
            textView = null;
        }
        textView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void drawProgress(@NotNull LinearLayout layoutProgress, @NotNull GradientDrawable progressDrawable, float max, float progress, float totalWidth, int radius, int padding, boolean isReverse) {
        Intrinsics.checkNotNullParameter(layoutProgress, "layoutProgress");
        Intrinsics.checkNotNullParameter(progressDrawable, "progressDrawable");
        float f = radius - (padding / 2.0f);
        progressDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
        layoutProgress.setBackground(progressDrawable);
        int i = (int) ((totalWidth - (padding * 2)) / (max / progress));
        ViewGroup.LayoutParams layoutParams = layoutProgress.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = i / 2;
        if (padding + i2 < radius) {
            int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(radius - padding, 0) - i2;
            marginLayoutParams.topMargin = iCoerceAtLeast;
            marginLayoutParams.bottomMargin = iCoerceAtLeast;
        } else {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
        marginLayoutParams.width = i;
        layoutProgress.setLayoutParams(marginLayoutParams);
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void onViewDraw() {
        drawTextProgress();
        drawTextProgressSize();
        drawTextProgressMargin();
        post(new Runnable() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.TextRoundCornerProgressBar$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TextRoundCornerProgressBar.onViewDraw$lambda$1(this.f$0);
            }
        });
        drawTextProgressColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewDraw$lambda$1(TextRoundCornerProgressBar this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.drawTextProgressPosition();
    }

    private final void drawTextProgress() {
        TextView textView = this.tvProgress;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
            textView = null;
        }
        textView.setText(this.textProgress);
    }

    private final void drawTextProgressColor() {
        TextView textView = this.tvProgress;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
            textView = null;
        }
        textView.setTextColor(this.colorTextProgress);
    }

    private final void drawTextProgressSize() {
        TextView textView = this.tvProgress;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
            textView = null;
        }
        textView.setTextSize(0, this.textProgressSize);
    }

    private final void drawTextProgressMargin() {
        TextView textView = this.tvProgress;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
            textView = null;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = this.textProgressMargin;
        marginLayoutParams.setMargins(i, 0, i, 0);
        TextView textView3 = this.tvProgress;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
        } else {
            textView2 = textView3;
        }
        textView2.setLayoutParams(marginLayoutParams);
    }

    private final void drawTextProgressPosition() {
        clearTextProgressAlign();
        TextView textView = this.tvProgress;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
            textView = null;
        }
        int measuredWidth = textView.getMeasuredWidth() + (getTextProgressMargin() * 2);
        int layoutWidth = (int) ((getLayoutWidth() - (get_padding() * 2)) / (get_max() / get_progress()));
        if (this.textPositionPriority == 1) {
            if (getLayoutWidth() - layoutWidth > measuredWidth) {
                alignTextProgressOutsideProgress();
                return;
            } else {
                alignTextProgressInsideProgress();
                return;
            }
        }
        if (measuredWidth + this.textProgressMargin > layoutWidth) {
            alignTextProgressOutsideProgress();
        } else {
            alignTextProgressInsideProgress();
        }
    }

    private final void clearTextProgressAlign() {
        TextView textView = this.tvProgress;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
            textView = null;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(0);
        layoutParams2.removeRule(1);
        layoutParams2.removeRule(5);
        layoutParams2.removeRule(7);
        layoutParams2.removeRule(9);
        layoutParams2.removeRule(11);
        layoutParams2.removeRule(16);
        layoutParams2.removeRule(17);
        layoutParams2.removeRule(18);
        layoutParams2.removeRule(19);
        layoutParams2.removeRule(20);
        layoutParams2.removeRule(21);
        TextView textView3 = this.tvProgress;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
        } else {
            textView2 = textView3;
        }
        textView2.setLayoutParams(layoutParams2);
    }

    private final void alignTextProgressInsideProgress() {
        TextView textView = this.tvProgress;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
            textView = null;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (isReverse()) {
            if (this.textInsideGravity == 1) {
                layoutParams2.addRule(7, R.id.container_progress);
                layoutParams2.addRule(19, R.id.container_progress);
            } else {
                layoutParams2.addRule(5, R.id.container_progress);
                layoutParams2.addRule(18, R.id.container_progress);
            }
        } else if (this.textInsideGravity == 1) {
            layoutParams2.addRule(5, R.id.container_progress);
            layoutParams2.addRule(18, R.id.container_progress);
        } else {
            layoutParams2.addRule(7, R.id.container_progress);
            layoutParams2.addRule(19, R.id.container_progress);
        }
        TextView textView3 = this.tvProgress;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
        } else {
            textView2 = textView3;
        }
        textView2.setLayoutParams(layoutParams2);
    }

    private final void alignTextProgressOutsideProgress() {
        TextView textView = this.tvProgress;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
            textView = null;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (isReverse()) {
            if (this.textOutsideGravity == 1) {
                layoutParams2.addRule(9);
                layoutParams2.addRule(20);
            } else {
                layoutParams2.addRule(0, R.id.container_progress);
                layoutParams2.addRule(16, R.id.container_progress);
            }
        } else if (this.textOutsideGravity == 1) {
            layoutParams2.addRule(11);
            layoutParams2.addRule(21);
        } else {
            layoutParams2.addRule(1, R.id.container_progress);
            layoutParams2.addRule(17, R.id.container_progress);
        }
        TextView textView3 = this.tvProgress;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
        } else {
            textView2 = textView3;
        }
        textView2.setLayoutParams(layoutParams2);
    }

    @Nullable
    /* renamed from: getProgressText, reason: from getter */
    public final String getTextProgress() {
        return this.textProgress;
    }

    public final void setProgressText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.textProgress = text;
        drawTextProgress();
        drawTextProgressPosition();
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar, com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setProgress(int progress) {
        setProgress(progress);
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar, com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setProgress(float progress) {
        super.setProgress(progress);
        drawTextProgressPosition();
    }

    /* renamed from: getTextProgressColor, reason: from getter */
    public final int getColorTextProgress() {
        return this.colorTextProgress;
    }

    public final void setTextProgressColor(@ColorInt int color) {
        this.colorTextProgress = color;
        drawTextProgressColor();
    }

    public final int getTextProgressSize() {
        return this.textProgressSize;
    }

    public final void setTextProgressSize(@Px int size) {
        this.textProgressSize = size;
        drawTextProgressSize();
        drawTextProgressPosition();
    }

    public final int getTextProgressMargin() {
        return this.textProgressMargin;
    }

    public final void setTextProgressMargin(@Px int margin) {
        this.textProgressMargin = margin;
        drawTextProgressMargin();
        drawTextProgressPosition();
    }

    public final int getTextPositionPriority() {
        return this.textPositionPriority;
    }

    public final void setTextPositionPriority(int priority) {
        this.textPositionPriority = priority;
        drawTextProgressPosition();
    }

    public final int getTextInsideGravity() {
        return this.textInsideGravity;
    }

    public final void setTextInsideGravity(int gravity) {
        this.textInsideGravity = gravity;
        drawTextProgressPosition();
    }

    public final int getTextOutsideGravity() {
        return this.textOutsideGravity;
    }

    public final void setTextOutsideGravity(int gravity) {
        this.textOutsideGravity = gravity;
        drawTextProgressPosition();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        TextView textView = this.tvProgress;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
            textView = null;
        }
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        drawTextProgressPosition();
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar, com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar, android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.setColorTextProgress(this.colorTextProgress);
        savedState.setTextProgressSize(this.textProgressSize);
        savedState.setTextProgressMargin(this.textProgressMargin);
        savedState.setTextProgress(this.textProgress);
        savedState.setTextInsideGravity(this.textInsideGravity);
        savedState.setTextOutsideGravity(this.textOutsideGravity);
        savedState.setTextPositionPriority(this.textPositionPriority);
        return savedState;
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar, com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.colorTextProgress = savedState.getColorTextProgress();
        this.textProgressSize = savedState.getTextProgressSize();
        this.textProgressMargin = savedState.getTextProgressMargin();
        this.textProgress = savedState.getTextProgress();
        this.textInsideGravity = savedState.getTextInsideGravity();
        this.textOutsideGravity = savedState.getTextOutsideGravity();
        this.textPositionPriority = savedState.getTextPositionPriority();
    }

    /* compiled from: TextRoundCornerProgressBar.kt */
    @Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\fH\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010¨\u0006+"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/TextRoundCornerProgressBar$SavedState;", "Landroidx/customview/view/AbsSavedState;", "superState", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "loader", "Ljava/lang/ClassLoader;", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V", "colorTextProgress", "", "getColorTextProgress", "()I", "setColorTextProgress", "(I)V", "textInsideGravity", "getTextInsideGravity", "setTextInsideGravity", "textOutsideGravity", "getTextOutsideGravity", "setTextOutsideGravity", "textPositionPriority", "getTextPositionPriority", "setTextPositionPriority", "textProgress", "", "getTextProgress", "()Ljava/lang/String;", "setTextProgress", "(Ljava/lang/String;)V", "textProgressMargin", "getTextProgressMargin", "setTextProgressMargin", "textProgressSize", "getTextProgressSize", "setTextProgressSize", "writeToParcel", "", "dest", "flags", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class SavedState extends AbsSavedState {
        public int colorTextProgress;
        public int textInsideGravity;
        public int textOutsideGravity;
        public int textPositionPriority;

        @Nullable
        public String textProgress;
        public int textProgressMargin;
        public int textProgressSize;

        @JvmField
        @NotNull
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.TextRoundCornerProgressBar$SavedState$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NotNull
            public TextRoundCornerProgressBar.SavedState createFromParcel(@NotNull Parcel source, @NotNull ClassLoader loader) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(loader, "loader");
                return new TextRoundCornerProgressBar.SavedState(source, loader);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public TextRoundCornerProgressBar.SavedState createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new TextRoundCornerProgressBar.SavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public TextRoundCornerProgressBar.SavedState[] newArray(int size) {
                return newArray(size);
            }
        };

        public final int getColorTextProgress() {
            return this.colorTextProgress;
        }

        public final void setColorTextProgress(int i) {
            this.colorTextProgress = i;
        }

        public final int getTextProgressSize() {
            return this.textProgressSize;
        }

        public final void setTextProgressSize(int i) {
            this.textProgressSize = i;
        }

        public final int getTextProgressMargin() {
            return this.textProgressMargin;
        }

        public final void setTextProgressMargin(int i) {
            this.textProgressMargin = i;
        }

        @Nullable
        public final String getTextProgress() {
            return this.textProgress;
        }

        public final void setTextProgress(@Nullable String str) {
            this.textProgress = str;
        }

        public final int getTextInsideGravity() {
            return this.textInsideGravity;
        }

        public final void setTextInsideGravity(int i) {
            this.textInsideGravity = i;
        }

        public final int getTextOutsideGravity() {
            return this.textOutsideGravity;
        }

        public final void setTextOutsideGravity(int i) {
            this.textOutsideGravity = i;
        }

        public final int getTextPositionPriority() {
            return this.textPositionPriority;
        }

        public final void setTextPositionPriority(int i) {
            this.textPositionPriority = i;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcelable superState) {
            super(superState);
            Intrinsics.checkNotNullParameter(superState, "superState");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcel source) {
            super(source, null);
            Intrinsics.checkNotNullParameter(source, "source");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcel source, @Nullable ClassLoader classLoader) {
            super(source, classLoader);
            Intrinsics.checkNotNullParameter(source, "source");
            this.colorTextProgress = source.readInt();
            this.textProgressSize = source.readInt();
            this.textProgressMargin = source.readInt();
            this.textProgress = source.readString();
            this.textInsideGravity = source.readInt();
            this.textOutsideGravity = source.readInt();
            this.textPositionPriority = source.readInt();
        }

        public /* synthetic */ SavedState(Parcel parcel, ClassLoader classLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel, (i & 2) != 0 ? null : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            super.writeToParcel(dest, flags);
            dest.writeInt(this.colorTextProgress);
            dest.writeInt(this.textProgressSize);
            dest.writeInt(this.textProgressMargin);
            dest.writeString(this.textProgress);
            dest.writeInt(this.textInsideGravity);
            dest.writeInt(this.textOutsideGravity);
            dest.writeInt(this.textPositionPriority);
        }
    }
}
