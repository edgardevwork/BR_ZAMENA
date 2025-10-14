package com.blackhub.bronline.game.core.utils;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.databinding.BindingAdapter;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.Useful;
import com.caverock.androidsvg.SVG;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.obr.xml.OBRXMLParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewDataBindingAdapters.kt */
@Metadata(m7104d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u001a\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0013H\u0007\u001a\u0018\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0010H\u0007\u001a\u0018\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0010H\u0007\u001a\u0018\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0010H\u0007\u001a\u0018\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0010H\u0007\u001a)\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010%\u001a)\u0010&\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010%\u001a\u001f\u0010'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010)\u001a\u0018\u0010*\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020+H\u0007\u001a\u0018\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0005H\u0007\u001a\u0018\u0010.\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0013H\u0007\u001a\u0018\u00100\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0005H\u0007¨\u00062"}, m7105d2 = {"setBackground", "", SVG.View.NODE_NAME, "Landroid/view/View;", "drawable", "", "setColorFilter", "Landroid/widget/ImageView;", "colorFilter", "Landroid/graphics/ColorFilter;", "setDrawableEnd", "Landroid/widget/TextView;", "drawableRight", "Landroid/graphics/drawable/Drawable;", "setElevation", "elevation", "", "setEnable", "enabled", "", "setHeight", "height", "setImageResource", "imageView", OBRXMLParser.ResourceHandler.RESOURCE, "setInvisible", "isInvisible", "setMarginBottomNegative", "dimen", "setMarginLeftNegative", "setMarginRightNegative", "setMarginTopNegative", "setOnClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "debounceMillis", "", "(Landroid/view/View;Landroid/view/View$OnClickListener;Ljava/lang/Long;)V", "setOnClickListenerWithAnimate", "setTextFromInt", "text", "(Landroid/widget/TextView;Ljava/lang/Integer;)V", "setTextHtml", "", "setVisibilty", "visibility", "setVisible", "isVisible", "setWidth", "width", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nViewDataBindingAdapters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewDataBindingAdapters.kt\ncom/blackhub/bronline/game/core/utils/ViewDataBindingAdaptersKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,131:1\n256#2,2:132\n277#2,2:134\n*S KotlinDebug\n*F\n+ 1 ViewDataBindingAdapters.kt\ncom/blackhub/bronline/game/core/utils/ViewDataBindingAdaptersKt\n*L\n30#1:132,2\n35#1:134,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ViewDataBindingAdaptersKt {
    @BindingAdapter({"viewWidth"})
    public static final void setWidth(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getLayoutParams().width = i;
    }

    @BindingAdapter({"viewHeight"})
    public static final void setHeight(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getLayoutParams().height = i;
    }

    @BindingAdapter({"visibility"})
    public static final void setVisibilty(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVisibility(i);
    }

    @BindingAdapter({"colorFilter"})
    public static final void setColorFilter(@NotNull ImageView view, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setColorFilter(colorFilter);
    }

    @BindingAdapter({"drawableRight"})
    public static final void setDrawableEnd(@NotNull TextView view, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    @BindingAdapter({"textFromInt"})
    public static final void setTextFromInt(@NotNull TextView view, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setText(String.valueOf(num));
    }

    @BindingAdapter(requireAll = false, value = {"onClickDebounce", "delay"})
    public static final void setOnClickListener(@NotNull View view, @Nullable View.OnClickListener onClickListener, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (l == null) {
            ViewExtensionKt.setOnDebounceClickListener$default(view, 0L, onClickListener, 1, null);
        } else {
            ViewExtensionKt.setOnDebounceClickListener(view, l.longValue(), onClickListener);
        }
    }

    @BindingAdapter(requireAll = false, value = {"onClickDebounceAndAnimate", "delay"})
    public static final void setOnClickListenerWithAnimate(@NotNull View view, @Nullable View.OnClickListener onClickListener, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (l == null) {
            ViewExtensionKt.setOnDebounceAndAnimateClickListener$default(view, 0L, onClickListener, 1, null);
        } else {
            ViewExtensionKt.setOnDebounceAndAnimateClickListener(view, l.longValue(), onClickListener);
        }
    }

    @BindingAdapter({"imageResource"})
    public static final void setImageResource(@NotNull ImageView imageView, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        imageView.setImageResource(i);
    }

    @BindingAdapter({"marginTopNegative"})
    public static final void setMarginTopNegative(@NotNull View view, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewExtensionKt.setMargins$default(view, 0, -((int) f), 0, 0, 13, null);
    }

    @BindingAdapter({"marginBottomNegative"})
    public static final void setMarginBottomNegative(@NotNull View view, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewExtensionKt.setMargins$default(view, 0, 0, 0, -((int) f), 7, null);
    }

    @BindingAdapter({"marginLeftNegative"})
    public static final void setMarginLeftNegative(@NotNull View view, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewExtensionKt.setMargins$default(view, -((int) f), 0, 0, 0, 14, null);
    }

    @BindingAdapter({"marginRightNegative"})
    public static final void setMarginRightNegative(@NotNull View view, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewExtensionKt.setMargins$default(view, 0, 0, -((int) f), 0, 11, null);
    }

    @BindingAdapter({"background"})
    public static final void setBackground(@NotNull View view, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundResource(i);
    }

    @BindingAdapter({"textHtml"})
    public static final void setTextHtml(@NotNull TextView view, @NotNull String text) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(text, "text");
        view.setText(Useful.INSTANCE.getTextWithHtmlStyles(text));
    }

    @BindingAdapter({"elevation"})
    public static final void setElevation(@NotNull View view, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setElevation(f);
    }

    @BindingAdapter({"enabled"})
    public static final void setEnable(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(z);
    }

    @BindingAdapter({"visible"})
    public static final void setVisible(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVisibility(z ? 0 : 8);
    }

    @BindingAdapter({"invisible"})
    public static final void setInvisible(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVisibility(z ? 4 : 0);
    }
}
