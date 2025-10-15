package com.blackhub.bronline.game.common.roundcornerprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.customview.view.AbsSavedState;
import com.blackhub.bronline.C3489R;
import com.blackhub.bronline.game.common.roundcornerprogressbar.IconRoundCornerProgressBar;
import com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IconRoundCornerProgressBar.kt */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(m7104d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018\u0000 S2\u00020\u0001:\u0002STB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002JH\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u000200H\u0014J\u0006\u00101\u001a\u00020\tJ\b\u00102\u001a\u0004\u0018\u00010\u000fJ\b\u00103\u001a\u0004\u0018\u00010\u0011J\u0006\u00104\u001a\u00020\tJ\u0006\u00105\u001a\u00020\tJ\u0006\u00106\u001a\u00020\tJ\u0006\u00107\u001a\u00020\tJ\u0006\u00108\u001a\u00020\tJ\u0006\u00109\u001a\u00020\tJ\u0006\u0010:\u001a\u00020\tJ\b\u0010;\u001a\u00020\tH\u0014J\u001a\u0010<\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010=\u001a\u00020\u001fH\u0014J\u0012\u0010>\u001a\u00020\u001f2\b\u0010?\u001a\u0004\u0018\u00010@H\u0014J\n\u0010A\u001a\u0004\u0018\u00010@H\u0014J\b\u0010B\u001a\u00020\u001fH\u0014J\u000e\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020\tJ\u0010\u0010E\u001a\u00020\u001f2\b\u0010F\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010G\u001a\u00020\u001f2\b\u0010H\u001a\u0004\u0018\u00010\u0011J\u000e\u0010I\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\tJ\u000e\u0010K\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\tJ\u000e\u0010L\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\tJ\u000e\u0010M\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\tJ\u000e\u0010N\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\tJ\u000e\u0010O\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\tJ\u000e\u0010P\u001a\u00020\u001f2\u0006\u0010Q\u001a\u00020\tJ\u0018\u0010R\u001a\u00020\u001f2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006U"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/IconRoundCornerProgressBar;", "Lcom/blackhub/bronline/game/common/roundcornerprogressbar/common/AnimatedRoundCornerProgressBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "colorIconBackground", "iconBitmap", "Landroid/graphics/Bitmap;", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "iconHeight", "iconPadding", "iconPaddingBottom", "iconPaddingLeft", "iconPaddingRight", "iconPaddingTop", "iconResource", "iconSize", "iconWidth", "ivProgressIcon", "Landroid/widget/ImageView;", "onIconClick", "Lkotlin/Function0;", "", "drawIconBackgroundColor", "drawImageIcon", "drawImageIconPadding", "drawImageIconSize", "drawProgress", "layoutProgress", "Landroid/widget/LinearLayout;", "progressDrawable", "Landroid/graphics/drawable/GradientDrawable;", "max", "", "progress", "totalWidth", "radius", "padding", "isReverse", "", "getColorIconBackground", "getIconImageBitmap", "getIconImageDrawable", "getIconImageResource", "getIconPadding", "getIconPaddingBottom", "getIconPaddingLeft", "getIconPaddingRight", "getIconPaddingTop", "getIconSize", "initLayout", "initStyleable", "initView", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "onViewDraw", "setIconBackgroundColor", "color", "setIconImageBitmap", "bitmap", "setIconImageDrawable", "drawable", "setIconImageResource", "resId", "setIconPadding", "setIconPaddingBottom", "setIconPaddingLeft", "setIconPaddingRight", "setIconPaddingTop", "setIconSize", "size", "setOnIconClickListener", "Companion", "SavedState", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public class IconRoundCornerProgressBar extends AnimatedRoundCornerProgressBar {
    protected static final int DEFAULT_ICON_PADDING_BOTTOM = 0;
    protected static final int DEFAULT_ICON_PADDING_LEFT = 0;
    protected static final int DEFAULT_ICON_PADDING_RIGHT = 0;
    protected static final int DEFAULT_ICON_PADDING_TOP = 0;
    protected static final int DEFAULT_ICON_SIZE = 20;
    private int colorIconBackground;

    @Nullable
    private Bitmap iconBitmap;

    @Nullable
    private Drawable iconDrawable;
    private int iconHeight;
    private int iconPadding;
    private int iconPaddingBottom;
    private int iconPaddingLeft;
    private int iconPaddingRight;
    private int iconPaddingTop;
    private int iconResource;
    private int iconSize;
    private int iconWidth;
    private ImageView ivProgressIcon;

    @Nullable
    private Function0<Unit> onIconClick;
    public static final int $stable = 8;

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public int initLayout() {
        return R.layout.widget_icon_round_corner_progress_bar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconRoundCornerProgressBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i, int i2) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C3489R.styleable.IconRoundCornerProgressBar);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.iconResource = typedArrayObtainStyledAttributes.getResourceId(8, -1);
        this.iconSize = (int) typedArrayObtainStyledAttributes.getDimension(7, -1.0f);
        this.iconWidth = (int) typedArrayObtainStyledAttributes.getDimension(9, dp2px(20.0f));
        this.iconHeight = (int) typedArrayObtainStyledAttributes.getDimension(1, dp2px(20.0f));
        this.iconPadding = (int) typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.iconPaddingLeft = (int) typedArrayObtainStyledAttributes.getDimension(4, dp2px(0.0f));
        this.iconPaddingRight = (int) typedArrayObtainStyledAttributes.getDimension(5, dp2px(0.0f));
        this.iconPaddingTop = (int) typedArrayObtainStyledAttributes.getDimension(6, dp2px(0.0f));
        this.iconPaddingBottom = (int) typedArrayObtainStyledAttributes.getDimension(3, dp2px(0.0f));
        this.colorIconBackground = typedArrayObtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.dark_gray));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initView() {
        View viewFindViewById = findViewById(R.id.iv_progress_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.ivProgressIcon = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivProgressIcon");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.IconRoundCornerProgressBar$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IconRoundCornerProgressBar.initView$lambda$1(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(IconRoundCornerProgressBar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onIconClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOnIconClickListener$default(IconRoundCornerProgressBar iconRoundCornerProgressBar, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnIconClickListener");
        }
        if ((i & 1) != 0) {
            function0 = null;
        }
        iconRoundCornerProgressBar.setOnIconClickListener(function0);
    }

    public final void setOnIconClickListener(@Nullable Function0<Unit> onIconClick) {
        this.onIconClick = onIconClick;
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void drawProgress(@NotNull LinearLayout layoutProgress, @NotNull GradientDrawable progressDrawable, float max, float progress, float totalWidth, int radius, int padding, boolean isReverse) {
        Intrinsics.checkNotNullParameter(layoutProgress, "layoutProgress");
        Intrinsics.checkNotNullParameter(progressDrawable, "progressDrawable");
        float f = radius - (padding / 2.0f);
        if (isReverse && progress != max) {
            progressDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
        } else {
            progressDrawable.setCornerRadii(new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f});
        }
        layoutProgress.setBackground(progressDrawable);
        float f2 = max / progress;
        int i = padding * 2;
        ImageView imageView = this.ivProgressIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivProgressIcon");
            imageView = null;
        }
        int width = (int) ((totalWidth - (i + imageView.getWidth())) / f2);
        ViewGroup.LayoutParams layoutParams = layoutProgress.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (isReverse) {
            int i2 = width / 2;
            if (padding + i2 < radius) {
                int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(radius - padding, 0) - i2;
                marginLayoutParams.topMargin = iCoerceAtLeast;
                marginLayoutParams.bottomMargin = iCoerceAtLeast;
            } else {
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.bottomMargin = 0;
            }
        }
        marginLayoutParams.width = width;
        layoutProgress.setLayoutParams(marginLayoutParams);
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void onViewDraw() {
        drawImageIcon();
        drawImageIconSize();
        drawImageIconPadding();
        drawIconBackgroundColor();
    }

    private final void drawImageIcon() {
        ImageView imageView = null;
        if (this.iconResource != -1) {
            ImageView imageView2 = this.ivProgressIcon;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivProgressIcon");
            } else {
                imageView = imageView2;
            }
            imageView.setImageResource(this.iconResource);
            return;
        }
        if (this.iconBitmap != null) {
            ImageView imageView3 = this.ivProgressIcon;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivProgressIcon");
            } else {
                imageView = imageView3;
            }
            imageView.setImageBitmap(this.iconBitmap);
            return;
        }
        if (this.iconDrawable != null) {
            ImageView imageView4 = this.ivProgressIcon;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivProgressIcon");
            } else {
                imageView = imageView4;
            }
            imageView.setImageDrawable(this.iconDrawable);
            return;
        }
        ImageView imageView5 = this.ivProgressIcon;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivProgressIcon");
        } else {
            imageView = imageView5;
        }
        imageView.setImageResource(0);
    }

    private final void drawImageIconSize() {
        LinearLayout.LayoutParams layoutParams;
        if (this.iconSize == -1) {
            layoutParams = new LinearLayout.LayoutParams(this.iconWidth, this.iconHeight);
        } else {
            int i = this.iconSize;
            layoutParams = new LinearLayout.LayoutParams(i, i);
        }
        ImageView imageView = this.ivProgressIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivProgressIcon");
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams);
    }

    private final void drawImageIconPadding() {
        int i = this.iconPadding;
        ImageView imageView = null;
        if (i == -1 || i == 0) {
            ImageView imageView2 = this.ivProgressIcon;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivProgressIcon");
                imageView2 = null;
            }
            imageView2.setPadding(this.iconPaddingLeft, this.iconPaddingTop, this.iconPaddingRight, this.iconPaddingBottom);
        } else {
            ImageView imageView3 = this.ivProgressIcon;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivProgressIcon");
                imageView3 = null;
            }
            int i2 = this.iconPadding;
            imageView3.setPadding(i2, i2, i2, i2);
        }
        ImageView imageView4 = this.ivProgressIcon;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivProgressIcon");
        } else {
            imageView = imageView4;
        }
        imageView.invalidate();
    }

    private final void drawIconBackgroundColor() {
        GradientDrawable gradientDrawableCreateGradientDrawable = createGradientDrawable(this.colorIconBackground);
        float f = get_radius() - (get_padding() / 2);
        gradientDrawableCreateGradientDrawable.setCornerRadii(new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f});
        ImageView imageView = this.ivProgressIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivProgressIcon");
            imageView = null;
        }
        imageView.setBackground(gradientDrawableCreateGradientDrawable);
    }

    /* renamed from: getIconImageResource, reason: from getter */
    public final int getIconResource() {
        return this.iconResource;
    }

    public final void setIconImageResource(int resId) {
        this.iconResource = resId;
        this.iconBitmap = null;
        this.iconDrawable = null;
        drawImageIcon();
    }

    @Nullable
    /* renamed from: getIconImageBitmap, reason: from getter */
    public final Bitmap getIconBitmap() {
        return this.iconBitmap;
    }

    public final void setIconImageBitmap(@Nullable Bitmap bitmap) {
        this.iconResource = -1;
        this.iconBitmap = bitmap;
        this.iconDrawable = null;
        drawImageIcon();
    }

    @Nullable
    /* renamed from: getIconImageDrawable, reason: from getter */
    public final Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    public final void setIconImageDrawable(@Nullable Drawable drawable) {
        this.iconResource = -1;
        this.iconBitmap = null;
        this.iconDrawable = drawable;
        drawImageIcon();
    }

    public final int getIconSize() {
        return this.iconSize;
    }

    public final void setIconSize(int size) {
        if (size >= 0) {
            this.iconSize = size;
        }
        drawImageIconSize();
    }

    public final int getIconPadding() {
        return this.iconPadding;
    }

    public final void setIconPadding(int padding) {
        if (padding >= 0) {
            this.iconPadding = padding;
        }
        drawImageIconPadding();
    }

    public final int getIconPaddingLeft() {
        return this.iconPaddingLeft;
    }

    public final void setIconPaddingLeft(int padding) {
        if (padding > 0) {
            this.iconPaddingLeft = padding;
        }
        drawImageIconPadding();
    }

    public final int getIconPaddingRight() {
        return this.iconPaddingRight;
    }

    public final void setIconPaddingRight(int padding) {
        if (padding > 0) {
            this.iconPaddingRight = padding;
        }
        drawImageIconPadding();
    }

    public final int getIconPaddingTop() {
        return this.iconPaddingTop;
    }

    public final void setIconPaddingTop(int padding) {
        if (padding > 0) {
            this.iconPaddingTop = padding;
        }
        drawImageIconPadding();
    }

    public final int getIconPaddingBottom() {
        return this.iconPaddingBottom;
    }

    public final void setIconPaddingBottom(int padding) {
        if (padding > 0) {
            this.iconPaddingBottom = padding;
        }
        drawImageIconPadding();
    }

    public final int getColorIconBackground() {
        return this.colorIconBackground;
    }

    public final void setIconBackgroundColor(int color) {
        this.colorIconBackground = color;
        drawIconBackgroundColor();
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar, com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar, android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.setIconResource(this.iconResource);
        savedState.setIconSize(this.iconSize);
        savedState.setIconWidth(this.iconWidth);
        savedState.setIconHeight(this.iconHeight);
        savedState.setIconPadding(this.iconPadding);
        savedState.setIconPaddingLeft(this.iconPaddingLeft);
        savedState.setIconPaddingRight(this.iconPaddingRight);
        savedState.setIconPaddingTop(this.iconPaddingTop);
        savedState.setIconPaddingBottom(this.iconPaddingBottom);
        savedState.setColorIconBackground(this.colorIconBackground);
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
        this.iconResource = savedState.getIconResource();
        this.iconSize = savedState.getIconSize();
        this.iconWidth = savedState.getIconWidth();
        this.iconHeight = savedState.getIconHeight();
        this.iconPadding = savedState.getIconPadding();
        this.iconPaddingLeft = savedState.getIconPaddingLeft();
        this.iconPaddingRight = savedState.getIconPaddingRight();
        this.iconPaddingTop = savedState.getIconPaddingTop();
        this.iconPaddingBottom = savedState.getIconPaddingBottom();
        this.colorIconBackground = savedState.getColorIconBackground();
    }

    /* compiled from: IconRoundCornerProgressBar.kt */
    @Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000 02\u00020\u0001:\u00010B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\fH\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\u001a\u0010)\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010¨\u00061"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/IconRoundCornerProgressBar$SavedState;", "Landroidx/customview/view/AbsSavedState;", "superState", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "loader", "Ljava/lang/ClassLoader;", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V", "colorIconBackground", "", "getColorIconBackground", "()I", "setColorIconBackground", "(I)V", "iconHeight", "getIconHeight", "setIconHeight", "iconPadding", "getIconPadding", "setIconPadding", "iconPaddingBottom", "getIconPaddingBottom", "setIconPaddingBottom", "iconPaddingLeft", "getIconPaddingLeft", "setIconPaddingLeft", "iconPaddingRight", "getIconPaddingRight", "setIconPaddingRight", "iconPaddingTop", "getIconPaddingTop", "setIconPaddingTop", "iconResource", "getIconResource", "setIconResource", "iconSize", "getIconSize", "setIconSize", "iconWidth", "getIconWidth", "setIconWidth", "writeToParcel", "", "dest", "flags", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class SavedState extends AbsSavedState {
        public int colorIconBackground;
        public int iconHeight;
        public int iconPadding;
        public int iconPaddingBottom;
        public int iconPaddingLeft;
        public int iconPaddingRight;
        public int iconPaddingTop;
        public int iconResource;
        public int iconSize;
        public int iconWidth;

        @JvmField
        @NotNull
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.IconRoundCornerProgressBar$SavedState$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NotNull
            public IconRoundCornerProgressBar.SavedState createFromParcel(@NotNull Parcel source, @NotNull ClassLoader loader) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(loader, "loader");
                return new IconRoundCornerProgressBar.SavedState(source, loader);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public IconRoundCornerProgressBar.SavedState createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new IconRoundCornerProgressBar.SavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public IconRoundCornerProgressBar.SavedState[] newArray(int size) {
                return newArray(size);
            }
        };

        public final int getIconResource() {
            return this.iconResource;
        }

        public final void setIconResource(int i) {
            this.iconResource = i;
        }

        public final int getIconSize() {
            return this.iconSize;
        }

        public final void setIconSize(int i) {
            this.iconSize = i;
        }

        public final int getIconWidth() {
            return this.iconWidth;
        }

        public final void setIconWidth(int i) {
            this.iconWidth = i;
        }

        public final int getIconHeight() {
            return this.iconHeight;
        }

        public final void setIconHeight(int i) {
            this.iconHeight = i;
        }

        public final int getIconPadding() {
            return this.iconPadding;
        }

        public final void setIconPadding(int i) {
            this.iconPadding = i;
        }

        public final int getIconPaddingLeft() {
            return this.iconPaddingLeft;
        }

        public final void setIconPaddingLeft(int i) {
            this.iconPaddingLeft = i;
        }

        public final int getIconPaddingRight() {
            return this.iconPaddingRight;
        }

        public final void setIconPaddingRight(int i) {
            this.iconPaddingRight = i;
        }

        public final int getIconPaddingTop() {
            return this.iconPaddingTop;
        }

        public final void setIconPaddingTop(int i) {
            this.iconPaddingTop = i;
        }

        public final int getIconPaddingBottom() {
            return this.iconPaddingBottom;
        }

        public final void setIconPaddingBottom(int i) {
            this.iconPaddingBottom = i;
        }

        public final int getColorIconBackground() {
            return this.colorIconBackground;
        }

        public final void setColorIconBackground(int i) {
            this.colorIconBackground = i;
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
            this.iconResource = source.readInt();
            this.iconSize = source.readInt();
            this.iconWidth = source.readInt();
            this.iconHeight = source.readInt();
            this.iconPadding = source.readInt();
            this.iconPaddingLeft = source.readInt();
            this.iconPaddingRight = source.readInt();
            this.iconPaddingTop = source.readInt();
            this.iconPaddingBottom = source.readInt();
            this.colorIconBackground = source.readInt();
        }

        public /* synthetic */ SavedState(Parcel parcel, ClassLoader classLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel, (i & 2) != 0 ? null : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            super.writeToParcel(dest, flags);
            dest.writeInt(this.iconResource);
            dest.writeInt(this.iconSize);
            dest.writeInt(this.iconWidth);
            dest.writeInt(this.iconHeight);
            dest.writeInt(this.iconPadding);
            dest.writeInt(this.iconPaddingLeft);
            dest.writeInt(this.iconPaddingRight);
            dest.writeInt(this.iconPaddingTop);
            dest.writeInt(this.iconPaddingBottom);
            dest.writeInt(this.colorIconBackground);
        }
    }
}
