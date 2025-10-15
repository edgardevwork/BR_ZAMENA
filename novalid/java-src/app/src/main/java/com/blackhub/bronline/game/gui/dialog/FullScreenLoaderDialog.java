package com.blackhub.bronline.game.gui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.LottieAnimationView;
import com.blackhub.bronline.databinding.DialogFullScreenLoaderBinding;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.bless.client.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FullScreenLoaderDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\fH\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/dialog/FullScreenLoaderDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "style", "", "(Landroid/content/Context;I)V", "binding", "Lcom/blackhub/bronline/databinding/DialogFullScreenLoaderBinding;", "setAnimation", "", "isFlipAnimation", "", "setOnBackClickListener", "block", "Lkotlin/Function0;", "setOnCancelListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/DialogInterface$OnCancelListener;", "setProgressAnimate", "isProgressAnimate", "setTitleText", "text", "", "show", "Builder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFullScreenLoaderDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullScreenLoaderDialog.kt\ncom/blackhub/bronline/game/gui/dialog/FullScreenLoaderDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,113:1\n256#2,2:114\n256#2,2:116\n256#2,2:118\n256#2,2:120\n*S KotlinDebug\n*F\n+ 1 FullScreenLoaderDialog.kt\ncom/blackhub/bronline/game/gui/dialog/FullScreenLoaderDialog\n*L\n45#1:114,2\n50#1:116,2\n56#1:118,2\n57#1:120,2\n*E\n"})
/* loaded from: classes2.dex */
public final class FullScreenLoaderDialog extends Dialog {
    public static final int $stable = 8;

    @NotNull
    public final DialogFullScreenLoaderBinding binding;

    public /* synthetic */ FullScreenLoaderDialog(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? R.style.FullScreenLoaderTheme : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenLoaderDialog(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        DialogFullScreenLoaderBinding dialogFullScreenLoaderBindingInflate = DialogFullScreenLoaderBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(dialogFullScreenLoaderBindingInflate, "inflate(...)");
        this.binding = dialogFullScreenLoaderBindingInflate;
        setContentView(dialogFullScreenLoaderBindingInflate.getRoot());
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        Window window = getWindow();
        UsefulKt.hideSystemUI(window != null ? window.getDecorView() : null);
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(@Nullable DialogInterface.OnCancelListener listener) {
        super.setOnCancelListener(listener);
        setOnKeyListener(null);
    }

    public final void setOnBackClickListener(final Function0<Unit> block) {
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.dialog.FullScreenLoaderDialog$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return FullScreenLoaderDialog.setOnBackClickListener$lambda$0(this.f$0, block, dialogInterface, i, keyEvent);
            }
        });
    }

    public static final boolean setOnBackClickListener$lambda$0(FullScreenLoaderDialog this$0, Function0 block, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(block, "$block");
        if (i == 4) {
            this$0.setCancelable(true);
            this$0.dismiss();
            block.invoke();
        }
        return true;
    }

    public final void setProgressAnimate(boolean isProgressAnimate) {
        LottieAnimationView pbFullScreenDialog = this.binding.pbFullScreenDialog;
        Intrinsics.checkNotNullExpressionValue(pbFullScreenDialog, "pbFullScreenDialog");
        pbFullScreenDialog.setVisibility(isProgressAnimate ? 0 : 8);
    }

    public final void setTitleText(String text) {
        this.binding.tvTitle.setText(text);
        TextView tvTitle = this.binding.tvTitle;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        tvTitle.setVisibility(0);
    }

    public final void setAnimation(boolean isFlipAnimation) {
        if (isFlipAnimation) {
            this.binding.viewLoaderFlipper.startFlipping();
            ViewFlipper viewLoaderFlipper = this.binding.viewLoaderFlipper;
            Intrinsics.checkNotNullExpressionValue(viewLoaderFlipper, "viewLoaderFlipper");
            viewLoaderFlipper.setVisibility(0);
            LottieAnimationView pbFullScreenDialog = this.binding.pbFullScreenDialog;
            Intrinsics.checkNotNullExpressionValue(pbFullScreenDialog, "pbFullScreenDialog");
            pbFullScreenDialog.setVisibility(8);
        }
    }

    /* compiled from: FullScreenLoaderDialog.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005J\u0014\u0010\u0016\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/dialog/FullScreenLoaderDialog$Builder;", "", "context", "Landroid/content/Context;", "transparent", "", "light", "(Landroid/content/Context;ZZ)V", "getContext", "()Landroid/content/Context;", "dialog", "Lcom/blackhub/bronline/game/gui/dialog/FullScreenLoaderDialog;", "getDialog", "()Lcom/blackhub/bronline/game/gui/dialog/FullScreenLoaderDialog;", "setDialog", "(Lcom/blackhub/bronline/game/gui/dialog/FullScreenLoaderDialog;)V", "getStyle", "", "setCancelable", "cancelable", "setFlipAnimation", "isFlipAnimation", "setOnBackClickListener", "block", "Lkotlin/Function0;", "", "setProgressAnimate", "isProgressAnimate", "setTitleText", "textTitle", "", "show", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        public final Context context;

        @NotNull
        public FullScreenLoaderDialog dialog;
        public final boolean light;
        public final boolean transparent;

        public Builder(@NotNull Context context, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.transparent = z;
            this.light = z2;
            FullScreenLoaderDialog fullScreenLoaderDialog = new FullScreenLoaderDialog(context, getStyle());
            this.dialog = fullScreenLoaderDialog;
            fullScreenLoaderDialog.setCancelable(false);
        }

        public /* synthetic */ Builder(Context context, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final FullScreenLoaderDialog getDialog() {
            return this.dialog;
        }

        public final void setDialog(@NotNull FullScreenLoaderDialog fullScreenLoaderDialog) {
            Intrinsics.checkNotNullParameter(fullScreenLoaderDialog, "<set-?>");
            this.dialog = fullScreenLoaderDialog;
        }

        @NotNull
        public final Builder setCancelable(boolean cancelable) {
            this.dialog.setCancelable(cancelable);
            return this;
        }

        @NotNull
        public final Builder setOnBackClickListener(@NotNull Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.dialog.setOnBackClickListener(block);
            return this;
        }

        @NotNull
        public final Builder setProgressAnimate(boolean isProgressAnimate) {
            this.dialog.setProgressAnimate(isProgressAnimate);
            return this;
        }

        @NotNull
        public final Builder setTitleText(@NotNull String textTitle) {
            Intrinsics.checkNotNullParameter(textTitle, "textTitle");
            this.dialog.setTitleText(textTitle);
            return this;
        }

        @NotNull
        public final Builder setFlipAnimation(boolean isFlipAnimation) {
            this.dialog.setAnimation(isFlipAnimation);
            return this;
        }

        @NotNull
        public final FullScreenLoaderDialog show() {
            this.dialog.show();
            return this.dialog;
        }

        public final int getStyle() {
            return this.transparent ? R.style.FullScreenLoaderTransparentTheme : this.light ? R.style.FullScreenLoaderLightTheme : R.style.FullScreenLoaderTheme;
        }
    }
}
