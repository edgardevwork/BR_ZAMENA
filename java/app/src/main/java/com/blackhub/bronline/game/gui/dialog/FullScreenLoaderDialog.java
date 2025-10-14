package com.blackhub.bronline.game.gui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
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
@SourceDebugExtension({"SMAP\nFullScreenLoaderDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullScreenLoaderDialog.kt\ncom/blackhub/bronline/game/gui/dialog/FullScreenLoaderDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,113:1\n256#2,2:114\n256#2,2:116\n256#2,2:118\n256#2,2:120\n*S KotlinDebug\n*F\n+ 1 FullScreenLoaderDialog.kt\ncom/blackhub/bronline/game/gui/dialog/FullScreenLoaderDialog\n*L\n45#1:114,2\n50#1:116,2\n56#1:118,2\n57#1:120,2\n*E\n"})

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
                return FullScreenLoaderDialog.setOnBackClickListener$lambda$0(null, block, dialogInterface, i, keyEvent);
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
        pbFullScreenDialog.setVisibility(isProgressAnimate ? View.VISIBLE : View.GONE);
    }

    public final void setTitleText(String text) {
        this.binding.tvTitle.setText(text);
        TextView tvTitle = this.binding.tvTitle;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        tvTitle.setVisibility(View.VISIBLE);
    }

    public final void setAnimation(boolean isFlipAnimation) {
        if (isFlipAnimation) {
            this.binding.viewLoaderFlipper.startFlipping();
            ViewFlipper viewLoaderFlipper = this.binding.viewLoaderFlipper;
            Intrinsics.checkNotNullExpressionValue(viewLoaderFlipper, "viewLoaderFlipper");
            viewLoaderFlipper.setVisibility(View.VISIBLE);
            LottieAnimationView pbFullScreenDialog = this.binding.pbFullScreenDialog;
            Intrinsics.checkNotNullExpressionValue(pbFullScreenDialog, "pbFullScreenDialog");
            pbFullScreenDialog.setVisibility(View.GONE);
        }
    }

    /* compiled from: FullScreenLoaderDialog.kt */
    @StabilityInferred(parameters = 0)
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

